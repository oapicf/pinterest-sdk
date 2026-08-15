

#include "MembersToDeleteBody_members_inner.h"

using namespace Tiny;

MembersToDeleteBody_members_inner::MembersToDeleteBody_members_inner()
{
	business_role = BusinessRoleForMembers();
	member_id = std::string();
}

MembersToDeleteBody_members_inner::MembersToDeleteBody_members_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

MembersToDeleteBody_members_inner::~MembersToDeleteBody_members_inner()
{

}

void
MembersToDeleteBody_members_inner::fromJson(std::string jsonObj)
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
MembersToDeleteBody_members_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["business_role"] = getBusinessRole().toJson();





    object["member_id"] = getMemberId();



    return object;

}

BusinessRoleForMembers
MembersToDeleteBody_members_inner::getBusinessRole()
{
	return business_role;
}

void
MembersToDeleteBody_members_inner::setBusinessRole(BusinessRoleForMembers  business_role)
{
	this->business_role = business_role;
}

std::string
MembersToDeleteBody_members_inner::getMemberId()
{
	return member_id;
}

void
MembersToDeleteBody_members_inner::setMemberId(std::string  member_id)
{
	this->member_id = member_id;
}



