

#include "AuthRespondInvitesBody.h"

using namespace Tiny;

AuthRespondInvitesBody::AuthRespondInvitesBody()
{
	invites = std::list<AuthRespondInvitesBody_invites_inner>();
}

AuthRespondInvitesBody::AuthRespondInvitesBody(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuthRespondInvitesBody::~AuthRespondInvitesBody()
{

}

void
AuthRespondInvitesBody::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *invitesKey = "invites";

    if(object.has_key(invitesKey))
    {
        bourne::json value = object[invitesKey];


        std::list<AuthRespondInvitesBody_invites_inner> invites_list;
        AuthRespondInvitesBody_invites_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            invites_list.push_back(element);
        }
        invites = invites_list;


    }


}

bourne::json
AuthRespondInvitesBody::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<AuthRespondInvitesBody_invites_inner> invites_list = getInvites();
    bourne::json invites_arr = bourne::json::array();

    for(auto& var : invites_list)
    {
        AuthRespondInvitesBody_invites_inner obj = var;
        invites_arr.append(obj.toJson());
    }
    object["invites"] = invites_arr;




    return object;

}

std::list<AuthRespondInvitesBody_invites_inner>
AuthRespondInvitesBody::getInvites()
{
	return invites;
}

void
AuthRespondInvitesBody::setInvites(std::list <AuthRespondInvitesBody_invites_inner> invites)
{
	this->invites = invites;
}



