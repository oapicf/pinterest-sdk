

#include "RetailLocalInventoryItemAttributes.h"

using namespace Tiny;

RetailLocalInventoryItemAttributes::RetailLocalInventoryItemAttributes()
{
	ad_link = std::string();
	availability = null;
	price = std::string();
	sale_price = std::string();
}

RetailLocalInventoryItemAttributes::RetailLocalInventoryItemAttributes(std::string jsonString)
{
	this->fromJson(jsonString);
}

RetailLocalInventoryItemAttributes::~RetailLocalInventoryItemAttributes()
{

}

void
RetailLocalInventoryItemAttributes::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_linkKey = "ad_link";

    if(object.has_key(ad_linkKey))
    {
        bourne::json value = object[ad_linkKey];



        jsonToValue(&ad_link, value, "std::string");


    }

    const char *availabilityKey = "availability";

    if(object.has_key(availabilityKey))
    {
        bourne::json value = object[availabilityKey];




        ItemAvailability* obj = &availability;
		obj->fromJson(value.dump());

    }

    const char *priceKey = "price";

    if(object.has_key(priceKey))
    {
        bourne::json value = object[priceKey];



        jsonToValue(&price, value, "std::string");


    }

    const char *sale_priceKey = "sale_price";

    if(object.has_key(sale_priceKey))
    {
        bourne::json value = object[sale_priceKey];



        jsonToValue(&sale_price, value, "std::string");


    }


}

bourne::json
RetailLocalInventoryItemAttributes::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_link"] = getAdLink();







	object["availability"] = getAvailability().toJson();





    object["price"] = getPrice();






    object["sale_price"] = getSalePrice();



    return object;

}

std::string
RetailLocalInventoryItemAttributes::getAdLink()
{
	return ad_link;
}

void
RetailLocalInventoryItemAttributes::setAdLink(std::string ad_link)
{
	this->ad_link = ad_link;
}

ItemAvailability
RetailLocalInventoryItemAttributes::getAvailability()
{
	return availability;
}

void
RetailLocalInventoryItemAttributes::setAvailability(ItemAvailability availability)
{
	this->availability = availability;
}

std::string
RetailLocalInventoryItemAttributes::getPrice()
{
	return price;
}

void
RetailLocalInventoryItemAttributes::setPrice(std::string price)
{
	this->price = price;
}

std::string
RetailLocalInventoryItemAttributes::getSalePrice()
{
	return sale_price;
}

void
RetailLocalInventoryItemAttributes::setSalePrice(std::string sale_price)
{
	this->sale_price = sale_price;
}



