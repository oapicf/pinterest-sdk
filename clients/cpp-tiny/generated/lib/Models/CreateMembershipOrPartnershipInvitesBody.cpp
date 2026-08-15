

#include "CreateMembershipOrPartnershipInvitesBody.h"

using namespace Tiny;

CreateMembershipOrPartnershipInvitesBody::CreateMembershipOrPartnershipInvitesBody()
{
	business_role = std::string();
	invite_type = InviteType();
	members = std::list<std::string>();
	partners = std::list<std::string>();
}

CreateMembershipOrPartnershipInvitesBody::CreateMembershipOrPartnershipInvitesBody(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateMembershipOrPartnershipInvitesBody::~CreateMembershipOrPartnershipInvitesBody()
{

}

void
CreateMembershipOrPartnershipInvitesBody::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *business_roleKey = "business_role";

    if(object.has_key(business_roleKey))
    {
        bourne::json value = object[business_roleKey];



        jsonToValue(&business_role, value, "std::string");


    }

    const char *invite_typeKey = "invite_type";

    if(object.has_key(invite_typeKey))
    {
        bourne::json value = object[invite_typeKey];




        InviteType* obj = &invite_type;
		obj->fromJson(value.dump());

    }

    const char *membersKey = "members";

    if(object.has_key(membersKey))
    {
        bourne::json value = object[membersKey];


        std::list<std::string> members_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            members_list.push_back(element);
        }
        members = members_list;


    }

    const char *partnersKey = "partners";

    if(object.has_key(partnersKey))
    {
        bourne::json value = object[partnersKey];


        std::list<std::string> partners_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            partners_list.push_back(element);
        }
        partners = partners_list;


    }


}

bourne::json
CreateMembershipOrPartnershipInvitesBody::toJson()
{
    bourne::json object = bourne::json::object();





    object["business_role"] = getBusinessRole();







	object["invite_type"] = getInviteType().toJson();




    std::list<std::string> members_list = getMembers();
    bourne::json members_arr = bourne::json::array();

    for(auto& var : members_list)
    {
        members_arr.append(var);
    }
    object["members"] = members_arr;








    std::list<std::string> partners_list = getPartners();
    bourne::json partners_arr = bourne::json::array();

    for(auto& var : partners_list)
    {
        partners_arr.append(var);
    }
    object["partners"] = partners_arr;






    return object;

}

std::string
CreateMembershipOrPartnershipInvitesBody::getBusinessRole()
{
	return business_role;
}

void
CreateMembershipOrPartnershipInvitesBody::setBusinessRole(std::string  business_role)
{
	this->business_role = business_role;
}

InviteType
CreateMembershipOrPartnershipInvitesBody::getInviteType()
{
	return invite_type;
}

void
CreateMembershipOrPartnershipInvitesBody::setInviteType(InviteType  invite_type)
{
	this->invite_type = invite_type;
}

std::list<std::string>
CreateMembershipOrPartnershipInvitesBody::getMembers()
{
	return members;
}

void
CreateMembershipOrPartnershipInvitesBody::setMembers(std::list <std::string> members)
{
	this->members = members;
}

std::list<std::string>
CreateMembershipOrPartnershipInvitesBody::getPartners()
{
	return partners;
}

void
CreateMembershipOrPartnershipInvitesBody::setPartners(std::list <std::string> partners)
{
	this->partners = partners;
}



