

#include "UserWebsiteVerifyRequest.h"

using namespace Tiny;

UserWebsiteVerifyRequest::UserWebsiteVerifyRequest()
{
	verification_method = std::string();
	website = std::string();
}

UserWebsiteVerifyRequest::UserWebsiteVerifyRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

UserWebsiteVerifyRequest::~UserWebsiteVerifyRequest()
{

}

void
UserWebsiteVerifyRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *verification_methodKey = "verification_method";

    if(object.has_key(verification_methodKey))
    {
        bourne::json value = object[verification_methodKey];



        jsonToValue(&verification_method, value, "std::string");


    }

    const char *websiteKey = "website";

    if(object.has_key(websiteKey))
    {
        bourne::json value = object[websiteKey];



        jsonToValue(&website, value, "std::string");


    }


}

bourne::json
UserWebsiteVerifyRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["verification_method"] = getVerificationMethod();






    object["website"] = getWebsite();



    return object;

}

std::string
UserWebsiteVerifyRequest::getVerificationMethod()
{
	return verification_method;
}

void
UserWebsiteVerifyRequest::setVerificationMethod(std::string  verification_method)
{
	this->verification_method = verification_method;
}

std::string
UserWebsiteVerifyRequest::getWebsite()
{
	return website;
}

void
UserWebsiteVerifyRequest::setWebsite(std::string  website)
{
	this->website = website;
}



