

#include "CatalogsCreateReportResponse.h"

using namespace Tiny;

CatalogsCreateReportResponse::CatalogsCreateReportResponse()
{
	token = std::string();
}

CatalogsCreateReportResponse::CatalogsCreateReportResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsCreateReportResponse::~CatalogsCreateReportResponse()
{

}

void
CatalogsCreateReportResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *tokenKey = "token";

    if(object.has_key(tokenKey))
    {
        bourne::json value = object[tokenKey];



        jsonToValue(&token, value, "std::string");


    }


}

bourne::json
CatalogsCreateReportResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["token"] = getToken();



    return object;

}

std::string
CatalogsCreateReportResponse::getToken()
{
	return token;
}

void
CatalogsCreateReportResponse::setToken(std::string token)
{
	this->token = token;
}



