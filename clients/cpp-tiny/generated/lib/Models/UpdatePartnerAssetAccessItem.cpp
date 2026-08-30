

#include "UpdatePartnerAssetAccessItem.h"

using namespace Tiny;

UpdatePartnerAssetAccessItem::UpdatePartnerAssetAccessItem()
{
	asset_id = std::string();
	partner_id = std::string();
	permissions = std::list<Permissions>();
}

UpdatePartnerAssetAccessItem::UpdatePartnerAssetAccessItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdatePartnerAssetAccessItem::~UpdatePartnerAssetAccessItem()
{

}

void
UpdatePartnerAssetAccessItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *asset_idKey = "asset_id";

    if(object.has_key(asset_idKey))
    {
        bourne::json value = object[asset_idKey];



        jsonToValue(&asset_id, value, "std::string");


    }

    const char *partner_idKey = "partner_id";

    if(object.has_key(partner_idKey))
    {
        bourne::json value = object[partner_idKey];



        jsonToValue(&partner_id, value, "std::string");


    }

    const char *permissionsKey = "permissions";

    if(object.has_key(permissionsKey))
    {
        bourne::json value = object[permissionsKey];


        std::list<Permissions> permissions_list;
        Permissions element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            permissions_list.push_back(element);
        }
        permissions = permissions_list;


    }


}

bourne::json
UpdatePartnerAssetAccessItem::toJson()
{
    bourne::json object = bourne::json::object();





    object["asset_id"] = getAssetId();






    object["partner_id"] = getPartnerId();





    std::list<Permissions> permissions_list = getPermissions();
    bourne::json permissions_arr = bourne::json::array();

    for(auto& var : permissions_list)
    {
        Permissions obj = var;
        permissions_arr.append(obj.toJson());
    }
    object["permissions"] = permissions_arr;




    return object;

}

std::string
UpdatePartnerAssetAccessItem::getAssetId()
{
	return asset_id;
}

void
UpdatePartnerAssetAccessItem::setAssetId(std::string asset_id)
{
	this->asset_id = asset_id;
}

std::string
UpdatePartnerAssetAccessItem::getPartnerId()
{
	return partner_id;
}

void
UpdatePartnerAssetAccessItem::setPartnerId(std::string partner_id)
{
	this->partner_id = partner_id;
}

std::list<Permissions>
UpdatePartnerAssetAccessItem::getPermissions()
{
	return permissions;
}

void
UpdatePartnerAssetAccessItem::setPermissions(std::list<Permissions> permissions)
{
	this->permissions = permissions;
}



