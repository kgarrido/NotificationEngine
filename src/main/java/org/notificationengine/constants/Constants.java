package org.notificationengine.constants;

public class Constants {

	final public static String CONFIGURATION_FILE_NAME = "configuration.json";
	
	final public static String CHANNELS = "channels";
	
	final public static String TOPIC = "topic";
	
	final public static String TOPIC_NAME = "topic.name";
	
	final public static String RAW_NOTIFICATION_TOPIC_NAME = "rawNotification.topic.name";
	
	final public static String ID = "id";
	
	final public static String SELECTOR_TYPE = "selectorType";
	
	public static final String NOTIFICATOR_TYPE = "notificatorType";
	
	final public static String SELECTOR_TYPE_MONGODB = "mongoDbSelector";
	
	final public static String DATABASE = "notificationengine";
	
	final public static String DATABASE_TEST = "notificationengine_test";
	
	final public static String RAW_NOTIFICATIONS_COLLECTION = "rawnotifications";
	
	final public static String DECORATED_NOTIFICATIONS_COLLECTION = "decoratednotifications";
	
	final public static String PERSISTER = "persister";
	
	final public static String TEMPLATE_ENGINE = "templateEngine";
	
	final public static String MAILER = "mailer";
	
	final public static String CONFIGURATION_READER = "configurationReader";

	public static final Object PROCESSED = "processed";

	public static final Object _ID = "_id";

	public static final Object REGEX = "$regex";

	public static final long SELECTOR_TASK_DELAY = 10000;

	public static final long SELECTOR_TASK_PERIOD = 60000;

	public static final String DOT = ".";

	public static final String SENT = "sent";

	public static final String NOTIFICATOR_TYPE_MULTIPLE_MAIL_BY_RECIPIENT = "multipleMailByRecipient";
	
	public static final String NOTIFICATOR_TYPE_SINGLE_MAIL_BY_RECIPIENT = "singleMailByRecipient";
	
	public static final String NOTIFICATOR_TYPE_SINGLE_MULTI_TOPIC_MAIL_BY_RECIPIENT = "singleMultiTopicMailByRecipient";
	
	public static final String SINGLE_MULTI_TOPIC_MAIL_BY_RECIPIENT_NOTIFICATOR = "singleMultiTopicMailByRecipientNotificator";

	public static final int NOTIFICATOR_TASK_DELAY = 20000;
	
	public static final long NOTIFICATOR_TASK_PERIOD = 60000;	

	public static final String TEMPLATE_EXTENSION = ".template";
	
	public static final String MAIL_TEMPLATE = "mailTemplate";

	public static final String RECIPIENT = "recipient";

	public static final String NOTIFICATIONS_BY_RECIPIENT = "notificationsByRecipient";

	public static final String SUBSCRIPTION_CONTROLLER = "subscriptionController";

	public static final String NOTIFICATIONS_FOR_TOPIC = "notificationsForTopic";

	public static final String TOPICS = "topics";

	public static final String NOTIFICATOR_TYPE_CUSTOM = "customNotificator";
	
	public static final String SELECTOR_TYPE_CUSTOM = "customSelector";

	public static final String OPTION_NOTIFICATOR_TASK_PERIOD = "notificatorTaskPeriod";
	
	public static final String OPTION_SELECTOR_TASK_PERIOD = "selectorTaskPeriod";
}
