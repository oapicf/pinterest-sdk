

#include "CancelInviteResultUser.h"

using namespace Tiny;

CancelInviteResultUser::CancelInviteResultUser()
{
	email = std::string();
	id = std::string();
	username = std::string();
}

CancelInviteResultUser::CancelInviteResultUser(std::string jsonString)
{
	this->fromJson(jsonString);
}

CancelInviteResultUser::~CancelInviteResultUser()
{

}

void
CancelInviteResultUser::fromJson(std::string jsonObj)
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
CancelInviteResultUser::toJson()
{
    bourne::json object = bourne::json::object();





    object["email"] = getEmail();






    object["id"] = getId();






    object["username"] = getUsername();



    return object;

}

std::string
CancelInviteResultUser::getEmail()
{
	return email;
}

void
CancelInviteResultUser::setEmail(std::string email)
{
	this->email = email;
}

std::string
CancelInviteResultUser::getId()
{
	return id;
}

void
CancelInviteResultUser::setId(std::string id)
{
	this->id = id;
}

std::string
CancelInviteResultUser::getUsername()
{
	return username;
}

void
CancelInviteResultUser::setUsername(std::string username)
{
	this->username = username;
}



