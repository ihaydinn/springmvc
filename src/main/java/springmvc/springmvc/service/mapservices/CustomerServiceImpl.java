package springmvc.springmvc.service.mapservices;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springmvc.springmvc.domain.Customer;
import springmvc.springmvc.domain.DomainObject;
import springmvc.springmvc.service.CustomerService;

import java.util.List;

@Service
@Profile("map")
public class CustomerServiceImpl extends AbstractMapService implements CustomerService {

    @Override
    public List<DomainObject> listAll() {
        return super.listAll();
    }

    @Override
    public Customer getById(Integer id) {
        return (Customer) super.getById(id);
    }

    @Override
    public Customer saveOrUpdate(Customer domainObject) {
        return (Customer) super.saveOrUpdate(domainObject);
    }

    @Override
    public void delete(Integer id) {
        super.delete(id);
    }

    @Override
    protected void loadDomainObjects() {

    }

}