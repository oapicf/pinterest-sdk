

#include "NotificationResponse.h"

using namespace Tiny;

NotificationResponse::NotificationResponse()
{
	error_msg = std::string();
	received_at = int(0);
	success = bool(false);
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

    const char *error_msgKey = "error_msg";

    if(object.has_key(error_msgKey))
    {
        bourne::json value = object[error_msgKey];



        jsonToValue(&error_msg, value, "std::string");


    }

    const char *received_atKey = "received_at";

    if(object.has_key(received_atKey))
    {
        bourne::json value = object[received_atKey];



        jsonToValue(&received_at, value, "int");


    }

    const char *successKey = "success";

    if(object.has_key(successKey))
    {
        bourne::json value = object[successKey];



        jsonToValue(&success, value, "bool");


    }


}

bourne::json
NotificationResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["error_msg"] = getErrorMsg();






    object["received_at"] = getReceivedAt();






    object["success"] = isSuccess();



    return object;

}

std::string
NotificationResponse::getErrorMsg()
{
	return error_msg;
}

void
NotificationResponse::setErrorMsg(std::string error_msg)
{
	this->error_msg = error_msg;
}

int
NotificationResponse::getReceivedAt()
{
	return received_at;
}

void
NotificationResponse::setReceivedAt(int received_at)
{
	this->received_at = received_at;
}

bool
NotificationResponse::isSuccess()
{
	return success;
}

void
NotificationResponse::setSuccess(bool success)
{
	this->success = success;
}



