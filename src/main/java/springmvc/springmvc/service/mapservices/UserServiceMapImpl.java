package springmvc.springmvc.service.mapservices;



import springmvc.springmvc.domain.DomainObject;
import springmvc.springmvc.domain.User;
import springmvc.springmvc.service.UserService;

import java.util.List;


public class UserServiceMapImpl extends AbstractMapService implements UserService {

    @Override
    public List<DomainObject> listAll() {
        return super.listAll();
    }

    @Override
    public User getById(Integer id) {
        return (User) super.getById(id);
    }

    @Override
    public User saveOrUpdate(User domainObject) {
        return (User) super.saveOrUpdate(domainObject);
    }

    @Override
    public void delete(Integer id) {
        super.delete(id);
    }

    @Override
    protected void loadDomainObjects() {

    }
}