

#include "Campaign_ad_preview_delete_200_response_inner_status.h"

using namespace Tiny;

Campaign_ad_preview_delete_200_response_inner_status::Campaign_ad_preview_delete_200_response_inner_status()
{
	statusCode = float(0);
	code = int(0);
	message = std::string();
}

Campaign_ad_preview_delete_200_response_inner_status::Campaign_ad_preview_delete_200_response_inner_status(std::string jsonString)
{
	this->fromJson(jsonString);
}

Campaign_ad_preview_delete_200_response_inner_status::~Campaign_ad_preview_delete_200_response_inner_status()
{

}

void
Campaign_ad_preview_delete_200_response_inner_status::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *statusCodeKey = "statusCode";

    if(object.has_key(statusCodeKey))
    {
        bourne::json value = object[statusCodeKey];



        jsonToValue(&statusCode, value, "long");


    }

    const char *codeKey = "code";

    if(object.has_key(codeKey))
    {
        bourne::json value = object[codeKey];



        jsonToValue(&code, value, "int");


    }

    const char *messageKey = "message";

    if(object.has_key(messageKey))
    {
        bourne::json value = object[messageKey];



        jsonToValue(&message, value, "std::string");


    }


}

bourne::json
Campaign_ad_preview_delete_200_response_inner_status::toJson()
{
    bourne::json object = bourne::json::object();





    object["statusCode"] = getStatusCode();






    object["code"] = getCode();






    object["message"] = getMessage();



    return object;

}

long
Campaign_ad_preview_delete_200_response_inner_status::getStatusCode()
{
	return statusCode;
}

void
Campaign_ad_preview_delete_200_response_inner_status::setStatusCode(long statusCode)
{
	this->statusCode = statusCode;
}

int
Campaign_ad_preview_delete_200_response_inner_status::getCode()
{
	return code;
}

void
Campaign_ad_preview_delete_200_response_inner_status::setCode(int code)
{
	this->code = code;
}

std::string
Campaign_ad_preview_delete_200_response_inner_status::getMessage()
{
	return message;
}

void
Campaign_ad_preview_delete_200_response_inner_status::setMessage(std::string message)
{
	this->message = message;
}



