

#include "OauthAccessTokenResponse.h"

using namespace Tiny;

OauthAccessTokenResponse::OauthAccessTokenResponse()
{
	access_token = std::string();
	expires_in = int(0);
	response_type = std::string();
	scope = std::string();
	token_type = std::string();
}

OauthAccessTokenResponse::OauthAccessTokenResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

OauthAccessTokenResponse::~OauthAccessTokenResponse()
{

}

void
OauthAccessTokenResponse::fromJson(std::string jsonObj)
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
OauthAccessTokenResponse::toJson()
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
OauthAccessTokenResponse::getAccessToken()
{
	return access_token;
}

void
OauthAccessTokenResponse::setAccessToken(std::string  access_token)
{
	this->access_token = access_token;
}

int
OauthAccessTokenResponse::getExpiresIn()
{
	return expires_in;
}

void
OauthAccessTokenResponse::setExpiresIn(int  expires_in)
{
	this->expires_in = expires_in;
}

std::string
OauthAccessTokenResponse::getResponseType()
{
	return response_type;
}

void
OauthAccessTokenResponse::setResponseType(std::string  response_type)
{
	this->response_type = response_type;
}

std::string
OauthAccessTokenResponse::getScope()
{
	return scope;
}

void
OauthAccessTokenResponse::setScope(std::string  scope)
{
	this->scope = scope;
}

std::string
OauthAccessTokenResponse::getTokenType()
{
	return token_type;
}

void
OauthAccessTokenResponse::setTokenType(std::string  token_type)
{
	this->token_type = token_type;
}



