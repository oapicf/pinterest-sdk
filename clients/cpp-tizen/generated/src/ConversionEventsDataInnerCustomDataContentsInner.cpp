#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionEvents_data_inner_custom_data_contents_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionEvents_data_inner_custom_data_contents_inner::ConversionEvents_data_inner_custom_data_contents_inner()
{
	//__init();
}

ConversionEvents_data_inner_custom_data_contents_inner::~ConversionEvents_data_inner_custom_data_contents_inner()
{
	//__cleanup();
}

void
ConversionEvents_data_inner_custom_data_contents_inner::__init()
{
	//id = std::string();
	//item_price = std::string();
	//quantity = long(0);
	//item_name = std::string();
	//item_category = std::string();
	//item_brand = std::string();
}

void
ConversionEvents_data_inner_custom_data_contents_inner::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(item_price != NULL) {
	//
	//delete item_price;
	//item_price = NULL;
	//}
	//if(quantity != NULL) {
	//
	//delete quantity;
	//quantity = NULL;
	//}
	//if(item_name != NULL) {
	//
	//delete item_name;
	//item_name = NULL;
	//}
	//if(item_category != NULL) {
	//
	//delete item_category;
	//item_category = NULL;
	//}
	//if(item_brand != NULL) {
	//
	//delete item_brand;
	//item_brand = NULL;
	//}
	//
}

void
ConversionEvents_data_inner_custom_data_contents_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *item_priceKey = "item_price";
	node = json_object_get_member(pJsonObject, item_priceKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&item_price, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *quantityKey = "quantity";
	node = json_object_get_member(pJsonObject, quantityKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&quantity, node, "long long", "");
		} else {
			
		}
	}
	const gchar *item_nameKey = "item_name";
	node = json_object_get_member(pJsonObject, item_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&item_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *item_categoryKey = "item_category";
	node = json_object_get_member(pJsonObject, item_categoryKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&item_category, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *item_brandKey = "item_brand";
	node = json_object_get_member(pJsonObject, item_brandKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&item_brand, node, "std::string", "");
		} else {
			
		}
	}
}

ConversionEvents_data_inner_custom_data_contents_inner::ConversionEvents_data_inner_custom_data_contents_inner(char* json)
{
	this->fromJson(json);
}

char*
ConversionEvents_data_inner_custom_data_contents_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getItemPrice();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *item_priceKey = "item_price";
	json_object_set_member(pJsonObject, item_priceKey, node);
	if (isprimitive("long long")) {
		long long obj = getQuantity();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *quantityKey = "quantity";
	json_object_set_member(pJsonObject, quantityKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getItemName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *item_nameKey = "item_name";
	json_object_set_member(pJsonObject, item_nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getItemCategory();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *item_categoryKey = "item_category";
	json_object_set_member(pJsonObject, item_categoryKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getItemBrand();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *item_brandKey = "item_brand";
	json_object_set_member(pJsonObject, item_brandKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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
ConversionEvents_data_inner_custom_data_contents_inner::getItemPrice()
{
	return item_price;
}

void
ConversionEvents_data_inner_custom_data_contents_inner::setItemPrice(std::string  item_price)
{
	this->item_price = item_price;
}

long long
ConversionEvents_data_inner_custom_data_contents_inner::getQuantity()
{
	return quantity;
}

void
ConversionEvents_data_inner_custom_data_contents_inner::setQuantity(long long  quantity)
{
	this->quantity = quantity;
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
ConversionEvents_data_inner_custom_data_contents_inner::getItemBrand()
{
	return item_brand;
}

void
ConversionEvents_data_inner_custom_data_contents_inner::setItemBrand(std::string  item_brand)
{
	this->item_brand = item_brand;
}


