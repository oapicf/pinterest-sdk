

#include "NotificationResponse.h"

using namespace Tiny;

NotificationResponse::NotificationResponse()
{
	success = bool(false);
	received_at = int(0);
	error_msg = std::string();
}

NotificationResponse::NotificationResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

NotificationResponse::~NotificationResponse()
{

}

void
NotificationResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *successKey = "success";

    if(object.has_key(successKey))
    {
        bourne::json value = object[successKey];



        jsonToValue(&success, value, "bool");


    }

    const char *received_atKey = "received_at";

    if(object.has_key(received_atKey))
    {
        bourne::json value = object[received_atKey];



        jsonToValue(&received_at, value, "int");


    }

    const char *error_msgKey = "error_msg";

    if(object.has_key(error_msgKey))
    {
        bourne::json value = object[error_msgKey];



        jsonToValue(&error_msg, value, "std::string");


    }


}

bourne::json
NotificationResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["success"] = isSuccess();






    object["received_at"] = getReceivedAt();






    object["error_msg"] = getErrorMsg();



    return object;

}

bool
NotificationResponse::isSuccess()
{
	return success;
}

void
NotificationResponse::setSuccess(bool  success)
{
	this->success = success;
}

int
NotificationResponse::getReceivedAt()
{
	return received_at;
}

void
NotificationResponse::setReceivedAt(int  received_at)
{
	this->received_at = received_at;
}

std::string
NotificationResponse::getErrorMsg()
{
	return error_msg;
}

void
NotificationResponse::setErrorMsg(std::string  error_msg)
{
	this->error_msg = error_msg;
}



