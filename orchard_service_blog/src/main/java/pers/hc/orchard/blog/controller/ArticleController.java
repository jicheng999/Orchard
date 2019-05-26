package pers.hc.orchard.blog.controller;

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.hc.orchard.blog.entity.Article;
import pers.hc.orchard.blog.service.IArticleService;
import pers.hc.orchard.common.vo.BasePageRequestVo;
import pers.hc.orchard.common.vo.PageResponseVo;

import java.util.List;

/**
 * Created by liujicheng on 2019/5/24.
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    IArticleService articleService;

    @PostMapping(value = "/summaryInfoList")
    @ApiOperation(value = "文章概要信息列表", httpMethod = "POST", notes = "收银台", code = 200, response = PageResponseVo.class)
    @ApiResponses({@ApiResponse(code = 200, message = "业务成功完成"),
            @ApiResponse(code = 400, message = "表明在请求 API时提供了错误信息"),
            @ApiResponse(code = 500, message = "表明 API请求时,服务器发生了错误")})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "pageIndex", dataType = "String", required = true, value = "页号", defaultValue = "1"),
            @ApiImplicitParam(paramType = "query", name = "pageSize", dataType = "String", required = true, value = "单页尺寸", defaultValue = "20"),
            @ApiImplicitParam(paramType = "query", name = "conditions", dataType = "Map", required = true, value = "查询条件")})
    @ResponseBody
    public PageResponseVo getArticelList(@RequestBody  BasePageRequestVo requestVo) {

        List<Article> lsit = articleService.selectArticlesPage(requestVo);

        PageResponseVo responseVo = PageResponseVo.getSuccessVo();
        responseVo.setBody(lsit);
        return responseVo;
    }
}
