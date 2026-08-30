

#include "AssetGroupDeletionDelete.h"

using namespace Tiny;

AssetGroupDeletionDelete::AssetGroupDeletionDelete()
{
	asset_groups_to_delete = std::list<std::string>();
}

AssetGroupDeletionDelete::AssetGroupDeletionDelete(std::string jsonString)
{
	this->fromJson(jsonString);
}

AssetGroupDeletionDelete::~AssetGroupDeletionDelete()
{

}

void
AssetGroupDeletionDelete::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *asset_groups_to_deleteKey = "asset_groups_to_delete";

    if(object.has_key(asset_groups_to_deleteKey))
    {
        bourne::json value = object[asset_groups_to_deleteKey];


        std::list<std::string> asset_groups_to_delete_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            asset_groups_to_delete_list.push_back(element);
        }
        asset_groups_to_delete = asset_groups_to_delete_list;


    }


}

bourne::json
AssetGroupDeletionDelete::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> asset_groups_to_delete_list = getAssetGroupsToDelete();
    bourne::json asset_groups_to_delete_arr = bourne::json::array();

    for(auto& var : asset_groups_to_delete_list)
    {
        asset_groups_to_delete_arr.append(var);
    }
    object["asset_groups_to_delete"] = asset_groups_to_delete_arr;






    return object;

}

std::list<std::string>
AssetGroupDeletionDelete::getAssetGroupsToDelete()
{
	return asset_groups_to_delete;
}

void
AssetGroupDeletionDelete::setAssetGroupsToDelete(std::list<std::string> asset_groups_to_delete)
{
	this->asset_groups_to_delete = asset_groups_to_delete;
}



