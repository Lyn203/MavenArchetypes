#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorld {
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		model.addAttribute("msg", "Hello World");
		return "index";
	}
}
