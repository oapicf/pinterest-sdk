

#include "DeleteInvitesResultsResponseArray_items_inner.h"

using namespace Tiny;

DeleteInvitesResultsResponseArray_items_inner::DeleteInvitesResultsResponseArray_items_inner()
{
	exception = DeleteInvitesResultsResponseArray_items_inner_exception();
	invite = BaseInviteDataResponse();
}

DeleteInvitesResultsResponseArray_items_inner::DeleteInvitesResultsResponseArray_items_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeleteInvitesResultsResponseArray_items_inner::~DeleteInvitesResultsResponseArray_items_inner()
{

}

void
DeleteInvitesResultsResponseArray_items_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *exceptionKey = "exception";

    if(object.has_key(exceptionKey))
    {
        bourne::json value = object[exceptionKey];




        DeleteInvitesResultsResponseArray_items_inner_exception* obj = &exception;
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
DeleteInvitesResultsResponseArray_items_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["exception"] = getException().toJson();






	object["invite"] = getInvite().toJson();


    return object;

}

DeleteInvitesResultsResponseArray_items_inner_exception
DeleteInvitesResultsResponseArray_items_inner::getException()
{
	return exception;
}

void
DeleteInvitesResultsResponseArray_items_inner::setException(DeleteInvitesResultsResponseArray_items_inner_exception  exception)
{
	this->exception = exception;
}

BaseInviteDataResponse
DeleteInvitesResultsResponseArray_items_inner::getInvite()
{
	return invite;
}

void
DeleteInvitesResultsResponseArray_items_inner::setInvite(BaseInviteDataResponse  invite)
{
	this->invite = invite;
}



