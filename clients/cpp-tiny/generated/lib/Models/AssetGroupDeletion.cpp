

#include "AssetGroupDeletion.h"

using namespace Tiny;

AssetGroupDeletion::AssetGroupDeletion()
{
	deleted_asset_groups = std::list<std::string>();
	exceptions = std::list<AssetGroupDeleteError>();
}

AssetGroupDeletion::AssetGroupDeletion(std::string jsonString)
{
	this->fromJson(jsonString);
}

AssetGroupDeletion::~AssetGroupDeletion()
{

}

void
AssetGroupDeletion::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *deleted_asset_groupsKey = "deleted_asset_groups";

    if(object.has_key(deleted_asset_groupsKey))
    {
        bourne::json value = object[deleted_asset_groupsKey];


        std::list<std::string> deleted_asset_groups_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            deleted_asset_groups_list.push_back(element);
        }
        deleted_asset_groups = deleted_asset_groups_list;


    }

    const char *exceptionsKey = "exceptions";

    if(object.has_key(exceptionsKey))
    {
        bourne::json value = object[exceptionsKey];


        std::list<AssetGroupDeleteError> exceptions_list;
        AssetGroupDeleteError element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            exceptions_list.push_back(element);
        }
        exceptions = exceptions_list;


    }


}

bourne::json
AssetGroupDeletion::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> deleted_asset_groups_list = getDeletedAssetGroups();
    bourne::json deleted_asset_groups_arr = bourne::json::array();

    for(auto& var : deleted_asset_groups_list)
    {
        deleted_asset_groups_arr.append(var);
    }
    object["deleted_asset_groups"] = deleted_asset_groups_arr;








    std::list<AssetGroupDeleteError> exceptions_list = getExceptions();
    bourne::json exceptions_arr = bourne::json::array();

    for(auto& var : exceptions_list)
    {
        AssetGroupDeleteError obj = var;
        exceptions_arr.append(obj.toJson());
    }
    object["exceptions"] = exceptions_arr;




    return object;

}

std::list<std::string>
AssetGroupDeletion::getDeletedAssetGroups()
{
	return deleted_asset_groups;
}

void
AssetGroupDeletion::setDeletedAssetGroups(std::list<std::string> deleted_asset_groups)
{
	this->deleted_asset_groups = deleted_asset_groups;
}

std::list<AssetGroupDeleteError>
AssetGroupDeletion::getExceptions()
{
	return exceptions;
}

void
AssetGroupDeletion::setExceptions(std::list<AssetGroupDeleteError> exceptions)
{
	this->exceptions = exceptions;
}



