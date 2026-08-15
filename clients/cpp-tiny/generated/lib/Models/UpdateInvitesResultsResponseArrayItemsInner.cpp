

#include "UpdateInvitesResultsResponseArray_items_inner.h"

using namespace Tiny;

UpdateInvitesResultsResponseArray_items_inner::UpdateInvitesResultsResponseArray_items_inner()
{
	exception = InviteExceptionResponse();
	invite = InviteBusinessRoleBinding();
}

UpdateInvitesResultsResponseArray_items_inner::UpdateInvitesResultsResponseArray_items_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateInvitesResultsResponseArray_items_inner::~UpdateInvitesResultsResponseArray_items_inner()
{

}

void
UpdateInvitesResultsResponseArray_items_inner::fromJson(std::string jsonObj)
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




        InviteBusinessRoleBinding* obj = &invite;
		obj->fromJson(value.dump());

    }


}

bourne::json
UpdateInvitesResultsResponseArray_items_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["exception"] = getException().toJson();






	object["invite"] = getInvite().toJson();


    return object;

}

InviteExceptionResponse
UpdateInvitesResultsResponseArray_items_inner::getException()
{
	return exception;
}

void
UpdateInvitesResultsResponseArray_items_inner::setException(InviteExceptionResponse  exception)
{
	this->exception = exception;
}

InviteBusinessRoleBinding
UpdateInvitesResultsResponseArray_items_inner::getInvite()
{
	return invite;
}

void
UpdateInvitesResultsResponseArray_items_inner::setInvite(InviteBusinessRoleBinding  invite)
{
	this->invite = invite;
}



