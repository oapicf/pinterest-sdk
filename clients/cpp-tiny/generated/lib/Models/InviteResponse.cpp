

#include "InviteResponse.h"

using namespace Tiny;

InviteResponse::InviteResponse()
{
	id = std::string();
	invite_data = BaseInviteDataResponse_invite_data();
	is_received_invite = bool(false);
	user = null;
	assets_summary = InviteAssetsSummary();
	business_roles = std::list<std::string>();
	created_by_business = null;
	created_by_user = null;
	created_time = int(0);
}

InviteResponse::InviteResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

InviteResponse::~InviteResponse()
{

}

void
InviteResponse::fromJson(std::string jsonObj)
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




        BaseInviteDataResponse_invite_data* obj = &invite_data;
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

    const char *assets_summaryKey = "assets_summary";

    if(object.has_key(assets_summaryKey))
    {
        bourne::json value = object[assets_summaryKey];




        InviteAssetsSummary* obj = &assets_summary;
		obj->fromJson(value.dump());

    }

    const char *business_rolesKey = "business_roles";

    if(object.has_key(business_rolesKey))
    {
        bourne::json value = object[business_rolesKey];


        std::list<std::string> business_roles_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            business_roles_list.push_back(element);
        }
        business_roles = business_roles_list;


    }

    const char *created_by_businessKey = "created_by_business";

    if(object.has_key(created_by_businessKey))
    {
        bourne::json value = object[created_by_businessKey];




        Object* obj = &created_by_business;
		obj->fromJson(value.dump());

    }

    const char *created_by_userKey = "created_by_user";

    if(object.has_key(created_by_userKey))
    {
        bourne::json value = object[created_by_userKey];




        Object* obj = &created_by_user;
		obj->fromJson(value.dump());

    }

    const char *created_timeKey = "created_time";

    if(object.has_key(created_timeKey))
    {
        bourne::json value = object[created_timeKey];



        jsonToValue(&created_time, value, "int");


    }


}

bourne::json
InviteResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["invite_data"] = getInviteData().toJson();





    object["is_received_invite"] = isIsReceivedInvite();







	object["user"] = getUser().toJson();






	object["assets_summary"] = getAssetsSummary().toJson();




    std::list<std::string> business_roles_list = getBusinessRoles();
    bourne::json business_roles_arr = bourne::json::array();

    for(auto& var : business_roles_list)
    {
        business_roles_arr.append(var);
    }
    object["business_roles"] = business_roles_arr;










	object["created_by_business"] = getCreatedByBusiness().toJson();






	object["created_by_user"] = getCreatedByUser().toJson();





    object["created_time"] = getCreatedTime();



    return object;

}

std::string
InviteResponse::getId()
{
	return id;
}

void
InviteResponse::setId(std::string  id)
{
	this->id = id;
}

BaseInviteDataResponse_invite_data
InviteResponse::getInviteData()
{
	return invite_data;
}

void
InviteResponse::setInviteData(BaseInviteDataResponse_invite_data  invite_data)
{
	this->invite_data = invite_data;
}

bool
InviteResponse::isIsReceivedInvite()
{
	return is_received_invite;
}

void
InviteResponse::setIsReceivedInvite(bool  is_received_invite)
{
	this->is_received_invite = is_received_invite;
}

BusinessAccessUserSummary
InviteResponse::getUser()
{
	return user;
}

void
InviteResponse::setUser(BusinessAccessUserSummary  user)
{
	this->user = user;
}

InviteAssetsSummary
InviteResponse::getAssetsSummary()
{
	return assets_summary;
}

void
InviteResponse::setAssetsSummary(InviteAssetsSummary  assets_summary)
{
	this->assets_summary = assets_summary;
}

std::list<std::string>
InviteResponse::getBusinessRoles()
{
	return business_roles;
}

void
InviteResponse::setBusinessRoles(std::list <std::string> business_roles)
{
	this->business_roles = business_roles;
}

Object
InviteResponse::getCreatedByBusiness()
{
	return created_by_business;
}

void
InviteResponse::setCreatedByBusiness(Object  created_by_business)
{
	this->created_by_business = created_by_business;
}

Object
InviteResponse::getCreatedByUser()
{
	return created_by_user;
}

void
InviteResponse::setCreatedByUser(Object  created_by_user)
{
	this->created_by_user = created_by_user;
}

int
InviteResponse::getCreatedTime()
{
	return created_time;
}

void
InviteResponse::setCreatedTime(int  created_time)
{
	this->created_time = created_time;
}



