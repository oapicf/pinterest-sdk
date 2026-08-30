

#include "AppsflyerAudienceCreate.h"

using namespace Tiny;

AppsflyerAudienceCreate::AppsflyerAudienceCreate()
{
	name = std::string();
	platform = null;
}

AppsflyerAudienceCreate::AppsflyerAudienceCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

AppsflyerAudienceCreate::~AppsflyerAudienceCreate()
{

}

void
AppsflyerAudienceCreate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *platformKey = "platform";

    if(object.has_key(platformKey))
    {
        bourne::json value = object[platformKey];




        AppsflyerPlatform* obj = &platform;
		obj->fromJson(value.dump());

    }


}

bourne::json
AppsflyerAudienceCreate::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["platform"] = getPlatform().toJson();


    return object;

}

std::string
AppsflyerAudienceCreate::getName()
{
	return name;
}

void
AppsflyerAudienceCreate::setName(std::string name)
{
	this->name = name;
}

AppsflyerPlatform
AppsflyerAudienceCreate::getPlatform()
{
	return platform;
}

void
AppsflyerAudienceCreate::setPlatform(AppsflyerPlatform platform)
{
	this->platform = platform;
}



