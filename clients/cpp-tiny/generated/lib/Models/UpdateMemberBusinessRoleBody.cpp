

#include "UpdateMemberBusinessRoleBody.h"

using namespace Tiny;

UpdateMemberBusinessRoleBody::UpdateMemberBusinessRoleBody()
{
	business_role = BusinessRoleForMembers();
	member_id = std::string();
}

UpdateMemberBusinessRoleBody::UpdateMemberBusinessRoleBody(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateMemberBusinessRoleBody::~UpdateMemberBusinessRoleBody()
{

}

void
UpdateMemberBusinessRoleBody::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *business_roleKey = "business_role";

    if(object.has_key(business_roleKey))
    {
        bourne::json value = object[business_roleKey];




        BusinessRoleForMembers* obj = &business_role;
		obj->fromJson(value.dump());

    }

    const char *member_idKey = "member_id";

    if(object.has_key(member_idKey))
    {
        bourne::json value = object[member_idKey];



        jsonToValue(&member_id, value, "std::string");


    }


}

bourne::json
UpdateMemberBusinessRoleBody::toJson()
{
    bourne::json object = bourne::json::object();






	object["business_role"] = getBusinessRole().toJson();





    object["member_id"] = getMemberId();



    return object;

}

BusinessRoleForMembers
UpdateMemberBusinessRoleBody::getBusinessRole()
{
	return business_role;
}

void
UpdateMemberBusinessRoleBody::setBusinessRole(BusinessRoleForMembers  business_role)
{
	this->business_role = business_role;
}

std::string
UpdateMemberBusinessRoleBody::getMemberId()
{
	return member_id;
}

void
UpdateMemberBusinessRoleBody::setMemberId(std::string  member_id)
{
	this->member_id = member_id;
}



