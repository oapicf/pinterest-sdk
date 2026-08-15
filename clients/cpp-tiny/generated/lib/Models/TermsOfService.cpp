

#include "TermsOfService.h"

using namespace Tiny;

TermsOfService::TermsOfService()
{
	ad_account_id = std::string();
	has_accepted = bool(false);
	html = std::string();
	id = std::string();
}

TermsOfService::TermsOfService(std::string jsonString)
{
	this->fromJson(jsonString);
}

TermsOfService::~TermsOfService()
{

}

void
TermsOfService::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_account_idKey = "ad_account_id";

    if(object.has_key(ad_account_idKey))
    {
        bourne::json value = object[ad_account_idKey];



        jsonToValue(&ad_account_id, value, "std::string");


    }

    const char *has_acceptedKey = "has_accepted";

    if(object.has_key(has_acceptedKey))
    {
        bourne::json value = object[has_acceptedKey];



        jsonToValue(&has_accepted, value, "bool");


    }

    const char *htmlKey = "html";

    if(object.has_key(htmlKey))
    {
        bourne::json value = object[htmlKey];



        jsonToValue(&html, value, "std::string");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }


}

bourne::json
TermsOfService::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_account_id"] = getAdAccountId();






    object["has_accepted"] = isHasAccepted();






    object["html"] = getHtml();






    object["id"] = getId();



    return object;

}

std::string
TermsOfService::getAdAccountId()
{
	return ad_account_id;
}

void
TermsOfService::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

bool
TermsOfService::isHasAccepted()
{
	return has_accepted;
}

void
TermsOfService::setHasAccepted(bool  has_accepted)
{
	this->has_accepted = has_accepted;
}

std::string
TermsOfService::getHtml()
{
	return html;
}

void
TermsOfService::setHtml(std::string  html)
{
	this->html = html;
}

std::string
TermsOfService::getId()
{
	return id;
}

void
TermsOfService::setId(std::string  id)
{
	this->id = id;
}



