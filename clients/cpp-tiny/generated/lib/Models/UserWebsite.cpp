

#include "UserWebsite.h"

using namespace Tiny;

UserWebsite::UserWebsite()
{
	status = std::string();
	verified_at = std::string();
	website = std::string();
}

UserWebsite::UserWebsite(std::string jsonString)
{
	this->fromJson(jsonString);
}

UserWebsite::~UserWebsite()
{

}

void
UserWebsite::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];



        jsonToValue(&status, value, "std::string");


    }

    const char *verified_atKey = "verified_at";

    if(object.has_key(verified_atKey))
    {
        bourne::json value = object[verified_atKey];



        jsonToValue(&verified_at, value, "std::string");


    }

    const char *websiteKey = "website";

    if(object.has_key(websiteKey))
    {
        bourne::json value = object[websiteKey];



        jsonToValue(&website, value, "std::string");


    }


}

bourne::json
UserWebsite::toJson()
{
    bourne::json object = bourne::json::object();





    object["status"] = getStatus();






    object["verified_at"] = getVerifiedAt();






    object["website"] = getWebsite();



    return object;

}

std::string
UserWebsite::getStatus()
{
	return status;
}

void
UserWebsite::setStatus(std::string status)
{
	this->status = status;
}

std::string
UserWebsite::getVerifiedAt()
{
	return verified_at;
}

void
UserWebsite::setVerifiedAt(std::string verified_at)
{
	this->verified_at = verified_at;
}

std::string
UserWebsite::getWebsite()
{
	return website;
}

void
UserWebsite::setWebsite(std::string website)
{
	this->website = website;
}



