

#include "CancelInvitesRequest.h"

using namespace Tiny;

CancelInvitesRequest::CancelInvitesRequest()
{
	invite_ids = std::list<std::string>();
}

CancelInvitesRequest::CancelInvitesRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CancelInvitesRequest::~CancelInvitesRequest()
{

}

void
CancelInvitesRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *invite_idsKey = "invite_ids";

    if(object.has_key(invite_idsKey))
    {
        bourne::json value = object[invite_idsKey];


        std::list<std::string> invite_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            invite_ids_list.push_back(element);
        }
        invite_ids = invite_ids_list;


    }


}

bourne::json
CancelInvitesRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> invite_ids_list = getInviteIds();
    bourne::json invite_ids_arr = bourne::json::array();

    for(auto& var : invite_ids_list)
    {
        invite_ids_arr.append(var);
    }
    object["invite_ids"] = invite_ids_arr;






    return object;

}

std::list<std::string>
CancelInvitesRequest::getInviteIds()
{
	return invite_ids;
}

void
CancelInvitesRequest::setInviteIds(std::list<std::string> invite_ids)
{
	this->invite_ids = invite_ids;
}



