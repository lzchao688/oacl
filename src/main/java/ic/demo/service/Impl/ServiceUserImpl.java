package ic.demo.service.Impl;

import ic.demo.dao.HrUsersMapper;
import ic.demo.entity.HrUsers;
import ic.demo.service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceUserImpl implements ServiceUser {
    @Autowired
    private HrUsersMapper user;
    @Override
    public List<HrUsers> queryAll() {
        return user.selectAll();
    }
}
