

#include "ConversionEventsDataItemsCustomDataContentsItems.h"

using namespace Tiny;

ConversionEventsDataItemsCustomDataContentsItems::ConversionEventsDataItemsCustomDataContentsItems()
{
	id = std::string();
	item_brand = std::string();
	item_brand_id = std::string();
	item_category = std::string();
	item_name = std::string();
	item_price = std::string();
	quantity = long(0);
}

ConversionEventsDataItemsCustomDataContentsItems::ConversionEventsDataItemsCustomDataContentsItems(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionEventsDataItemsCustomDataContentsItems::~ConversionEventsDataItemsCustomDataContentsItems()
{

}

void
ConversionEventsDataItemsCustomDataContentsItems::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *item_brandKey = "item_brand";

    if(object.has_key(item_brandKey))
    {
        bourne::json value = object[item_brandKey];



        jsonToValue(&item_brand, value, "std::string");


    }

    const char *item_brand_idKey = "item_brand_id";

    if(object.has_key(item_brand_idKey))
    {
        bourne::json value = object[item_brand_idKey];



        jsonToValue(&item_brand_id, value, "std::string");


    }

    const char *item_categoryKey = "item_category";

    if(object.has_key(item_categoryKey))
    {
        bourne::json value = object[item_categoryKey];



        jsonToValue(&item_category, value, "std::string");


    }

    const char *item_nameKey = "item_name";

    if(object.has_key(item_nameKey))
    {
        bourne::json value = object[item_nameKey];



        jsonToValue(&item_name, value, "std::string");


    }

    const char *item_priceKey = "item_price";

    if(object.has_key(item_priceKey))
    {
        bourne::json value = object[item_priceKey];



        jsonToValue(&item_price, value, "std::string");


    }

    const char *quantityKey = "quantity";

    if(object.has_key(quantityKey))
    {
        bourne::json value = object[quantityKey];



        jsonToValue(&quantity, value, "long");


    }


}

bourne::json
ConversionEventsDataItemsCustomDataContentsItems::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["item_brand"] = getItemBrand();






    object["item_brand_id"] = getItemBrandId();






    object["item_category"] = getItemCategory();






    object["item_name"] = getItemName();






    object["item_price"] = getItemPrice();






    object["quantity"] = getQuantity();



    return object;

}

std::string
ConversionEventsDataItemsCustomDataContentsItems::getId()
{
	return id;
}

void
ConversionEventsDataItemsCustomDataContentsItems::setId(std::string id)
{
	this->id = id;
}

std::string
ConversionEventsDataItemsCustomDataContentsItems::getItemBrand()
{
	return item_brand;
}

void
ConversionEventsDataItemsCustomDataContentsItems::setItemBrand(std::string item_brand)
{
	this->item_brand = item_brand;
}

std::string
ConversionEventsDataItemsCustomDataContentsItems::getItemBrandId()
{
	return item_brand_id;
}

void
ConversionEventsDataItemsCustomDataContentsItems::setItemBrandId(std::string item_brand_id)
{
	this->item_brand_id = item_brand_id;
}

std::string
ConversionEventsDataItemsCustomDataContentsItems::getItemCategory()
{
	return item_category;
}

void
ConversionEventsDataItemsCustomDataContentsItems::setItemCategory(std::string item_category)
{
	this->item_category = item_category;
}

std::string
ConversionEventsDataItemsCustomDataContentsItems::getItemName()
{
	return item_name;
}

void
ConversionEventsDataItemsCustomDataContentsItems::setItemName(std::string item_name)
{
	this->item_name = item_name;
}

std::string
ConversionEventsDataItemsCustomDataContentsItems::getItemPrice()
{
	return item_price;
}

void
ConversionEventsDataItemsCustomDataContentsItems::setItemPrice(std::string item_price)
{
	this->item_price = item_price;
}

long
ConversionEventsDataItemsCustomDataContentsItems::getQuantity()
{
	return quantity;
}

void
ConversionEventsDataItemsCustomDataContentsItems::setQuantity(long quantity)
{
	this->quantity = quantity;
}



