

#include "OauthAccessTokenResponseIntegrationRefresh.h"

using namespace Tiny;

OauthAccessTokenResponseIntegrationRefresh::OauthAccessTokenResponseIntegrationRefresh()
{
	refresh_token = std::string();
	refresh_token_expires_in = int(0);
	access_token = std::string();
	expires_in = int(0);
	response_type = std::string();
	scope = std::string();
	token_type = std::string();
}

OauthAccessTokenResponseIntegrationRefresh::OauthAccessTokenResponseIntegrationRefresh(std::string jsonString)
{
	this->fromJson(jsonString);
}

OauthAccessTokenResponseIntegrationRefresh::~OauthAccessTokenResponseIntegrationRefresh()
{

}

void
OauthAccessTokenResponseIntegrationRefresh::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *refresh_tokenKey = "refresh_token";

    if(object.has_key(refresh_tokenKey))
    {
        bourne::json value = object[refresh_tokenKey];



        jsonToValue(&refresh_token, value, "std::string");


    }

    const char *refresh_token_expires_inKey = "refresh_token_expires_in";

    if(object.has_key(refresh_token_expires_inKey))
    {
        bourne::json value = object[refresh_token_expires_inKey];



        jsonToValue(&refresh_token_expires_in, value, "int");


    }

    const char *access_tokenKey = "access_token";

    if(object.has_key(access_tokenKey))
    {
        bourne::json value = object[access_tokenKey];



        jsonToValue(&access_token, value, "std::string");


    }

    const char *expires_inKey = "expires_in";

    if(object.has_key(expires_inKey))
    {
        bourne::json value = object[expires_inKey];



        jsonToValue(&expires_in, value, "int");


    }

    const char *response_typeKey = "response_type";

    if(object.has_key(response_typeKey))
    {
        bourne::json value = object[response_typeKey];



        jsonToValue(&response_type, value, "std::string");


    }

    const char *scopeKey = "scope";

    if(object.has_key(scopeKey))
    {
        bourne::json value = object[scopeKey];



        jsonToValue(&scope, value, "std::string");


    }

    const char *token_typeKey = "token_type";

    if(object.has_key(token_typeKey))
    {
        bourne::json value = object[token_typeKey];



        jsonToValue(&token_type, value, "std::string");


    }


}

bourne::json
OauthAccessTokenResponseIntegrationRefresh::toJson()
{
    bourne::json object = bourne::json::object();





    object["refresh_token"] = getRefreshToken();






    object["refresh_token_expires_in"] = getRefreshTokenExpiresIn();






    object["access_token"] = getAccessToken();






    object["expires_in"] = getExpiresIn();






    object["response_type"] = getResponseType();






    object["scope"] = getScope();






    object["token_type"] = getTokenType();



    return object;

}

std::string
OauthAccessTokenResponseIntegrationRefresh::getRefreshToken()
{
	return refresh_token;
}

void
OauthAccessTokenResponseIntegrationRefresh::setRefreshToken(std::string  refresh_token)
{
	this->refresh_token = refresh_token;
}

int
OauthAccessTokenResponseIntegrationRefresh::getRefreshTokenExpiresIn()
{
	return refresh_token_expires_in;
}

void
OauthAccessTokenResponseIntegrationRefresh::setRefreshTokenExpiresIn(int  refresh_token_expires_in)
{
	this->refresh_token_expires_in = refresh_token_expires_in;
}

std::string
OauthAccessTokenResponseIntegrationRefresh::getAccessToken()
{
	return access_token;
}

void
OauthAccessTokenResponseIntegrationRefresh::setAccessToken(std::string  access_token)
{
	this->access_token = access_token;
}

int
OauthAccessTokenResponseIntegrationRefresh::getExpiresIn()
{
	return expires_in;
}

void
OauthAccessTokenResponseIntegrationRefresh::setExpiresIn(int  expires_in)
{
	this->expires_in = expires_in;
}

std::string
OauthAccessTokenResponseIntegrationRefresh::getResponseType()
{
	return response_type;
}

void
OauthAccessTokenResponseIntegrationRefresh::setResponseType(std::string  response_type)
{
	this->response_type = response_type;
}

std::string
OauthAccessTokenResponseIntegrationRefresh::getScope()
{
	return scope;
}

void
OauthAccessTokenResponseIntegrationRefresh::setScope(std::string  scope)
{
	this->scope = scope;
}

std::string
OauthAccessTokenResponseIntegrationRefresh::getTokenType()
{
	return token_type;
}

void
OauthAccessTokenResponseIntegrationRefresh::setTokenType(std::string  token_type)
{
	this->token_type = token_type;
}



