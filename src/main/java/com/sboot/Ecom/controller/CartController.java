package com.sboot.Ecom.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.servlet.ModelAndView;

import com.sboot.Ecom.model.Cart;

import com.sboot.Ecom.service.CartService;


@Controller
public class CartController {

	@Autowired
	private CartService cartService;

	@GetMapping("/cart/{Id}")
	public ModelAndView getCartItemsById(@PathVariable long Id) {
		ModelAndView modelAndView =new ModelAndView("dashboard");
		
		return modelAndView;
	}
	
	@PostMapping("/cart")
	public String doregistration(Cart cart) {
		
		cartService.add(cart);
		
		return "redirect:/mycart";
	}
	
	@PostMapping("/deleteFromCart")
	public String doDeleteFromCart(Cart cart) {
		
		cartService.deleteByCustAndProdId(cart);
		
		return "redirect:/mycart";
	}
	
}
