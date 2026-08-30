

#include "CatalogsRetailProductMetadata.h"

using namespace Tiny;

CatalogsRetailProductMetadata::CatalogsRetailProductMetadata()
{
	availability = ProductAvailability();
	currency = NonNullableCatalogsCurrency();
	item_group_id = std::string();
	item_id = std::string();
	price = float(0);
	sale_price = float(0);
}

CatalogsRetailProductMetadata::CatalogsRetailProductMetadata(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsRetailProductMetadata::~CatalogsRetailProductMetadata()
{

}

void
CatalogsRetailProductMetadata::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *availabilityKey = "availability";

    if(object.has_key(availabilityKey))
    {
        bourne::json value = object[availabilityKey];




        ProductAvailability* obj = &availability;
		obj->fromJson(value.dump());

    }

    const char *currencyKey = "currency";

    if(object.has_key(currencyKey))
    {
        bourne::json value = object[currencyKey];




        NonNullableCatalogsCurrency* obj = &currency;
		obj->fromJson(value.dump());

    }

    const char *item_group_idKey = "item_group_id";

    if(object.has_key(item_group_idKey))
    {
        bourne::json value = object[item_group_idKey];



        jsonToValue(&item_group_id, value, "std::string");


    }

    const char *item_idKey = "item_id";

    if(object.has_key(item_idKey))
    {
        bourne::json value = object[item_idKey];



        jsonToValue(&item_id, value, "std::string");


    }

    const char *priceKey = "price";

    if(object.has_key(priceKey))
    {
        bourne::json value = object[priceKey];



        jsonToValue(&price, value, "long");


    }

    const char *sale_priceKey = "sale_price";

    if(object.has_key(sale_priceKey))
    {
        bourne::json value = object[sale_priceKey];



        jsonToValue(&sale_price, value, "long");


    }


}

bourne::json
CatalogsRetailProductMetadata::toJson()
{
    bourne::json object = bourne::json::object();






	object["availability"] = getAvailability().toJson();






	object["currency"] = getCurrency().toJson();





    object["item_group_id"] = getItemGroupId();






    object["item_id"] = getItemId();






    object["price"] = getPrice();






    object["sale_price"] = getSalePrice();



    return object;

}

ProductAvailability
CatalogsRetailProductMetadata::getAvailability()
{
	return availability;
}

void
CatalogsRetailProductMetadata::setAvailability(ProductAvailability availability)
{
	this->availability = availability;
}

NonNullableCatalogsCurrency
CatalogsRetailProductMetadata::getCurrency()
{
	return currency;
}

void
CatalogsRetailProductMetadata::setCurrency(NonNullableCatalogsCurrency currency)
{
	this->currency = currency;
}

std::string
CatalogsRetailProductMetadata::getItemGroupId()
{
	return item_group_id;
}

void
CatalogsRetailProductMetadata::setItemGroupId(std::string item_group_id)
{
	this->item_group_id = item_group_id;
}

std::string
CatalogsRetailProductMetadata::getItemId()
{
	return item_id;
}

void
CatalogsRetailProductMetadata::setItemId(std::string item_id)
{
	this->item_id = item_id;
}

long
CatalogsRetailProductMetadata::getPrice()
{
	return price;
}

void
CatalogsRetailProductMetadata::setPrice(long price)
{
	this->price = price;
}

long
CatalogsRetailProductMetadata::getSalePrice()
{
	return sale_price;
}

void
CatalogsRetailProductMetadata::setSalePrice(long sale_price)
{
	this->sale_price = sale_price;
}



