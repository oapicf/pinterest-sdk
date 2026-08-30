

#include "PartnerMetadata.h"

using namespace Tiny;

PartnerMetadata::PartnerMetadata()
{
	subscriber_key = std::string();
}

PartnerMetadata::PartnerMetadata(std::string jsonString)
{
	this->fromJson(jsonString);
}

PartnerMetadata::~PartnerMetadata()
{

}

void
PartnerMetadata::fromJson(std::string jsonObj)
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
PartnerMetadata::toJson()
{
    bourne::json object = bourne::json::object();





    object["subscriber_key"] = getSubscriberKey();



    return object;

}

std::string
PartnerMetadata::getSubscriberKey()
{
	return subscriber_key;
}

void
PartnerMetadata::setSubscriberKey(std::string subscriber_key)
{
	this->subscriber_key = subscriber_key;
}



