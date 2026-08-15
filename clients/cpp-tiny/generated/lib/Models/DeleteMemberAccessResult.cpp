

#include "DeleteMemberAccessResult.h"

using namespace Tiny;

DeleteMemberAccessResult::DeleteMemberAccessResult()
{
	asset_id = std::string();
	member_id = std::string();
}

DeleteMemberAccessResult::DeleteMemberAccessResult(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeleteMemberAccessResult::~DeleteMemberAccessResult()
{

}

void
DeleteMemberAccessResult::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *asset_idKey = "asset_id";

    if(object.has_key(asset_idKey))
    {
        bourne::json value = object[asset_idKey];



        jsonToValue(&asset_id, value, "std::string");


    }

    const char *member_idKey = "member_id";

    if(object.has_key(member_idKey))
    {
        bourne::json value = object[member_idKey];



        jsonToValue(&member_id, value, "std::string");


    }


}

bourne::json
DeleteMemberAccessResult::toJson()
{
    bourne::json object = bourne::json::object();





    object["asset_id"] = getAssetId();






    object["member_id"] = getMemberId();



    return object;

}

std::string
DeleteMemberAccessResult::getAssetId()
{
	return asset_id;
}

void
DeleteMemberAccessResult::setAssetId(std::string  asset_id)
{
	this->asset_id = asset_id;
}

std::string
DeleteMemberAccessResult::getMemberId()
{
	return member_id;
}

void
DeleteMemberAccessResult::setMemberId(std::string  member_id)
{
	this->member_id = member_id;
}



