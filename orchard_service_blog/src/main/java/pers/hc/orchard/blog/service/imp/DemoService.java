package pers.hc.orchard.blog.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.hc.orchard.blog.dao.IDemoDao;
import pers.hc.orchard.blog.entity.Demo;
import pers.hc.orchard.blog.service.IDemoService;

import java.util.List;

/**
 * Created by liujicheng on 2018/11/16.
 */
@Service
public class DemoService implements IDemoService {

    @Autowired
    RedisTemplate<String, Object> redisTemplate;

    @Autowired
    IDemoDao demoDao;

    @Override
    @Transactional
    public List<Demo> demoTest() {

//        Date now = new Date();
//        Demo dm = new Demo();
//        dm.setAddress("test address");
//        dm.setCreTime(now);
//        dm.setModifyTime(now);
//        demoDao.save(dm);
        return demoDao.selectAll();
    }
}
