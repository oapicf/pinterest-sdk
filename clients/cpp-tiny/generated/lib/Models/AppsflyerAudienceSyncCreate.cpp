

#include "AppsflyerAudienceSyncCreate.h"

using namespace Tiny;

AppsflyerAudienceSyncCreate::AppsflyerAudienceSyncCreate()
{
	container_id = std::string();
	url_adid_sha256 = std::string();
	url_email_sha256 = std::string();
}

AppsflyerAudienceSyncCreate::AppsflyerAudienceSyncCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

AppsflyerAudienceSyncCreate::~AppsflyerAudienceSyncCreate()
{

}

void
AppsflyerAudienceSyncCreate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *container_idKey = "container_id";

    if(object.has_key(container_idKey))
    {
        bourne::json value = object[container_idKey];



        jsonToValue(&container_id, value, "std::string");


    }

    const char *url_adid_sha256Key = "url_adid_sha256";

    if(object.has_key(url_adid_sha256Key))
    {
        bourne::json value = object[url_adid_sha256Key];



        jsonToValue(&url_adid_sha256, value, "std::string");


    }

    const char *url_email_sha256Key = "url_email_sha256";

    if(object.has_key(url_email_sha256Key))
    {
        bourne::json value = object[url_email_sha256Key];



        jsonToValue(&url_email_sha256, value, "std::string");


    }


}

bourne::json
AppsflyerAudienceSyncCreate::toJson()
{
    bourne::json object = bourne::json::object();





    object["container_id"] = getContainerId();






    object["url_adid_sha256"] = getUrlAdidSha256();






    object["url_email_sha256"] = getUrlEmailSha256();



    return object;

}

std::string
AppsflyerAudienceSyncCreate::getContainerId()
{
	return container_id;
}

void
AppsflyerAudienceSyncCreate::setContainerId(std::string container_id)
{
	this->container_id = container_id;
}

std::string
AppsflyerAudienceSyncCreate::getUrlAdidSha256()
{
	return url_adid_sha256;
}

void
AppsflyerAudienceSyncCreate::setUrlAdidSha256(std::string url_adid_sha256)
{
	this->url_adid_sha256 = url_adid_sha256;
}

std::string
AppsflyerAudienceSyncCreate::getUrlEmailSha256()
{
	return url_email_sha256;
}

void
AppsflyerAudienceSyncCreate::setUrlEmailSha256(std::string url_email_sha256)
{
	this->url_email_sha256 = url_email_sha256;
}



