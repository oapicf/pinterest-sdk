

#include "LeadFormTestResponse.h"

using namespace Tiny;

LeadFormTestResponse::LeadFormTestResponse()
{
	subscription_id = std::string();
}

LeadFormTestResponse::LeadFormTestResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

LeadFormTestResponse::~LeadFormTestResponse()
{

}

void
LeadFormTestResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *subscription_idKey = "subscription_id";

    if(object.has_key(subscription_idKey))
    {
        bourne::json value = object[subscription_idKey];



        jsonToValue(&subscription_id, value, "std::string");


    }


}

bourne::json
LeadFormTestResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["subscription_id"] = getSubscriptionId();



    return object;

}

std::string
LeadFormTestResponse::getSubscriptionId()
{
	return subscription_id;
}

void
LeadFormTestResponse::setSubscriptionId(std::string  subscription_id)
{
	this->subscription_id = subscription_id;
}



