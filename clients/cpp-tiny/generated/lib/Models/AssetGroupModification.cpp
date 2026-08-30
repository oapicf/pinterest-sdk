

#include "AssetGroupModification.h"

using namespace Tiny;

AssetGroupModification::AssetGroupModification()
{
	exceptions = std::list<AssetGroupUpdateError>();
	updated_asset_groups = std::list<AssetGroupBinding>();
}

AssetGroupModification::AssetGroupModification(std::string jsonString)
{
	this->fromJson(jsonString);
}

AssetGroupModification::~AssetGroupModification()
{

}

void
AssetGroupModification::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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
AssetGroupModification::toJson()
{
    bourne::json object = bourne::json::object();




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

std::list<AssetGroupUpdateError>
AssetGroupModification::getExceptions()
{
	return exceptions;
}

void
AssetGroupModification::setExceptions(std::list<AssetGroupUpdateError> exceptions)
{
	this->exceptions = exceptions;
}

std::list<AssetGroupBinding>
AssetGroupModification::getUpdatedAssetGroups()
{
	return updated_asset_groups;
}

void
AssetGroupModification::setUpdatedAssetGroups(std::list<AssetGroupBinding> updated_asset_groups)
{
	this->updated_asset_groups = updated_asset_groups;
}



