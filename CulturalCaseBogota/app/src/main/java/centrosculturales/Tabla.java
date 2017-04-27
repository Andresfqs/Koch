package centrosculturales;

import android.media.RemoteController;

import java.util.ArrayList;

/**
 * Created by JuanMa on 27/04/2017.
 */

public class Tabla {
    public String[] getMeta() {
        return meta;
    }

    public void setMeta(String[] meta) {
        this.meta = meta;
    }

    public ArrayList<Data> getData() {
        return data;
    }

    public void setData(ArrayList<Data> data) {
        this.data = data;
    }

    private String[] meta;
    private ArrayList<Data> data;
}
