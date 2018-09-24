package com.cenzhongman.spring.p05UploadFile;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置上传
 */
@Configuration
public class FileUpLoadConfig {

    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //// 设置文件大小限制,超了，页面会抛出异常信息，这时候就需要进行异常信息的处理了;
        factory.setMaxFileSize("128KB"); // KB,MB
        /// 设置总上传数据总大小
        factory.setMaxRequestSize("256KB");
        // Sets the directory location where files will be stored. 设置上传路径,临时文件，直接会被删除，可选
        factory.setLocation("c:/other/");
        return factory.createMultipartConfig();
    }
}
