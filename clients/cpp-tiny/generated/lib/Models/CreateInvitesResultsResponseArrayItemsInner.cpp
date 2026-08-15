

#include "CreateInvitesResultsResponseArray_items_inner.h"

using namespace Tiny;

CreateInvitesResultsResponseArray_items_inner::CreateInvitesResultsResponseArray_items_inner()
{
	exception = InviteExceptionResponse();
	invite = CreateInvitesResultsResponseArray_items_inner_invite();
}

CreateInvitesResultsResponseArray_items_inner::CreateInvitesResultsResponseArray_items_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateInvitesResultsResponseArray_items_inner::~CreateInvitesResultsResponseArray_items_inner()
{

}

void
CreateInvitesResultsResponseArray_items_inner::fromJson(std::string jsonObj)
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




        CreateInvitesResultsResponseArray_items_inner_invite* obj = &invite;
		obj->fromJson(value.dump());

    }


}

bourne::json
CreateInvitesResultsResponseArray_items_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["exception"] = getException().toJson();






	object["invite"] = getInvite().toJson();


    return object;

}

InviteExceptionResponse
CreateInvitesResultsResponseArray_items_inner::getException()
{
	return exception;
}

void
CreateInvitesResultsResponseArray_items_inner::setException(InviteExceptionResponse  exception)
{
	this->exception = exception;
}

CreateInvitesResultsResponseArray_items_inner_invite
CreateInvitesResultsResponseArray_items_inner::getInvite()
{
	return invite;
}

void
CreateInvitesResultsResponseArray_items_inner::setInvite(CreateInvitesResultsResponseArray_items_inner_invite  invite)
{
	this->invite = invite;
}



