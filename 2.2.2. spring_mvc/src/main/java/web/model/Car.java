package web.model;

public class Car {
    private String model;
    private int series;
    private String ownerName;

    public Car(){

    }

    public Car(String model, int series, String ownerName){
        this.model = model;
        this.series = series;
        this.ownerName = ownerName;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
