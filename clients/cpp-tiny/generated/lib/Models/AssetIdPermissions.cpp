

#include "AssetIdPermissions.h"

using namespace Tiny;

AssetIdPermissions::AssetIdPermissions()
{
	asset_group_info = AssetGroupBinding();
	asset_id = std::string();
	asset_type = std::string();
	permissions = std::list<std::string>();
}

AssetIdPermissions::AssetIdPermissions(std::string jsonString)
{
	this->fromJson(jsonString);
}

AssetIdPermissions::~AssetIdPermissions()
{

}

void
AssetIdPermissions::fromJson(std::string jsonObj)
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
AssetIdPermissions::toJson()
{
    bourne::json object = bourne::json::object();






	object["asset_group_info"] = getAssetGroupInfo().toJson();





    object["asset_id"] = getAssetId();






    object["asset_type"] = getAssetType();





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
AssetIdPermissions::getAssetGroupInfo()
{
	return asset_group_info;
}

void
AssetIdPermissions::setAssetGroupInfo(AssetGroupBinding  asset_group_info)
{
	this->asset_group_info = asset_group_info;
}

std::string
AssetIdPermissions::getAssetId()
{
	return asset_id;
}

void
AssetIdPermissions::setAssetId(std::string  asset_id)
{
	this->asset_id = asset_id;
}

std::string
AssetIdPermissions::getAssetType()
{
	return asset_type;
}

void
AssetIdPermissions::setAssetType(std::string  asset_type)
{
	this->asset_type = asset_type;
}

std::list<std::string>
AssetIdPermissions::getPermissions()
{
	return permissions;
}

void
AssetIdPermissions::setPermissions(std::list <std::string> permissions)
{
	this->permissions = permissions;
}



