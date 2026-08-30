

#include "UsersForIndividualAssetResponse.h"

using namespace Tiny;

UsersForIndividualAssetResponse::UsersForIndividualAssetResponse()
{
	asset_id = std::string();
	member_id = std::string();
	permissions = std::list<std::string>();
}

UsersForIndividualAssetResponse::UsersForIndividualAssetResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

UsersForIndividualAssetResponse::~UsersForIndividualAssetResponse()
{

}

void
UsersForIndividualAssetResponse::fromJson(std::string jsonObj)
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

    const char *permissionsKey = "permissions";

    if(object.has_key(permissionsKey))
    {
        bourne::json value = object[permissionsKey];


        std::list<std::string> permissions_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            permissions_list.push_back(element);
        }
        permissions = permissions_list;


    }


}

bourne::json
UsersForIndividualAssetResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["asset_id"] = getAssetId();






    object["member_id"] = getMemberId();





    std::list<std::string> permissions_list = getPermissions();
    bourne::json permissions_arr = bourne::json::array();

    for(auto& var : permissions_list)
    {
        permissions_arr.append(var);
    }
    object["permissions"] = permissions_arr;






    return object;

}

std::string
UsersForIndividualAssetResponse::getAssetId()
{
	return asset_id;
}

void
UsersForIndividualAssetResponse::setAssetId(std::string asset_id)
{
	this->asset_id = asset_id;
}

std::string
UsersForIndividualAssetResponse::getMemberId()
{
	return member_id;
}

void
UsersForIndividualAssetResponse::setMemberId(std::string member_id)
{
	this->member_id = member_id;
}

std::list<std::string>
UsersForIndividualAssetResponse::getPermissions()
{
	return permissions;
}

void
UsersForIndividualAssetResponse::setPermissions(std::list<std::string> permissions)
{
	this->permissions = permissions;
}



