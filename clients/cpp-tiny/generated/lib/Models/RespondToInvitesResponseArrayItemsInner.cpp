

#include "RespondToInvitesResponseArray_items_inner.h"

using namespace Tiny;

RespondToInvitesResponseArray_items_inner::RespondToInvitesResponseArray_items_inner()
{
	exception = InviteExceptionResponse();
	invite = BaseInviteDataResponse();
}

RespondToInvitesResponseArray_items_inner::RespondToInvitesResponseArray_items_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

RespondToInvitesResponseArray_items_inner::~RespondToInvitesResponseArray_items_inner()
{

}

void
RespondToInvitesResponseArray_items_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *exceptionKey = "exception";

    if(object.has_key(exceptionKey))
    {
        bourne::json value = object[exceptionKey];




        InviteExceptionResponse* obj = &exception;
		obj->fromJson(value.dump());

    }

    const char *inviteKey = "invite";

    if(object.has_key(inviteKey))
    {
        bourne::json value = object[inviteKey];




        BaseInviteDataResponse* obj = &invite;
		obj->fromJson(value.dump());

    }


}

bourne::json
RespondToInvitesResponseArray_items_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["exception"] = getException().toJson();






	object["invite"] = getInvite().toJson();


    return object;

}

InviteExceptionResponse
RespondToInvitesResponseArray_items_inner::getException()
{
	return exception;
}

void
RespondToInvitesResponseArray_items_inner::setException(InviteExceptionResponse  exception)
{
	this->exception = exception;
}

BaseInviteDataResponse
RespondToInvitesResponseArray_items_inner::getInvite()
{
	return invite;
}

void
RespondToInvitesResponseArray_items_inner::setInvite(BaseInviteDataResponse  invite)
{
	this->invite = invite;
}



