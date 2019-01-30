package aufgabe_1;

import javax.imageio.IIOException;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            ObjectMapperWeather omw = new ObjectMapperWeather();
            System.out.println(omw.readJson());
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
