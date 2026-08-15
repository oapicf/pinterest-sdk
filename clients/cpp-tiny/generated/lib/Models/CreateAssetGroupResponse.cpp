

#include "CreateAssetGroupResponse.h"

using namespace Tiny;

CreateAssetGroupResponse::CreateAssetGroupResponse()
{
	asset_group = AssetGroupBinding();
}

CreateAssetGroupResponse::CreateAssetGroupResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateAssetGroupResponse::~CreateAssetGroupResponse()
{

}

void
CreateAssetGroupResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *asset_groupKey = "asset_group";

    if(object.has_key(asset_groupKey))
    {
        bourne::json value = object[asset_groupKey];




        AssetGroupBinding* obj = &asset_group;
		obj->fromJson(value.dump());

    }


}

bourne::json
CreateAssetGroupResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["asset_group"] = getAssetGroup().toJson();


    return object;

}

AssetGroupBinding
CreateAssetGroupResponse::getAssetGroup()
{
	return asset_group;
}

void
CreateAssetGroupResponse::setAssetGroup(AssetGroupBinding  asset_group)
{
	this->asset_group = asset_group;
}



