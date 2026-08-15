

#include "OauthAccessTokenResponseCode.h"

using namespace Tiny;

OauthAccessTokenResponseCode::OauthAccessTokenResponseCode()
{
	refresh_token = std::string();
	refresh_token_expires_at = int(0);
	refresh_token_expires_in = int(0);
	access_token = std::string();
	expires_in = int(0);
	response_type = std::string();
	scope = std::string();
	token_type = std::string();
}

OauthAccessTokenResponseCode::OauthAccessTokenResponseCode(std::string jsonString)
{
	this->fromJson(jsonString);
}

OauthAccessTokenResponseCode::~OauthAccessTokenResponseCode()
{

}

void
OauthAccessTokenResponseCode::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *refresh_tokenKey = "refresh_token";

    if(object.has_key(refresh_tokenKey))
    {
        bourne::json value = object[refresh_tokenKey];



        jsonToValue(&refresh_token, value, "std::string");


    }

    const char *refresh_token_expires_atKey = "refresh_token_expires_at";

    if(object.has_key(refresh_token_expires_atKey))
    {
        bourne::json value = object[refresh_token_expires_atKey];



        jsonToValue(&refresh_token_expires_at, value, "int");


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
OauthAccessTokenResponseCode::toJson()
{
    bourne::json object = bourne::json::object();





    object["refresh_token"] = getRefreshToken();






    object["refresh_token_expires_at"] = getRefreshTokenExpiresAt();






    object["refresh_token_expires_in"] = getRefreshTokenExpiresIn();






    object["access_token"] = getAccessToken();






    object["expires_in"] = getExpiresIn();






    object["response_type"] = getResponseType();






    object["scope"] = getScope();






    object["token_type"] = getTokenType();



    return object;

}

std::string
OauthAccessTokenResponseCode::getRefreshToken()
{
	return refresh_token;
}

void
OauthAccessTokenResponseCode::setRefreshToken(std::string  refresh_token)
{
	this->refresh_token = refresh_token;
}

int
OauthAccessTokenResponseCode::getRefreshTokenExpiresAt()
{
	return refresh_token_expires_at;
}

void
OauthAccessTokenResponseCode::setRefreshTokenExpiresAt(int  refresh_token_expires_at)
{
	this->refresh_token_expires_at = refresh_token_expires_at;
}

int
OauthAccessTokenResponseCode::getRefreshTokenExpiresIn()
{
	return refresh_token_expires_in;
}

void
OauthAccessTokenResponseCode::setRefreshTokenExpiresIn(int  refresh_token_expires_in)
{
	this->refresh_token_expires_in = refresh_token_expires_in;
}

std::string
OauthAccessTokenResponseCode::getAccessToken()
{
	return access_token;
}

void
OauthAccessTokenResponseCode::setAccessToken(std::string  access_token)
{
	this->access_token = access_token;
}

int
OauthAccessTokenResponseCode::getExpiresIn()
{
	return expires_in;
}

void
OauthAccessTokenResponseCode::setExpiresIn(int  expires_in)
{
	this->expires_in = expires_in;
}

std::string
OauthAccessTokenResponseCode::getResponseType()
{
	return response_type;
}

void
OauthAccessTokenResponseCode::setResponseType(std::string  response_type)
{
	this->response_type = response_type;
}

std::string
OauthAccessTokenResponseCode::getScope()
{
	return scope;
}

void
OauthAccessTokenResponseCode::setScope(std::string  scope)
{
	this->scope = scope;
}

std::string
OauthAccessTokenResponseCode::getTokenType()
{
	return token_type;
}

void
OauthAccessTokenResponseCode::setTokenType(std::string  token_type)
{
	this->token_type = token_type;
}



