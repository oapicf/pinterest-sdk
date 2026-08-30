

#include "CreateInvitesResultsResponseArray.h"

using namespace Tiny;

CreateInvitesResultsResponseArray::CreateInvitesResultsResponseArray()
{
	items = std::list<InviteActionResultItem>();
}

CreateInvitesResultsResponseArray::CreateInvitesResultsResponseArray(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateInvitesResultsResponseArray::~CreateInvitesResultsResponseArray()
{

}

void
CreateInvitesResultsResponseArray::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<InviteActionResultItem> items_list;
        InviteActionResultItem element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
CreateInvitesResultsResponseArray::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<InviteActionResultItem> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        InviteActionResultItem obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<InviteActionResultItem>
CreateInvitesResultsResponseArray::getItems()
{
	return items;
}

void
CreateInvitesResultsResponseArray::setItems(std::list<InviteActionResultItem> items)
{
	this->items = items;
}



