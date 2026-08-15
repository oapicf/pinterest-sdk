

#include "AdvancedAuctionItemsSubmitRequest.h"

using namespace Tiny;

AdvancedAuctionItemsSubmitRequest::AdvancedAuctionItemsSubmitRequest()
{
	catalog_id = std::string();
	items = std::list<AdvancedAuctionItemsSubmitRecord>();
}

AdvancedAuctionItemsSubmitRequest::AdvancedAuctionItemsSubmitRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdvancedAuctionItemsSubmitRequest::~AdvancedAuctionItemsSubmitRequest()
{

}

void
AdvancedAuctionItemsSubmitRequest::fromJson(std::string jsonObj)
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


        std::list<AdvancedAuctionItemsSubmitRecord> items_list;
        AdvancedAuctionItemsSubmitRecord element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
AdvancedAuctionItemsSubmitRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_id"] = getCatalogId();





    std::list<AdvancedAuctionItemsSubmitRecord> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        AdvancedAuctionItemsSubmitRecord obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::string
AdvancedAuctionItemsSubmitRequest::getCatalogId()
{
	return catalog_id;
}

void
AdvancedAuctionItemsSubmitRequest::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}

std::list<AdvancedAuctionItemsSubmitRecord>
AdvancedAuctionItemsSubmitRequest::getItems()
{
	return items;
}

void
AdvancedAuctionItemsSubmitRequest::setItems(std::list <AdvancedAuctionItemsSubmitRecord> items)
{
	this->items = items;
}



