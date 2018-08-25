/**
 *
 */
package cn.dw.hz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author aubrey
 * @date  下午3:38:49
 * 
 */
@Controller
//@RequestMapping("/test")
public class TestController {
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		return "testcontroller";
	}

}
