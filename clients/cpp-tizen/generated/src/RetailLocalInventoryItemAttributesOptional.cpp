#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RetailLocalInventoryItemAttributesOptional.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RetailLocalInventoryItemAttributesOptional::RetailLocalInventoryItemAttributesOptional()
{
	//__init();
}

RetailLocalInventoryItemAttributesOptional::~RetailLocalInventoryItemAttributesOptional()
{
	//__cleanup();
}

void
RetailLocalInventoryItemAttributesOptional::__init()
{
	//ad_link = std::string();
	//availability = null;
	//price = std::string();
	//sale_price = std::string();
}

void
RetailLocalInventoryItemAttributesOptional::__cleanup()
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
	//
}

void
RetailLocalInventoryItemAttributesOptional::fromJson(char* jsonStr)
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
}

RetailLocalInventoryItemAttributesOptional::RetailLocalInventoryItemAttributesOptional(char* json)
{
	this->fromJson(json);
}

char*
RetailLocalInventoryItemAttributesOptional::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RetailLocalInventoryItemAttributesOptional::getAdLink()
{
	return ad_link;
}

void
RetailLocalInventoryItemAttributesOptional::setAdLink(std::string  ad_link)
{
	this->ad_link = ad_link;
}

ItemAvailability
RetailLocalInventoryItemAttributesOptional::getAvailability()
{
	return availability;
}

void
RetailLocalInventoryItemAttributesOptional::setAvailability(ItemAvailability  availability)
{
	this->availability = availability;
}

std::string
RetailLocalInventoryItemAttributesOptional::getPrice()
{
	return price;
}

void
RetailLocalInventoryItemAttributesOptional::setPrice(std::string  price)
{
	this->price = price;
}

std::string
RetailLocalInventoryItemAttributesOptional::getSalePrice()
{
	return sale_price;
}

void
RetailLocalInventoryItemAttributesOptional::setSalePrice(std::string  sale_price)
{
	this->sale_price = sale_price;
}


