

#include "CatalogsFeedCredentials.h"

using namespace Tiny;

CatalogsFeedCredentials::CatalogsFeedCredentials()
{
	password = std::string();
	username = std::string();
}

CatalogsFeedCredentials::CatalogsFeedCredentials(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsFeedCredentials::~CatalogsFeedCredentials()
{

}

void
CatalogsFeedCredentials::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *passwordKey = "password";

    if(object.has_key(passwordKey))
    {
        bourne::json value = object[passwordKey];



        jsonToValue(&password, value, "std::string");


    }

    const char *usernameKey = "username";

    if(object.has_key(usernameKey))
    {
        bourne::json value = object[usernameKey];



        jsonToValue(&username, value, "std::string");


    }


}

bourne::json
CatalogsFeedCredentials::toJson()
{
    bourne::json object = bourne::json::object();





    object["password"] = getPassword();






    object["username"] = getUsername();



    return object;

}

std::string
CatalogsFeedCredentials::getPassword()
{
	return password;
}

void
CatalogsFeedCredentials::setPassword(std::string password)
{
	this->password = password;
}

std::string
CatalogsFeedCredentials::getUsername()
{
	return username;
}

void
CatalogsFeedCredentials::setUsername(std::string username)
{
	this->username = username;
}



