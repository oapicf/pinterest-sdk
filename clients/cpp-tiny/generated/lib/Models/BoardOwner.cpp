

#include "BoardOwner.h"

using namespace Tiny;

BoardOwner::BoardOwner()
{
	username = std::string();
}

BoardOwner::BoardOwner(std::string jsonString)
{
	this->fromJson(jsonString);
}

BoardOwner::~BoardOwner()
{

}

void
BoardOwner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *usernameKey = "username";

    if(object.has_key(usernameKey))
    {
        bourne::json value = object[usernameKey];



        jsonToValue(&username, value, "std::string");


    }


}

bourne::json
BoardOwner::toJson()
{
    bourne::json object = bourne::json::object();





    object["username"] = getUsername();



    return object;

}

std::string
BoardOwner::getUsername()
{
	return username;
}

void
BoardOwner::setUsername(std::string username)
{
	this->username = username;
}



