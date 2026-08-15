

#include "OauthAccessTokenRequestClientCredentials.h"

using namespace Tiny;

OauthAccessTokenRequestClientCredentials::OauthAccessTokenRequestClientCredentials()
{
	scope = std::string();
	grant_type = std::string();
}

OauthAccessTokenRequestClientCredentials::OauthAccessTokenRequestClientCredentials(std::string jsonString)
{
	this->fromJson(jsonString);
}

OauthAccessTokenRequestClientCredentials::~OauthAccessTokenRequestClientCredentials()
{

}

void
OauthAccessTokenRequestClientCredentials::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *scopeKey = "scope";

    if(object.has_key(scopeKey))
    {
        bourne::json value = object[scopeKey];



        jsonToValue(&scope, value, "std::string");


    }

    const char *grant_typeKey = "grant_type";

    if(object.has_key(grant_typeKey))
    {
        bourne::json value = object[grant_typeKey];



        jsonToValue(&grant_type, value, "std::string");


    }


}

bourne::json
OauthAccessTokenRequestClientCredentials::toJson()
{
    bourne::json object = bourne::json::object();





    object["scope"] = getScope();






    object["grant_type"] = getGrantType();



    return object;

}

std::string
OauthAccessTokenRequestClientCredentials::getScope()
{
	return scope;
}

void
OauthAccessTokenRequestClientCredentials::setScope(std::string  scope)
{
	this->scope = scope;
}

std::string
OauthAccessTokenRequestClientCredentials::getGrantType()
{
	return grant_type;
}

void
OauthAccessTokenRequestClientCredentials::setGrantType(std::string  grant_type)
{
	this->grant_type = grant_type;
}



