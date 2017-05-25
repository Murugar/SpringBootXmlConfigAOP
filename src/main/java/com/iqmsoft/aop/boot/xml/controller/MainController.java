package com.iqmsoft.aop.boot.xml.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;


@RestController
public class MainController {

    @RequestMapping("/hello")
    public HelloObject hello(@RequestParam(value = "name") String name){
        System.out.println("In controller!");
        HelloObject obj = new HelloObject();
        obj.setName(name);
        obj.setVersion("1.0");
        return obj;
    }

    private static class HelloObject {
        private String name;
        private String version;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        @Override
        public String toString() {
            return "HelloObject{" +
                    "name='" + name + '\'' +
                    ", version='" + version + '\'' +
                    '}';
        }
    }
}
