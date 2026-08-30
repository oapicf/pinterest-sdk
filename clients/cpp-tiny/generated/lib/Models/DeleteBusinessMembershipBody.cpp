

#include "DeleteBusinessMembershipBody.h"

using namespace Tiny;

DeleteBusinessMembershipBody::DeleteBusinessMembershipBody()
{
	members = std::list<DeleteBusinessMembershipMember>();
}

DeleteBusinessMembershipBody::DeleteBusinessMembershipBody(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeleteBusinessMembershipBody::~DeleteBusinessMembershipBody()
{

}

void
DeleteBusinessMembershipBody::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *membersKey = "members";

    if(object.has_key(membersKey))
    {
        bourne::json value = object[membersKey];


        std::list<DeleteBusinessMembershipMember> members_list;
        DeleteBusinessMembershipMember element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            members_list.push_back(element);
        }
        members = members_list;


    }


}

bourne::json
DeleteBusinessMembershipBody::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<DeleteBusinessMembershipMember> members_list = getMembers();
    bourne::json members_arr = bourne::json::array();

    for(auto& var : members_list)
    {
        DeleteBusinessMembershipMember obj = var;
        members_arr.append(obj.toJson());
    }
    object["members"] = members_arr;




    return object;

}

std::list<DeleteBusinessMembershipMember>
DeleteBusinessMembershipBody::getMembers()
{
	return members;
}

void
DeleteBusinessMembershipBody::setMembers(std::list<DeleteBusinessMembershipMember> members)
{
	this->members = members;
}



