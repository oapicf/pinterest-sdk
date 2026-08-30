

#include "RespondToInviteResultItem.h"

using namespace Tiny;

RespondToInviteResultItem::RespondToInviteResultItem()
{
	exception = InviteExceptionResponse();
	invite = null;
}

RespondToInviteResultItem::RespondToInviteResultItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

RespondToInviteResultItem::~RespondToInviteResultItem()
{

}

void
RespondToInviteResultItem::fromJson(std::string jsonObj)
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
RespondToInviteResultItem::toJson()
{
    bourne::json object = bourne::json::object();






	object["exception"] = getException().toJson();






	object["invite"] = getInvite().toJson();


    return object;

}

InviteExceptionResponse
RespondToInviteResultItem::getException()
{
	return exception;
}

void
RespondToInviteResultItem::setException(InviteExceptionResponse exception)
{
	this->exception = exception;
}

BaseInviteDataResponse
RespondToInviteResultItem::getInvite()
{
	return invite;
}

void
RespondToInviteResultItem::setInvite(BaseInviteDataResponse invite)
{
	this->invite = invite;
}



