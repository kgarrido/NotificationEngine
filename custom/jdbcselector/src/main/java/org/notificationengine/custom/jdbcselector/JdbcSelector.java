package org.notificationengine.custom.jdbcselector;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.apache.log4j.Logger;
import org.notificationengine.domain.Subscription;
import org.notificationengine.domain.Topic;
import org.notificationengine.selector.Selector;
import org.notificationengine.spring.SpringUtils;

public class JdbcSelector extends Selector {

	private static Logger LOGGER = Logger.getLogger(JdbcSelector.class);
	
	public JdbcSelector(Topic topic, Map<String, String> options) {
		super(topic, options);	
	}

	@Override
	protected Collection<Subscription> retrieveSubscriptionsForTopic(Topic topic) {
		
		DbHelper dbHelper = (DbHelper)SpringUtils.getBean(JdbcSelectorConstants.DB_HELPER);
		
		Collection<Subscription> result = new ArrayList<>();
		
		for (Topic fatherTopic : topic.getFathers()) {
		
			LOGGER.debug("Searching Subscriptions for topic : " + fatherTopic);
			
			result.addAll(dbHelper.retrieveSubscriptionsForTopic(fatherTopic.getName()));
		}
		
		LOGGER.debug("Nbr of subscriptions retrieved : " + result.size());
		
		return result;
	}

}
