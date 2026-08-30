

#include "BusinessToBusinessSharedAudience.h"

using namespace Tiny;

BusinessToBusinessSharedAudience::BusinessToBusinessSharedAudience()
{
	audience_id = null;
	permissions = std::list<Role>();
	recipient_business_ids = std::list<std::string>();
}

BusinessToBusinessSharedAudience::BusinessToBusinessSharedAudience(std::string jsonString)
{
	this->fromJson(jsonString);
}

BusinessToBusinessSharedAudience::~BusinessToBusinessSharedAudience()
{

}

void
BusinessToBusinessSharedAudience::fromJson(std::string jsonObj)
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

    const char *recipient_business_idsKey = "recipient_business_ids";

    if(object.has_key(recipient_business_idsKey))
    {
        bourne::json value = object[recipient_business_idsKey];


        std::list<std::string> recipient_business_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            recipient_business_ids_list.push_back(element);
        }
        recipient_business_ids = recipient_business_ids_list;


    }


}

bourne::json
BusinessToBusinessSharedAudience::toJson()
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






    std::list<std::string> recipient_business_ids_list = getRecipientBusinessIds();
    bourne::json recipient_business_ids_arr = bourne::json::array();

    for(auto& var : recipient_business_ids_list)
    {
        recipient_business_ids_arr.append(var);
    }
    object["recipient_business_ids"] = recipient_business_ids_arr;






    return object;

}

std::string
BusinessToBusinessSharedAudience::getAudienceId()
{
	return audience_id;
}

void
BusinessToBusinessSharedAudience::setAudienceId(std::string audience_id)
{
	this->audience_id = audience_id;
}

std::list<Role>
BusinessToBusinessSharedAudience::getPermissions()
{
	return permissions;
}

void
BusinessToBusinessSharedAudience::setPermissions(std::list<Role> permissions)
{
	this->permissions = permissions;
}

std::list<std::string>
BusinessToBusinessSharedAudience::getRecipientBusinessIds()
{
	return recipient_business_ids;
}

void
BusinessToBusinessSharedAudience::setRecipientBusinessIds(std::list<std::string> recipient_business_ids)
{
	this->recipient_business_ids = recipient_business_ids;
}



