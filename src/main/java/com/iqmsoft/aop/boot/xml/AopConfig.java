package com.iqmsoft.aop.boot.xml;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@Configuration
@ImportResource("classpath:aopContext.xml")
public class AopConfig {
}
