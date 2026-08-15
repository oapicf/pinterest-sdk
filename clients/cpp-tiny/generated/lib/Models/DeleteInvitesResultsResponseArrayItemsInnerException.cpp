

#include "DeleteInvitesResultsResponseArray_items_inner_exception.h"

using namespace Tiny;

DeleteInvitesResultsResponseArray_items_inner_exception::DeleteInvitesResultsResponseArray_items_inner_exception()
{
	invite_id = std::string();
	message = std::string();
}

DeleteInvitesResultsResponseArray_items_inner_exception::DeleteInvitesResultsResponseArray_items_inner_exception(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeleteInvitesResultsResponseArray_items_inner_exception::~DeleteInvitesResultsResponseArray_items_inner_exception()
{

}

void
DeleteInvitesResultsResponseArray_items_inner_exception::fromJson(std::string jsonObj)
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
DeleteInvitesResultsResponseArray_items_inner_exception::toJson()
{
    bourne::json object = bourne::json::object();





    object["invite_id"] = getInviteId();






    object["message"] = getMessage();



    return object;

}

std::string
DeleteInvitesResultsResponseArray_items_inner_exception::getInviteId()
{
	return invite_id;
}

void
DeleteInvitesResultsResponseArray_items_inner_exception::setInviteId(std::string  invite_id)
{
	this->invite_id = invite_id;
}

std::string
DeleteInvitesResultsResponseArray_items_inner_exception::getMessage()
{
	return message;
}

void
DeleteInvitesResultsResponseArray_items_inner_exception::setMessage(std::string  message)
{
	this->message = message;
}



