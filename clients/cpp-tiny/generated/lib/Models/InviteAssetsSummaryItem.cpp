

#include "InviteAssetsSummaryItem.h"

using namespace Tiny;

InviteAssetsSummaryItem::InviteAssetsSummaryItem()
{
	id = std::string();
	permissions = std::list<std::string>();
}

InviteAssetsSummaryItem::InviteAssetsSummaryItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

InviteAssetsSummaryItem::~InviteAssetsSummaryItem()
{

}

void
InviteAssetsSummaryItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


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
InviteAssetsSummaryItem::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();





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
InviteAssetsSummaryItem::getId()
{
	return id;
}

void
InviteAssetsSummaryItem::setId(std::string id)
{
	this->id = id;
}

std::list<std::string>
InviteAssetsSummaryItem::getPermissions()
{
	return permissions;
}

void
InviteAssetsSummaryItem::setPermissions(std::list<std::string> permissions)
{
	this->permissions = permissions;
}



