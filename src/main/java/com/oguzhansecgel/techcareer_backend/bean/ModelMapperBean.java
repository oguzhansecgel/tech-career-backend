package com.oguzhansecgel.techcareer_backend.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Log4j2
@Configuration
public class ModelMapperBean {

    @Bean
    @Scope("singleton")
    public ModelMapper getModelMapperMethodSingleton()
    {
        return new ModelMapper();
    }


}
