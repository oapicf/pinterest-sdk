

#include "AdAccountGetSubscriptionResponse.h"

using namespace Tiny;

AdAccountGetSubscriptionResponse::AdAccountGetSubscriptionResponse()
{
	lead_form_id = std::string();
	webhook_url = std::string();
	ad_account_id = std::string();
	api_version = std::string();
	created_time = int(0);
	cryptographic_algorithm = std::string();
	cryptographic_key = std::string();
	id = std::string();
	user_account_id = std::string();
}

AdAccountGetSubscriptionResponse::AdAccountGetSubscriptionResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdAccountGetSubscriptionResponse::~AdAccountGetSubscriptionResponse()
{

}

void
AdAccountGetSubscriptionResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *lead_form_idKey = "lead_form_id";

    if(object.has_key(lead_form_idKey))
    {
        bourne::json value = object[lead_form_idKey];



        jsonToValue(&lead_form_id, value, "std::string");


    }

    const char *webhook_urlKey = "webhook_url";

    if(object.has_key(webhook_urlKey))
    {
        bourne::json value = object[webhook_urlKey];



        jsonToValue(&webhook_url, value, "std::string");


    }

    const char *ad_account_idKey = "ad_account_id";

    if(object.has_key(ad_account_idKey))
    {
        bourne::json value = object[ad_account_idKey];



        jsonToValue(&ad_account_id, value, "std::string");


    }

    const char *api_versionKey = "api_version";

    if(object.has_key(api_versionKey))
    {
        bourne::json value = object[api_versionKey];



        jsonToValue(&api_version, value, "std::string");


    }

    const char *created_timeKey = "created_time";

    if(object.has_key(created_timeKey))
    {
        bourne::json value = object[created_timeKey];



        jsonToValue(&created_time, value, "int");


    }

    const char *cryptographic_algorithmKey = "cryptographic_algorithm";

    if(object.has_key(cryptographic_algorithmKey))
    {
        bourne::json value = object[cryptographic_algorithmKey];



        jsonToValue(&cryptographic_algorithm, value, "std::string");


    }

    const char *cryptographic_keyKey = "cryptographic_key";

    if(object.has_key(cryptographic_keyKey))
    {
        bourne::json value = object[cryptographic_keyKey];



        jsonToValue(&cryptographic_key, value, "std::string");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *user_account_idKey = "user_account_id";

    if(object.has_key(user_account_idKey))
    {
        bourne::json value = object[user_account_idKey];



        jsonToValue(&user_account_id, value, "std::string");


    }


}

bourne::json
AdAccountGetSubscriptionResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["lead_form_id"] = getLeadFormId();






    object["webhook_url"] = getWebhookUrl();






    object["ad_account_id"] = getAdAccountId();






    object["api_version"] = getApiVersion();






    object["created_time"] = getCreatedTime();






    object["cryptographic_algorithm"] = getCryptographicAlgorithm();






    object["cryptographic_key"] = getCryptographicKey();






    object["id"] = getId();






    object["user_account_id"] = getUserAccountId();



    return object;

}

std::string
AdAccountGetSubscriptionResponse::getLeadFormId()
{
	return lead_form_id;
}

void
AdAccountGetSubscriptionResponse::setLeadFormId(std::string  lead_form_id)
{
	this->lead_form_id = lead_form_id;
}

std::string
AdAccountGetSubscriptionResponse::getWebhookUrl()
{
	return webhook_url;
}

void
AdAccountGetSubscriptionResponse::setWebhookUrl(std::string  webhook_url)
{
	this->webhook_url = webhook_url;
}

std::string
AdAccountGetSubscriptionResponse::getAdAccountId()
{
	return ad_account_id;
}

void
AdAccountGetSubscriptionResponse::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::string
AdAccountGetSubscriptionResponse::getApiVersion()
{
	return api_version;
}

void
AdAccountGetSubscriptionResponse::setApiVersion(std::string  api_version)
{
	this->api_version = api_version;
}

int
AdAccountGetSubscriptionResponse::getCreatedTime()
{
	return created_time;
}

void
AdAccountGetSubscriptionResponse::setCreatedTime(int  created_time)
{
	this->created_time = created_time;
}

std::string
AdAccountGetSubscriptionResponse::getCryptographicAlgorithm()
{
	return cryptographic_algorithm;
}

void
AdAccountGetSubscriptionResponse::setCryptographicAlgorithm(std::string  cryptographic_algorithm)
{
	this->cryptographic_algorithm = cryptographic_algorithm;
}

std::string
AdAccountGetSubscriptionResponse::getCryptographicKey()
{
	return cryptographic_key;
}

void
AdAccountGetSubscriptionResponse::setCryptographicKey(std::string  cryptographic_key)
{
	this->cryptographic_key = cryptographic_key;
}

std::string
AdAccountGetSubscriptionResponse::getId()
{
	return id;
}

void
AdAccountGetSubscriptionResponse::setId(std::string  id)
{
	this->id = id;
}

std::string
AdAccountGetSubscriptionResponse::getUserAccountId()
{
	return user_account_id;
}

void
AdAccountGetSubscriptionResponse::setUserAccountId(std::string  user_account_id)
{
	this->user_account_id = user_account_id;
}



