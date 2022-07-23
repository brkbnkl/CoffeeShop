package Adapters;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import MernisReferance.VEMKPSPublicSoap;

public class MernisServiceAdapter implements ICustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception  {
        VEMKPSPublicSoap client = new VEMKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalitId()),customer.getFirstName(),customer.getLastName(),customer.getDateOfBirth());
    }
}
