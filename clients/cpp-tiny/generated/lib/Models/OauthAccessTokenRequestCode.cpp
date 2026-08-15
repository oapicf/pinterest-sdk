

#include "OauthAccessTokenRequestCode.h"

using namespace Tiny;

OauthAccessTokenRequestCode::OauthAccessTokenRequestCode()
{
	code = std::string();
	redirect_uri = std::string();
	grant_type = std::string();
}

OauthAccessTokenRequestCode::OauthAccessTokenRequestCode(std::string jsonString)
{
	this->fromJson(jsonString);
}

OauthAccessTokenRequestCode::~OauthAccessTokenRequestCode()
{

}

void
OauthAccessTokenRequestCode::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *codeKey = "code";

    if(object.has_key(codeKey))
    {
        bourne::json value = object[codeKey];



        jsonToValue(&code, value, "std::string");


    }

    const char *redirect_uriKey = "redirect_uri";

    if(object.has_key(redirect_uriKey))
    {
        bourne::json value = object[redirect_uriKey];



        jsonToValue(&redirect_uri, value, "std::string");


    }

    const char *grant_typeKey = "grant_type";

    if(object.has_key(grant_typeKey))
    {
        bourne::json value = object[grant_typeKey];



        jsonToValue(&grant_type, value, "std::string");


    }


}

bourne::json
OauthAccessTokenRequestCode::toJson()
{
    bourne::json object = bourne::json::object();





    object["code"] = getCode();






    object["redirect_uri"] = getRedirectUri();






    object["grant_type"] = getGrantType();



    return object;

}

std::string
OauthAccessTokenRequestCode::getCode()
{
	return code;
}

void
OauthAccessTokenRequestCode::setCode(std::string  code)
{
	this->code = code;
}

std::string
OauthAccessTokenRequestCode::getRedirectUri()
{
	return redirect_uri;
}

void
OauthAccessTokenRequestCode::setRedirectUri(std::string  redirect_uri)
{
	this->redirect_uri = redirect_uri;
}

std::string
OauthAccessTokenRequestCode::getGrantType()
{
	return grant_type;
}

void
OauthAccessTokenRequestCode::setGrantType(std::string  grant_type)
{
	this->grant_type = grant_type;
}



