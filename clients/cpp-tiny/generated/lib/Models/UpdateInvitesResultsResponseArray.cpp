

#include "UpdateInvitesResultsResponseArray.h"

using namespace Tiny;

UpdateInvitesResultsResponseArray::UpdateInvitesResultsResponseArray()
{
	items = std::list<UpdateInvitesResultsResponseArray_items_inner>();
}

UpdateInvitesResultsResponseArray::UpdateInvitesResultsResponseArray(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateInvitesResultsResponseArray::~UpdateInvitesResultsResponseArray()
{

}

void
UpdateInvitesResultsResponseArray::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<UpdateInvitesResultsResponseArray_items_inner> items_list;
        UpdateInvitesResultsResponseArray_items_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
UpdateInvitesResultsResponseArray::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<UpdateInvitesResultsResponseArray_items_inner> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        UpdateInvitesResultsResponseArray_items_inner obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<UpdateInvitesResultsResponseArray_items_inner>
UpdateInvitesResultsResponseArray::getItems()
{
	return items;
}

void
UpdateInvitesResultsResponseArray::setItems(std::list <UpdateInvitesResultsResponseArray_items_inner> items)
{
	this->items = items;
}



