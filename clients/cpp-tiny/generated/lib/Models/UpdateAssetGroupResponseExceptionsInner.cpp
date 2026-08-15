

#include "UpdateAssetGroupResponse_exceptions_inner.h"

using namespace Tiny;

UpdateAssetGroupResponse_exceptions_inner::UpdateAssetGroupResponse_exceptions_inner()
{
	asset_group_id = std::string();
	code = int(0);
	message = std::string();
}

UpdateAssetGroupResponse_exceptions_inner::UpdateAssetGroupResponse_exceptions_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateAssetGroupResponse_exceptions_inner::~UpdateAssetGroupResponse_exceptions_inner()
{

}

void
UpdateAssetGroupResponse_exceptions_inner::fromJson(std::string jsonObj)
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
UpdateAssetGroupResponse_exceptions_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["asset_group_id"] = getAssetGroupId();






    object["code"] = getCode();






    object["message"] = getMessage();



    return object;

}

std::string
UpdateAssetGroupResponse_exceptions_inner::getAssetGroupId()
{
	return asset_group_id;
}

void
UpdateAssetGroupResponse_exceptions_inner::setAssetGroupId(std::string  asset_group_id)
{
	this->asset_group_id = asset_group_id;
}

int
UpdateAssetGroupResponse_exceptions_inner::getCode()
{
	return code;
}

void
UpdateAssetGroupResponse_exceptions_inner::setCode(int  code)
{
	this->code = code;
}

std::string
UpdateAssetGroupResponse_exceptions_inner::getMessage()
{
	return message;
}

void
UpdateAssetGroupResponse_exceptions_inner::setMessage(std::string  message)
{
	this->message = message;
}



