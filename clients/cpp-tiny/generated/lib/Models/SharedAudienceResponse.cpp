

#include "SharedAudienceResponse.h"

using namespace Tiny;

SharedAudienceResponse::SharedAudienceResponse()
{
	audience_id = std::string();
	permissions = std::list<Role>();
	recipient_account_ids = std::list<std::string>();
}

SharedAudienceResponse::SharedAudienceResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

SharedAudienceResponse::~SharedAudienceResponse()
{

}

void
SharedAudienceResponse::fromJson(std::string jsonObj)
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

    const char *recipient_account_idsKey = "recipient_account_ids";

    if(object.has_key(recipient_account_idsKey))
    {
        bourne::json value = object[recipient_account_idsKey];


        std::list<std::string> recipient_account_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            recipient_account_ids_list.push_back(element);
        }
        recipient_account_ids = recipient_account_ids_list;


    }


}

bourne::json
SharedAudienceResponse::toJson()
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






    std::list<std::string> recipient_account_ids_list = getRecipientAccountIds();
    bourne::json recipient_account_ids_arr = bourne::json::array();

    for(auto& var : recipient_account_ids_list)
    {
        recipient_account_ids_arr.append(var);
    }
    object["recipient_account_ids"] = recipient_account_ids_arr;






    return object;

}

std::string
SharedAudienceResponse::getAudienceId()
{
	return audience_id;
}

void
SharedAudienceResponse::setAudienceId(std::string  audience_id)
{
	this->audience_id = audience_id;
}

std::list<Role>
SharedAudienceResponse::getPermissions()
{
	return permissions;
}

void
SharedAudienceResponse::setPermissions(std::list <Role> permissions)
{
	this->permissions = permissions;
}

std::list<std::string>
SharedAudienceResponse::getRecipientAccountIds()
{
	return recipient_account_ids;
}

void
SharedAudienceResponse::setRecipientAccountIds(std::list <std::string> recipient_account_ids)
{
	this->recipient_account_ids = recipient_account_ids;
}



