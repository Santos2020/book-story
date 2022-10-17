package com.carlos.bookstory.configs;

import com.carlos.bookstory.services.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("/dev")
public class DevConfig {

    @Autowired
    private DBService service;

    @Value("${spring.jpa.hibernate.ddl-auto=create}")
    private String strategy;
    private DevConfig dbService;

    @Bean
    public Boolean instanciaBaseDeDados(){
      if(strategy.equals("create")){
          this.dbService.instanciaBaseDeDados();
      }
      return false;
  }
}
