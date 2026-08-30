

#include "BusinessAssets.h"

using namespace Tiny;

BusinessAssets::BusinessAssets()
{
	asset_group_info = null;
	asset_id = std::string();
	asset_type = AssetTypeResponse();
	permissions = std::list<std::string>();
	catalog_info = null;
}

BusinessAssets::BusinessAssets(std::string jsonString)
{
	this->fromJson(jsonString);
}

BusinessAssets::~BusinessAssets()
{

}

void
BusinessAssets::fromJson(std::string jsonObj)
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




        AssetTypeResponse* obj = &asset_type;
		obj->fromJson(value.dump());

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

    const char *catalog_infoKey = "catalog_info";

    if(object.has_key(catalog_infoKey))
    {
        bourne::json value = object[catalog_infoKey];




        CatalogBinding* obj = &catalog_info;
		obj->fromJson(value.dump());

    }


}

bourne::json
BusinessAssets::toJson()
{
    bourne::json object = bourne::json::object();






	object["asset_group_info"] = getAssetGroupInfo().toJson();





    object["asset_id"] = getAssetId();







	object["asset_type"] = getAssetType().toJson();




    std::list<std::string> permissions_list = getPermissions();
    bourne::json permissions_arr = bourne::json::array();

    for(auto& var : permissions_list)
    {
        permissions_arr.append(var);
    }
    object["permissions"] = permissions_arr;










	object["catalog_info"] = getCatalogInfo().toJson();


    return object;

}

AssetGroupBinding
BusinessAssets::getAssetGroupInfo()
{
	return asset_group_info;
}

void
BusinessAssets::setAssetGroupInfo(AssetGroupBinding asset_group_info)
{
	this->asset_group_info = asset_group_info;
}

std::string
BusinessAssets::getAssetId()
{
	return asset_id;
}

void
BusinessAssets::setAssetId(std::string asset_id)
{
	this->asset_id = asset_id;
}

AssetTypeResponse
BusinessAssets::getAssetType()
{
	return asset_type;
}

void
BusinessAssets::setAssetType(AssetTypeResponse asset_type)
{
	this->asset_type = asset_type;
}

std::list<std::string>
BusinessAssets::getPermissions()
{
	return permissions;
}

void
BusinessAssets::setPermissions(std::list<std::string> permissions)
{
	this->permissions = permissions;
}

CatalogBinding
BusinessAssets::getCatalogInfo()
{
	return catalog_info;
}

void
BusinessAssets::setCatalogInfo(CatalogBinding catalog_info)
{
	this->catalog_info = catalog_info;
}



