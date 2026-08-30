

#include "AssetGroupDeleteError.h"

using namespace Tiny;

AssetGroupDeleteError::AssetGroupDeleteError()
{
	asset_group_id = std::string();
	code = int(0);
	message = std::string();
}

AssetGroupDeleteError::AssetGroupDeleteError(std::string jsonString)
{
	this->fromJson(jsonString);
}

AssetGroupDeleteError::~AssetGroupDeleteError()
{

}

void
AssetGroupDeleteError::fromJson(std::string jsonObj)
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
AssetGroupDeleteError::toJson()
{
    bourne::json object = bourne::json::object();





    object["asset_group_id"] = getAssetGroupId();






    object["code"] = getCode();






    object["message"] = getMessage();



    return object;

}

std::string
AssetGroupDeleteError::getAssetGroupId()
{
	return asset_group_id;
}

void
AssetGroupDeleteError::setAssetGroupId(std::string asset_group_id)
{
	this->asset_group_id = asset_group_id;
}

int
AssetGroupDeleteError::getCode()
{
	return code;
}

void
AssetGroupDeleteError::setCode(int code)
{
	this->code = code;
}

std::string
AssetGroupDeleteError::getMessage()
{
	return message;
}

void
AssetGroupDeleteError::setMessage(std::string message)
{
	this->message = message;
}



