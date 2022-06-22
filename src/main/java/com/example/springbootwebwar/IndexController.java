package com.example.springbootwebwar;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Monster
 * @date: 2019-05-14 17:02
 **/
@CrossOrigin(origins = "*")
@RestController
public class IndexController {


	@RequestMapping("/hi")
	public String testFreemarker(){
		//modelMap.addAttribute("msg", "Hello dalaoyang , this is freemarker");
		return "hi";
	}



    @RequestMapping(value="/hello",method= RequestMethod.GET)
    public String hello(){
        return "hello world";
    }


}
