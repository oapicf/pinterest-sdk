

#include "IntegrationLogsSuccessResponse.h"

using namespace Tiny;

IntegrationLogsSuccessResponse::IntegrationLogsSuccessResponse()
{
	message = std::string();
}

IntegrationLogsSuccessResponse::IntegrationLogsSuccessResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

IntegrationLogsSuccessResponse::~IntegrationLogsSuccessResponse()
{

}

void
IntegrationLogsSuccessResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *messageKey = "message";

    if(object.has_key(messageKey))
    {
        bourne::json value = object[messageKey];



        jsonToValue(&message, value, "std::string");


    }


}

bourne::json
IntegrationLogsSuccessResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["message"] = getMessage();



    return object;

}

std::string
IntegrationLogsSuccessResponse::getMessage()
{
	return message;
}

void
IntegrationLogsSuccessResponse::setMessage(std::string  message)
{
	this->message = message;
}



