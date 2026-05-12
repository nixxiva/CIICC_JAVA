public class Toy {

    public static String name = "Gundam";
    public String brand;
    public double price;
    public int quantity;

    void setPrice(double price){
        this.price = price;
    }

    public static void main(String[] args){
        System.out.println("Hello World");
        Toy toy1 = new Toy();
        System.out.println(toy1.name);
    }


}
