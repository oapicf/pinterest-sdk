

#include "LeadSubscriptionPostParams.h"

using namespace Tiny;

LeadSubscriptionPostParams::LeadSubscriptionPostParams()
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
	partner_access_token = std::string();
	partner_metadata = null;
	partner_refresh_token = std::string();
}

LeadSubscriptionPostParams::LeadSubscriptionPostParams(std::string jsonString)
{
	this->fromJson(jsonString);
}

LeadSubscriptionPostParams::~LeadSubscriptionPostParams()
{

}

void
LeadSubscriptionPostParams::fromJson(std::string jsonObj)
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

    const char *partner_access_tokenKey = "partner_access_token";

    if(object.has_key(partner_access_tokenKey))
    {
        bourne::json value = object[partner_access_tokenKey];



        jsonToValue(&partner_access_token, value, "std::string");


    }

    const char *partner_metadataKey = "partner_metadata";

    if(object.has_key(partner_metadataKey))
    {
        bourne::json value = object[partner_metadataKey];




        PartnerMetadata* obj = &partner_metadata;
		obj->fromJson(value.dump());

    }

    const char *partner_refresh_tokenKey = "partner_refresh_token";

    if(object.has_key(partner_refresh_tokenKey))
    {
        bourne::json value = object[partner_refresh_tokenKey];



        jsonToValue(&partner_refresh_token, value, "std::string");


    }


}

bourne::json
LeadSubscriptionPostParams::toJson()
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






    object["partner_access_token"] = getPartnerAccessToken();







	object["partner_metadata"] = getPartnerMetadata().toJson();





    object["partner_refresh_token"] = getPartnerRefreshToken();



    return object;

}

std::string
LeadSubscriptionPostParams::getAdAccountId()
{
	return ad_account_id;
}

void
LeadSubscriptionPostParams::setAdAccountId(std::string ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::string
LeadSubscriptionPostParams::getApiVersion()
{
	return api_version;
}

void
LeadSubscriptionPostParams::setApiVersion(std::string api_version)
{
	this->api_version = api_version;
}

int
LeadSubscriptionPostParams::getCreatedTime()
{
	return created_time;
}

void
LeadSubscriptionPostParams::setCreatedTime(int created_time)
{
	this->created_time = created_time;
}

std::string
LeadSubscriptionPostParams::getCryptographicAlgorithm()
{
	return cryptographic_algorithm;
}

void
LeadSubscriptionPostParams::setCryptographicAlgorithm(std::string cryptographic_algorithm)
{
	this->cryptographic_algorithm = cryptographic_algorithm;
}

std::string
LeadSubscriptionPostParams::getCryptographicKey()
{
	return cryptographic_key;
}

void
LeadSubscriptionPostParams::setCryptographicKey(std::string cryptographic_key)
{
	this->cryptographic_key = cryptographic_key;
}

std::string
LeadSubscriptionPostParams::getId()
{
	return id;
}

void
LeadSubscriptionPostParams::setId(std::string id)
{
	this->id = id;
}

std::string
LeadSubscriptionPostParams::getLeadFormId()
{
	return lead_form_id;
}

void
LeadSubscriptionPostParams::setLeadFormId(std::string lead_form_id)
{
	this->lead_form_id = lead_form_id;
}

std::string
LeadSubscriptionPostParams::getUserAccountId()
{
	return user_account_id;
}

void
LeadSubscriptionPostParams::setUserAccountId(std::string user_account_id)
{
	this->user_account_id = user_account_id;
}

std::string
LeadSubscriptionPostParams::getWebhookUrl()
{
	return webhook_url;
}

void
LeadSubscriptionPostParams::setWebhookUrl(std::string webhook_url)
{
	this->webhook_url = webhook_url;
}

std::string
LeadSubscriptionPostParams::getPartnerAccessToken()
{
	return partner_access_token;
}

void
LeadSubscriptionPostParams::setPartnerAccessToken(std::string partner_access_token)
{
	this->partner_access_token = partner_access_token;
}

PartnerMetadata
LeadSubscriptionPostParams::getPartnerMetadata()
{
	return partner_metadata;
}

void
LeadSubscriptionPostParams::setPartnerMetadata(PartnerMetadata partner_metadata)
{
	this->partner_metadata = partner_metadata;
}

std::string
LeadSubscriptionPostParams::getPartnerRefreshToken()
{
	return partner_refresh_token;
}

void
LeadSubscriptionPostParams::setPartnerRefreshToken(std::string partner_refresh_token)
{
	this->partner_refresh_token = partner_refresh_token;
}



