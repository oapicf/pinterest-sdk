

#include "BoardCreate.h"

using namespace Tiny;

BoardCreate::BoardCreate()
{
	description = std::string();
	is_ads_only = bool(false);
	name = std::string();
	privacy = null;
}

BoardCreate::BoardCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

BoardCreate::~BoardCreate()
{

}

void
BoardCreate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *is_ads_onlyKey = "is_ads_only";

    if(object.has_key(is_ads_onlyKey))
    {
        bourne::json value = object[is_ads_onlyKey];



        jsonToValue(&is_ads_only, value, "bool");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *privacyKey = "privacy";

    if(object.has_key(privacyKey))
    {
        bourne::json value = object[privacyKey];




        BoardPrivacy* obj = &privacy;
		obj->fromJson(value.dump());

    }


}

bourne::json
BoardCreate::toJson()
{
    bourne::json object = bourne::json::object();





    object["description"] = getDescription();






    object["is_ads_only"] = isIsAdsOnly();






    object["name"] = getName();







	object["privacy"] = getPrivacy().toJson();


    return object;

}

std::string
BoardCreate::getDescription()
{
	return description;
}

void
BoardCreate::setDescription(std::string description)
{
	this->description = description;
}

bool
BoardCreate::isIsAdsOnly()
{
	return is_ads_only;
}

void
BoardCreate::setIsAdsOnly(bool is_ads_only)
{
	this->is_ads_only = is_ads_only;
}

std::string
BoardCreate::getName()
{
	return name;
}

void
BoardCreate::setName(std::string name)
{
	this->name = name;
}

BoardPrivacy
BoardCreate::getPrivacy()
{
	return privacy;
}

void
BoardCreate::setPrivacy(BoardPrivacy privacy)
{
	this->privacy = privacy;
}



