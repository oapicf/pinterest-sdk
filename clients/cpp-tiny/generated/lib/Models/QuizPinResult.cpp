

#include "QuizPinResult.h"

using namespace Tiny;

QuizPinResult::QuizPinResult()
{
	android_deep_link = std::string();
	destination_url = std::string();
	ios_deep_link = std::string();
	organic_pin_id = std::string();
	result_id = float(0);
}

QuizPinResult::QuizPinResult(std::string jsonString)
{
	this->fromJson(jsonString);
}

QuizPinResult::~QuizPinResult()
{

}

void
QuizPinResult::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *android_deep_linkKey = "android_deep_link";

    if(object.has_key(android_deep_linkKey))
    {
        bourne::json value = object[android_deep_linkKey];



        jsonToValue(&android_deep_link, value, "std::string");


    }

    const char *destination_urlKey = "destination_url";

    if(object.has_key(destination_urlKey))
    {
        bourne::json value = object[destination_urlKey];



        jsonToValue(&destination_url, value, "std::string");


    }

    const char *ios_deep_linkKey = "ios_deep_link";

    if(object.has_key(ios_deep_linkKey))
    {
        bourne::json value = object[ios_deep_linkKey];



        jsonToValue(&ios_deep_link, value, "std::string");


    }

    const char *organic_pin_idKey = "organic_pin_id";

    if(object.has_key(organic_pin_idKey))
    {
        bourne::json value = object[organic_pin_idKey];



        jsonToValue(&organic_pin_id, value, "std::string");


    }

    const char *result_idKey = "result_id";

    if(object.has_key(result_idKey))
    {
        bourne::json value = object[result_idKey];



        jsonToValue(&result_id, value, "long");


    }


}

bourne::json
QuizPinResult::toJson()
{
    bourne::json object = bourne::json::object();





    object["android_deep_link"] = getAndroidDeepLink();






    object["destination_url"] = getDestinationUrl();






    object["ios_deep_link"] = getIosDeepLink();






    object["organic_pin_id"] = getOrganicPinId();






    object["result_id"] = getResultId();



    return object;

}

std::string
QuizPinResult::getAndroidDeepLink()
{
	return android_deep_link;
}

void
QuizPinResult::setAndroidDeepLink(std::string android_deep_link)
{
	this->android_deep_link = android_deep_link;
}

std::string
QuizPinResult::getDestinationUrl()
{
	return destination_url;
}

void
QuizPinResult::setDestinationUrl(std::string destination_url)
{
	this->destination_url = destination_url;
}

std::string
QuizPinResult::getIosDeepLink()
{
	return ios_deep_link;
}

void
QuizPinResult::setIosDeepLink(std::string ios_deep_link)
{
	this->ios_deep_link = ios_deep_link;
}

std::string
QuizPinResult::getOrganicPinId()
{
	return organic_pin_id;
}

void
QuizPinResult::setOrganicPinId(std::string organic_pin_id)
{
	this->organic_pin_id = organic_pin_id;
}

long
QuizPinResult::getResultId()
{
	return result_id;
}

void
QuizPinResult::setResultId(long result_id)
{
	this->result_id = result_id;
}



