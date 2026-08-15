

#include "UpdateAssetGroupResponse.h"

using namespace Tiny;

UpdateAssetGroupResponse::UpdateAssetGroupResponse()
{
	exceptions = std::list<UpdateAssetGroupResponse_exceptions_inner>();
	updated_asset_groups = std::list<AssetGroupBinding>();
}

UpdateAssetGroupResponse::UpdateAssetGroupResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateAssetGroupResponse::~UpdateAssetGroupResponse()
{

}

void
UpdateAssetGroupResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *exceptionsKey = "exceptions";

    if(object.has_key(exceptionsKey))
    {
        bourne::json value = object[exceptionsKey];


        std::list<UpdateAssetGroupResponse_exceptions_inner> exceptions_list;
        UpdateAssetGroupResponse_exceptions_inner element;
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
UpdateAssetGroupResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<UpdateAssetGroupResponse_exceptions_inner> exceptions_list = getExceptions();
    bourne::json exceptions_arr = bourne::json::array();

    for(auto& var : exceptions_list)
    {
        UpdateAssetGroupResponse_exceptions_inner obj = var;
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

std::list<UpdateAssetGroupResponse_exceptions_inner>
UpdateAssetGroupResponse::getExceptions()
{
	return exceptions;
}

void
UpdateAssetGroupResponse::setExceptions(std::list <UpdateAssetGroupResponse_exceptions_inner> exceptions)
{
	this->exceptions = exceptions;
}

std::list<AssetGroupBinding>
UpdateAssetGroupResponse::getUpdatedAssetGroups()
{
	return updated_asset_groups;
}

void
UpdateAssetGroupResponse::setUpdatedAssetGroups(std::list <AssetGroupBinding> updated_asset_groups)
{
	this->updated_asset_groups = updated_asset_groups;
}



