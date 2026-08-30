

#include "AssetGroupInput.h"

using namespace Tiny;

AssetGroupInput::AssetGroupInput()
{
	asset_group = AssetGroupBinding();
}

AssetGroupInput::AssetGroupInput(std::string jsonString)
{
	this->fromJson(jsonString);
}

AssetGroupInput::~AssetGroupInput()
{

}

void
AssetGroupInput::fromJson(std::string jsonObj)
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
AssetGroupInput::toJson()
{
    bourne::json object = bourne::json::object();






	object["asset_group"] = getAssetGroup().toJson();


    return object;

}

AssetGroupBinding
AssetGroupInput::getAssetGroup()
{
	return asset_group;
}

void
AssetGroupInput::setAssetGroup(AssetGroupBinding asset_group)
{
	this->asset_group = asset_group;
}



