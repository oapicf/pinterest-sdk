

#include "AdvancedAuctionItemsGetRequest.h"

using namespace Tiny;

AdvancedAuctionItemsGetRequest::AdvancedAuctionItemsGetRequest()
{
	catalog_id = std::string();
	items = std::list<AdvancedAuctionItemsGetRecord>();
}

AdvancedAuctionItemsGetRequest::AdvancedAuctionItemsGetRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdvancedAuctionItemsGetRequest::~AdvancedAuctionItemsGetRequest()
{

}

void
AdvancedAuctionItemsGetRequest::fromJson(std::string jsonObj)
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


        std::list<AdvancedAuctionItemsGetRecord> items_list;
        AdvancedAuctionItemsGetRecord element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
AdvancedAuctionItemsGetRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_id"] = getCatalogId();





    std::list<AdvancedAuctionItemsGetRecord> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        AdvancedAuctionItemsGetRecord obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::string
AdvancedAuctionItemsGetRequest::getCatalogId()
{
	return catalog_id;
}

void
AdvancedAuctionItemsGetRequest::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}

std::list<AdvancedAuctionItemsGetRecord>
AdvancedAuctionItemsGetRequest::getItems()
{
	return items;
}

void
AdvancedAuctionItemsGetRequest::setItems(std::list <AdvancedAuctionItemsGetRecord> items)
{
	this->items = items;
}



