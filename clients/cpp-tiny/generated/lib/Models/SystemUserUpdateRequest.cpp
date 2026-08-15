

#include "System_user_update_request.h"

using namespace Tiny;

System_user_update_request::System_user_update_request()
{
	name = std::string();
}

System_user_update_request::System_user_update_request(std::string jsonString)
{
	this->fromJson(jsonString);
}

System_user_update_request::~System_user_update_request()
{

}

void
System_user_update_request::fromJson(std::string jsonObj)
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
System_user_update_request::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();



    return object;

}

std::string
System_user_update_request::getName()
{
	return name;
}

void
System_user_update_request::setName(std::string  name)
{
	this->name = name;
}



