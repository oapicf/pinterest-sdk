

#include "AssetGroupUpdateError.h"

using namespace Tiny;

AssetGroupUpdateError::AssetGroupUpdateError()
{
	asset_group_id = std::string();
	code = int(0);
	message = std::string();
}

AssetGroupUpdateError::AssetGroupUpdateError(std::string jsonString)
{
	this->fromJson(jsonString);
}

AssetGroupUpdateError::~AssetGroupUpdateError()
{

}

void
AssetGroupUpdateError::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *asset_group_idKey = "asset_group_id";

    if(object.has_key(asset_group_idKey))
    {
        bourne::json value = object[asset_group_idKey];



        jsonToValue(&asset_group_id, value, "std::string");


    }

    const char *codeKey = "code";

    if(object.has_key(codeKey))
    {
        bourne::json value = object[codeKey];



        jsonToValue(&code, value, "int");


    }

    const char *messageKey = "message";

    if(object.has_key(messageKey))
    {
        bourne::json value = object[messageKey];



        jsonToValue(&message, value, "std::string");


    }


}

bourne::json
AssetGroupUpdateError::toJson()
{
    bourne::json object = bourne::json::object();





    object["asset_group_id"] = getAssetGroupId();






    object["code"] = getCode();






    object["message"] = getMessage();



    return object;

}

std::string
AssetGroupUpdateError::getAssetGroupId()
{
	return asset_group_id;
}

void
AssetGroupUpdateError::setAssetGroupId(std::string asset_group_id)
{
	this->asset_group_id = asset_group_id;
}

int
AssetGroupUpdateError::getCode()
{
	return code;
}

void
AssetGroupUpdateError::setCode(int code)
{
	this->code = code;
}

std::string
AssetGroupUpdateError::getMessage()
{
	return message;
}

void
AssetGroupUpdateError::setMessage(std::string message)
{
	this->message = message;
}



