package aufgabe_1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ObjectMapperWeather
{
    //read value wirft exception und ich leite sie an die main weiter
    public Weather readJson() throws IOException {

        //stellt methoden für json lesung und schreibung zur verfügung
        ObjectMapper objectMapper = new ObjectMapper();

        //klasse von JAckson API...hilft reading und writing bei JSon datein
        //hier erstelle ich ein neues wetterobjekt und die daten vom json werden hineingespeichert
        Weather wetter = objectMapper.readValue(new File("src/weather.json"), Weather.class);

        //das objekt wetter wird returned
        return wetter;

    }

}
