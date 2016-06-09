#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/")
public class IndexController {
	@RequestMapping(value = "index", method = RequestMethod.GET)
	public @ResponseBody String index(){
		return "Created by quick-springmvc!";
	} 
}