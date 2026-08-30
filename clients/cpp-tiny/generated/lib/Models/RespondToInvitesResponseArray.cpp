

#include "RespondToInvitesResponseArray.h"

using namespace Tiny;

RespondToInvitesResponseArray::RespondToInvitesResponseArray()
{
	items = std::list<RespondToInviteResultItem>();
}

RespondToInvitesResponseArray::RespondToInvitesResponseArray(std::string jsonString)
{
	this->fromJson(jsonString);
}

RespondToInvitesResponseArray::~RespondToInvitesResponseArray()
{

}

void
RespondToInvitesResponseArray::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<RespondToInviteResultItem> items_list;
        RespondToInviteResultItem element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
RespondToInvitesResponseArray::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<RespondToInviteResultItem> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        RespondToInviteResultItem obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<RespondToInviteResultItem>
RespondToInvitesResponseArray::getItems()
{
	return items;
}

void
RespondToInvitesResponseArray::setItems(std::list<RespondToInviteResultItem> items)
{
	this->items = items;
}



