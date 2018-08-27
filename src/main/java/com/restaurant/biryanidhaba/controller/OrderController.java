/**
 * 
 */
package com.restaurant.biryanidhaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.biryanidhaba.dto.Biryani;

/**
 * @author ranjith.kandi
 *
 */
@RestController
public class OrderController {
	
	@PostMapping("/orderBiryani")
	public String orderBiryani(@RequestBody Biryani biryani) {
		return "Biryani is ordered";
	}
	
	@GetMapping("/getMenu")
	public Menu getMenu() {
		Menu menu = new Menu();
		return menu;
	}

}
