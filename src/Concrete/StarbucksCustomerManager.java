package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private ICustomerCheckService customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    public void save(Customer customer) throws Exception {
        if (customerCheckService.CheckIfRealPerson(customer)) {
            System.out.println("Veritabanına Kaydedildi: " + customer.getFirstName());
        }
        else {
            System.out.println("Doğrulanamayan Kullanıcı");
        }
    }



}
