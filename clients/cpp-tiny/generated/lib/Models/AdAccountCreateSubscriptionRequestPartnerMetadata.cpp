

#include "AdAccountCreateSubscriptionRequest_partner_metadata.h"

using namespace Tiny;

AdAccountCreateSubscriptionRequest_partner_metadata::AdAccountCreateSubscriptionRequest_partner_metadata()
{
	subscriber_key = std::string();
}

AdAccountCreateSubscriptionRequest_partner_metadata::AdAccountCreateSubscriptionRequest_partner_metadata(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdAccountCreateSubscriptionRequest_partner_metadata::~AdAccountCreateSubscriptionRequest_partner_metadata()
{

}

void
AdAccountCreateSubscriptionRequest_partner_metadata::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *subscriber_keyKey = "subscriber_key";

    if(object.has_key(subscriber_keyKey))
    {
        bourne::json value = object[subscriber_keyKey];



        jsonToValue(&subscriber_key, value, "std::string");


    }


}

bourne::json
AdAccountCreateSubscriptionRequest_partner_metadata::toJson()
{
    bourne::json object = bourne::json::object();





    object["subscriber_key"] = getSubscriberKey();



    return object;

}

std::string
AdAccountCreateSubscriptionRequest_partner_metadata::getSubscriberKey()
{
	return subscriber_key;
}

void
AdAccountCreateSubscriptionRequest_partner_metadata::setSubscriberKey(std::string  subscriber_key)
{
	this->subscriber_key = subscriber_key;
}



