package pers.hc.orchard.blog.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @功能描述: API文档注解配置。
 * @项目版本: V1.0
 * @项目名称: 享宇金服-PAYMENT
 * @创建作者: liujicheng
 * @创建日期: 2019年04月04日 上午11:24:07
 * @ClassName: SwaggerConfig
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("Orchard API 文档")
                .description("orchard")
                .version("1.0")
                .termsOfServiceUrl("")
                .build();

        return apiInfo;
    }

    @Bean
    public Docket demo() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("domo")
                .genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(false).pathMapping("/").select()
                .paths(Predicates.or(PathSelectors.regex("/demo/.*")))// 过滤的接口
                .build().apiInfo(apiInfo());
//		return new Docket(DocumentationType.SWAGGER_2)
//				.groupName("domo")//分组名称
//				.select()
//				.paths(PathSelectors.any())//指定路径处理PathSelectors.any()代表所有的
//				.build()
//				.apiInfo(apiInfo());
    }


    /**
     * @return
     * @描述：易宝支付相关接口
     * @author liujicheng
     * @Date 2019/4/15
     */
    @Bean
    public Docket yeepayDoc() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("article")
                .genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(false).pathMapping("/").select()
                .paths(Predicates.or(PathSelectors.regex("/article/.*")))// 过滤的接口
                .build().apiInfo(apiInfo());
    }

}
