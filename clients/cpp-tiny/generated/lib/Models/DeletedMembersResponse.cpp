

#include "DeletedMembersResponse.h"

using namespace Tiny;

DeletedMembersResponse::DeletedMembersResponse()
{
	deleted_members = std::list<std::string>();
}

DeletedMembersResponse::DeletedMembersResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeletedMembersResponse::~DeletedMembersResponse()
{

}

void
DeletedMembersResponse::fromJson(std::string jsonObj)
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
DeletedMembersResponse::toJson()
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
DeletedMembersResponse::getDeletedMembers()
{
	return deleted_members;
}

void
DeletedMembersResponse::setDeletedMembers(std::list <std::string> deleted_members)
{
	this->deleted_members = deleted_members;
}



