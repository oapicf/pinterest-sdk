

#include "Business_members_asset_access_delete_request_accesses_inner.h"

using namespace Tiny;

Business_members_asset_access_delete_request_accesses_inner::Business_members_asset_access_delete_request_accesses_inner()
{
	asset_id = std::string();
	member_id = std::string();
}

Business_members_asset_access_delete_request_accesses_inner::Business_members_asset_access_delete_request_accesses_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

Business_members_asset_access_delete_request_accesses_inner::~Business_members_asset_access_delete_request_accesses_inner()
{

}

void
Business_members_asset_access_delete_request_accesses_inner::fromJson(std::string jsonObj)
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
Business_members_asset_access_delete_request_accesses_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["asset_id"] = getAssetId();






    object["member_id"] = getMemberId();



    return object;

}

std::string
Business_members_asset_access_delete_request_accesses_inner::getAssetId()
{
	return asset_id;
}

void
Business_members_asset_access_delete_request_accesses_inner::setAssetId(std::string  asset_id)
{
	this->asset_id = asset_id;
}

std::string
Business_members_asset_access_delete_request_accesses_inner::getMemberId()
{
	return member_id;
}

void
Business_members_asset_access_delete_request_accesses_inner::setMemberId(std::string  member_id)
{
	this->member_id = member_id;
}



