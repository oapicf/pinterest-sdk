

#include "OauthAccessToken.h"

using namespace Tiny;

OauthAccessToken::OauthAccessToken()
{
	access_token = std::string();
	expires_in = int(0);
	refresh_token = std::string();
	refresh_token_expires_at = int(0);
	refresh_token_expires_in = int(0);
	response_type = null;
	scope = std::string();
	token_type = std::string();
}

OauthAccessToken::OauthAccessToken(std::string jsonString)
{
	this->fromJson(jsonString);
}

OauthAccessToken::~OauthAccessToken()
{

}

void
OauthAccessToken::fromJson(std::string jsonObj)
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

    const char *response_typeKey = "response_type";

    if(object.has_key(response_typeKey))
    {
        bourne::json value = object[response_typeKey];




        TokenGrantType* obj = &response_type;
		obj->fromJson(value.dump());

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
OauthAccessToken::toJson()
{
    bourne::json object = bourne::json::object();





    object["access_token"] = getAccessToken();






    object["expires_in"] = getExpiresIn();






    object["refresh_token"] = getRefreshToken();






    object["refresh_token_expires_at"] = getRefreshTokenExpiresAt();






    object["refresh_token_expires_in"] = getRefreshTokenExpiresIn();







	object["response_type"] = getResponseType().toJson();





    object["scope"] = getScope();






    object["token_type"] = getTokenType();



    return object;

}

std::string
OauthAccessToken::getAccessToken()
{
	return access_token;
}

void
OauthAccessToken::setAccessToken(std::string access_token)
{
	this->access_token = access_token;
}

int
OauthAccessToken::getExpiresIn()
{
	return expires_in;
}

void
OauthAccessToken::setExpiresIn(int expires_in)
{
	this->expires_in = expires_in;
}

std::string
OauthAccessToken::getRefreshToken()
{
	return refresh_token;
}

void
OauthAccessToken::setRefreshToken(std::string refresh_token)
{
	this->refresh_token = refresh_token;
}

int
OauthAccessToken::getRefreshTokenExpiresAt()
{
	return refresh_token_expires_at;
}

void
OauthAccessToken::setRefreshTokenExpiresAt(int refresh_token_expires_at)
{
	this->refresh_token_expires_at = refresh_token_expires_at;
}

int
OauthAccessToken::getRefreshTokenExpiresIn()
{
	return refresh_token_expires_in;
}

void
OauthAccessToken::setRefreshTokenExpiresIn(int refresh_token_expires_in)
{
	this->refresh_token_expires_in = refresh_token_expires_in;
}

TokenGrantType
OauthAccessToken::getResponseType()
{
	return response_type;
}

void
OauthAccessToken::setResponseType(TokenGrantType response_type)
{
	this->response_type = response_type;
}

std::string
OauthAccessToken::getScope()
{
	return scope;
}

void
OauthAccessToken::setScope(std::string scope)
{
	this->scope = scope;
}

std::string
OauthAccessToken::getTokenType()
{
	return token_type;
}

void
OauthAccessToken::setTokenType(std::string token_type)
{
	this->token_type = token_type;
}



