

#include "AuthRespondInviteAction.h"

using namespace Tiny;

AuthRespondInviteAction::AuthRespondInviteAction()
{
	accept_invite = bool(false);
	asset_id_to_permissions = null<std::list>();
}

AuthRespondInviteAction::AuthRespondInviteAction(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuthRespondInviteAction::~AuthRespondInviteAction()
{

}

void
AuthRespondInviteAction::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *accept_inviteKey = "accept_invite";

    if(object.has_key(accept_inviteKey))
    {
        bourne::json value = object[accept_inviteKey];



        jsonToValue(&accept_invite, value, "bool");


    }

    const char *asset_id_to_permissionsKey = "asset_id_to_permissions";

    if(object.has_key(asset_id_to_permissionsKey))
    {
        bourne::json value = object[asset_id_to_permissionsKey];


    }


}

bourne::json
AuthRespondInviteAction::toJson()
{
    bourne::json object = bourne::json::object();





    object["accept_invite"] = isAcceptInvite();






    return object;

}

bool
AuthRespondInviteAction::isAcceptInvite()
{
	return accept_invite;
}

void
AuthRespondInviteAction::setAcceptInvite(bool accept_invite)
{
	this->accept_invite = accept_invite;
}

std::map<std::string, std::list>
AuthRespondInviteAction::getAssetIdToPermissions()
{
	return asset_id_to_permissions;
}

void
AuthRespondInviteAction::setAssetIdToPermissions(std::map<std::string, std::list> asset_id_to_permissions)
{
	this->asset_id_to_permissions = asset_id_to_permissions;
}



