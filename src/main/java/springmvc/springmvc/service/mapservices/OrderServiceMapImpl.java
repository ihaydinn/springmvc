package springmvc.springmvc.service.mapservices;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springmvc.springmvc.domain.DomainObject;
import springmvc.springmvc.domain.Order;
import springmvc.springmvc.service.OrderService;

import java.util.List;

@Service
@Profile("map")
public class OrderServiceMapImpl extends AbstractMapService implements OrderService {
    @Override
    public List<DomainObject> listAll() {
        return super.listAll();
    }

    @Override
    public Order getById(Integer id) {
        return (Order) super.getById(id);
    }

    @Override
    public Order saveOrUpdate(Order domainObject) {
        return (Order) super.saveOrUpdate(domainObject);
    }

    @Override
    public void delete(Integer id) {
        super.delete(id);
    }

    @Override
    protected void loadDomainObjects() {

    }
}