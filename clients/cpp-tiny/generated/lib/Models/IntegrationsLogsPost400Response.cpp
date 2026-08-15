

#include "Integrations_logs_post_400_response.h"

using namespace Tiny;

Integrations_logs_post_400_response::Integrations_logs_post_400_response()
{
	code = int(0);
	message = std::string();
	details = null;
}

Integrations_logs_post_400_response::Integrations_logs_post_400_response(std::string jsonString)
{
	this->fromJson(jsonString);
}

Integrations_logs_post_400_response::~Integrations_logs_post_400_response()
{

}

void
Integrations_logs_post_400_response::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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

    const char *detailsKey = "details";

    if(object.has_key(detailsKey))
    {
        bourne::json value = object[detailsKey];




        Object* obj = &details;
		obj->fromJson(value.dump());

    }


}

bourne::json
Integrations_logs_post_400_response::toJson()
{
    bourne::json object = bourne::json::object();





    object["code"] = getCode();






    object["message"] = getMessage();







	object["details"] = getDetails().toJson();


    return object;

}

int
Integrations_logs_post_400_response::getCode()
{
	return code;
}

void
Integrations_logs_post_400_response::setCode(int  code)
{
	this->code = code;
}

std::string
Integrations_logs_post_400_response::getMessage()
{
	return message;
}

void
Integrations_logs_post_400_response::setMessage(std::string  message)
{
	this->message = message;
}

Object
Integrations_logs_post_400_response::getDetails()
{
	return details;
}

void
Integrations_logs_post_400_response::setDetails(Object  details)
{
	this->details = details;
}



