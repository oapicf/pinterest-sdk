

#include "LeadFormTest.h"

using namespace Tiny;

LeadFormTest::LeadFormTest()
{
	subscription_id = std::string();
}

LeadFormTest::LeadFormTest(std::string jsonString)
{
	this->fromJson(jsonString);
}

LeadFormTest::~LeadFormTest()
{

}

void
LeadFormTest::fromJson(std::string jsonObj)
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
LeadFormTest::toJson()
{
    bourne::json object = bourne::json::object();





    object["subscription_id"] = getSubscriptionId();



    return object;

}

std::string
LeadFormTest::getSubscriptionId()
{
	return subscription_id;
}

void
LeadFormTest::setSubscriptionId(std::string subscription_id)
{
	this->subscription_id = subscription_id;
}



