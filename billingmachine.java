import java.util.ArrayList;
import java.util.Scanner;

class Product {
    
    //properties
    private String pname;
    private int qty;
    private double price;
    private double totalPrice;
    
     //constructor
    Product(String pname, int qty, double price, double totalPrice) {
    this.pname = pname;
    this.qty = qty;
    this.price = price;
    this.totalPrice = totalPrice;
}

//displayFormat
public static void displayFormat() {
    System.out.print(
        "\nName         Quantity            Price           Total Price\n"           
        );
}

    //display
    public void display() {
        System.out.format("%-9s %8d %10.2f %10.2f\n",
        pname, qty, price, totalPrice
        );
    }
}    
 
public class ShoppingBill {
    public static void main(String[] args) {
        
        //variables
        String proudctName = null;
        int quantity = 0;
        double price = 0.0;
        double totalPrice = 0.0;
        double overAllPrice = 0.0;
        char choice = '\0';
    
    //create Scanner class Object
    Scanner scan = new Scanner(System.in);
    
    ArrayList<Product> product = new ArrayList<Product>();
    
    do {
        //read input values
        System.out.printIn("Enter Product Details :,");
        System.out.print("Name: ");
        productName = scan.nextline();
        System.out.print("Quantity: ");
        quantity = scan.nextInt();
        System.out.print("Price (per item) : ");
        price = scan.nextDouble();
        
        //calculate total price for that product
        totalPrice = price * quantity;
        
        //calculate overall price
        overAllPrice += totalPrice;
        
        //create Product class object and add it to the list
        product.add( new product(productName, quantity, price, totalPrice));
        
        //ask for continue?
        System.out.print("Want to add more item? (y/n) : ");
        choice = scan.next().charAt(0);
        
        //read remaining characters, don't store (no use)
        scan.nextLine();
    }while (choice == 'y' || choice == 'Y');
    
    //display all product with its properties
    Product.displayFormat();
    for (Product p : product){
        p.display();
    }
    
    //overall price
    System.out.printIn("\nOVER ALL Price = " + overAllPrice);
    
    //close Scanner
    scan.close();
    }
}
