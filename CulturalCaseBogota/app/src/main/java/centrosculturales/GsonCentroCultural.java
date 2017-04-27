package centrosculturales;

import android.util.JsonReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import com.google.gson.Gson;



public class GsonCentroCultural {
    public ArrayList<Data> leerFlujoJson(InputStream in) throws IOException{
         Gson gson=new Gson();
        JsonReader reader= new JsonReader(new InputStreamReader(in,"UTF-8"));
        ArrayList <Data> listaCentros=  new ArrayList<>();
        reader.beginArray();

        while (reader.hasNext()){
            Data centro = gson.fromJson(String.valueOf(reader), Data.class);
            listaCentros.add(centro);
        }
        reader.endArray();
        reader.close();
        return listaCentros;
    }
}
