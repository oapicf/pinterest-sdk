#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsProductMetadata.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsProductMetadata::CatalogsProductMetadata()
{
	//__init();
}

CatalogsProductMetadata::~CatalogsProductMetadata()
{
	//__cleanup();
}

void
CatalogsProductMetadata::__init()
{
	//item_id = std::string();
	//item_group_id = std::string();
	//availability = new NonNullableProductAvailabilityType();
	//price = double(0);
	//sale_price = double(0);
	//currency = new NonNullableCatalogsCurrency();
}

void
CatalogsProductMetadata::__cleanup()
{
	//if(item_id != NULL) {
	//
	//delete item_id;
	//item_id = NULL;
	//}
	//if(item_group_id != NULL) {
	//
	//delete item_group_id;
	//item_group_id = NULL;
	//}
	//if(availability != NULL) {
	//
	//delete availability;
	//availability = NULL;
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
	//if(currency != NULL) {
	//
	//delete currency;
	//currency = NULL;
	//}
	//
}

void
CatalogsProductMetadata::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *item_idKey = "item_id";
	node = json_object_get_member(pJsonObject, item_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&item_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *item_group_idKey = "item_group_id";
	node = json_object_get_member(pJsonObject, item_group_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&item_group_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *availabilityKey = "availability";
	node = json_object_get_member(pJsonObject, availabilityKey);
	if (node !=NULL) {
	

		if (isprimitive("NonNullableProductAvailabilityType")) {
			jsonToValue(&availability, node, "NonNullableProductAvailabilityType", "NonNullableProductAvailabilityType");
		} else {
			
			NonNullableProductAvailabilityType* obj = static_cast<NonNullableProductAvailabilityType*> (&availability);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *priceKey = "price";
	node = json_object_get_member(pJsonObject, priceKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&price, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&price);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *sale_priceKey = "sale_price";
	node = json_object_get_member(pJsonObject, sale_priceKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&sale_price, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&sale_price);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *currencyKey = "currency";
	node = json_object_get_member(pJsonObject, currencyKey);
	if (node !=NULL) {
	

		if (isprimitive("NonNullableCatalogsCurrency")) {
			jsonToValue(&currency, node, "NonNullableCatalogsCurrency", "NonNullableCatalogsCurrency");
		} else {
			
			NonNullableCatalogsCurrency* obj = static_cast<NonNullableCatalogsCurrency*> (&currency);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsProductMetadata::CatalogsProductMetadata(char* json)
{
	this->fromJson(json);
}

char*
CatalogsProductMetadata::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getItemId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *item_idKey = "item_id";
	json_object_set_member(pJsonObject, item_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getItemGroupId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *item_group_idKey = "item_group_id";
	json_object_set_member(pJsonObject, item_group_idKey, node);
	if (isprimitive("NonNullableProductAvailabilityType")) {
		NonNullableProductAvailabilityType obj = getAvailability();
		node = converttoJson(&obj, "NonNullableProductAvailabilityType", "");
	}
	else {
		
		NonNullableProductAvailabilityType obj = static_cast<NonNullableProductAvailabilityType> (getAvailability());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *availabilityKey = "availability";
	json_object_set_member(pJsonObject, availabilityKey, node);
	if (isprimitive("long long")) {
		long long obj = getPrice();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getPrice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *priceKey = "price";
	json_object_set_member(pJsonObject, priceKey, node);
	if (isprimitive("long long")) {
		long long obj = getSalePrice();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getSalePrice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sale_priceKey = "sale_price";
	json_object_set_member(pJsonObject, sale_priceKey, node);
	if (isprimitive("NonNullableCatalogsCurrency")) {
		NonNullableCatalogsCurrency obj = getCurrency();
		node = converttoJson(&obj, "NonNullableCatalogsCurrency", "");
	}
	else {
		
		NonNullableCatalogsCurrency obj = static_cast<NonNullableCatalogsCurrency> (getCurrency());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *currencyKey = "currency";
	json_object_set_member(pJsonObject, currencyKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsProductMetadata::getItemId()
{
	return item_id;
}

void
CatalogsProductMetadata::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

std::string
CatalogsProductMetadata::getItemGroupId()
{
	return item_group_id;
}

void
CatalogsProductMetadata::setItemGroupId(std::string  item_group_id)
{
	this->item_group_id = item_group_id;
}

NonNullableProductAvailabilityType
CatalogsProductMetadata::getAvailability()
{
	return availability;
}

void
CatalogsProductMetadata::setAvailability(NonNullableProductAvailabilityType  availability)
{
	this->availability = availability;
}

long long
CatalogsProductMetadata::getPrice()
{
	return price;
}

void
CatalogsProductMetadata::setPrice(long long  price)
{
	this->price = price;
}

long long
CatalogsProductMetadata::getSalePrice()
{
	return sale_price;
}

void
CatalogsProductMetadata::setSalePrice(long long  sale_price)
{
	this->sale_price = sale_price;
}

NonNullableCatalogsCurrency
CatalogsProductMetadata::getCurrency()
{
	return currency;
}

void
CatalogsProductMetadata::setCurrency(NonNullableCatalogsCurrency  currency)
{
	this->currency = currency;
}


