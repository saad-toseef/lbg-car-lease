package com.mustard.transport.SubscriptionService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService {

	@Autowired
	private SubscriptionRepository subscriptionRepository;

	public List<Subscription> getSubscriptions() {

		List<Subscription> subscriptions = subscriptionRepository.findAll();

		return subscriptions;

	}

}
