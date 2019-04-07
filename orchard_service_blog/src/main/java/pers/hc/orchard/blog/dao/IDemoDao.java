package pers.hc.orchard.blog.dao;

import org.springframework.stereotype.Repository;
import pers.hc.orchard.blog.entity.Demo;
import java.util.List;

/**
 * Created by liujicheng on 2018/11/16.
 */
@Repository
public interface IDemoDao {
    /**
     * @描述：保存
     * @param domain
     * @return  void
     *
     * @author liujicheng
     * @Date 2018/11/16 17:35
     */
    void save(Demo domain);
    
    /**
     * @描述：查询所有
     * @param
     * @return  java.util.List<pers.hc.orchard.blog.entity.Demo>
     *
     * @author liujicheng
     * @Date 2018/11/16 17:41
     */
    List<Demo> selectAll();

    /**
     * @描述：更新
     * @param domain
     * @return  void
     *
     * @author liujicheng
     * @Date 2018/11/16 17:41
     */
    void update(Demo domain);
}
