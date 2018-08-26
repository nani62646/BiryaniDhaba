/**
 * 
 */
package com.restaurant.biryanidhaba.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * @author ranjith.kandi
 *
 */
public class Biryani {
	
	@JsonProperty("chickenBiryani") 
	@Getter @Setter
	private boolean chickenBiryani;
	
	@JsonProperty("muttonBiryani") 
	@Getter @Setter 
	private boolean muttonBiryani;

}
