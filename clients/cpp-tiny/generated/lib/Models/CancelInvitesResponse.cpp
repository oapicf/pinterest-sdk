

#include "CancelInvitesResponse.h"

using namespace Tiny;

CancelInvitesResponse::CancelInvitesResponse()
{
	items = std::list<CancelInviteResultItem>();
}

CancelInvitesResponse::CancelInvitesResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

CancelInvitesResponse::~CancelInvitesResponse()
{

}

void
CancelInvitesResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<CancelInviteResultItem> items_list;
        CancelInviteResultItem element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
CancelInvitesResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<CancelInviteResultItem> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        CancelInviteResultItem obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<CancelInviteResultItem>
CancelInvitesResponse::getItems()
{
	return items;
}

void
CancelInvitesResponse::setItems(std::list<CancelInviteResultItem> items)
{
	this->items = items;
}



