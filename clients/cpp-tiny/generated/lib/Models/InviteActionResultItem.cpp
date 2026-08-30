

#include "InviteActionResultItem.h"

using namespace Tiny;

InviteActionResultItem::InviteActionResultItem()
{
	exception = InviteExceptionResponse();
	invite = InviteBusinessRoleBinding();
}

InviteActionResultItem::InviteActionResultItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

InviteActionResultItem::~InviteActionResultItem()
{

}

void
InviteActionResultItem::fromJson(std::string jsonObj)
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
InviteActionResultItem::toJson()
{
    bourne::json object = bourne::json::object();






	object["exception"] = getException().toJson();






	object["invite"] = getInvite().toJson();


    return object;

}

InviteExceptionResponse
InviteActionResultItem::getException()
{
	return exception;
}

void
InviteActionResultItem::setException(InviteExceptionResponse exception)
{
	this->exception = exception;
}

InviteBusinessRoleBinding
InviteActionResultItem::getInvite()
{
	return invite;
}

void
InviteActionResultItem::setInvite(InviteBusinessRoleBinding invite)
{
	this->invite = invite;
}



