

#include "AdvancedAuctionItems.h"

using namespace Tiny;

AdvancedAuctionItems::AdvancedAuctionItems()
{
	catalog_id = null;
	items = std::list<AdvancedAuctionItem>();
}

AdvancedAuctionItems::AdvancedAuctionItems(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdvancedAuctionItems::~AdvancedAuctionItems()
{

}

void
AdvancedAuctionItems::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *catalog_idKey = "catalog_id";

    if(object.has_key(catalog_idKey))
    {
        bourne::json value = object[catalog_idKey];



        jsonToValue(&catalog_id, value, "std::string");


    }

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<AdvancedAuctionItem> items_list;
        AdvancedAuctionItem element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
AdvancedAuctionItems::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_id"] = getCatalogId();





    std::list<AdvancedAuctionItem> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        AdvancedAuctionItem obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::string
AdvancedAuctionItems::getCatalogId()
{
	return catalog_id;
}

void
AdvancedAuctionItems::setCatalogId(std::string catalog_id)
{
	this->catalog_id = catalog_id;
}

std::list<AdvancedAuctionItem>
AdvancedAuctionItems::getItems()
{
	return items;
}

void
AdvancedAuctionItems::setItems(std::list<AdvancedAuctionItem> items)
{
	this->items = items;
}



