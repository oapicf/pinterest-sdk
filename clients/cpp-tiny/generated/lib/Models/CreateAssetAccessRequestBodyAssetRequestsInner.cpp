

#include "CreateAssetAccessRequestBody_asset_requests_inner.h"

using namespace Tiny;

CreateAssetAccessRequestBody_asset_requests_inner::CreateAssetAccessRequestBody_asset_requests_inner()
{
	asset_id_to_permissions = null<std::list>();
	partner_id = std::string();
}

CreateAssetAccessRequestBody_asset_requests_inner::CreateAssetAccessRequestBody_asset_requests_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateAssetAccessRequestBody_asset_requests_inner::~CreateAssetAccessRequestBody_asset_requests_inner()
{

}

void
CreateAssetAccessRequestBody_asset_requests_inner::fromJson(std::string jsonObj)
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
CreateAssetAccessRequestBody_asset_requests_inner::toJson()
{
    bourne::json object = bourne::json::object();








    object["partner_id"] = getPartnerId();



    return object;

}

Map<string, string>
CreateAssetAccessRequestBody_asset_requests_inner::getAssetIdToPermissions()
{
	return asset_id_to_permissions;
}

void
CreateAssetAccessRequestBody_asset_requests_inner::setAssetIdToPermissions(Map <string, string> asset_id_to_permissions)
{
	this->asset_id_to_permissions = asset_id_to_permissions;
}

std::string
CreateAssetAccessRequestBody_asset_requests_inner::getPartnerId()
{
	return partner_id;
}

void
CreateAssetAccessRequestBody_asset_requests_inner::setPartnerId(std::string  partner_id)
{
	this->partner_id = partner_id;
}



