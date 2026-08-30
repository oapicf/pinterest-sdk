

#include "CancelInviteResultItem.h"

using namespace Tiny;

CancelInviteResultItem::CancelInviteResultItem()
{
	exception = CancelInviteException();
	invite = CancelInviteResult();
}

CancelInviteResultItem::CancelInviteResultItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

CancelInviteResultItem::~CancelInviteResultItem()
{

}

void
CancelInviteResultItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *exceptionKey = "exception";

    if(object.has_key(exceptionKey))
    {
        bourne::json value = object[exceptionKey];




        CancelInviteException* obj = &exception;
		obj->fromJson(value.dump());

    }

    const char *inviteKey = "invite";

    if(object.has_key(inviteKey))
    {
        bourne::json value = object[inviteKey];




        CancelInviteResult* obj = &invite;
		obj->fromJson(value.dump());

    }


}

bourne::json
CancelInviteResultItem::toJson()
{
    bourne::json object = bourne::json::object();






	object["exception"] = getException().toJson();






	object["invite"] = getInvite().toJson();


    return object;

}

CancelInviteException
CancelInviteResultItem::getException()
{
	return exception;
}

void
CancelInviteResultItem::setException(CancelInviteException exception)
{
	this->exception = exception;
}

CancelInviteResult
CancelInviteResultItem::getInvite()
{
	return invite;
}

void
CancelInviteResultItem::setInvite(CancelInviteResult invite)
{
	this->invite = invite;
}



