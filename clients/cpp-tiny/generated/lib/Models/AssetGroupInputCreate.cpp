

#include "AssetGroupInputCreate.h"

using namespace Tiny;

AssetGroupInputCreate::AssetGroupInputCreate()
{
	asset_group = AssetGroupBinding();
	asset_group_description = std::string();
	asset_group_name = std::string();
	asset_group_types = std::list<AssetGroupType>();
}

AssetGroupInputCreate::AssetGroupInputCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

AssetGroupInputCreate::~AssetGroupInputCreate()
{

}

void
AssetGroupInputCreate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *asset_groupKey = "asset_group";

    if(object.has_key(asset_groupKey))
    {
        bourne::json value = object[asset_groupKey];




        AssetGroupBinding* obj = &asset_group;
		obj->fromJson(value.dump());

    }

    const char *asset_group_descriptionKey = "asset_group_description";

    if(object.has_key(asset_group_descriptionKey))
    {
        bourne::json value = object[asset_group_descriptionKey];



        jsonToValue(&asset_group_description, value, "std::string");


    }

    const char *asset_group_nameKey = "asset_group_name";

    if(object.has_key(asset_group_nameKey))
    {
        bourne::json value = object[asset_group_nameKey];



        jsonToValue(&asset_group_name, value, "std::string");


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


}

bourne::json
AssetGroupInputCreate::toJson()
{
    bourne::json object = bourne::json::object();






	object["asset_group"] = getAssetGroup().toJson();





    object["asset_group_description"] = getAssetGroupDescription();






    object["asset_group_name"] = getAssetGroupName();





    std::list<AssetGroupType> asset_group_types_list = getAssetGroupTypes();
    bourne::json asset_group_types_arr = bourne::json::array();

    for(auto& var : asset_group_types_list)
    {
        AssetGroupType obj = var;
        asset_group_types_arr.append(obj.toJson());
    }
    object["asset_group_types"] = asset_group_types_arr;




    return object;

}

AssetGroupBinding
AssetGroupInputCreate::getAssetGroup()
{
	return asset_group;
}

void
AssetGroupInputCreate::setAssetGroup(AssetGroupBinding asset_group)
{
	this->asset_group = asset_group;
}

std::string
AssetGroupInputCreate::getAssetGroupDescription()
{
	return asset_group_description;
}

void
AssetGroupInputCreate::setAssetGroupDescription(std::string asset_group_description)
{
	this->asset_group_description = asset_group_description;
}

std::string
AssetGroupInputCreate::getAssetGroupName()
{
	return asset_group_name;
}

void
AssetGroupInputCreate::setAssetGroupName(std::string asset_group_name)
{
	this->asset_group_name = asset_group_name;
}

std::list<AssetGroupType>
AssetGroupInputCreate::getAssetGroupTypes()
{
	return asset_group_types;
}

void
AssetGroupInputCreate::setAssetGroupTypes(std::list<AssetGroupType> asset_group_types)
{
	this->asset_group_types = asset_group_types;
}



