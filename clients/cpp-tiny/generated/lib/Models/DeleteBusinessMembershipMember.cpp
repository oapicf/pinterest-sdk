

#include "DeleteBusinessMembershipMember.h"

using namespace Tiny;

DeleteBusinessMembershipMember::DeleteBusinessMembershipMember()
{
	business_role = BusinessRoleForMembers();
	member_id = std::string();
}

DeleteBusinessMembershipMember::DeleteBusinessMembershipMember(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeleteBusinessMembershipMember::~DeleteBusinessMembershipMember()
{

}

void
DeleteBusinessMembershipMember::fromJson(std::string jsonObj)
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
DeleteBusinessMembershipMember::toJson()
{
    bourne::json object = bourne::json::object();






	object["business_role"] = getBusinessRole().toJson();





    object["member_id"] = getMemberId();



    return object;

}

BusinessRoleForMembers
DeleteBusinessMembershipMember::getBusinessRole()
{
	return business_role;
}

void
DeleteBusinessMembershipMember::setBusinessRole(BusinessRoleForMembers business_role)
{
	this->business_role = business_role;
}

std::string
DeleteBusinessMembershipMember::getMemberId()
{
	return member_id;
}

void
DeleteBusinessMembershipMember::setMemberId(std::string member_id)
{
	this->member_id = member_id;
}



