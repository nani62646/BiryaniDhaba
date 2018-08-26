/**
 * 
 */
package com.restaurant.biryanidhaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ranjith.kandi
 *
 */
@RestController
public class OrderController {
	
	@GetMapping("/orderBiryani")
	public String orderBiryani() {
		return "Biryani is ordered";
	}

}
