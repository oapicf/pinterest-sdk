

#include "CreateAssetGroupBody.h"

using namespace Tiny;

CreateAssetGroupBody::CreateAssetGroupBody()
{
	asset_group_description = std::string();
	asset_group_name = std::string();
	asset_group_types = std::list<AssetGroupType>();
}

CreateAssetGroupBody::CreateAssetGroupBody(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateAssetGroupBody::~CreateAssetGroupBody()
{

}

void
CreateAssetGroupBody::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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
CreateAssetGroupBody::toJson()
{
    bourne::json object = bourne::json::object();





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

std::string
CreateAssetGroupBody::getAssetGroupDescription()
{
	return asset_group_description;
}

void
CreateAssetGroupBody::setAssetGroupDescription(std::string  asset_group_description)
{
	this->asset_group_description = asset_group_description;
}

std::string
CreateAssetGroupBody::getAssetGroupName()
{
	return asset_group_name;
}

void
CreateAssetGroupBody::setAssetGroupName(std::string  asset_group_name)
{
	this->asset_group_name = asset_group_name;
}

std::list<AssetGroupType>
CreateAssetGroupBody::getAssetGroupTypes()
{
	return asset_group_types;
}

void
CreateAssetGroupBody::setAssetGroupTypes(std::list <AssetGroupType> asset_group_types)
{
	this->asset_group_types = asset_group_types;
}



