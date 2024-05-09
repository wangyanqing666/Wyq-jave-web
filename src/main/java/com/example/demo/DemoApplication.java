package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
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
    @RequestMapping("home/{userName}")
    String home(HttpServletRequest request, @PathVariable String userName) {
        if( "wyq".equals(userName) ){
            System.out.print("这是 if 语句2225555");
        }else if ( "lsj".equals(userName) ) {
            System.out.print("这是 else 语句2244444");

        } else if ( "jsh".equals(userName) ){
                System.out.print("新增346e4");
        } else if ( "zhm".equals(userName) ){
            System.out.print("新增4");
        }else{
            System.out.print("这是 else 语句334");

        }


        int count = 100;
        return "欢迎您" + userName + "，这是您的第 " + count + " 次登录";
    }

    @RequestMapping("page/{num}")
    String kaifei(HttpServletRequest request,@PathVariable Integer num) {
//        String userName = "Jef";
        if( num == 1 ){
            System.out.print("这是 if dfhdughdsiaaaaaughdaiuhfuadih 语句1");
        }else if (num == 2 ){
            System.out.print("这是 else 语句2");
        }else{
            System.out.print("这是 else 语句3");

        }


        int count = 100;
        return "page num:="+num;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}