

#include "AssetGroupModificationReadOrUpdate.h"

using namespace Tiny;

AssetGroupModificationReadOrUpdate::AssetGroupModificationReadOrUpdate()
{
	asset_groups_to_update = std::list<AssetGroupUpdateItemReadOrUpdateItem>();
	exceptions = std::list<AssetGroupUpdateError>();
	updated_asset_groups = std::list<AssetGroupBinding>();
}

AssetGroupModificationReadOrUpdate::AssetGroupModificationReadOrUpdate(std::string jsonString)
{
	this->fromJson(jsonString);
}

AssetGroupModificationReadOrUpdate::~AssetGroupModificationReadOrUpdate()
{

}

void
AssetGroupModificationReadOrUpdate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *asset_groups_to_updateKey = "asset_groups_to_update";

    if(object.has_key(asset_groups_to_updateKey))
    {
        bourne::json value = object[asset_groups_to_updateKey];


        std::list<AssetGroupUpdateItemReadOrUpdateItem> asset_groups_to_update_list;
        AssetGroupUpdateItemReadOrUpdateItem element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            asset_groups_to_update_list.push_back(element);
        }
        asset_groups_to_update = asset_groups_to_update_list;


    }

    const char *exceptionsKey = "exceptions";

    if(object.has_key(exceptionsKey))
    {
        bourne::json value = object[exceptionsKey];


        std::list<AssetGroupUpdateError> exceptions_list;
        AssetGroupUpdateError element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            exceptions_list.push_back(element);
        }
        exceptions = exceptions_list;


    }

    const char *updated_asset_groupsKey = "updated_asset_groups";

    if(object.has_key(updated_asset_groupsKey))
    {
        bourne::json value = object[updated_asset_groupsKey];


        std::list<AssetGroupBinding> updated_asset_groups_list;
        AssetGroupBinding element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            updated_asset_groups_list.push_back(element);
        }
        updated_asset_groups = updated_asset_groups_list;


    }


}

bourne::json
AssetGroupModificationReadOrUpdate::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<AssetGroupUpdateItemReadOrUpdateItem> asset_groups_to_update_list = getAssetGroupsToUpdate();
    bourne::json asset_groups_to_update_arr = bourne::json::array();

    for(auto& var : asset_groups_to_update_list)
    {
        AssetGroupUpdateItemReadOrUpdateItem obj = var;
        asset_groups_to_update_arr.append(obj.toJson());
    }
    object["asset_groups_to_update"] = asset_groups_to_update_arr;






    std::list<AssetGroupUpdateError> exceptions_list = getExceptions();
    bourne::json exceptions_arr = bourne::json::array();

    for(auto& var : exceptions_list)
    {
        AssetGroupUpdateError obj = var;
        exceptions_arr.append(obj.toJson());
    }
    object["exceptions"] = exceptions_arr;






    std::list<AssetGroupBinding> updated_asset_groups_list = getUpdatedAssetGroups();
    bourne::json updated_asset_groups_arr = bourne::json::array();

    for(auto& var : updated_asset_groups_list)
    {
        AssetGroupBinding obj = var;
        updated_asset_groups_arr.append(obj.toJson());
    }
    object["updated_asset_groups"] = updated_asset_groups_arr;




    return object;

}

std::list<AssetGroupUpdateItemReadOrUpdateItem>
AssetGroupModificationReadOrUpdate::getAssetGroupsToUpdate()
{
	return asset_groups_to_update;
}

void
AssetGroupModificationReadOrUpdate::setAssetGroupsToUpdate(std::list<AssetGroupUpdateItemReadOrUpdateItem> asset_groups_to_update)
{
	this->asset_groups_to_update = asset_groups_to_update;
}

std::list<AssetGroupUpdateError>
AssetGroupModificationReadOrUpdate::getExceptions()
{
	return exceptions;
}

void
AssetGroupModificationReadOrUpdate::setExceptions(std::list<AssetGroupUpdateError> exceptions)
{
	this->exceptions = exceptions;
}

std::list<AssetGroupBinding>
AssetGroupModificationReadOrUpdate::getUpdatedAssetGroups()
{
	return updated_asset_groups;
}

void
AssetGroupModificationReadOrUpdate::setUpdatedAssetGroups(std::list<AssetGroupBinding> updated_asset_groups)
{
	this->updated_asset_groups = updated_asset_groups;
}



