

#include "UserSingleAssetBinding.h"

using namespace Tiny;

UserSingleAssetBinding::UserSingleAssetBinding()
{
	permissions = std::list<std::string>();
	user = BusinessAccessUserSummary();
}

UserSingleAssetBinding::UserSingleAssetBinding(std::string jsonString)
{
	this->fromJson(jsonString);
}

UserSingleAssetBinding::~UserSingleAssetBinding()
{

}

void
UserSingleAssetBinding::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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

    const char *userKey = "user";

    if(object.has_key(userKey))
    {
        bourne::json value = object[userKey];




        BusinessAccessUserSummary* obj = &user;
		obj->fromJson(value.dump());

    }


}

bourne::json
UserSingleAssetBinding::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> permissions_list = getPermissions();
    bourne::json permissions_arr = bourne::json::array();

    for(auto& var : permissions_list)
    {
        permissions_arr.append(var);
    }
    object["permissions"] = permissions_arr;










	object["user"] = getUser().toJson();


    return object;

}

std::list<std::string>
UserSingleAssetBinding::getPermissions()
{
	return permissions;
}

void
UserSingleAssetBinding::setPermissions(std::list<std::string> permissions)
{
	this->permissions = permissions;
}

BusinessAccessUserSummary
UserSingleAssetBinding::getUser()
{
	return user;
}

void
UserSingleAssetBinding::setUser(BusinessAccessUserSummary user)
{
	this->user = user;
}



