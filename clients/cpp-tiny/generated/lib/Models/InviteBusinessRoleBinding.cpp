

#include "InviteBusinessRoleBinding.h"

using namespace Tiny;

InviteBusinessRoleBinding::InviteBusinessRoleBinding()
{
	created_by_business_id = std::string();
	created_by_user_id = std::string();
	id = std::string();
	invite_data = InviteDataResponse();
	is_received_invite = bool(false);
	user = null;
}

InviteBusinessRoleBinding::InviteBusinessRoleBinding(std::string jsonString)
{
	this->fromJson(jsonString);
}

InviteBusinessRoleBinding::~InviteBusinessRoleBinding()
{

}

void
InviteBusinessRoleBinding::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *created_by_business_idKey = "created_by_business_id";

    if(object.has_key(created_by_business_idKey))
    {
        bourne::json value = object[created_by_business_idKey];



        jsonToValue(&created_by_business_id, value, "std::string");


    }

    const char *created_by_user_idKey = "created_by_user_id";

    if(object.has_key(created_by_user_idKey))
    {
        bourne::json value = object[created_by_user_idKey];



        jsonToValue(&created_by_user_id, value, "std::string");


    }

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
InviteBusinessRoleBinding::toJson()
{
    bourne::json object = bourne::json::object();





    object["created_by_business_id"] = getCreatedByBusinessId();






    object["created_by_user_id"] = getCreatedByUserId();






    object["id"] = getId();







	object["invite_data"] = getInviteData().toJson();





    object["is_received_invite"] = isIsReceivedInvite();







	object["user"] = getUser().toJson();


    return object;

}

std::string
InviteBusinessRoleBinding::getCreatedByBusinessId()
{
	return created_by_business_id;
}

void
InviteBusinessRoleBinding::setCreatedByBusinessId(std::string created_by_business_id)
{
	this->created_by_business_id = created_by_business_id;
}

std::string
InviteBusinessRoleBinding::getCreatedByUserId()
{
	return created_by_user_id;
}

void
InviteBusinessRoleBinding::setCreatedByUserId(std::string created_by_user_id)
{
	this->created_by_user_id = created_by_user_id;
}

std::string
InviteBusinessRoleBinding::getId()
{
	return id;
}

void
InviteBusinessRoleBinding::setId(std::string id)
{
	this->id = id;
}

InviteDataResponse
InviteBusinessRoleBinding::getInviteData()
{
	return invite_data;
}

void
InviteBusinessRoleBinding::setInviteData(InviteDataResponse invite_data)
{
	this->invite_data = invite_data;
}

bool
InviteBusinessRoleBinding::isIsReceivedInvite()
{
	return is_received_invite;
}

void
InviteBusinessRoleBinding::setIsReceivedInvite(bool is_received_invite)
{
	this->is_received_invite = is_received_invite;
}

BusinessAccessUserSummary
InviteBusinessRoleBinding::getUser()
{
	return user;
}

void
InviteBusinessRoleBinding::setUser(BusinessAccessUserSummary user)
{
	this->user = user;
}



