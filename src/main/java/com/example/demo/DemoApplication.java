package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

@EnableAutoConfiguration
@RestController
@RequestMapping("admin/")
public class DemoApplication {

    /**
     * 用户首页，用于登录之后给用户看一些信息
     * 信息可以从数据库中取，这边作为demo，暂时写死
     * @return
     */
    @RequestMapping("home")
    String home(HttpServletRequest request) {
        String userName = "Jef";
        if( userName=="Jef" ){
            System.out.print("这是 if 语句1");
        }else if ( userName=="Jef" ){
            System.out.print("这是 else 语句2");
        }else if ( userName=="wyqtest" ){
            System.out.print("这是wyqtest");
        }else{
            System.out.print("这是 else 语句3");

        }


        int count = 100;
        return "欢迎您" + userName + "，这是您的第 " + count + " 次登录";
    }

    @RequestMapping("zhuce")
    String kaifei(HttpServletRequest request) {
        String userName = "Jef";
        int count = 100;
        return "我草";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}