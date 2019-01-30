package aufgabe_2;


import aufgabe_1.ObjectMapperWeather;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  throws IOException, JAXBException, FileNotFoundException {
        ObjectMapperWeather omw = new ObjectMapperWeather();

        aufgabe_1.Weather w1 = omw.readJson();

        aufgabe_2.Weather w = new aufgabe_2.Weather(w1.getId(), w1.getMain(), w1.getDescription(), w1.getIcon());
        JAXBContext jaxbContext = JAXBContext.newInstance(aufgabe_2.Weather.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(w, new File("src/at/ac/fh_kufstein/a2/weather.xml"));
        marshaller.marshal(w, System.out);
    }
}
