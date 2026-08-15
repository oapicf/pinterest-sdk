

#include "UserWebsiteSummary.h"

using namespace Tiny;

UserWebsiteSummary::UserWebsiteSummary()
{
	status = std::string();
	verified_at = std::string();
	website = std::string();
}

UserWebsiteSummary::UserWebsiteSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

UserWebsiteSummary::~UserWebsiteSummary()
{

}

void
UserWebsiteSummary::fromJson(std::string jsonObj)
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
UserWebsiteSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["status"] = getStatus();






    object["verified_at"] = getVerifiedAt();






    object["website"] = getWebsite();



    return object;

}

std::string
UserWebsiteSummary::getStatus()
{
	return status;
}

void
UserWebsiteSummary::setStatus(std::string  status)
{
	this->status = status;
}

std::string
UserWebsiteSummary::getVerifiedAt()
{
	return verified_at;
}

void
UserWebsiteSummary::setVerifiedAt(std::string  verified_at)
{
	this->verified_at = verified_at;
}

std::string
UserWebsiteSummary::getWebsite()
{
	return website;
}

void
UserWebsiteSummary::setWebsite(std::string  website)
{
	this->website = website;
}



