

#include "UserWebsiteCreate.h"

using namespace Tiny;

UserWebsiteCreate::UserWebsiteCreate()
{
	verification_method = null;
	website = std::string();
}

UserWebsiteCreate::UserWebsiteCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

UserWebsiteCreate::~UserWebsiteCreate()
{

}

void
UserWebsiteCreate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *verification_methodKey = "verification_method";

    if(object.has_key(verification_methodKey))
    {
        bourne::json value = object[verification_methodKey];




        WebsiteVerificationMethod* obj = &verification_method;
		obj->fromJson(value.dump());

    }

    const char *websiteKey = "website";

    if(object.has_key(websiteKey))
    {
        bourne::json value = object[websiteKey];



        jsonToValue(&website, value, "std::string");


    }


}

bourne::json
UserWebsiteCreate::toJson()
{
    bourne::json object = bourne::json::object();






	object["verification_method"] = getVerificationMethod().toJson();





    object["website"] = getWebsite();



    return object;

}

WebsiteVerificationMethod
UserWebsiteCreate::getVerificationMethod()
{
	return verification_method;
}

void
UserWebsiteCreate::setVerificationMethod(WebsiteVerificationMethod verification_method)
{
	this->verification_method = verification_method;
}

std::string
UserWebsiteCreate::getWebsite()
{
	return website;
}

void
UserWebsiteCreate::setWebsite(std::string website)
{
	this->website = website;
}



