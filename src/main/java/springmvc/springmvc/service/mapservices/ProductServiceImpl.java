package springmvc.springmvc.service.mapservices;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springmvc.springmvc.domain.DomainObject;
import springmvc.springmvc.domain.Product;
import springmvc.springmvc.service.ProductService;

import java.util.List;


@Service
@Profile("map")
public class ProductServiceImpl extends AbstractMapService implements ProductService {

    @Override
    public List<DomainObject> listAll() {
        return super.listAll();
    }

    @Override
    public Product getById(Integer id) {
        return (Product) super.getById(id);
    }

    @Override
    public Product saveOrUpdate(Product domainObject) {
        return (Product) super.saveOrUpdate(domainObject);
    }

    @Override
    public void delete(Integer id) {
        super.delete(id);
    }

    @Override
    protected void loadDomainObjects() {

    }

}