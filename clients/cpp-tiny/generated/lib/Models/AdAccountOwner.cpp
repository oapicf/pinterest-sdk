

#include "AdAccountOwner.h"

using namespace Tiny;

AdAccountOwner::AdAccountOwner()
{
	id = std::string();
	username = std::string();
}

AdAccountOwner::AdAccountOwner(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdAccountOwner::~AdAccountOwner()
{

}

void
AdAccountOwner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *usernameKey = "username";

    if(object.has_key(usernameKey))
    {
        bourne::json value = object[usernameKey];



        jsonToValue(&username, value, "std::string");


    }


}

bourne::json
AdAccountOwner::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["username"] = getUsername();



    return object;

}

std::string
AdAccountOwner::getId()
{
	return id;
}

void
AdAccountOwner::setId(std::string  id)
{
	this->id = id;
}

std::string
AdAccountOwner::getUsername()
{
	return username;
}

void
AdAccountOwner::setUsername(std::string  username)
{
	this->username = username;
}



