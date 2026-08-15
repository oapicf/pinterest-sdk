

#include "AuthRespondInvitesBody_invites_inner.h"

using namespace Tiny;

AuthRespondInvitesBody_invites_inner::AuthRespondInvitesBody_invites_inner()
{
	action = AuthRespondInvitesBody_invites_inner_action();
	invite_id = std::string();
}

AuthRespondInvitesBody_invites_inner::AuthRespondInvitesBody_invites_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuthRespondInvitesBody_invites_inner::~AuthRespondInvitesBody_invites_inner()
{

}

void
AuthRespondInvitesBody_invites_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *actionKey = "action";

    if(object.has_key(actionKey))
    {
        bourne::json value = object[actionKey];




        AuthRespondInvitesBody_invites_inner_action* obj = &action;
		obj->fromJson(value.dump());

    }

    const char *invite_idKey = "invite_id";

    if(object.has_key(invite_idKey))
    {
        bourne::json value = object[invite_idKey];



        jsonToValue(&invite_id, value, "std::string");


    }


}

bourne::json
AuthRespondInvitesBody_invites_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["action"] = getAction().toJson();





    object["invite_id"] = getInviteId();



    return object;

}

AuthRespondInvitesBody_invites_inner_action
AuthRespondInvitesBody_invites_inner::getAction()
{
	return action;
}

void
AuthRespondInvitesBody_invites_inner::setAction(AuthRespondInvitesBody_invites_inner_action  action)
{
	this->action = action;
}

std::string
AuthRespondInvitesBody_invites_inner::getInviteId()
{
	return invite_id;
}

void
AuthRespondInvitesBody_invites_inner::setInviteId(std::string  invite_id)
{
	this->invite_id = invite_id;
}



