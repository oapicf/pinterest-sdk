

#include "CreateAssetAccessRequestItem.h"

using namespace Tiny;

CreateAssetAccessRequestItem::CreateAssetAccessRequestItem()
{
	asset_id_to_permissions = null<std::list>();
	partner_id = std::string();
}

CreateAssetAccessRequestItem::CreateAssetAccessRequestItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateAssetAccessRequestItem::~CreateAssetAccessRequestItem()
{

}

void
CreateAssetAccessRequestItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *asset_id_to_permissionsKey = "asset_id_to_permissions";

    if(object.has_key(asset_id_to_permissionsKey))
    {
        bourne::json value = object[asset_id_to_permissionsKey];


    }

    const char *partner_idKey = "partner_id";

    if(object.has_key(partner_idKey))
    {
        bourne::json value = object[partner_idKey];



        jsonToValue(&partner_id, value, "std::string");


    }


}

bourne::json
CreateAssetAccessRequestItem::toJson()
{
    bourne::json object = bourne::json::object();








    object["partner_id"] = getPartnerId();



    return object;

}

std::map<std::string, std::list>
CreateAssetAccessRequestItem::getAssetIdToPermissions()
{
	return asset_id_to_permissions;
}

void
CreateAssetAccessRequestItem::setAssetIdToPermissions(std::map<std::string, std::list> asset_id_to_permissions)
{
	this->asset_id_to_permissions = asset_id_to_permissions;
}

std::string
CreateAssetAccessRequestItem::getPartnerId()
{
	return partner_id;
}

void
CreateAssetAccessRequestItem::setPartnerId(std::string partner_id)
{
	this->partner_id = partner_id;
}



