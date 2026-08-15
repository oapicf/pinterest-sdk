

#include "Business_members_asset_access_delete_request.h"

using namespace Tiny;

Business_members_asset_access_delete_request::Business_members_asset_access_delete_request()
{
	accesses = std::list<Business_members_asset_access_delete_request_accesses_inner>();
}

Business_members_asset_access_delete_request::Business_members_asset_access_delete_request(std::string jsonString)
{
	this->fromJson(jsonString);
}

Business_members_asset_access_delete_request::~Business_members_asset_access_delete_request()
{

}

void
Business_members_asset_access_delete_request::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *accessesKey = "accesses";

    if(object.has_key(accessesKey))
    {
        bourne::json value = object[accessesKey];


        std::list<Business_members_asset_access_delete_request_accesses_inner> accesses_list;
        Business_members_asset_access_delete_request_accesses_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            accesses_list.push_back(element);
        }
        accesses = accesses_list;


    }


}

bourne::json
Business_members_asset_access_delete_request::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<Business_members_asset_access_delete_request_accesses_inner> accesses_list = getAccesses();
    bourne::json accesses_arr = bourne::json::array();

    for(auto& var : accesses_list)
    {
        Business_members_asset_access_delete_request_accesses_inner obj = var;
        accesses_arr.append(obj.toJson());
    }
    object["accesses"] = accesses_arr;




    return object;

}

std::list<Business_members_asset_access_delete_request_accesses_inner>
Business_members_asset_access_delete_request::getAccesses()
{
	return accesses;
}

void
Business_members_asset_access_delete_request::setAccesses(std::list <Business_members_asset_access_delete_request_accesses_inner> accesses)
{
	this->accesses = accesses;
}



