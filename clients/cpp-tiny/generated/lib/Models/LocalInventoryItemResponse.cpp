

#include "LocalInventoryItemResponse.h"

using namespace Tiny;

LocalInventoryItemResponse::LocalInventoryItemResponse()
{
	ad_link = std::string();
	availability = null;
	created_at = long(0);
	item_id = std::string();
	last_updated_time = long(0);
	price = std::string();
	sale_price = std::string();
	store_metadata = null;
}

LocalInventoryItemResponse::LocalInventoryItemResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

LocalInventoryItemResponse::~LocalInventoryItemResponse()
{

}

void
LocalInventoryItemResponse::fromJson(std::string jsonObj)
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

    const char *created_atKey = "created_at";

    if(object.has_key(created_atKey))
    {
        bourne::json value = object[created_atKey];



        jsonToValue(&created_at, value, "long");


    }

    const char *item_idKey = "item_id";

    if(object.has_key(item_idKey))
    {
        bourne::json value = object[item_idKey];



        jsonToValue(&item_id, value, "std::string");


    }

    const char *last_updated_timeKey = "last_updated_time";

    if(object.has_key(last_updated_timeKey))
    {
        bourne::json value = object[last_updated_timeKey];



        jsonToValue(&last_updated_time, value, "long");


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

    const char *store_metadataKey = "store_metadata";

    if(object.has_key(store_metadataKey))
    {
        bourne::json value = object[store_metadataKey];




        StoreMetadata* obj = &store_metadata;
		obj->fromJson(value.dump());

    }


}

bourne::json
LocalInventoryItemResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_link"] = getAdLink();







	object["availability"] = getAvailability().toJson();





    object["created_at"] = getCreatedAt();






    object["item_id"] = getItemId();






    object["last_updated_time"] = getLastUpdatedTime();






    object["price"] = getPrice();






    object["sale_price"] = getSalePrice();







	object["store_metadata"] = getStoreMetadata().toJson();


    return object;

}

std::string
LocalInventoryItemResponse::getAdLink()
{
	return ad_link;
}

void
LocalInventoryItemResponse::setAdLink(std::string ad_link)
{
	this->ad_link = ad_link;
}

ItemAvailability
LocalInventoryItemResponse::getAvailability()
{
	return availability;
}

void
LocalInventoryItemResponse::setAvailability(ItemAvailability availability)
{
	this->availability = availability;
}

long
LocalInventoryItemResponse::getCreatedAt()
{
	return created_at;
}

void
LocalInventoryItemResponse::setCreatedAt(long created_at)
{
	this->created_at = created_at;
}

std::string
LocalInventoryItemResponse::getItemId()
{
	return item_id;
}

void
LocalInventoryItemResponse::setItemId(std::string item_id)
{
	this->item_id = item_id;
}

long
LocalInventoryItemResponse::getLastUpdatedTime()
{
	return last_updated_time;
}

void
LocalInventoryItemResponse::setLastUpdatedTime(long last_updated_time)
{
	this->last_updated_time = last_updated_time;
}

std::string
LocalInventoryItemResponse::getPrice()
{
	return price;
}

void
LocalInventoryItemResponse::setPrice(std::string price)
{
	this->price = price;
}

std::string
LocalInventoryItemResponse::getSalePrice()
{
	return sale_price;
}

void
LocalInventoryItemResponse::setSalePrice(std::string sale_price)
{
	this->sale_price = sale_price;
}

StoreMetadata
LocalInventoryItemResponse::getStoreMetadata()
{
	return store_metadata;
}

void
LocalInventoryItemResponse::setStoreMetadata(StoreMetadata store_metadata)
{
	this->store_metadata = store_metadata;
}



