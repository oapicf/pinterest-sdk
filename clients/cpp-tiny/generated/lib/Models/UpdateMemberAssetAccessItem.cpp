

#include "UpdateMemberAssetAccessItem.h"

using namespace Tiny;

UpdateMemberAssetAccessItem::UpdateMemberAssetAccessItem()
{
	asset_id = std::string();
	member_id = std::string();
	permissions = std::list<Permissions>();
}

UpdateMemberAssetAccessItem::UpdateMemberAssetAccessItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateMemberAssetAccessItem::~UpdateMemberAssetAccessItem()
{

}

void
UpdateMemberAssetAccessItem::fromJson(std::string jsonObj)
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
UpdateMemberAssetAccessItem::toJson()
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
UpdateMemberAssetAccessItem::getAssetId()
{
	return asset_id;
}

void
UpdateMemberAssetAccessItem::setAssetId(std::string asset_id)
{
	this->asset_id = asset_id;
}

std::string
UpdateMemberAssetAccessItem::getMemberId()
{
	return member_id;
}

void
UpdateMemberAssetAccessItem::setMemberId(std::string member_id)
{
	this->member_id = member_id;
}

std::list<Permissions>
UpdateMemberAssetAccessItem::getPermissions()
{
	return permissions;
}

void
UpdateMemberAssetAccessItem::setPermissions(std::list<Permissions> permissions)
{
	this->permissions = permissions;
}



