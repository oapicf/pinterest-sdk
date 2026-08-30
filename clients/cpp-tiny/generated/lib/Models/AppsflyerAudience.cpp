

#include "AppsflyerAudience.h"

using namespace Tiny;

AppsflyerAudience::AppsflyerAudience()
{
	container_id = std::string();
	name = std::string();
	platform = null;
}

AppsflyerAudience::AppsflyerAudience(std::string jsonString)
{
	this->fromJson(jsonString);
}

AppsflyerAudience::~AppsflyerAudience()
{

}

void
AppsflyerAudience::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *container_idKey = "container_id";

    if(object.has_key(container_idKey))
    {
        bourne::json value = object[container_idKey];



        jsonToValue(&container_id, value, "std::string");


    }

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
AppsflyerAudience::toJson()
{
    bourne::json object = bourne::json::object();





    object["container_id"] = getContainerId();






    object["name"] = getName();







	object["platform"] = getPlatform().toJson();


    return object;

}

std::string
AppsflyerAudience::getContainerId()
{
	return container_id;
}

void
AppsflyerAudience::setContainerId(std::string container_id)
{
	this->container_id = container_id;
}

std::string
AppsflyerAudience::getName()
{
	return name;
}

void
AppsflyerAudience::setName(std::string name)
{
	this->name = name;
}

AppsflyerPlatform
AppsflyerAudience::getPlatform()
{
	return platform;
}

void
AppsflyerAudience::setPlatform(AppsflyerPlatform platform)
{
	this->platform = platform;
}



