package centrosculturales;

import java.util.ArrayList;

public class Singleton {
    private static final Singleton ourInstance = new Singleton();

    private String localizacion;
    private ArrayList <Data> listadoCentros;

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
        listadoCentros = new ArrayList();
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public ArrayList<Data> getListadoCentros() {
        return listadoCentros;
    }

    public void setListadoCentros(ArrayList<Data> listadoCentros) {
        this.listadoCentros = listadoCentros;
    }
}
