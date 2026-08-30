

#include "FollowUser.h"

using namespace Tiny;

FollowUser::FollowUser()
{
	type = std::string();
	username = std::string();
}

FollowUser::FollowUser(std::string jsonString)
{
	this->fromJson(jsonString);
}

FollowUser::~FollowUser()
{

}

void
FollowUser::fromJson(std::string jsonObj)
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
FollowUser::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();






    object["username"] = getUsername();



    return object;

}

std::string
FollowUser::getType()
{
	return type;
}

void
FollowUser::setType(std::string type)
{
	this->type = type;
}

std::string
FollowUser::getUsername()
{
	return username;
}

void
FollowUser::setUsername(std::string username)
{
	this->username = username;
}



