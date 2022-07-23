import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {
    public static void main(String[] args) throws Exception {

        BaseCustomerManager customerManager = new NeroCustomerManager();
        customerManager.Save(new Customer(1,"Berk","Benkel",1989,"53854116564"));
    }
}
