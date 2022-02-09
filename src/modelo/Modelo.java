package modelo;

public class Modelo {

    private String nombre;

    private Item[] items;

    public Modelo(String nombre, int items) {
        this.nombre = nombre;
        this.items=new Item[items];
    }

    public Modelo(int items) {
        this.items=new Item[items];
    }

    public Modelo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }
}
