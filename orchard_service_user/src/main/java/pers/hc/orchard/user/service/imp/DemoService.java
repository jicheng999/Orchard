package pers.hc.orchard.user.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.hc.orchard.user.dao.IDemoDao;
import pers.hc.orchard.user.entity.Demo;
import pers.hc.orchard.user.service.IDemoService;

/**
 * Created by liujicheng on 2018/11/16.
 */
@Service
public class DemoService implements IDemoService {

    @Autowired
    IDemoDao demoDao;

    @Override
    @Transactional
    public void demoTest() {
        for (int i = 0; i < 20; i++) {
            Demo dm=new Demo();
            dm.setDemo("user"+i);
            demoDao.save(dm);
        }
    }
}
