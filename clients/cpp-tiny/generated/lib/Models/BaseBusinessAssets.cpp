

#include "BaseBusinessAssets.h"

using namespace Tiny;

BaseBusinessAssets::BaseBusinessAssets()
{
	asset_group_info = null;
	asset_id = std::string();
	asset_type = AssetTypeResponse();
	permissions = std::list<std::string>();
}

BaseBusinessAssets::BaseBusinessAssets(std::string jsonString)
{
	this->fromJson(jsonString);
}

BaseBusinessAssets::~BaseBusinessAssets()
{

}

void
BaseBusinessAssets::fromJson(std::string jsonObj)
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


}

bourne::json
BaseBusinessAssets::toJson()
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






    return object;

}

AssetGroupBinding
BaseBusinessAssets::getAssetGroupInfo()
{
	return asset_group_info;
}

void
BaseBusinessAssets::setAssetGroupInfo(AssetGroupBinding asset_group_info)
{
	this->asset_group_info = asset_group_info;
}

std::string
BaseBusinessAssets::getAssetId()
{
	return asset_id;
}

void
BaseBusinessAssets::setAssetId(std::string asset_id)
{
	this->asset_id = asset_id;
}

AssetTypeResponse
BaseBusinessAssets::getAssetType()
{
	return asset_type;
}

void
BaseBusinessAssets::setAssetType(AssetTypeResponse asset_type)
{
	this->asset_type = asset_type;
}

std::list<std::string>
BaseBusinessAssets::getPermissions()
{
	return permissions;
}

void
BaseBusinessAssets::setPermissions(std::list<std::string> permissions)
{
	this->permissions = permissions;
}



