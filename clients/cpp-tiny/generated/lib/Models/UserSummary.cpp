

#include "UserSummary.h"

using namespace Tiny;

UserSummary::UserSummary()
{
	type = std::string();
	username = std::string();
}

UserSummary::UserSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

UserSummary::~UserSummary()
{

}

void
UserSummary::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *usernameKey = "username";

    if(object.has_key(usernameKey))
    {
        bourne::json value = object[usernameKey];



        jsonToValue(&username, value, "std::string");


    }


}

bourne::json
UserSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();






    object["username"] = getUsername();



    return object;

}

std::string
UserSummary::getType()
{
	return type;
}

void
UserSummary::setType(std::string  type)
{
	this->type = type;
}

std::string
UserSummary::getUsername()
{
	return username;
}

void
UserSummary::setUsername(std::string  username)
{
	this->username = username;
}



