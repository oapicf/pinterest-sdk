

#include "AmazonConnectResponse.h"

using namespace Tiny;

AmazonConnectResponse::AmazonConnectResponse()
{
	message = std::string();
}

AmazonConnectResponse::AmazonConnectResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

AmazonConnectResponse::~AmazonConnectResponse()
{

}

void
AmazonConnectResponse::fromJson(std::string jsonObj)
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
AmazonConnectResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["message"] = getMessage();



    return object;

}

std::string
AmazonConnectResponse::getMessage()
{
	return message;
}

void
AmazonConnectResponse::setMessage(std::string message)
{
	this->message = message;
}



