package com.mustard.transport.SubscriptionService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SubscriptionController {
	
	@Autowired
	private SubscriptionService subscriptionService;
	
	
	@RequestMapping(value="/subscriptions", method = RequestMethod.GET)
	public ResponseEntity<List<Subscription>> getSubscriptions(){
		
		List<Subscription> subscriptions = subscriptionService.getSubscriptions();
		return new ResponseEntity<>(subscriptions,HttpStatus.OK);
	}
}
