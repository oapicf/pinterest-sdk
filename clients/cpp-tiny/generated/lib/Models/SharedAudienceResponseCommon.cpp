

#include "SharedAudienceResponseCommon.h"

using namespace Tiny;

SharedAudienceResponseCommon::SharedAudienceResponseCommon()
{
	audience_id = std::string();
	permissions = std::list<Role>();
}

SharedAudienceResponseCommon::SharedAudienceResponseCommon(std::string jsonString)
{
	this->fromJson(jsonString);
}

SharedAudienceResponseCommon::~SharedAudienceResponseCommon()
{

}

void
SharedAudienceResponseCommon::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *audience_idKey = "audience_id";

    if(object.has_key(audience_idKey))
    {
        bourne::json value = object[audience_idKey];



        jsonToValue(&audience_id, value, "std::string");


    }

    const char *permissionsKey = "permissions";

    if(object.has_key(permissionsKey))
    {
        bourne::json value = object[permissionsKey];


        std::list<Role> permissions_list;
        Role element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            permissions_list.push_back(element);
        }
        permissions = permissions_list;


    }


}

bourne::json
SharedAudienceResponseCommon::toJson()
{
    bourne::json object = bourne::json::object();





    object["audience_id"] = getAudienceId();





    std::list<Role> permissions_list = getPermissions();
    bourne::json permissions_arr = bourne::json::array();

    for(auto& var : permissions_list)
    {
        Role obj = var;
        permissions_arr.append(obj.toJson());
    }
    object["permissions"] = permissions_arr;




    return object;

}

std::string
SharedAudienceResponseCommon::getAudienceId()
{
	return audience_id;
}

void
SharedAudienceResponseCommon::setAudienceId(std::string  audience_id)
{
	this->audience_id = audience_id;
}

std::list<Role>
SharedAudienceResponseCommon::getPermissions()
{
	return permissions;
}

void
SharedAudienceResponseCommon::setPermissions(std::list <Role> permissions)
{
	this->permissions = permissions;
}



