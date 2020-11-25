public class Car {
//    5. Створити клас Car
//     - кінські сили (або потужність)
//     - об'єм двигуна
//     + 5 полів придумати самостійно


    String producer;
    String model;
    String color;
    double price;
    int year;
    int power;
    double engine;

    public Car() {
    }

    public Car(String producer, String model, String color, double price, int year, int power, double engine) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.price = price;
        this.year = year;
        this.power = power;
        this.engine = engine;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public int getPower() {
        return power;
    }

    public double getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", power=" + power +
                ", engine=" + engine +
                '}';
    }
}
