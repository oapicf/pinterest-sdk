

#include "GetBusinessAssetsResponse.h"

using namespace Tiny;

GetBusinessAssetsResponse::GetBusinessAssetsResponse()
{
	asset_group_info = AssetGroupBinding();
	asset_id = std::string();
	asset_type = std::string();
	catalog_info = GetBusinessAssetsResponse_catalog_info();
}

GetBusinessAssetsResponse::GetBusinessAssetsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetBusinessAssetsResponse::~GetBusinessAssetsResponse()
{

}

void
GetBusinessAssetsResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *asset_group_infoKey = "asset_group_info";

    if(object.has_key(asset_group_infoKey))
    {
        bourne::json value = object[asset_group_infoKey];




        AssetGroupBinding* obj = &asset_group_info;
		obj->fromJson(value.dump());

    }

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

    const char *catalog_infoKey = "catalog_info";

    if(object.has_key(catalog_infoKey))
    {
        bourne::json value = object[catalog_infoKey];




        GetBusinessAssetsResponse_catalog_info* obj = &catalog_info;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetBusinessAssetsResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["asset_group_info"] = getAssetGroupInfo().toJson();





    object["asset_id"] = getAssetId();






    object["asset_type"] = getAssetType();







	object["catalog_info"] = getCatalogInfo().toJson();


    return object;

}

AssetGroupBinding
GetBusinessAssetsResponse::getAssetGroupInfo()
{
	return asset_group_info;
}

void
GetBusinessAssetsResponse::setAssetGroupInfo(AssetGroupBinding  asset_group_info)
{
	this->asset_group_info = asset_group_info;
}

std::string
GetBusinessAssetsResponse::getAssetId()
{
	return asset_id;
}

void
GetBusinessAssetsResponse::setAssetId(std::string  asset_id)
{
	this->asset_id = asset_id;
}

std::string
GetBusinessAssetsResponse::getAssetType()
{
	return asset_type;
}

void
GetBusinessAssetsResponse::setAssetType(std::string  asset_type)
{
	this->asset_type = asset_type;
}

GetBusinessAssetsResponse_catalog_info
GetBusinessAssetsResponse::getCatalogInfo()
{
	return catalog_info;
}

void
GetBusinessAssetsResponse::setCatalogInfo(GetBusinessAssetsResponse_catalog_info  catalog_info)
{
	this->catalog_info = catalog_info;
}



