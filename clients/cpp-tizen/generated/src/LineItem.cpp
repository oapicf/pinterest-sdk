#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LineItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LineItem::LineItem()
{
	//__init();
}

LineItem::~LineItem()
{
	//__cleanup();
}

void
LineItem::__init()
{
	//product_brand = std::string();
	//product_category = std::string();
	//product_id = int(0);
	//product_name = std::string();
	//product_price = std::string();
	//product_quantity = int(0);
	//product_variant = std::string();
	//product_variant_id = std::string();
}

void
LineItem::__cleanup()
{
	//if(product_brand != NULL) {
	//
	//delete product_brand;
	//product_brand = NULL;
	//}
	//if(product_category != NULL) {
	//
	//delete product_category;
	//product_category = NULL;
	//}
	//if(product_id != NULL) {
	//
	//delete product_id;
	//product_id = NULL;
	//}
	//if(product_name != NULL) {
	//
	//delete product_name;
	//product_name = NULL;
	//}
	//if(product_price != NULL) {
	//
	//delete product_price;
	//product_price = NULL;
	//}
	//if(product_quantity != NULL) {
	//
	//delete product_quantity;
	//product_quantity = NULL;
	//}
	//if(product_variant != NULL) {
	//
	//delete product_variant;
	//product_variant = NULL;
	//}
	//if(product_variant_id != NULL) {
	//
	//delete product_variant_id;
	//product_variant_id = NULL;
	//}
	//
}

void
LineItem::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *product_brandKey = "product_brand";
	node = json_object_get_member(pJsonObject, product_brandKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&product_brand, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *product_categoryKey = "product_category";
	node = json_object_get_member(pJsonObject, product_categoryKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&product_category, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *product_idKey = "product_id";
	node = json_object_get_member(pJsonObject, product_idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&product_id, node, "int", "");
		} else {
			
		}
	}
	const gchar *product_nameKey = "product_name";
	node = json_object_get_member(pJsonObject, product_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&product_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *product_priceKey = "product_price";
	node = json_object_get_member(pJsonObject, product_priceKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&product_price, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *product_quantityKey = "product_quantity";
	node = json_object_get_member(pJsonObject, product_quantityKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&product_quantity, node, "int", "");
		} else {
			
		}
	}
	const gchar *product_variantKey = "product_variant";
	node = json_object_get_member(pJsonObject, product_variantKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&product_variant, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *product_variant_idKey = "product_variant_id";
	node = json_object_get_member(pJsonObject, product_variant_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&product_variant_id, node, "std::string", "");
		} else {
			
		}
	}
}

LineItem::LineItem(char* json)
{
	this->fromJson(json);
}

char*
LineItem::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getProductBrand();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *product_brandKey = "product_brand";
	json_object_set_member(pJsonObject, product_brandKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getProductCategory();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *product_categoryKey = "product_category";
	json_object_set_member(pJsonObject, product_categoryKey, node);
	if (isprimitive("int")) {
		int obj = getProductId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *product_idKey = "product_id";
	json_object_set_member(pJsonObject, product_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getProductName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *product_nameKey = "product_name";
	json_object_set_member(pJsonObject, product_nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getProductPrice();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *product_priceKey = "product_price";
	json_object_set_member(pJsonObject, product_priceKey, node);
	if (isprimitive("int")) {
		int obj = getProductQuantity();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *product_quantityKey = "product_quantity";
	json_object_set_member(pJsonObject, product_quantityKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getProductVariant();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *product_variantKey = "product_variant";
	json_object_set_member(pJsonObject, product_variantKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getProductVariantId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *product_variant_idKey = "product_variant_id";
	json_object_set_member(pJsonObject, product_variant_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
LineItem::getProductBrand()
{
	return product_brand;
}

void
LineItem::setProductBrand(std::string  product_brand)
{
	this->product_brand = product_brand;
}

std::string
LineItem::getProductCategory()
{
	return product_category;
}

void
LineItem::setProductCategory(std::string  product_category)
{
	this->product_category = product_category;
}

int
LineItem::getProductId()
{
	return product_id;
}

void
LineItem::setProductId(int  product_id)
{
	this->product_id = product_id;
}

std::string
LineItem::getProductName()
{
	return product_name;
}

void
LineItem::setProductName(std::string  product_name)
{
	this->product_name = product_name;
}

std::string
LineItem::getProductPrice()
{
	return product_price;
}

void
LineItem::setProductPrice(std::string  product_price)
{
	this->product_price = product_price;
}

int
LineItem::getProductQuantity()
{
	return product_quantity;
}

void
LineItem::setProductQuantity(int  product_quantity)
{
	this->product_quantity = product_quantity;
}

std::string
LineItem::getProductVariant()
{
	return product_variant;
}

void
LineItem::setProductVariant(std::string  product_variant)
{
	this->product_variant = product_variant;
}

std::string
LineItem::getProductVariantId()
{
	return product_variant_id;
}

void
LineItem::setProductVariantId(std::string  product_variant_id)
{
	this->product_variant_id = product_variant_id;
}


