

#include "CancelInviteException.h"

using namespace Tiny;

CancelInviteException::CancelInviteException()
{
	invite_id = std::string();
	message = std::string();
}

CancelInviteException::CancelInviteException(std::string jsonString)
{
	this->fromJson(jsonString);
}

CancelInviteException::~CancelInviteException()
{

}

void
CancelInviteException::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *invite_idKey = "invite_id";

    if(object.has_key(invite_idKey))
    {
        bourne::json value = object[invite_idKey];



        jsonToValue(&invite_id, value, "std::string");


    }

    const char *messageKey = "message";

    if(object.has_key(messageKey))
    {
        bourne::json value = object[messageKey];



        jsonToValue(&message, value, "std::string");


    }


}

bourne::json
CancelInviteException::toJson()
{
    bourne::json object = bourne::json::object();





    object["invite_id"] = getInviteId();






    object["message"] = getMessage();



    return object;

}

std::string
CancelInviteException::getInviteId()
{
	return invite_id;
}

void
CancelInviteException::setInviteId(std::string invite_id)
{
	this->invite_id = invite_id;
}

std::string
CancelInviteException::getMessage()
{
	return message;
}

void
CancelInviteException::setMessage(std::string message)
{
	this->message = message;
}



