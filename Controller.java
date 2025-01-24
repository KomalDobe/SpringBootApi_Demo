package com.jbk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	    @RequestMapping(value="/first",method = RequestMethod.GET)
		public String firstAPI() {
			return "This is the First API";
		}
		
		@RequestMapping(value="/second",method = RequestMethod.POST)
		public String secondAPI() {
			return "This is the Second API";
		}
		
		@RequestMapping(value="/third",method = RequestMethod.PUT)
		public String thirdAPI() {
			return "This is the Third API";
		}
		
		@RequestMapping(value="/third",method = RequestMethod.DELETE)
		public String fourthAPI() {
			return "This is the Fourth API";
		}
	}

