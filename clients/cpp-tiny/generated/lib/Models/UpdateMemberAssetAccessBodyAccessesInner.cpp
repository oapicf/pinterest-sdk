

#include "UpdateMemberAssetAccessBody_accesses_inner.h"

using namespace Tiny;

UpdateMemberAssetAccessBody_accesses_inner::UpdateMemberAssetAccessBody_accesses_inner()
{
	asset_id = std::string();
	member_id = std::string();
	permissions = std::list<Permissions>();
}

UpdateMemberAssetAccessBody_accesses_inner::UpdateMemberAssetAccessBody_accesses_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateMemberAssetAccessBody_accesses_inner::~UpdateMemberAssetAccessBody_accesses_inner()
{

}

void
UpdateMemberAssetAccessBody_accesses_inner::fromJson(std::string jsonObj)
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


        std::list<Permissions> permissions_list;
        Permissions element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            permissions_list.push_back(element);
        }
        permissions = permissions_list;


    }


}

bourne::json
UpdateMemberAssetAccessBody_accesses_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["asset_id"] = getAssetId();






    object["member_id"] = getMemberId();





    std::list<Permissions> permissions_list = getPermissions();
    bourne::json permissions_arr = bourne::json::array();

    for(auto& var : permissions_list)
    {
        Permissions obj = var;
        permissions_arr.append(obj.toJson());
    }
    object["permissions"] = permissions_arr;




    return object;

}

std::string
UpdateMemberAssetAccessBody_accesses_inner::getAssetId()
{
	return asset_id;
}

void
UpdateMemberAssetAccessBody_accesses_inner::setAssetId(std::string  asset_id)
{
	this->asset_id = asset_id;
}

std::string
UpdateMemberAssetAccessBody_accesses_inner::getMemberId()
{
	return member_id;
}

void
UpdateMemberAssetAccessBody_accesses_inner::setMemberId(std::string  member_id)
{
	this->member_id = member_id;
}

std::list<Permissions>
UpdateMemberAssetAccessBody_accesses_inner::getPermissions()
{
	return permissions;
}

void
UpdateMemberAssetAccessBody_accesses_inner::setPermissions(std::list <Permissions> permissions)
{
	this->permissions = permissions;
}



