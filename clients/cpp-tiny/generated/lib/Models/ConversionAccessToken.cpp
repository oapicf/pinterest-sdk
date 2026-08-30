

#include "ConversionAccessToken.h"

using namespace Tiny;

ConversionAccessToken::ConversionAccessToken()
{
	access_token = std::string();
	token_type = std::string();
}

ConversionAccessToken::ConversionAccessToken(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionAccessToken::~ConversionAccessToken()
{

}

void
ConversionAccessToken::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *access_tokenKey = "access_token";

    if(object.has_key(access_tokenKey))
    {
        bourne::json value = object[access_tokenKey];



        jsonToValue(&access_token, value, "std::string");


    }

    const char *token_typeKey = "token_type";

    if(object.has_key(token_typeKey))
    {
        bourne::json value = object[token_typeKey];



        jsonToValue(&token_type, value, "std::string");


    }


}

bourne::json
ConversionAccessToken::toJson()
{
    bourne::json object = bourne::json::object();





    object["access_token"] = getAccessToken();






    object["token_type"] = getTokenType();



    return object;

}

std::string
ConversionAccessToken::getAccessToken()
{
	return access_token;
}

void
ConversionAccessToken::setAccessToken(std::string access_token)
{
	this->access_token = access_token;
}

std::string
ConversionAccessToken::getTokenType()
{
	return token_type;
}

void
ConversionAccessToken::setTokenType(std::string token_type)
{
	this->token_type = token_type;
}



