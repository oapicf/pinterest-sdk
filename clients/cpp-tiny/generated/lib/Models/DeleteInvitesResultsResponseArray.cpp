

#include "DeleteInvitesResultsResponseArray.h"

using namespace Tiny;

DeleteInvitesResultsResponseArray::DeleteInvitesResultsResponseArray()
{
	items = std::list<DeleteInvitesResultsResponseArray_items_inner>();
}

DeleteInvitesResultsResponseArray::DeleteInvitesResultsResponseArray(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeleteInvitesResultsResponseArray::~DeleteInvitesResultsResponseArray()
{

}

void
DeleteInvitesResultsResponseArray::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<DeleteInvitesResultsResponseArray_items_inner> items_list;
        DeleteInvitesResultsResponseArray_items_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
DeleteInvitesResultsResponseArray::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<DeleteInvitesResultsResponseArray_items_inner> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        DeleteInvitesResultsResponseArray_items_inner obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<DeleteInvitesResultsResponseArray_items_inner>
DeleteInvitesResultsResponseArray::getItems()
{
	return items;
}

void
DeleteInvitesResultsResponseArray::setItems(std::list <DeleteInvitesResultsResponseArray_items_inner> items)
{
	this->items = items;
}



