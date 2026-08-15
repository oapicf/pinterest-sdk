

#include "UpdateAssetGroupBody.h"

using namespace Tiny;

UpdateAssetGroupBody::UpdateAssetGroupBody()
{
	asset_groups_to_update = std::list<UpdateAssetGroupBody_asset_groups_to_update_inner>();
}

UpdateAssetGroupBody::UpdateAssetGroupBody(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateAssetGroupBody::~UpdateAssetGroupBody()
{

}

void
UpdateAssetGroupBody::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *asset_groups_to_updateKey = "asset_groups_to_update";

    if(object.has_key(asset_groups_to_updateKey))
    {
        bourne::json value = object[asset_groups_to_updateKey];


        std::list<UpdateAssetGroupBody_asset_groups_to_update_inner> asset_groups_to_update_list;
        UpdateAssetGroupBody_asset_groups_to_update_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            asset_groups_to_update_list.push_back(element);
        }
        asset_groups_to_update = asset_groups_to_update_list;


    }


}

bourne::json
UpdateAssetGroupBody::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<UpdateAssetGroupBody_asset_groups_to_update_inner> asset_groups_to_update_list = getAssetGroupsToUpdate();
    bourne::json asset_groups_to_update_arr = bourne::json::array();

    for(auto& var : asset_groups_to_update_list)
    {
        UpdateAssetGroupBody_asset_groups_to_update_inner obj = var;
        asset_groups_to_update_arr.append(obj.toJson());
    }
    object["asset_groups_to_update"] = asset_groups_to_update_arr;




    return object;

}

std::list<UpdateAssetGroupBody_asset_groups_to_update_inner>
UpdateAssetGroupBody::getAssetGroupsToUpdate()
{
	return asset_groups_to_update;
}

void
UpdateAssetGroupBody::setAssetGroupsToUpdate(std::list <UpdateAssetGroupBody_asset_groups_to_update_inner> asset_groups_to_update)
{
	this->asset_groups_to_update = asset_groups_to_update;
}



