

#include "UpdatePartnerAssetsResult.h"

using namespace Tiny;

UpdatePartnerAssetsResult::UpdatePartnerAssetsResult()
{
	asset_id = std::string();
	asset_type = std::string();
	partner_id = std::string();
	permissions = std::list<std::string>();
}

UpdatePartnerAssetsResult::UpdatePartnerAssetsResult(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdatePartnerAssetsResult::~UpdatePartnerAssetsResult()
{

}

void
UpdatePartnerAssetsResult::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *asset_idKey = "asset_id";

    if(object.has_key(asset_idKey))
    {
        bourne::json value = object[asset_idKey];



        jsonToValue(&asset_id, value, "std::string");


    }

    const char *asset_typeKey = "asset_type";

    if(object.has_key(asset_typeKey))
    {
        bourne::json value = object[asset_typeKey];



        jsonToValue(&asset_type, value, "std::string");


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


        std::list<std::string> permissions_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            permissions_list.push_back(element);
        }
        permissions = permissions_list;


    }


}

bourne::json
UpdatePartnerAssetsResult::toJson()
{
    bourne::json object = bourne::json::object();





    object["asset_id"] = getAssetId();






    object["asset_type"] = getAssetType();






    object["partner_id"] = getPartnerId();





    std::list<std::string> permissions_list = getPermissions();
    bourne::json permissions_arr = bourne::json::array();

    for(auto& var : permissions_list)
    {
        permissions_arr.append(var);
    }
    object["permissions"] = permissions_arr;






    return object;

}

std::string
UpdatePartnerAssetsResult::getAssetId()
{
	return asset_id;
}

void
UpdatePartnerAssetsResult::setAssetId(std::string  asset_id)
{
	this->asset_id = asset_id;
}

std::string
UpdatePartnerAssetsResult::getAssetType()
{
	return asset_type;
}

void
UpdatePartnerAssetsResult::setAssetType(std::string  asset_type)
{
	this->asset_type = asset_type;
}

std::string
UpdatePartnerAssetsResult::getPartnerId()
{
	return partner_id;
}

void
UpdatePartnerAssetsResult::setPartnerId(std::string  partner_id)
{
	this->partner_id = partner_id;
}

std::list<std::string>
UpdatePartnerAssetsResult::getPermissions()
{
	return permissions;
}

void
UpdatePartnerAssetsResult::setPermissions(std::list <std::string> permissions)
{
	this->permissions = permissions;
}



