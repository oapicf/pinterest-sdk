

#include "AuthRespondInvitesBodyItem.h"

using namespace Tiny;

AuthRespondInvitesBodyItem::AuthRespondInvitesBodyItem()
{
	action = AuthRespondInviteAction();
	invite_id = std::string();
}

AuthRespondInvitesBodyItem::AuthRespondInvitesBodyItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuthRespondInvitesBodyItem::~AuthRespondInvitesBodyItem()
{

}

void
AuthRespondInvitesBodyItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *actionKey = "action";

    if(object.has_key(actionKey))
    {
        bourne::json value = object[actionKey];




        AuthRespondInviteAction* obj = &action;
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
AuthRespondInvitesBodyItem::toJson()
{
    bourne::json object = bourne::json::object();






	object["action"] = getAction().toJson();





    object["invite_id"] = getInviteId();



    return object;

}

AuthRespondInviteAction
AuthRespondInvitesBodyItem::getAction()
{
	return action;
}

void
AuthRespondInvitesBodyItem::setAction(AuthRespondInviteAction action)
{
	this->action = action;
}

std::string
AuthRespondInvitesBodyItem::getInviteId()
{
	return invite_id;
}

void
AuthRespondInvitesBodyItem::setInviteId(std::string invite_id)
{
	this->invite_id = invite_id;
}



