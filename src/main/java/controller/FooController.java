package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试Git
 * @author RanJi
 *
 */
@Controller
public class FooController {
	
	@GetMapping("/haha")
	@ResponseBody
	public String foo(){
		return "haha";
	}
}
