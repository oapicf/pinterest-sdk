

#include "LocalInventoryItemsGetCreate.h"

using namespace Tiny;

LocalInventoryItemsGetCreate::LocalInventoryItemsGetCreate()
{
	item_filters = std::list<ItemIdStoreCodePair>();
}

LocalInventoryItemsGetCreate::LocalInventoryItemsGetCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

LocalInventoryItemsGetCreate::~LocalInventoryItemsGetCreate()
{

}

void
LocalInventoryItemsGetCreate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *item_filtersKey = "item_filters";

    if(object.has_key(item_filtersKey))
    {
        bourne::json value = object[item_filtersKey];


        std::list<ItemIdStoreCodePair> item_filters_list;
        ItemIdStoreCodePair element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            item_filters_list.push_back(element);
        }
        item_filters = item_filters_list;


    }


}

bourne::json
LocalInventoryItemsGetCreate::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<ItemIdStoreCodePair> item_filters_list = getItemFilters();
    bourne::json item_filters_arr = bourne::json::array();

    for(auto& var : item_filters_list)
    {
        ItemIdStoreCodePair obj = var;
        item_filters_arr.append(obj.toJson());
    }
    object["item_filters"] = item_filters_arr;




    return object;

}

std::list<ItemIdStoreCodePair>
LocalInventoryItemsGetCreate::getItemFilters()
{
	return item_filters;
}

void
LocalInventoryItemsGetCreate::setItemFilters(std::list<ItemIdStoreCodePair> item_filters)
{
	this->item_filters = item_filters;
}



