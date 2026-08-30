

#include "BaseInviteDataResponse.h"

using namespace Tiny;

BaseInviteDataResponse::BaseInviteDataResponse()
{
	id = std::string();
	invite_data = InviteDataResponse();
	is_received_invite = bool(false);
	user = null;
}

BaseInviteDataResponse::BaseInviteDataResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

BaseInviteDataResponse::~BaseInviteDataResponse()
{

}

void
BaseInviteDataResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *invite_dataKey = "invite_data";

    if(object.has_key(invite_dataKey))
    {
        bourne::json value = object[invite_dataKey];




        InviteDataResponse* obj = &invite_data;
		obj->fromJson(value.dump());

    }

    const char *is_received_inviteKey = "is_received_invite";

    if(object.has_key(is_received_inviteKey))
    {
        bourne::json value = object[is_received_inviteKey];



        jsonToValue(&is_received_invite, value, "bool");


    }

    const char *userKey = "user";

    if(object.has_key(userKey))
    {
        bourne::json value = object[userKey];




        BusinessAccessUserSummary* obj = &user;
		obj->fromJson(value.dump());

    }


}

bourne::json
BaseInviteDataResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["invite_data"] = getInviteData().toJson();





    object["is_received_invite"] = isIsReceivedInvite();







	object["user"] = getUser().toJson();


    return object;

}

std::string
BaseInviteDataResponse::getId()
{
	return id;
}

void
BaseInviteDataResponse::setId(std::string id)
{
	this->id = id;
}

InviteDataResponse
BaseInviteDataResponse::getInviteData()
{
	return invite_data;
}

void
BaseInviteDataResponse::setInviteData(InviteDataResponse invite_data)
{
	this->invite_data = invite_data;
}

bool
BaseInviteDataResponse::isIsReceivedInvite()
{
	return is_received_invite;
}

void
BaseInviteDataResponse::setIsReceivedInvite(bool is_received_invite)
{
	this->is_received_invite = is_received_invite;
}

BusinessAccessUserSummary
BaseInviteDataResponse::getUser()
{
	return user;
}

void
BaseInviteDataResponse::setUser(BusinessAccessUserSummary user)
{
	this->user = user;
}



