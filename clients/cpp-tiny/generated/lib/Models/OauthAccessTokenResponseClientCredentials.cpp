

#include "OauthAccessTokenResponseClientCredentials.h"

using namespace Tiny;

OauthAccessTokenResponseClientCredentials::OauthAccessTokenResponseClientCredentials()
{
	access_token = std::string();
	expires_in = int(0);
	response_type = std::string();
	scope = std::string();
	token_type = std::string();
}

OauthAccessTokenResponseClientCredentials::OauthAccessTokenResponseClientCredentials(std::string jsonString)
{
	this->fromJson(jsonString);
}

OauthAccessTokenResponseClientCredentials::~OauthAccessTokenResponseClientCredentials()
{

}

void
OauthAccessTokenResponseClientCredentials::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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
OauthAccessTokenResponseClientCredentials::toJson()
{
    bourne::json object = bourne::json::object();





    object["access_token"] = getAccessToken();






    object["expires_in"] = getExpiresIn();






    object["response_type"] = getResponseType();






    object["scope"] = getScope();






    object["token_type"] = getTokenType();



    return object;

}

std::string
OauthAccessTokenResponseClientCredentials::getAccessToken()
{
	return access_token;
}

void
OauthAccessTokenResponseClientCredentials::setAccessToken(std::string  access_token)
{
	this->access_token = access_token;
}

int
OauthAccessTokenResponseClientCredentials::getExpiresIn()
{
	return expires_in;
}

void
OauthAccessTokenResponseClientCredentials::setExpiresIn(int  expires_in)
{
	this->expires_in = expires_in;
}

std::string
OauthAccessTokenResponseClientCredentials::getResponseType()
{
	return response_type;
}

void
OauthAccessTokenResponseClientCredentials::setResponseType(std::string  response_type)
{
	this->response_type = response_type;
}

std::string
OauthAccessTokenResponseClientCredentials::getScope()
{
	return scope;
}

void
OauthAccessTokenResponseClientCredentials::setScope(std::string  scope)
{
	this->scope = scope;
}

std::string
OauthAccessTokenResponseClientCredentials::getTokenType()
{
	return token_type;
}

void
OauthAccessTokenResponseClientCredentials::setTokenType(std::string  token_type)
{
	this->token_type = token_type;
}



