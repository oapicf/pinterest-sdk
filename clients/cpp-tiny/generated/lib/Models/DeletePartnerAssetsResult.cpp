

#include "DeletePartnerAssetsResult.h"

using namespace Tiny;

DeletePartnerAssetsResult::DeletePartnerAssetsResult()
{
	asset_id = std::string();
	asset_type = std::string();
	is_shared_partner = bool(false);
	partner_id = std::string();
	permissions = std::list<std::string>();
}

DeletePartnerAssetsResult::DeletePartnerAssetsResult(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeletePartnerAssetsResult::~DeletePartnerAssetsResult()
{

}

void
DeletePartnerAssetsResult::fromJson(std::string jsonObj)
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

    const char *is_shared_partnerKey = "is_shared_partner";

    if(object.has_key(is_shared_partnerKey))
    {
        bourne::json value = object[is_shared_partnerKey];



        jsonToValue(&is_shared_partner, value, "bool");


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
DeletePartnerAssetsResult::toJson()
{
    bourne::json object = bourne::json::object();





    object["asset_id"] = getAssetId();






    object["asset_type"] = getAssetType();






    object["is_shared_partner"] = isIsSharedPartner();






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
DeletePartnerAssetsResult::getAssetId()
{
	return asset_id;
}

void
DeletePartnerAssetsResult::setAssetId(std::string  asset_id)
{
	this->asset_id = asset_id;
}

std::string
DeletePartnerAssetsResult::getAssetType()
{
	return asset_type;
}

void
DeletePartnerAssetsResult::setAssetType(std::string  asset_type)
{
	this->asset_type = asset_type;
}

bool
DeletePartnerAssetsResult::isIsSharedPartner()
{
	return is_shared_partner;
}

void
DeletePartnerAssetsResult::setIsSharedPartner(bool  is_shared_partner)
{
	this->is_shared_partner = is_shared_partner;
}

std::string
DeletePartnerAssetsResult::getPartnerId()
{
	return partner_id;
}

void
DeletePartnerAssetsResult::setPartnerId(std::string  partner_id)
{
	this->partner_id = partner_id;
}

std::list<std::string>
DeletePartnerAssetsResult::getPermissions()
{
	return permissions;
}

void
DeletePartnerAssetsResult::setPermissions(std::list <std::string> permissions)
{
	this->permissions = permissions;
}



