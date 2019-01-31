package aufgabe_3;


import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JasonWriterObjectMapper {
        ObjectMapper objectMapper = new ObjectMapper();

        public void writeToJson(aufgabe_5.Weather w)
        {
            try{
                String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(w);
                System.out.println("JSON String: " + jsonString);
            } catch(JsonGenerationException e){
                e.printStackTrace();
            } catch (JsonMappingException e){
                e.printStackTrace();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

