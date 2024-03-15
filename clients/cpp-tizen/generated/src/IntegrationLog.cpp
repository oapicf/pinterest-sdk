#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "IntegrationLog.h"

using namespace std;
using namespace Tizen::ArtikCloud;

IntegrationLog::IntegrationLog()
{
	//__init();
}

IntegrationLog::~IntegrationLog()
{
	//__cleanup();
}

void
IntegrationLog::__init()
{
	//client_timestamp = int(0);
	//event_type = std::string();
	//log_level = std::string();
	//external_business_id = std::string();
	//advertiser_id = std::string();
	//merchant_id = std::string();
	//tag_id = std::string();
	//feed_profile_id = std::string();
	//message = std::string();
	//app_version_number = std::string();
	//platform_version_number = std::string();
	//error = new IntegrationLogClientError();
	//request = new IntegrationLogClientRequest();
}

void
IntegrationLog::__cleanup()
{
	//if(client_timestamp != NULL) {
	//
	//delete client_timestamp;
	//client_timestamp = NULL;
	//}
	//if(event_type != NULL) {
	//
	//delete event_type;
	//event_type = NULL;
	//}
	//if(log_level != NULL) {
	//
	//delete log_level;
	//log_level = NULL;
	//}
	//if(external_business_id != NULL) {
	//
	//delete external_business_id;
	//external_business_id = NULL;
	//}
	//if(advertiser_id != NULL) {
	//
	//delete advertiser_id;
	//advertiser_id = NULL;
	//}
	//if(merchant_id != NULL) {
	//
	//delete merchant_id;
	//merchant_id = NULL;
	//}
	//if(tag_id != NULL) {
	//
	//delete tag_id;
	//tag_id = NULL;
	//}
	//if(feed_profile_id != NULL) {
	//
	//delete feed_profile_id;
	//feed_profile_id = NULL;
	//}
	//if(message != NULL) {
	//
	//delete message;
	//message = NULL;
	//}
	//if(app_version_number != NULL) {
	//
	//delete app_version_number;
	//app_version_number = NULL;
	//}
	//if(platform_version_number != NULL) {
	//
	//delete platform_version_number;
	//platform_version_number = NULL;
	//}
	//if(error != NULL) {
	//
	//delete error;
	//error = NULL;
	//}
	//if(request != NULL) {
	//
	//delete request;
	//request = NULL;
	//}
	//
}

void
IntegrationLog::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *client_timestampKey = "client_timestamp";
	node = json_object_get_member(pJsonObject, client_timestampKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&client_timestamp, node, "int", "");
		} else {
			
		}
	}
	const gchar *event_typeKey = "event_type";
	node = json_object_get_member(pJsonObject, event_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&event_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *log_levelKey = "log_level";
	node = json_object_get_member(pJsonObject, log_levelKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&log_level, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *external_business_idKey = "external_business_id";
	node = json_object_get_member(pJsonObject, external_business_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&external_business_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *advertiser_idKey = "advertiser_id";
	node = json_object_get_member(pJsonObject, advertiser_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&advertiser_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *merchant_idKey = "merchant_id";
	node = json_object_get_member(pJsonObject, merchant_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&merchant_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *tag_idKey = "tag_id";
	node = json_object_get_member(pJsonObject, tag_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&tag_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *feed_profile_idKey = "feed_profile_id";
	node = json_object_get_member(pJsonObject, feed_profile_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&feed_profile_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *messageKey = "message";
	node = json_object_get_member(pJsonObject, messageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&message, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *app_version_numberKey = "app_version_number";
	node = json_object_get_member(pJsonObject, app_version_numberKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&app_version_number, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *platform_version_numberKey = "platform_version_number";
	node = json_object_get_member(pJsonObject, platform_version_numberKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&platform_version_number, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *errorKey = "error";
	node = json_object_get_member(pJsonObject, errorKey);
	if (node !=NULL) {
	

		if (isprimitive("IntegrationLogClientError")) {
			jsonToValue(&error, node, "IntegrationLogClientError", "IntegrationLogClientError");
		} else {
			
			IntegrationLogClientError* obj = static_cast<IntegrationLogClientError*> (&error);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *requestKey = "request";
	node = json_object_get_member(pJsonObject, requestKey);
	if (node !=NULL) {
	

		if (isprimitive("IntegrationLogClientRequest")) {
			jsonToValue(&request, node, "IntegrationLogClientRequest", "IntegrationLogClientRequest");
		} else {
			
			IntegrationLogClientRequest* obj = static_cast<IntegrationLogClientRequest*> (&request);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

IntegrationLog::IntegrationLog(char* json)
{
	this->fromJson(json);
}

char*
IntegrationLog::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getClientTimestamp();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *client_timestampKey = "client_timestamp";
	json_object_set_member(pJsonObject, client_timestampKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEventType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *event_typeKey = "event_type";
	json_object_set_member(pJsonObject, event_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLogLevel();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *log_levelKey = "log_level";
	json_object_set_member(pJsonObject, log_levelKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getExternalBusinessId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *external_business_idKey = "external_business_id";
	json_object_set_member(pJsonObject, external_business_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAdvertiserId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *advertiser_idKey = "advertiser_id";
	json_object_set_member(pJsonObject, advertiser_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMerchantId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *merchant_idKey = "merchant_id";
	json_object_set_member(pJsonObject, merchant_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTagId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *tag_idKey = "tag_id";
	json_object_set_member(pJsonObject, tag_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFeedProfileId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *feed_profile_idKey = "feed_profile_id";
	json_object_set_member(pJsonObject, feed_profile_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMessage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *messageKey = "message";
	json_object_set_member(pJsonObject, messageKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAppVersionNumber();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *app_version_numberKey = "app_version_number";
	json_object_set_member(pJsonObject, app_version_numberKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPlatformVersionNumber();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *platform_version_numberKey = "platform_version_number";
	json_object_set_member(pJsonObject, platform_version_numberKey, node);
	if (isprimitive("IntegrationLogClientError")) {
		IntegrationLogClientError obj = getError();
		node = converttoJson(&obj, "IntegrationLogClientError", "");
	}
	else {
		
		IntegrationLogClientError obj = static_cast<IntegrationLogClientError> (getError());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *errorKey = "error";
	json_object_set_member(pJsonObject, errorKey, node);
	if (isprimitive("IntegrationLogClientRequest")) {
		IntegrationLogClientRequest obj = getRequest();
		node = converttoJson(&obj, "IntegrationLogClientRequest", "");
	}
	else {
		
		IntegrationLogClientRequest obj = static_cast<IntegrationLogClientRequest> (getRequest());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *requestKey = "request";
	json_object_set_member(pJsonObject, requestKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
IntegrationLog::getClientTimestamp()
{
	return client_timestamp;
}

void
IntegrationLog::setClientTimestamp(int  client_timestamp)
{
	this->client_timestamp = client_timestamp;
}

std::string
IntegrationLog::getEventType()
{
	return event_type;
}

void
IntegrationLog::setEventType(std::string  event_type)
{
	this->event_type = event_type;
}

std::string
IntegrationLog::getLogLevel()
{
	return log_level;
}

void
IntegrationLog::setLogLevel(std::string  log_level)
{
	this->log_level = log_level;
}

std::string
IntegrationLog::getExternalBusinessId()
{
	return external_business_id;
}

void
IntegrationLog::setExternalBusinessId(std::string  external_business_id)
{
	this->external_business_id = external_business_id;
}

std::string
IntegrationLog::getAdvertiserId()
{
	return advertiser_id;
}

void
IntegrationLog::setAdvertiserId(std::string  advertiser_id)
{
	this->advertiser_id = advertiser_id;
}

std::string
IntegrationLog::getMerchantId()
{
	return merchant_id;
}

void
IntegrationLog::setMerchantId(std::string  merchant_id)
{
	this->merchant_id = merchant_id;
}

std::string
IntegrationLog::getTagId()
{
	return tag_id;
}

void
IntegrationLog::setTagId(std::string  tag_id)
{
	this->tag_id = tag_id;
}

std::string
IntegrationLog::getFeedProfileId()
{
	return feed_profile_id;
}

void
IntegrationLog::setFeedProfileId(std::string  feed_profile_id)
{
	this->feed_profile_id = feed_profile_id;
}

std::string
IntegrationLog::getMessage()
{
	return message;
}

void
IntegrationLog::setMessage(std::string  message)
{
	this->message = message;
}

std::string
IntegrationLog::getAppVersionNumber()
{
	return app_version_number;
}

void
IntegrationLog::setAppVersionNumber(std::string  app_version_number)
{
	this->app_version_number = app_version_number;
}

std::string
IntegrationLog::getPlatformVersionNumber()
{
	return platform_version_number;
}

void
IntegrationLog::setPlatformVersionNumber(std::string  platform_version_number)
{
	this->platform_version_number = platform_version_number;
}

IntegrationLogClientError
IntegrationLog::getError()
{
	return error;
}

void
IntegrationLog::setError(IntegrationLogClientError  error)
{
	this->error = error;
}

IntegrationLogClientRequest
IntegrationLog::getRequest()
{
	return request;
}

void
IntegrationLog::setRequest(IntegrationLogClientRequest  request)
{
	this->request = request;
}


