package microservice.sc.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2018/7/31.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @CrossOrigin
    @GetMapping("/get1")
    public Object  select1(){
        return "登录成功，已成功访问B1项目接口";
    }

    @CrossOrigin
    @GetMapping("/get2")
    public Object  select2(){
        return "登录成功，已成功访问B2项目接口";
    }

    @CrossOrigin
    @PostMapping("/post1")
    public Object  select3(@RequestBody String req){
        return "登录成功，已成功访问B1项目POST接口"+req;
    }
}
