

#include "InviteAssetsSummary_profiles_inner.h"

using namespace Tiny;

InviteAssetsSummary_profiles_inner::InviteAssetsSummary_profiles_inner()
{
	id = std::string();
	permissions = std::list<std::string>();
}

InviteAssetsSummary_profiles_inner::InviteAssetsSummary_profiles_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

InviteAssetsSummary_profiles_inner::~InviteAssetsSummary_profiles_inner()
{

}

void
InviteAssetsSummary_profiles_inner::fromJson(std::string jsonObj)
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
InviteAssetsSummary_profiles_inner::toJson()
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
InviteAssetsSummary_profiles_inner::getId()
{
	return id;
}

void
InviteAssetsSummary_profiles_inner::setId(std::string  id)
{
	this->id = id;
}

std::list<std::string>
InviteAssetsSummary_profiles_inner::getPermissions()
{
	return permissions;
}

void
InviteAssetsSummary_profiles_inner::setPermissions(std::list <std::string> permissions)
{
	this->permissions = permissions;
}



