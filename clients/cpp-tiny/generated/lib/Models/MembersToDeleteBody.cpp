

#include "MembersToDeleteBody.h"

using namespace Tiny;

MembersToDeleteBody::MembersToDeleteBody()
{
	members = std::list<MembersToDeleteBody_members_inner>();
}

MembersToDeleteBody::MembersToDeleteBody(std::string jsonString)
{
	this->fromJson(jsonString);
}

MembersToDeleteBody::~MembersToDeleteBody()
{

}

void
MembersToDeleteBody::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *membersKey = "members";

    if(object.has_key(membersKey))
    {
        bourne::json value = object[membersKey];


        std::list<MembersToDeleteBody_members_inner> members_list;
        MembersToDeleteBody_members_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            members_list.push_back(element);
        }
        members = members_list;


    }


}

bourne::json
MembersToDeleteBody::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<MembersToDeleteBody_members_inner> members_list = getMembers();
    bourne::json members_arr = bourne::json::array();

    for(auto& var : members_list)
    {
        MembersToDeleteBody_members_inner obj = var;
        members_arr.append(obj.toJson());
    }
    object["members"] = members_arr;




    return object;

}

std::list<MembersToDeleteBody_members_inner>
MembersToDeleteBody::getMembers()
{
	return members;
}

void
MembersToDeleteBody::setMembers(std::list <MembersToDeleteBody_members_inner> members)
{
	this->members = members;
}



