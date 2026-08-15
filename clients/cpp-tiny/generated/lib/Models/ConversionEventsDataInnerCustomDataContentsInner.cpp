

#include "ConversionEvents_data_inner_custom_data_contents_inner.h"

using namespace Tiny;

ConversionEvents_data_inner_custom_data_contents_inner::ConversionEvents_data_inner_custom_data_contents_inner()
{
	id = std::string();
	item_brand = std::string();
	item_category = std::string();
	item_name = std::string();
	item_price = std::string();
	quantity = long(0);
}

ConversionEvents_data_inner_custom_data_contents_inner::ConversionEvents_data_inner_custom_data_contents_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionEvents_data_inner_custom_data_contents_inner::~ConversionEvents_data_inner_custom_data_contents_inner()
{

}

void
ConversionEvents_data_inner_custom_data_contents_inner::fromJson(std::string jsonObj)
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
ConversionEvents_data_inner_custom_data_contents_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["item_brand"] = getItemBrand();






    object["item_category"] = getItemCategory();






    object["item_name"] = getItemName();






    object["item_price"] = getItemPrice();






    object["quantity"] = getQuantity();



    return object;

}

std::string
ConversionEvents_data_inner_custom_data_contents_inner::getId()
{
	return id;
}

void
ConversionEvents_data_inner_custom_data_contents_inner::setId(std::string  id)
{
	this->id = id;
}

std::string
ConversionEvents_data_inner_custom_data_contents_inner::getItemBrand()
{
	return item_brand;
}

void
ConversionEvents_data_inner_custom_data_contents_inner::setItemBrand(std::string  item_brand)
{
	this->item_brand = item_brand;
}

std::string
ConversionEvents_data_inner_custom_data_contents_inner::getItemCategory()
{
	return item_category;
}

void
ConversionEvents_data_inner_custom_data_contents_inner::setItemCategory(std::string  item_category)
{
	this->item_category = item_category;
}

std::string
ConversionEvents_data_inner_custom_data_contents_inner::getItemName()
{
	return item_name;
}

void
ConversionEvents_data_inner_custom_data_contents_inner::setItemName(std::string  item_name)
{
	this->item_name = item_name;
}

std::string
ConversionEvents_data_inner_custom_data_contents_inner::getItemPrice()
{
	return item_price;
}

void
ConversionEvents_data_inner_custom_data_contents_inner::setItemPrice(std::string  item_price)
{
	this->item_price = item_price;
}

long
ConversionEvents_data_inner_custom_data_contents_inner::getQuantity()
{
	return quantity;
}

void
ConversionEvents_data_inner_custom_data_contents_inner::setQuantity(long  quantity)
{
	this->quantity = quantity;
}



