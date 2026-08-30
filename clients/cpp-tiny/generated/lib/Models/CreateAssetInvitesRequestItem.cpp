

#include "CreateAssetInvitesRequestItem.h"

using namespace Tiny;

CreateAssetInvitesRequestItem::CreateAssetInvitesRequestItem()
{
	asset_id_to_permissions = null<std::list>();
	invite_id = std::string();
	invite_type = InviteType();
}

CreateAssetInvitesRequestItem::CreateAssetInvitesRequestItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateAssetInvitesRequestItem::~CreateAssetInvitesRequestItem()
{

}

void
CreateAssetInvitesRequestItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *asset_id_to_permissionsKey = "asset_id_to_permissions";

    if(object.has_key(asset_id_to_permissionsKey))
    {
        bourne::json value = object[asset_id_to_permissionsKey];


    }

    const char *invite_idKey = "invite_id";

    if(object.has_key(invite_idKey))
    {
        bourne::json value = object[invite_idKey];



        jsonToValue(&invite_id, value, "std::string");


    }

    const char *invite_typeKey = "invite_type";

    if(object.has_key(invite_typeKey))
    {
        bourne::json value = object[invite_typeKey];




        InviteType* obj = &invite_type;
		obj->fromJson(value.dump());

    }


}

bourne::json
CreateAssetInvitesRequestItem::toJson()
{
    bourne::json object = bourne::json::object();








    object["invite_id"] = getInviteId();







	object["invite_type"] = getInviteType().toJson();


    return object;

}

std::map<std::string, std::list>
CreateAssetInvitesRequestItem::getAssetIdToPermissions()
{
	return asset_id_to_permissions;
}

void
CreateAssetInvitesRequestItem::setAssetIdToPermissions(std::map<std::string, std::list> asset_id_to_permissions)
{
	this->asset_id_to_permissions = asset_id_to_permissions;
}

std::string
CreateAssetInvitesRequestItem::getInviteId()
{
	return invite_id;
}

void
CreateAssetInvitesRequestItem::setInviteId(std::string invite_id)
{
	this->invite_id = invite_id;
}

InviteType
CreateAssetInvitesRequestItem::getInviteType()
{
	return invite_type;
}

void
CreateAssetInvitesRequestItem::setInviteType(InviteType invite_type)
{
	this->invite_type = invite_type;
}



