

#include "CancelInviteResult.h"

using namespace Tiny;

CancelInviteResult::CancelInviteResult()
{
	id = std::string();
	invite_data = InviteDataResponse();
	is_received_invite = bool(false);
	user = CancelInviteResultUser();
}

CancelInviteResult::CancelInviteResult(std::string jsonString)
{
	this->fromJson(jsonString);
}

CancelInviteResult::~CancelInviteResult()
{

}

void
CancelInviteResult::fromJson(std::string jsonObj)
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




        CancelInviteResultUser* obj = &user;
		obj->fromJson(value.dump());

    }


}

bourne::json
CancelInviteResult::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["invite_data"] = getInviteData().toJson();





    object["is_received_invite"] = isIsReceivedInvite();







	object["user"] = getUser().toJson();


    return object;

}

std::string
CancelInviteResult::getId()
{
	return id;
}

void
CancelInviteResult::setId(std::string id)
{
	this->id = id;
}

InviteDataResponse
CancelInviteResult::getInviteData()
{
	return invite_data;
}

void
CancelInviteResult::setInviteData(InviteDataResponse invite_data)
{
	this->invite_data = invite_data;
}

bool
CancelInviteResult::isIsReceivedInvite()
{
	return is_received_invite;
}

void
CancelInviteResult::setIsReceivedInvite(bool is_received_invite)
{
	this->is_received_invite = is_received_invite;
}

CancelInviteResultUser
CancelInviteResult::getUser()
{
	return user;
}

void
CancelInviteResult::setUser(CancelInviteResultUser user)
{
	this->user = user;
}



