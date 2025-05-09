public class Product {
    private int id;
    private String name;
    private String company;
    private double price;
    private int quantity;
    private int day;
    private int month;
    private int year;
    private String date;


    public Product() {
    }

    

    public Product(int id, String name, String company, double price, int quantity, int day, int month, int year) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.price = price;
        this.quantity = quantity;
        this.day = day;
        this.month = month;
        this.year = year;
    }



    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCompany() {
        return company;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    } 
    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String toString(){
        return this.name+" "+this.company+" "+this.id+" "+this.price+" "+this.quantity+" "+this.date;
    }
}
