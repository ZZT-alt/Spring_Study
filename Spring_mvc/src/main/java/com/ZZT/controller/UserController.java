package com.ZZT.controller;

import com.ZZT.Domain.User;
import com.ZZT.Domain.VO;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

@SuppressWarnings({"all"})
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/quick", method = RequestMethod.GET, params = {"username"})
    public ModelAndView save() {
        System.out.println("目标资源执行");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("success");
        modelAndView.addObject("username", "郑芷桐");
        System.out.println("UserControlling...");
        return modelAndView;
    }

    @RequestMapping(value = "/test", produces = "application/json;charset=utf-8")
    @ResponseBody
    public User test() throws JsonProcessingException {
        User user = new User();
        user.setName("郑芷桐");
        user.setAddress("广东省天河区");
        //ObjectMapper objectMapper=new ObjectMapper();
        //String string = objectMapper.writeValueAsString(user);
        return user;
    }

    @RequestMapping("/getData")
    @ResponseBody
    public void get_data(String username, String addr) {
        System.out.println(username);
        System.out.println(addr);
    }


    @RequestMapping("/getData1")
    @ResponseBody
    public void get_data1(User user) {
        System.out.println(user);
    }

    @RequestMapping("/getData2")
    @ResponseBody
    public void get_data2(String[] strs) {
        System.out.println(Arrays.asList(strs));
    }

    @RequestMapping("/getData3")
    @ResponseBody
    public void get_data3(VO vo) {
        System.out.println(vo);
    }

    @RequestMapping("/getData4")
    @ResponseBody
    public void get_data4(@RequestParam(value = "username", required = false, defaultValue = "ZZT") String name) {
        System.out.println(name);
    }

    @RequestMapping("/getData5/{address}")
    @ResponseBody
    public void get_data5(@PathVariable(value = "address") String addr) {
        System.out.println(addr);
    }

    @RequestMapping("/getData6")
    @ResponseBody
    public void get_data6(Date date) {
        System.out.println(date);
    }

    @RequestMapping("/getData7")
    @ResponseBody
    public void get_data7(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        System.out.println(request);
        System.out.println(response);
        System.out.println(session);
    }

    @RequestMapping("/getData8")
    @ResponseBody
    public void get_data8(@RequestHeader(value = "User-Agent") String use_agent) {
        System.out.println(use_agent);
    }

    @RequestMapping("/getData9")
    @ResponseBody
    public void get_data9(@CookieValue(value = "JSESSIONID") String jsessionid) {
        System.out.println(jsessionid);
    }

    @RequestMapping("/getData10")
    @ResponseBody
    public void get_data10(String username, MultipartFile uploadfile) throws IOException {
        System.out.println(username);
        System.out.println(uploadfile);
        String filename = uploadfile.getOriginalFilename();
        uploadfile.transferTo(new File("C:/upload/"+filename));
    }
}
