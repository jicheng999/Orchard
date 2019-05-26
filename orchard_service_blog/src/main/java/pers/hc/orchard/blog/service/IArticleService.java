package pers.hc.orchard.blog.service;

import pers.hc.orchard.blog.entity.Article;
import pers.hc.orchard.common.vo.BasePageRequestVo;

import java.util.List;

/**
 * Created by liujicheng on 2019/5/24.
 */
public interface IArticleService {
    List<Article> selectArticlesPage(BasePageRequestVo requestVo);
}
