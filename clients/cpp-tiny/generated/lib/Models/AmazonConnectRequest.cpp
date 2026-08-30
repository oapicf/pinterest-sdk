

#include "AmazonConnectRequest.h"

using namespace Tiny;

AmazonConnectRequest::AmazonConnectRequest()
{
	amazon_storefront_id = std::string();
	amazon_storefront_name = std::string();
	amazon_storefront_url = std::string();
	amazon_user_id = std::string();
	is_amazon_account_linked = bool(false);
	one_time_passcode = std::string();
	pinterest_user_id = std::string();
}

AmazonConnectRequest::AmazonConnectRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

AmazonConnectRequest::~AmazonConnectRequest()
{

}

void
AmazonConnectRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *amazon_storefront_idKey = "amazon_storefront_id";

    if(object.has_key(amazon_storefront_idKey))
    {
        bourne::json value = object[amazon_storefront_idKey];



        jsonToValue(&amazon_storefront_id, value, "std::string");


    }

    const char *amazon_storefront_nameKey = "amazon_storefront_name";

    if(object.has_key(amazon_storefront_nameKey))
    {
        bourne::json value = object[amazon_storefront_nameKey];



        jsonToValue(&amazon_storefront_name, value, "std::string");


    }

    const char *amazon_storefront_urlKey = "amazon_storefront_url";

    if(object.has_key(amazon_storefront_urlKey))
    {
        bourne::json value = object[amazon_storefront_urlKey];



        jsonToValue(&amazon_storefront_url, value, "std::string");


    }

    const char *amazon_user_idKey = "amazon_user_id";

    if(object.has_key(amazon_user_idKey))
    {
        bourne::json value = object[amazon_user_idKey];



        jsonToValue(&amazon_user_id, value, "std::string");


    }

    const char *is_amazon_account_linkedKey = "is_amazon_account_linked";

    if(object.has_key(is_amazon_account_linkedKey))
    {
        bourne::json value = object[is_amazon_account_linkedKey];



        jsonToValue(&is_amazon_account_linked, value, "bool");


    }

    const char *one_time_passcodeKey = "one_time_passcode";

    if(object.has_key(one_time_passcodeKey))
    {
        bourne::json value = object[one_time_passcodeKey];



        jsonToValue(&one_time_passcode, value, "std::string");


    }

    const char *pinterest_user_idKey = "pinterest_user_id";

    if(object.has_key(pinterest_user_idKey))
    {
        bourne::json value = object[pinterest_user_idKey];



        jsonToValue(&pinterest_user_id, value, "std::string");


    }


}

bourne::json
AmazonConnectRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["amazon_storefront_id"] = getAmazonStorefrontId();






    object["amazon_storefront_name"] = getAmazonStorefrontName();






    object["amazon_storefront_url"] = getAmazonStorefrontUrl();






    object["amazon_user_id"] = getAmazonUserId();






    object["is_amazon_account_linked"] = isIsAmazonAccountLinked();






    object["one_time_passcode"] = getOneTimePasscode();






    object["pinterest_user_id"] = getPinterestUserId();



    return object;

}

std::string
AmazonConnectRequest::getAmazonStorefrontId()
{
	return amazon_storefront_id;
}

void
AmazonConnectRequest::setAmazonStorefrontId(std::string amazon_storefront_id)
{
	this->amazon_storefront_id = amazon_storefront_id;
}

std::string
AmazonConnectRequest::getAmazonStorefrontName()
{
	return amazon_storefront_name;
}

void
AmazonConnectRequest::setAmazonStorefrontName(std::string amazon_storefront_name)
{
	this->amazon_storefront_name = amazon_storefront_name;
}

std::string
AmazonConnectRequest::getAmazonStorefrontUrl()
{
	return amazon_storefront_url;
}

void
AmazonConnectRequest::setAmazonStorefrontUrl(std::string amazon_storefront_url)
{
	this->amazon_storefront_url = amazon_storefront_url;
}

std::string
AmazonConnectRequest::getAmazonUserId()
{
	return amazon_user_id;
}

void
AmazonConnectRequest::setAmazonUserId(std::string amazon_user_id)
{
	this->amazon_user_id = amazon_user_id;
}

bool
AmazonConnectRequest::isIsAmazonAccountLinked()
{
	return is_amazon_account_linked;
}

void
AmazonConnectRequest::setIsAmazonAccountLinked(bool is_amazon_account_linked)
{
	this->is_amazon_account_linked = is_amazon_account_linked;
}

std::string
AmazonConnectRequest::getOneTimePasscode()
{
	return one_time_passcode;
}

void
AmazonConnectRequest::setOneTimePasscode(std::string one_time_passcode)
{
	this->one_time_passcode = one_time_passcode;
}

std::string
AmazonConnectRequest::getPinterestUserId()
{
	return pinterest_user_id;
}

void
AmazonConnectRequest::setPinterestUserId(std::string pinterest_user_id)
{
	this->pinterest_user_id = pinterest_user_id;
}



