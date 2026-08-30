

#include "LocalInventoryItemsGet.h"

using namespace Tiny;

LocalInventoryItemsGet::LocalInventoryItemsGet()
{
	items = std::list<LocalInventoryItemResponse>();
}

LocalInventoryItemsGet::LocalInventoryItemsGet(std::string jsonString)
{
	this->fromJson(jsonString);
}

LocalInventoryItemsGet::~LocalInventoryItemsGet()
{

}

void
LocalInventoryItemsGet::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<LocalInventoryItemResponse> items_list;
        LocalInventoryItemResponse element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
LocalInventoryItemsGet::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<LocalInventoryItemResponse> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        LocalInventoryItemResponse obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<LocalInventoryItemResponse>
LocalInventoryItemsGet::getItems()
{
	return items;
}

void
LocalInventoryItemsGet::setItems(std::list<LocalInventoryItemResponse> items)
{
	this->items = items;
}



