package edu.ap.spring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import edu.ap.spring.model.InhaalExamen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.ap.spring.redis.RedisService;

@Controller
public class RedisController {


    private RedisService service;

    @Autowired
    public void setRedisService(RedisService service) {
        this.service = service;
    }

    @RequestMapping("/aanvragen/{student}")
    @ResponseBody
    public string aanvragen(@PathVariable String student, Model model){
        string Response = service.hgetAll();
    }

}
