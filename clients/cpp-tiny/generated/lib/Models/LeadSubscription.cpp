

#include "LeadSubscription.h"

using namespace Tiny;

LeadSubscription::LeadSubscription()
{
	ad_account_id = std::string();
	api_version = std::string();
	created_time = int(0);
	cryptographic_algorithm = std::string();
	cryptographic_key = std::string();
	id = std::string();
	lead_form_id = std::string();
	user_account_id = std::string();
	webhook_url = std::string();
}

LeadSubscription::LeadSubscription(std::string jsonString)
{
	this->fromJson(jsonString);
}

LeadSubscription::~LeadSubscription()
{

}

void
LeadSubscription::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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

    const char *lead_form_idKey = "lead_form_id";

    if(object.has_key(lead_form_idKey))
    {
        bourne::json value = object[lead_form_idKey];



        jsonToValue(&lead_form_id, value, "std::string");


    }

    const char *user_account_idKey = "user_account_id";

    if(object.has_key(user_account_idKey))
    {
        bourne::json value = object[user_account_idKey];



        jsonToValue(&user_account_id, value, "std::string");


    }

    const char *webhook_urlKey = "webhook_url";

    if(object.has_key(webhook_urlKey))
    {
        bourne::json value = object[webhook_urlKey];



        jsonToValue(&webhook_url, value, "std::string");


    }


}

bourne::json
LeadSubscription::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_account_id"] = getAdAccountId();






    object["api_version"] = getApiVersion();






    object["created_time"] = getCreatedTime();






    object["cryptographic_algorithm"] = getCryptographicAlgorithm();






    object["cryptographic_key"] = getCryptographicKey();






    object["id"] = getId();






    object["lead_form_id"] = getLeadFormId();






    object["user_account_id"] = getUserAccountId();






    object["webhook_url"] = getWebhookUrl();



    return object;

}

std::string
LeadSubscription::getAdAccountId()
{
	return ad_account_id;
}

void
LeadSubscription::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::string
LeadSubscription::getApiVersion()
{
	return api_version;
}

void
LeadSubscription::setApiVersion(std::string  api_version)
{
	this->api_version = api_version;
}

int
LeadSubscription::getCreatedTime()
{
	return created_time;
}

void
LeadSubscription::setCreatedTime(int  created_time)
{
	this->created_time = created_time;
}

std::string
LeadSubscription::getCryptographicAlgorithm()
{
	return cryptographic_algorithm;
}

void
LeadSubscription::setCryptographicAlgorithm(std::string  cryptographic_algorithm)
{
	this->cryptographic_algorithm = cryptographic_algorithm;
}

std::string
LeadSubscription::getCryptographicKey()
{
	return cryptographic_key;
}

void
LeadSubscription::setCryptographicKey(std::string  cryptographic_key)
{
	this->cryptographic_key = cryptographic_key;
}

std::string
LeadSubscription::getId()
{
	return id;
}

void
LeadSubscription::setId(std::string  id)
{
	this->id = id;
}

std::string
LeadSubscription::getLeadFormId()
{
	return lead_form_id;
}

void
LeadSubscription::setLeadFormId(std::string  lead_form_id)
{
	this->lead_form_id = lead_form_id;
}

std::string
LeadSubscription::getUserAccountId()
{
	return user_account_id;
}

void
LeadSubscription::setUserAccountId(std::string  user_account_id)
{
	this->user_account_id = user_account_id;
}

std::string
LeadSubscription::getWebhookUrl()
{
	return webhook_url;
}

void
LeadSubscription::setWebhookUrl(std::string  webhook_url)
{
	this->webhook_url = webhook_url;
}



