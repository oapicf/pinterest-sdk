

#include "DeletePartnerAssetAccessResult.h"

using namespace Tiny;

DeletePartnerAssetAccessResult::DeletePartnerAssetAccessResult()
{
	asset_id = std::string();
	asset_type = std::string();
	is_shared_partner = bool(false);
	partner_id = std::string();
	permissions = std::list<std::string>();
}

DeletePartnerAssetAccessResult::DeletePartnerAssetAccessResult(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeletePartnerAssetAccessResult::~DeletePartnerAssetAccessResult()
{

}

void
DeletePartnerAssetAccessResult::fromJson(std::string jsonObj)
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
DeletePartnerAssetAccessResult::toJson()
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
DeletePartnerAssetAccessResult::getAssetId()
{
	return asset_id;
}

void
DeletePartnerAssetAccessResult::setAssetId(std::string asset_id)
{
	this->asset_id = asset_id;
}

std::string
DeletePartnerAssetAccessResult::getAssetType()
{
	return asset_type;
}

void
DeletePartnerAssetAccessResult::setAssetType(std::string asset_type)
{
	this->asset_type = asset_type;
}

bool
DeletePartnerAssetAccessResult::isIsSharedPartner()
{
	return is_shared_partner;
}

void
DeletePartnerAssetAccessResult::setIsSharedPartner(bool is_shared_partner)
{
	this->is_shared_partner = is_shared_partner;
}

std::string
DeletePartnerAssetAccessResult::getPartnerId()
{
	return partner_id;
}

void
DeletePartnerAssetAccessResult::setPartnerId(std::string partner_id)
{
	this->partner_id = partner_id;
}

std::list<std::string>
DeletePartnerAssetAccessResult::getPermissions()
{
	return permissions;
}

void
DeletePartnerAssetAccessResult::setPermissions(std::list<std::string> permissions)
{
	this->permissions = permissions;
}



