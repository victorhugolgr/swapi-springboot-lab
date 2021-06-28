package com.example.swapispringbootlab.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.codec.Decoder;
import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

@Configuration
public class FeignConfig {

	 @Bean
	   public Encoder feignEncoder() {
	      return new SpringFormEncoder(new JacksonEncoder());
	   }
	   
	   @Bean
	   public Decoder feignDecoder() {
	      return new JacksonDecoder();
	   }

}