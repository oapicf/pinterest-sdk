

#include "UpdateMemberResult.h"

using namespace Tiny;

UpdateMemberResult::UpdateMemberResult()
{
	business_role = std::string();
	member_id = std::string();
}

UpdateMemberResult::UpdateMemberResult(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateMemberResult::~UpdateMemberResult()
{

}

void
UpdateMemberResult::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *business_roleKey = "business_role";

    if(object.has_key(business_roleKey))
    {
        bourne::json value = object[business_roleKey];



        jsonToValue(&business_role, value, "std::string");


    }

    const char *member_idKey = "member_id";

    if(object.has_key(member_idKey))
    {
        bourne::json value = object[member_idKey];



        jsonToValue(&member_id, value, "std::string");


    }


}

bourne::json
UpdateMemberResult::toJson()
{
    bourne::json object = bourne::json::object();





    object["business_role"] = getBusinessRole();






    object["member_id"] = getMemberId();



    return object;

}

std::string
UpdateMemberResult::getBusinessRole()
{
	return business_role;
}

void
UpdateMemberResult::setBusinessRole(std::string  business_role)
{
	this->business_role = business_role;
}

std::string
UpdateMemberResult::getMemberId()
{
	return member_id;
}

void
UpdateMemberResult::setMemberId(std::string  member_id)
{
	this->member_id = member_id;
}



