

#include "LeadSubscriptionPostParamsCreate.h"

using namespace Tiny;

LeadSubscriptionPostParamsCreate::LeadSubscriptionPostParamsCreate()
{
	lead_form_id = std::string();
	webhook_url = std::string();
	partner_access_token = std::string();
	partner_metadata = LeadSubscriptionPostParamsCreate_allOf_partner_metadata();
	partner_refresh_token = std::string();
}

LeadSubscriptionPostParamsCreate::LeadSubscriptionPostParamsCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

LeadSubscriptionPostParamsCreate::~LeadSubscriptionPostParamsCreate()
{

}

void
LeadSubscriptionPostParamsCreate::fromJson(std::string jsonObj)
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




        LeadSubscriptionPostParamsCreate_allOf_partner_metadata* obj = &partner_metadata;
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
LeadSubscriptionPostParamsCreate::toJson()
{
    bourne::json object = bourne::json::object();





    object["lead_form_id"] = getLeadFormId();






    object["webhook_url"] = getWebhookUrl();






    object["partner_access_token"] = getPartnerAccessToken();







	object["partner_metadata"] = getPartnerMetadata().toJson();





    object["partner_refresh_token"] = getPartnerRefreshToken();



    return object;

}

std::string
LeadSubscriptionPostParamsCreate::getLeadFormId()
{
	return lead_form_id;
}

void
LeadSubscriptionPostParamsCreate::setLeadFormId(std::string  lead_form_id)
{
	this->lead_form_id = lead_form_id;
}

std::string
LeadSubscriptionPostParamsCreate::getWebhookUrl()
{
	return webhook_url;
}

void
LeadSubscriptionPostParamsCreate::setWebhookUrl(std::string  webhook_url)
{
	this->webhook_url = webhook_url;
}

std::string
LeadSubscriptionPostParamsCreate::getPartnerAccessToken()
{
	return partner_access_token;
}

void
LeadSubscriptionPostParamsCreate::setPartnerAccessToken(std::string  partner_access_token)
{
	this->partner_access_token = partner_access_token;
}

LeadSubscriptionPostParamsCreate_allOf_partner_metadata
LeadSubscriptionPostParamsCreate::getPartnerMetadata()
{
	return partner_metadata;
}

void
LeadSubscriptionPostParamsCreate::setPartnerMetadata(LeadSubscriptionPostParamsCreate_allOf_partner_metadata  partner_metadata)
{
	this->partner_metadata = partner_metadata;
}

std::string
LeadSubscriptionPostParamsCreate::getPartnerRefreshToken()
{
	return partner_refresh_token;
}

void
LeadSubscriptionPostParamsCreate::setPartnerRefreshToken(std::string  partner_refresh_token)
{
	this->partner_refresh_token = partner_refresh_token;
}



