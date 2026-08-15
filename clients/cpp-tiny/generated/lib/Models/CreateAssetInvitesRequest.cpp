

#include "CreateAssetInvitesRequest.h"

using namespace Tiny;

CreateAssetInvitesRequest::CreateAssetInvitesRequest()
{
	invites = std::list<CreateAssetInvitesRequestItem>();
}

CreateAssetInvitesRequest::CreateAssetInvitesRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateAssetInvitesRequest::~CreateAssetInvitesRequest()
{

}

void
CreateAssetInvitesRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *invitesKey = "invites";

    if(object.has_key(invitesKey))
    {
        bourne::json value = object[invitesKey];


        std::list<CreateAssetInvitesRequestItem> invites_list;
        CreateAssetInvitesRequestItem element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            invites_list.push_back(element);
        }
        invites = invites_list;


    }


}

bourne::json
CreateAssetInvitesRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<CreateAssetInvitesRequestItem> invites_list = getInvites();
    bourne::json invites_arr = bourne::json::array();

    for(auto& var : invites_list)
    {
        CreateAssetInvitesRequestItem obj = var;
        invites_arr.append(obj.toJson());
    }
    object["invites"] = invites_arr;




    return object;

}

std::list<CreateAssetInvitesRequestItem>
CreateAssetInvitesRequest::getInvites()
{
	return invites;
}

void
CreateAssetInvitesRequest::setInvites(std::list <CreateAssetInvitesRequestItem> invites)
{
	this->invites = invites;
}



