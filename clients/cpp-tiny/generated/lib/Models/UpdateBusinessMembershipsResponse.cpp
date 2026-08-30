

#include "UpdateBusinessMembershipsResponse.h"

using namespace Tiny;

UpdateBusinessMembershipsResponse::UpdateBusinessMembershipsResponse()
{
	items = std::list<BusinessMembershipMember>();
}

UpdateBusinessMembershipsResponse::UpdateBusinessMembershipsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateBusinessMembershipsResponse::~UpdateBusinessMembershipsResponse()
{

}

void
UpdateBusinessMembershipsResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<BusinessMembershipMember> items_list;
        BusinessMembershipMember element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
UpdateBusinessMembershipsResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<BusinessMembershipMember> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        BusinessMembershipMember obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<BusinessMembershipMember>
UpdateBusinessMembershipsResponse::getItems()
{
	return items;
}

void
UpdateBusinessMembershipsResponse::setItems(std::list<BusinessMembershipMember> items)
{
	this->items = items;
}



