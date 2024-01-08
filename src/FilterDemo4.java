import java.util.ArrayList;
import java.util.List;

class Product{
    int id;
    String name;
    double price;

    public Product(int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}
public class FilterDemo4 {
    public static void main(String[] args) {

        List <Product> productList= new ArrayList<Product>();
        productList.add(new Product(1,"HP", 30000));
        productList.add(new Product(1,"Lenovo", 50000));
        productList.add(new Product(1,"Dell", 40000));
        productList.add(new Product(1,"HP New", 60000));

        productList.stream()
                .filter(p ->p.price>30000)
                .forEach(pr -> System.out.println(pr.price));

    }
}
