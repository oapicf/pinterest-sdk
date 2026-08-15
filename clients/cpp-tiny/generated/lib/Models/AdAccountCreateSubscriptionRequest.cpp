

#include "AdAccountCreateSubscriptionRequest.h"

using namespace Tiny;

AdAccountCreateSubscriptionRequest::AdAccountCreateSubscriptionRequest()
{
	lead_form_id = std::string();
	partner_access_token = std::string();
	partner_metadata = AdAccountCreateSubscriptionRequest_partner_metadata();
	partner_refresh_token = std::string();
	webhook_url = std::string();
}

AdAccountCreateSubscriptionRequest::AdAccountCreateSubscriptionRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdAccountCreateSubscriptionRequest::~AdAccountCreateSubscriptionRequest()
{

}

void
AdAccountCreateSubscriptionRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *lead_form_idKey = "lead_form_id";

    if(object.has_key(lead_form_idKey))
    {
        bourne::json value = object[lead_form_idKey];



        jsonToValue(&lead_form_id, value, "std::string");


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




        AdAccountCreateSubscriptionRequest_partner_metadata* obj = &partner_metadata;
		obj->fromJson(value.dump());

    }

    const char *partner_refresh_tokenKey = "partner_refresh_token";

    if(object.has_key(partner_refresh_tokenKey))
    {
        bourne::json value = object[partner_refresh_tokenKey];



        jsonToValue(&partner_refresh_token, value, "std::string");


    }

    const char *webhook_urlKey = "webhook_url";

    if(object.has_key(webhook_urlKey))
    {
        bourne::json value = object[webhook_urlKey];



        jsonToValue(&webhook_url, value, "std::string");


    }


}

bourne::json
AdAccountCreateSubscriptionRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["lead_form_id"] = getLeadFormId();






    object["partner_access_token"] = getPartnerAccessToken();







	object["partner_metadata"] = getPartnerMetadata().toJson();





    object["partner_refresh_token"] = getPartnerRefreshToken();






    object["webhook_url"] = getWebhookUrl();



    return object;

}

std::string
AdAccountCreateSubscriptionRequest::getLeadFormId()
{
	return lead_form_id;
}

void
AdAccountCreateSubscriptionRequest::setLeadFormId(std::string  lead_form_id)
{
	this->lead_form_id = lead_form_id;
}

std::string
AdAccountCreateSubscriptionRequest::getPartnerAccessToken()
{
	return partner_access_token;
}

void
AdAccountCreateSubscriptionRequest::setPartnerAccessToken(std::string  partner_access_token)
{
	this->partner_access_token = partner_access_token;
}

AdAccountCreateSubscriptionRequest_partner_metadata
AdAccountCreateSubscriptionRequest::getPartnerMetadata()
{
	return partner_metadata;
}

void
AdAccountCreateSubscriptionRequest::setPartnerMetadata(AdAccountCreateSubscriptionRequest_partner_metadata  partner_metadata)
{
	this->partner_metadata = partner_metadata;
}

std::string
AdAccountCreateSubscriptionRequest::getPartnerRefreshToken()
{
	return partner_refresh_token;
}

void
AdAccountCreateSubscriptionRequest::setPartnerRefreshToken(std::string  partner_refresh_token)
{
	this->partner_refresh_token = partner_refresh_token;
}

std::string
AdAccountCreateSubscriptionRequest::getWebhookUrl()
{
	return webhook_url;
}

void
AdAccountCreateSubscriptionRequest::setWebhookUrl(std::string  webhook_url)
{
	this->webhook_url = webhook_url;
}



