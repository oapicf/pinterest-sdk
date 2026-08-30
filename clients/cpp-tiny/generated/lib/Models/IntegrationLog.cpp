

#include "IntegrationLog.h"

using namespace Tiny;

IntegrationLog::IntegrationLog()
{
	advertiser_id = std::string();
	app_version_number = std::string();
	client_timestamp = int(0);
	error = IntegrationLogClientError();
	event_type = null;
	external_business_id = std::string();
	feed_profile_id = std::string();
	log_level = null;
	merchant_id = std::string();
	message = std::string();
	platform_version_number = std::string();
	request = IntegrationLogClientRequest();
	tag_id = std::string();
}

IntegrationLog::IntegrationLog(std::string jsonString)
{
	this->fromJson(jsonString);
}

IntegrationLog::~IntegrationLog()
{

}

void
IntegrationLog::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *advertiser_idKey = "advertiser_id";

    if(object.has_key(advertiser_idKey))
    {
        bourne::json value = object[advertiser_idKey];



        jsonToValue(&advertiser_id, value, "std::string");


    }

    const char *app_version_numberKey = "app_version_number";

    if(object.has_key(app_version_numberKey))
    {
        bourne::json value = object[app_version_numberKey];



        jsonToValue(&app_version_number, value, "std::string");


    }

    const char *client_timestampKey = "client_timestamp";

    if(object.has_key(client_timestampKey))
    {
        bourne::json value = object[client_timestampKey];



        jsonToValue(&client_timestamp, value, "int");


    }

    const char *errorKey = "error";

    if(object.has_key(errorKey))
    {
        bourne::json value = object[errorKey];




        IntegrationLogClientError* obj = &error;
		obj->fromJson(value.dump());

    }

    const char *event_typeKey = "event_type";

    if(object.has_key(event_typeKey))
    {
        bourne::json value = object[event_typeKey];




        IntegrationLogEventType* obj = &event_type;
		obj->fromJson(value.dump());

    }

    const char *external_business_idKey = "external_business_id";

    if(object.has_key(external_business_idKey))
    {
        bourne::json value = object[external_business_idKey];



        jsonToValue(&external_business_id, value, "std::string");


    }

    const char *feed_profile_idKey = "feed_profile_id";

    if(object.has_key(feed_profile_idKey))
    {
        bourne::json value = object[feed_profile_idKey];



        jsonToValue(&feed_profile_id, value, "std::string");


    }

    const char *log_levelKey = "log_level";

    if(object.has_key(log_levelKey))
    {
        bourne::json value = object[log_levelKey];




        IntegrationLogLevel* obj = &log_level;
		obj->fromJson(value.dump());

    }

    const char *merchant_idKey = "merchant_id";

    if(object.has_key(merchant_idKey))
    {
        bourne::json value = object[merchant_idKey];



        jsonToValue(&merchant_id, value, "std::string");


    }

    const char *messageKey = "message";

    if(object.has_key(messageKey))
    {
        bourne::json value = object[messageKey];



        jsonToValue(&message, value, "std::string");


    }

    const char *platform_version_numberKey = "platform_version_number";

    if(object.has_key(platform_version_numberKey))
    {
        bourne::json value = object[platform_version_numberKey];



        jsonToValue(&platform_version_number, value, "std::string");


    }

    const char *requestKey = "request";

    if(object.has_key(requestKey))
    {
        bourne::json value = object[requestKey];




        IntegrationLogClientRequest* obj = &request;
		obj->fromJson(value.dump());

    }

    const char *tag_idKey = "tag_id";

    if(object.has_key(tag_idKey))
    {
        bourne::json value = object[tag_idKey];



        jsonToValue(&tag_id, value, "std::string");


    }


}

bourne::json
IntegrationLog::toJson()
{
    bourne::json object = bourne::json::object();





    object["advertiser_id"] = getAdvertiserId();






    object["app_version_number"] = getAppVersionNumber();






    object["client_timestamp"] = getClientTimestamp();







	object["error"] = getError().toJson();






	object["event_type"] = getEventType().toJson();





    object["external_business_id"] = getExternalBusinessId();






    object["feed_profile_id"] = getFeedProfileId();







	object["log_level"] = getLogLevel().toJson();





    object["merchant_id"] = getMerchantId();






    object["message"] = getMessage();






    object["platform_version_number"] = getPlatformVersionNumber();







	object["request"] = getRequest().toJson();





    object["tag_id"] = getTagId();



    return object;

}

std::string
IntegrationLog::getAdvertiserId()
{
	return advertiser_id;
}

void
IntegrationLog::setAdvertiserId(std::string advertiser_id)
{
	this->advertiser_id = advertiser_id;
}

std::string
IntegrationLog::getAppVersionNumber()
{
	return app_version_number;
}

void
IntegrationLog::setAppVersionNumber(std::string app_version_number)
{
	this->app_version_number = app_version_number;
}

int
IntegrationLog::getClientTimestamp()
{
	return client_timestamp;
}

void
IntegrationLog::setClientTimestamp(int client_timestamp)
{
	this->client_timestamp = client_timestamp;
}

IntegrationLogClientError
IntegrationLog::getError()
{
	return error;
}

void
IntegrationLog::setError(IntegrationLogClientError error)
{
	this->error = error;
}

IntegrationLogEventType
IntegrationLog::getEventType()
{
	return event_type;
}

void
IntegrationLog::setEventType(IntegrationLogEventType event_type)
{
	this->event_type = event_type;
}

std::string
IntegrationLog::getExternalBusinessId()
{
	return external_business_id;
}

void
IntegrationLog::setExternalBusinessId(std::string external_business_id)
{
	this->external_business_id = external_business_id;
}

std::string
IntegrationLog::getFeedProfileId()
{
	return feed_profile_id;
}

void
IntegrationLog::setFeedProfileId(std::string feed_profile_id)
{
	this->feed_profile_id = feed_profile_id;
}

IntegrationLogLevel
IntegrationLog::getLogLevel()
{
	return log_level;
}

void
IntegrationLog::setLogLevel(IntegrationLogLevel log_level)
{
	this->log_level = log_level;
}

std::string
IntegrationLog::getMerchantId()
{
	return merchant_id;
}

void
IntegrationLog::setMerchantId(std::string merchant_id)
{
	this->merchant_id = merchant_id;
}

std::string
IntegrationLog::getMessage()
{
	return message;
}

void
IntegrationLog::setMessage(std::string message)
{
	this->message = message;
}

std::string
IntegrationLog::getPlatformVersionNumber()
{
	return platform_version_number;
}

void
IntegrationLog::setPlatformVersionNumber(std::string platform_version_number)
{
	this->platform_version_number = platform_version_number;
}

IntegrationLogClientRequest
IntegrationLog::getRequest()
{
	return request;
}

void
IntegrationLog::setRequest(IntegrationLogClientRequest request)
{
	this->request = request;
}

std::string
IntegrationLog::getTagId()
{
	return tag_id;
}

void
IntegrationLog::setTagId(std::string tag_id)
{
	this->tag_id = tag_id;
}



