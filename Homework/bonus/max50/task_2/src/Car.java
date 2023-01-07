public class Car {
    private String name;
    private String brand;
    private int year;
    private int total_distance;

    public Car(String name, String brand, int year, int total_distance) {
        this.name = name;
        this.brand = brand;
        this.year = year;
        this.total_distance = total_distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getTotal_distance() {
        return total_distance;
    }

    public void setTotal_distance(int total_distance) {
        this.total_distance = total_distance;
    }

    public void trip(int new_distance){
        this.setTotal_distance(this.getTotal_distance()+new_distance);
    }


}
