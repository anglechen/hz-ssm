/**
 *
 */
package cn.dw.hz.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import cn.dw.hz.dto.UserDto;
import cn.dw.hz.model.User;
import cn.dw.hz.service.UserService;
import jdk.nashorn.internal.ir.RuntimeNode.Request;

/**
 * @author aubrey
 * @date  上午10:59:18
 * 
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
//	@Qualifier("userService1") 
//	@Resource(name="userService1")
	private UserService userService;
	
	/* 指定请求的类型：method=RequestMethod.POST*/
	@RequestMapping(value="/add")
	@ResponseBody /*如果要直接返回数据(如：json）需要加上此注解*/
	public String add(User user) {
		userService.add(user);
		return "success";
		
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(User user) {
		userService.delete(user);
		return "success";
	}
	
	@RequestMapping("/query")
	@ResponseBody
	public String query(UserDto user) {
		List<User> results = userService.query(user);
		JSONObject json = new JSONObject();
		json.put("result", results);
		return json.toJSONString();
	}
	
	
	@RequestMapping("/update")
	@ResponseBody
	public String update(User user) {
		userService.update(user);
		return "success";
	}
	
	
	
	

}
