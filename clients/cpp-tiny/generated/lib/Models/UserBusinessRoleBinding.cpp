

#include "UserBusinessRoleBinding.h"

using namespace Tiny;

UserBusinessRoleBinding::UserBusinessRoleBinding()
{
	assets_summary = null;
	business_roles = std::list<std::string>();
	created_by_business = null;
	created_by_user = null;
	created_time = int(0);
	id = std::string();
	is_shared_partner = bool(false);
	user = null;
}

UserBusinessRoleBinding::UserBusinessRoleBinding(std::string jsonString)
{
	this->fromJson(jsonString);
}

UserBusinessRoleBinding::~UserBusinessRoleBinding()
{

}

void
UserBusinessRoleBinding::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *assets_summaryKey = "assets_summary";

    if(object.has_key(assets_summaryKey))
    {
        bourne::json value = object[assets_summaryKey];




        BusinessMemberAssetsSummary* obj = &assets_summary;
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




        BusinessAccessUserSummary* obj = &created_by_business;
		obj->fromJson(value.dump());

    }

    const char *created_by_userKey = "created_by_user";

    if(object.has_key(created_by_userKey))
    {
        bourne::json value = object[created_by_userKey];




        BusinessAccessUserSummary* obj = &created_by_user;
		obj->fromJson(value.dump());

    }

    const char *created_timeKey = "created_time";

    if(object.has_key(created_timeKey))
    {
        bourne::json value = object[created_timeKey];



        jsonToValue(&created_time, value, "int");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *is_shared_partnerKey = "is_shared_partner";

    if(object.has_key(is_shared_partnerKey))
    {
        bourne::json value = object[is_shared_partnerKey];



        jsonToValue(&is_shared_partner, value, "bool");


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
UserBusinessRoleBinding::toJson()
{
    bourne::json object = bourne::json::object();






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






    object["id"] = getId();






    object["is_shared_partner"] = isIsSharedPartner();







	object["user"] = getUser().toJson();


    return object;

}

BusinessMemberAssetsSummary
UserBusinessRoleBinding::getAssetsSummary()
{
	return assets_summary;
}

void
UserBusinessRoleBinding::setAssetsSummary(BusinessMemberAssetsSummary assets_summary)
{
	this->assets_summary = assets_summary;
}

std::list<std::string>
UserBusinessRoleBinding::getBusinessRoles()
{
	return business_roles;
}

void
UserBusinessRoleBinding::setBusinessRoles(std::list<std::string> business_roles)
{
	this->business_roles = business_roles;
}

BusinessAccessUserSummary
UserBusinessRoleBinding::getCreatedByBusiness()
{
	return created_by_business;
}

void
UserBusinessRoleBinding::setCreatedByBusiness(BusinessAccessUserSummary created_by_business)
{
	this->created_by_business = created_by_business;
}

BusinessAccessUserSummary
UserBusinessRoleBinding::getCreatedByUser()
{
	return created_by_user;
}

void
UserBusinessRoleBinding::setCreatedByUser(BusinessAccessUserSummary created_by_user)
{
	this->created_by_user = created_by_user;
}

int
UserBusinessRoleBinding::getCreatedTime()
{
	return created_time;
}

void
UserBusinessRoleBinding::setCreatedTime(int created_time)
{
	this->created_time = created_time;
}

std::string
UserBusinessRoleBinding::getId()
{
	return id;
}

void
UserBusinessRoleBinding::setId(std::string id)
{
	this->id = id;
}

bool
UserBusinessRoleBinding::isIsSharedPartner()
{
	return is_shared_partner;
}

void
UserBusinessRoleBinding::setIsSharedPartner(bool is_shared_partner)
{
	this->is_shared_partner = is_shared_partner;
}

BusinessAccessUserSummary
UserBusinessRoleBinding::getUser()
{
	return user;
}

void
UserBusinessRoleBinding::setUser(BusinessAccessUserSummary user)
{
	this->user = user;
}



