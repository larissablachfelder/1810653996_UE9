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

        aufgabe_1.Weather wetter1 = omw.readJson();

        aufgabe_2.Weather wetter2 = new aufgabe_2.Weather(wetter1.getId(), wetter1.getMain(), wetter1.getDescription(), wetter1.getIcon());


        JAXBContext jaxbContext = JAXBContext.newInstance(aufgabe_2.Weather.class);

        Marshaller marshaller = jaxbContext.createMarshaller();


        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(wetter2, new File("src/weather.xml"));
        marshaller.marshal(wetter2, System.out);
    }
}
