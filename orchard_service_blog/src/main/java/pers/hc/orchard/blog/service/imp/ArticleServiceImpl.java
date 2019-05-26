package pers.hc.orchard.blog.service.imp;

import org.springframework.stereotype.Service;
import pers.hc.orchard.blog.entity.Article;
import pers.hc.orchard.blog.service.IArticleService;
import pers.hc.orchard.common.vo.BasePageRequestVo;

import java.util.List;

/**
 * Created by liujicheng on 2019/5/24.
 */
@Service
public class ArticleServiceImpl implements IArticleService {

//    @Autowired
//    IArticleMapper articleMapper;

    @Override
    public List<Article> selectArticlesPage(BasePageRequestVo requestVo) {
//        ArticleExample example = new ArticleExample();
//        ArticleExample.Criteria criteria = example.createCriteria();
//        criteria.andIsShowEqualTo((byte)1);
//        criteria.andIsDelEqualTo((byte)0);
//        return articleMapper.selectByExample(example);
        return null;
    }
}
