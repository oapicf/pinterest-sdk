

#include "OauthAccessTokenRequestRefresh.h"

using namespace Tiny;

OauthAccessTokenRequestRefresh::OauthAccessTokenRequestRefresh()
{
	refresh_token = std::string();
	scope = std::string();
	grant_type = std::string();
}

OauthAccessTokenRequestRefresh::OauthAccessTokenRequestRefresh(std::string jsonString)
{
	this->fromJson(jsonString);
}

OauthAccessTokenRequestRefresh::~OauthAccessTokenRequestRefresh()
{

}

void
OauthAccessTokenRequestRefresh::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *refresh_tokenKey = "refresh_token";

    if(object.has_key(refresh_tokenKey))
    {
        bourne::json value = object[refresh_tokenKey];



        jsonToValue(&refresh_token, value, "std::string");


    }

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
OauthAccessTokenRequestRefresh::toJson()
{
    bourne::json object = bourne::json::object();





    object["refresh_token"] = getRefreshToken();






    object["scope"] = getScope();






    object["grant_type"] = getGrantType();



    return object;

}

std::string
OauthAccessTokenRequestRefresh::getRefreshToken()
{
	return refresh_token;
}

void
OauthAccessTokenRequestRefresh::setRefreshToken(std::string  refresh_token)
{
	this->refresh_token = refresh_token;
}

std::string
OauthAccessTokenRequestRefresh::getScope()
{
	return scope;
}

void
OauthAccessTokenRequestRefresh::setScope(std::string  scope)
{
	this->scope = scope;
}

std::string
OauthAccessTokenRequestRefresh::getGrantType()
{
	return grant_type;
}

void
OauthAccessTokenRequestRefresh::setGrantType(std::string  grant_type)
{
	this->grant_type = grant_type;
}



