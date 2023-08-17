public class app {

    public static void main(String[] args) {
        Product P1 = new Product();
        Electronics P2 = new Electronics();
        Smartphone P3 = new Smartphone();
        Book P4 = new Book();

        // P1 "Chair"
        P1.setName("Chair");
        P1.setPrice(500);
        // P2 Television
        P2.setName("Television");
        P2.setPrice(20000);
        P2.setBrand("Samsung");
        P2.setModel("Neo QLED");
        // P3 Iphone
        P3.setName("Iphone");
        P3.setPrice(40000);
        P3.setBrand("Apple");
        P3.setModel("Iphone 99");
        P3.setOS("ios");
        // P4 OOP Programming
        P4.setName("OOP Programming");
        P4.setPrice(250);
        P4.setAuther("John Doe");
        P4.setPages(300);

        System.out.println();
        System.out.println("Product Name : " + P1.getName());
        System.out.println("Product Price : " + P1.getPrice());
        System.out.println("**********************************");

        System.out.println("Product Name : " + P2.getName());
        System.out.println("Product Price : " + P2.getPrice());
        System.out.println("Brand : " + P2.getBrand());
        System.out.println("Model : " + P2.getModel());
        System.out.println("**********************************");

        System.out.println("Product Name : " + P3.getName());
        System.out.println("Product Price : " + P3.getPrice());
        System.out.println("Brand : " + P3.getBrand());
        System.out.println("Model : " + P3.getModel());
        System.out.println("Operating System : " + P3.getOS());
        System.out.println("**********************************");

        System.out.println("Product Name : " + P4.getName());
        System.out.println("Product Price : " + P4.getPrice());
        System.out.println("Author : " + P4.getAuthor());
        System.out.println("Number of Pages : " + P4.getPages());

    }
 
}

class Product {
    private String name;
    private double price;

    public String getName() {
        return this.name;
    }

    public void setName(String P_Name) {
        this.name = P_Name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double P_Price) {
        this.price = P_Price;
    }
}

class Electronics extends Product {
    private String brand;
    private String model;

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String P_Brand) {
        this.brand = P_Brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String P_Model) {
        this.model = P_Model;
    }

}

class Book extends Product {
    private String author;
    private int pages;

    public String getAuthor() {
        return this.author;
    }

    public void setAuther(String Author_name) {
        this.author = Author_name;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int page_amount) {
        this.pages = page_amount;
    }

}

class Smartphone extends Electronics {
    private String OS;

    public String getOS() {
        return this.OS;
    }

    public void setOS(String P_OS) {
        this.OS = P_OS;
    }
}