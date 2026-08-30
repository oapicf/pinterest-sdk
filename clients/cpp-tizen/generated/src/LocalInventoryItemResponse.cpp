#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LocalInventoryItemResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LocalInventoryItemResponse::LocalInventoryItemResponse()
{
	//__init();
}

LocalInventoryItemResponse::~LocalInventoryItemResponse()
{
	//__cleanup();
}

void
LocalInventoryItemResponse::__init()
{
	//ad_link = std::string();
	//availability = null;
	//created_at = long(0);
	//item_id = std::string();
	//last_updated_time = long(0);
	//price = std::string();
	//sale_price = std::string();
	//store_metadata = null;
}

void
LocalInventoryItemResponse::__cleanup()
{
	//if(ad_link != NULL) {
	//
	//delete ad_link;
	//ad_link = NULL;
	//}
	//if(availability != NULL) {
	//
	//delete availability;
	//availability = NULL;
	//}
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
	//}
	//if(item_id != NULL) {
	//
	//delete item_id;
	//item_id = NULL;
	//}
	//if(last_updated_time != NULL) {
	//
	//delete last_updated_time;
	//last_updated_time = NULL;
	//}
	//if(price != NULL) {
	//
	//delete price;
	//price = NULL;
	//}
	//if(sale_price != NULL) {
	//
	//delete sale_price;
	//sale_price = NULL;
	//}
	//if(store_metadata != NULL) {
	//
	//delete store_metadata;
	//store_metadata = NULL;
	//}
	//
}

void
LocalInventoryItemResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ad_linkKey = "ad_link";
	node = json_object_get_member(pJsonObject, ad_linkKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ad_link, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *availabilityKey = "availability";
	node = json_object_get_member(pJsonObject, availabilityKey);
	if (node !=NULL) {
	

		if (isprimitive("ItemAvailability")) {
			jsonToValue(&availability, node, "ItemAvailability", "ItemAvailability");
		} else {
			
			ItemAvailability* obj = static_cast<ItemAvailability*> (&availability);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *created_atKey = "created_at";
	node = json_object_get_member(pJsonObject, created_atKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&created_at, node, "long long", "");
		} else {
			
		}
	}
	const gchar *item_idKey = "item_id";
	node = json_object_get_member(pJsonObject, item_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&item_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *last_updated_timeKey = "last_updated_time";
	node = json_object_get_member(pJsonObject, last_updated_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&last_updated_time, node, "long long", "");
		} else {
			
		}
	}
	const gchar *priceKey = "price";
	node = json_object_get_member(pJsonObject, priceKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&price, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *sale_priceKey = "sale_price";
	node = json_object_get_member(pJsonObject, sale_priceKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&sale_price, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *store_metadataKey = "store_metadata";
	node = json_object_get_member(pJsonObject, store_metadataKey);
	if (node !=NULL) {
	

		if (isprimitive("StoreMetadata")) {
			jsonToValue(&store_metadata, node, "StoreMetadata", "StoreMetadata");
		} else {
			
			StoreMetadata* obj = static_cast<StoreMetadata*> (&store_metadata);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

LocalInventoryItemResponse::LocalInventoryItemResponse(char* json)
{
	this->fromJson(json);
}

char*
LocalInventoryItemResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAdLink();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ad_linkKey = "ad_link";
	json_object_set_member(pJsonObject, ad_linkKey, node);
	if (isprimitive("ItemAvailability")) {
		ItemAvailability obj = getAvailability();
		node = converttoJson(&obj, "ItemAvailability", "");
	}
	else {
		
		ItemAvailability obj = static_cast<ItemAvailability> (getAvailability());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *availabilityKey = "availability";
	json_object_set_member(pJsonObject, availabilityKey, node);
	if (isprimitive("long long")) {
		long long obj = getCreatedAt();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getItemId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *item_idKey = "item_id";
	json_object_set_member(pJsonObject, item_idKey, node);
	if (isprimitive("long long")) {
		long long obj = getLastUpdatedTime();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *last_updated_timeKey = "last_updated_time";
	json_object_set_member(pJsonObject, last_updated_timeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPrice();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *priceKey = "price";
	json_object_set_member(pJsonObject, priceKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSalePrice();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *sale_priceKey = "sale_price";
	json_object_set_member(pJsonObject, sale_priceKey, node);
	if (isprimitive("StoreMetadata")) {
		StoreMetadata obj = getStoreMetadata();
		node = converttoJson(&obj, "StoreMetadata", "");
	}
	else {
		
		StoreMetadata obj = static_cast<StoreMetadata> (getStoreMetadata());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *store_metadataKey = "store_metadata";
	json_object_set_member(pJsonObject, store_metadataKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
LocalInventoryItemResponse::getAdLink()
{
	return ad_link;
}

void
LocalInventoryItemResponse::setAdLink(std::string  ad_link)
{
	this->ad_link = ad_link;
}

ItemAvailability
LocalInventoryItemResponse::getAvailability()
{
	return availability;
}

void
LocalInventoryItemResponse::setAvailability(ItemAvailability  availability)
{
	this->availability = availability;
}

long long
LocalInventoryItemResponse::getCreatedAt()
{
	return created_at;
}

void
LocalInventoryItemResponse::setCreatedAt(long long  created_at)
{
	this->created_at = created_at;
}

std::string
LocalInventoryItemResponse::getItemId()
{
	return item_id;
}

void
LocalInventoryItemResponse::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

long long
LocalInventoryItemResponse::getLastUpdatedTime()
{
	return last_updated_time;
}

void
LocalInventoryItemResponse::setLastUpdatedTime(long long  last_updated_time)
{
	this->last_updated_time = last_updated_time;
}

std::string
LocalInventoryItemResponse::getPrice()
{
	return price;
}

void
LocalInventoryItemResponse::setPrice(std::string  price)
{
	this->price = price;
}

std::string
LocalInventoryItemResponse::getSalePrice()
{
	return sale_price;
}

void
LocalInventoryItemResponse::setSalePrice(std::string  sale_price)
{
	this->sale_price = sale_price;
}

StoreMetadata
LocalInventoryItemResponse::getStoreMetadata()
{
	return store_metadata;
}

void
LocalInventoryItemResponse::setStoreMetadata(StoreMetadata  store_metadata)
{
	this->store_metadata = store_metadata;
}


