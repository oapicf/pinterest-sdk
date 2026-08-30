

#include "AssetGroupUpdateItemReadOrUpdateItem.h"

using namespace Tiny;

AssetGroupUpdateItemReadOrUpdateItem::AssetGroupUpdateItemReadOrUpdateItem()
{
	asset_group_id = std::string();
	asset_group_types = std::list<AssetGroupType>();
	assets_to_add = std::list<std::string>();
	assets_to_remove = std::list<std::string>();
	description = std::string();
	name = std::string();
}

AssetGroupUpdateItemReadOrUpdateItem::AssetGroupUpdateItemReadOrUpdateItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

AssetGroupUpdateItemReadOrUpdateItem::~AssetGroupUpdateItemReadOrUpdateItem()
{

}

void
AssetGroupUpdateItemReadOrUpdateItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *asset_group_idKey = "asset_group_id";

    if(object.has_key(asset_group_idKey))
    {
        bourne::json value = object[asset_group_idKey];



        jsonToValue(&asset_group_id, value, "std::string");


    }

    const char *asset_group_typesKey = "asset_group_types";

    if(object.has_key(asset_group_typesKey))
    {
        bourne::json value = object[asset_group_typesKey];


        std::list<AssetGroupType> asset_group_types_list;
        AssetGroupType element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            asset_group_types_list.push_back(element);
        }
        asset_group_types = asset_group_types_list;


    }

    const char *assets_to_addKey = "assets_to_add";

    if(object.has_key(assets_to_addKey))
    {
        bourne::json value = object[assets_to_addKey];


        std::list<std::string> assets_to_add_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            assets_to_add_list.push_back(element);
        }
        assets_to_add = assets_to_add_list;


    }

    const char *assets_to_removeKey = "assets_to_remove";

    if(object.has_key(assets_to_removeKey))
    {
        bourne::json value = object[assets_to_removeKey];


        std::list<std::string> assets_to_remove_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            assets_to_remove_list.push_back(element);
        }
        assets_to_remove = assets_to_remove_list;


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }


}

bourne::json
AssetGroupUpdateItemReadOrUpdateItem::toJson()
{
    bourne::json object = bourne::json::object();





    object["asset_group_id"] = getAssetGroupId();





    std::list<AssetGroupType> asset_group_types_list = getAssetGroupTypes();
    bourne::json asset_group_types_arr = bourne::json::array();

    for(auto& var : asset_group_types_list)
    {
        AssetGroupType obj = var;
        asset_group_types_arr.append(obj.toJson());
    }
    object["asset_group_types"] = asset_group_types_arr;






    std::list<std::string> assets_to_add_list = getAssetsToAdd();
    bourne::json assets_to_add_arr = bourne::json::array();

    for(auto& var : assets_to_add_list)
    {
        assets_to_add_arr.append(var);
    }
    object["assets_to_add"] = assets_to_add_arr;








    std::list<std::string> assets_to_remove_list = getAssetsToRemove();
    bourne::json assets_to_remove_arr = bourne::json::array();

    for(auto& var : assets_to_remove_list)
    {
        assets_to_remove_arr.append(var);
    }
    object["assets_to_remove"] = assets_to_remove_arr;









    object["description"] = getDescription();






    object["name"] = getName();



    return object;

}

std::string
AssetGroupUpdateItemReadOrUpdateItem::getAssetGroupId()
{
	return asset_group_id;
}

void
AssetGroupUpdateItemReadOrUpdateItem::setAssetGroupId(std::string asset_group_id)
{
	this->asset_group_id = asset_group_id;
}

std::list<AssetGroupType>
AssetGroupUpdateItemReadOrUpdateItem::getAssetGroupTypes()
{
	return asset_group_types;
}

void
AssetGroupUpdateItemReadOrUpdateItem::setAssetGroupTypes(std::list<AssetGroupType> asset_group_types)
{
	this->asset_group_types = asset_group_types;
}

std::list<std::string>
AssetGroupUpdateItemReadOrUpdateItem::getAssetsToAdd()
{
	return assets_to_add;
}

void
AssetGroupUpdateItemReadOrUpdateItem::setAssetsToAdd(std::list<std::string> assets_to_add)
{
	this->assets_to_add = assets_to_add;
}

std::list<std::string>
AssetGroupUpdateItemReadOrUpdateItem::getAssetsToRemove()
{
	return assets_to_remove;
}

void
AssetGroupUpdateItemReadOrUpdateItem::setAssetsToRemove(std::list<std::string> assets_to_remove)
{
	this->assets_to_remove = assets_to_remove;
}

std::string
AssetGroupUpdateItemReadOrUpdateItem::getDescription()
{
	return description;
}

void
AssetGroupUpdateItemReadOrUpdateItem::setDescription(std::string description)
{
	this->description = description;
}

std::string
AssetGroupUpdateItemReadOrUpdateItem::getName()
{
	return name;
}

void
AssetGroupUpdateItemReadOrUpdateItem::setName(std::string name)
{
	this->name = name;
}



