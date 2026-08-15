

#include "AuthRespondInvitesBody_invites_inner_action.h"

using namespace Tiny;

AuthRespondInvitesBody_invites_inner_action::AuthRespondInvitesBody_invites_inner_action()
{
	accept_invite = bool(false);
	asset_id_to_permissions = null<std::list>();
}

AuthRespondInvitesBody_invites_inner_action::AuthRespondInvitesBody_invites_inner_action(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuthRespondInvitesBody_invites_inner_action::~AuthRespondInvitesBody_invites_inner_action()
{

}

void
AuthRespondInvitesBody_invites_inner_action::fromJson(std::string jsonObj)
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
AuthRespondInvitesBody_invites_inner_action::toJson()
{
    bourne::json object = bourne::json::object();





    object["accept_invite"] = isAcceptInvite();






    return object;

}

bool
AuthRespondInvitesBody_invites_inner_action::isAcceptInvite()
{
	return accept_invite;
}

void
AuthRespondInvitesBody_invites_inner_action::setAcceptInvite(bool  accept_invite)
{
	this->accept_invite = accept_invite;
}

Map<string, string>
AuthRespondInvitesBody_invites_inner_action::getAssetIdToPermissions()
{
	return asset_id_to_permissions;
}

void
AuthRespondInvitesBody_invites_inner_action::setAssetIdToPermissions(Map <string, string> asset_id_to_permissions)
{
	this->asset_id_to_permissions = asset_id_to_permissions;
}



