

#include "LeadSubscriptionCreate.h"

using namespace Tiny;

LeadSubscriptionCreate::LeadSubscriptionCreate()
{
	lead_form_id = std::string();
	webhook_url = std::string();
}

LeadSubscriptionCreate::LeadSubscriptionCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

LeadSubscriptionCreate::~LeadSubscriptionCreate()
{

}

void
LeadSubscriptionCreate::fromJson(std::string jsonObj)
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


}

bourne::json
LeadSubscriptionCreate::toJson()
{
    bourne::json object = bourne::json::object();





    object["lead_form_id"] = getLeadFormId();






    object["webhook_url"] = getWebhookUrl();



    return object;

}

std::string
LeadSubscriptionCreate::getLeadFormId()
{
	return lead_form_id;
}

void
LeadSubscriptionCreate::setLeadFormId(std::string lead_form_id)
{
	this->lead_form_id = lead_form_id;
}

std::string
LeadSubscriptionCreate::getWebhookUrl()
{
	return webhook_url;
}

void
LeadSubscriptionCreate::setWebhookUrl(std::string webhook_url)
{
	this->webhook_url = webhook_url;
}



