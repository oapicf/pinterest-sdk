

#include "BusinessMembershipMember.h"

using namespace Tiny;

BusinessMembershipMember::BusinessMembershipMember()
{
	business_role = BusinessRoleForMembers();
	member_id = std::string();
}

BusinessMembershipMember::BusinessMembershipMember(std::string jsonString)
{
	this->fromJson(jsonString);
}

BusinessMembershipMember::~BusinessMembershipMember()
{

}

void
BusinessMembershipMember::fromJson(std::string jsonObj)
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
BusinessMembershipMember::toJson()
{
    bourne::json object = bourne::json::object();






	object["business_role"] = getBusinessRole().toJson();





    object["member_id"] = getMemberId();



    return object;

}

BusinessRoleForMembers
BusinessMembershipMember::getBusinessRole()
{
	return business_role;
}

void
BusinessMembershipMember::setBusinessRole(BusinessRoleForMembers business_role)
{
	this->business_role = business_role;
}

std::string
BusinessMembershipMember::getMemberId()
{
	return member_id;
}

void
BusinessMembershipMember::setMemberId(std::string member_id)
{
	this->member_id = member_id;
}



