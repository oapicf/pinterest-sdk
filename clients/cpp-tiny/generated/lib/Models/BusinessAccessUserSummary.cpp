

#include "BusinessAccessUserSummary.h"

using namespace Tiny;

BusinessAccessUserSummary::BusinessAccessUserSummary()
{
	email = std::string();
	id = std::string();
	username = std::string();
}

BusinessAccessUserSummary::BusinessAccessUserSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

BusinessAccessUserSummary::~BusinessAccessUserSummary()
{

}

void
BusinessAccessUserSummary::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *emailKey = "email";

    if(object.has_key(emailKey))
    {
        bourne::json value = object[emailKey];



        jsonToValue(&email, value, "std::string");


    }

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
BusinessAccessUserSummary::toJson()
{
    bourne::json object = bourne::json::object();





    object["email"] = getEmail();






    object["id"] = getId();






    object["username"] = getUsername();



    return object;

}

std::string
BusinessAccessUserSummary::getEmail()
{
	return email;
}

void
BusinessAccessUserSummary::setEmail(std::string  email)
{
	this->email = email;
}

std::string
BusinessAccessUserSummary::getId()
{
	return id;
}

void
BusinessAccessUserSummary::setId(std::string  id)
{
	this->id = id;
}

std::string
BusinessAccessUserSummary::getUsername()
{
	return username;
}

void
BusinessAccessUserSummary::setUsername(std::string  username)
{
	this->username = username;
}



