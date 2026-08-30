

#include "Delete_business_membership_200_response.h"

using namespace Tiny;

Delete_business_membership_200_response::Delete_business_membership_200_response()
{
	deleted_members = std::list<std::string>();
}

Delete_business_membership_200_response::Delete_business_membership_200_response(std::string jsonString)
{
	this->fromJson(jsonString);
}

Delete_business_membership_200_response::~Delete_business_membership_200_response()
{

}

void
Delete_business_membership_200_response::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *deleted_membersKey = "deleted_members";

    if(object.has_key(deleted_membersKey))
    {
        bourne::json value = object[deleted_membersKey];


        std::list<std::string> deleted_members_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            deleted_members_list.push_back(element);
        }
        deleted_members = deleted_members_list;


    }


}

bourne::json
Delete_business_membership_200_response::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> deleted_members_list = getDeletedMembers();
    bourne::json deleted_members_arr = bourne::json::array();

    for(auto& var : deleted_members_list)
    {
        deleted_members_arr.append(var);
    }
    object["deleted_members"] = deleted_members_arr;






    return object;

}

std::list<std::string>
Delete_business_membership_200_response::getDeletedMembers()
{
	return deleted_members;
}

void
Delete_business_membership_200_response::setDeletedMembers(std::list<std::string> deleted_members)
{
	this->deleted_members = deleted_members;
}



