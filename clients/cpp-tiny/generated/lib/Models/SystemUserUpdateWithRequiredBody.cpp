

#include "SystemUserUpdateWithRequiredBody.h"

using namespace Tiny;

SystemUserUpdateWithRequiredBody::SystemUserUpdateWithRequiredBody()
{
	name = std::string();
}

SystemUserUpdateWithRequiredBody::SystemUserUpdateWithRequiredBody(std::string jsonString)
{
	this->fromJson(jsonString);
}

SystemUserUpdateWithRequiredBody::~SystemUserUpdateWithRequiredBody()
{

}

void
SystemUserUpdateWithRequiredBody::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }


}

bourne::json
SystemUserUpdateWithRequiredBody::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();



    return object;

}

std::string
SystemUserUpdateWithRequiredBody::getName()
{
	return name;
}

void
SystemUserUpdateWithRequiredBody::setName(std::string name)
{
	this->name = name;
}



