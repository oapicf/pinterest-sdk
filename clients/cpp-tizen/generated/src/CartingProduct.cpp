#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CartingProduct.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CartingProduct::CartingProduct()
{
	//__init();
}

CartingProduct::~CartingProduct()
{
	//__cleanup();
}

void
CartingProduct::__init()
{
	//carting_product_id = std::string();
	//display_preferred_retailers_only = bool(false);
	//display_product_price = bool(false);
	//new std::list()std::list> preferred_retailers;
	//randomize_preferred_retailers = bool(false);
}

void
CartingProduct::__cleanup()
{
	//if(carting_product_id != NULL) {
	//
	//delete carting_product_id;
	//carting_product_id = NULL;
	//}
	//if(display_preferred_retailers_only != NULL) {
	//
	//delete display_preferred_retailers_only;
	//display_preferred_retailers_only = NULL;
	//}
	//if(display_product_price != NULL) {
	//
	//delete display_product_price;
	//display_product_price = NULL;
	//}
	//if(preferred_retailers != NULL) {
	//preferred_retailers.RemoveAll(true);
	//delete preferred_retailers;
	//preferred_retailers = NULL;
	//}
	//if(randomize_preferred_retailers != NULL) {
	//
	//delete randomize_preferred_retailers;
	//randomize_preferred_retailers = NULL;
	//}
	//
}

void
CartingProduct::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *carting_product_idKey = "carting_product_id";
	node = json_object_get_member(pJsonObject, carting_product_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&carting_product_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *display_preferred_retailers_onlyKey = "display_preferred_retailers_only";
	node = json_object_get_member(pJsonObject, display_preferred_retailers_onlyKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&display_preferred_retailers_only, node, "bool", "");
		} else {
			
		}
	}
	const gchar *display_product_priceKey = "display_product_price";
	node = json_object_get_member(pJsonObject, display_product_priceKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&display_product_price, node, "bool", "");
		} else {
			
		}
	}
	const gchar *preferred_retailersKey = "preferred_retailers";
	node = json_object_get_member(pJsonObject, preferred_retailersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CartingRetailer> new_list;
			CartingRetailer inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CartingRetailer")) {
					jsonToValue(&inst, temp_json, "CartingRetailer", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			preferred_retailers = new_list;
		}
		
	}
	const gchar *randomize_preferred_retailersKey = "randomize_preferred_retailers";
	node = json_object_get_member(pJsonObject, randomize_preferred_retailersKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&randomize_preferred_retailers, node, "bool", "");
		} else {
			
		}
	}
}

CartingProduct::CartingProduct(char* json)
{
	this->fromJson(json);
}

char*
CartingProduct::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getCartingProductId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *carting_product_idKey = "carting_product_id";
	json_object_set_member(pJsonObject, carting_product_idKey, node);
	if (isprimitive("bool")) {
		bool obj = getDisplayPreferredRetailersOnly();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *display_preferred_retailers_onlyKey = "display_preferred_retailers_only";
	json_object_set_member(pJsonObject, display_preferred_retailers_onlyKey, node);
	if (isprimitive("bool")) {
		bool obj = getDisplayProductPrice();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *display_product_priceKey = "display_product_price";
	json_object_set_member(pJsonObject, display_product_priceKey, node);
	if (isprimitive("CartingRetailer")) {
		list<CartingRetailer> new_list = static_cast<list <CartingRetailer> > (getPreferredRetailers());
		node = converttoJson(&new_list, "CartingRetailer", "array");
	} else {
		node = json_node_alloc();
		list<CartingRetailer> new_list = static_cast<list <CartingRetailer> > (getPreferredRetailers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CartingRetailer>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CartingRetailer obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *preferred_retailersKey = "preferred_retailers";
	json_object_set_member(pJsonObject, preferred_retailersKey, node);
	if (isprimitive("bool")) {
		bool obj = getRandomizePreferredRetailers();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *randomize_preferred_retailersKey = "randomize_preferred_retailers";
	json_object_set_member(pJsonObject, randomize_preferred_retailersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CartingProduct::getCartingProductId()
{
	return carting_product_id;
}

void
CartingProduct::setCartingProductId(std::string  carting_product_id)
{
	this->carting_product_id = carting_product_id;
}

bool
CartingProduct::getDisplayPreferredRetailersOnly()
{
	return display_preferred_retailers_only;
}

void
CartingProduct::setDisplayPreferredRetailersOnly(bool  display_preferred_retailers_only)
{
	this->display_preferred_retailers_only = display_preferred_retailers_only;
}

bool
CartingProduct::getDisplayProductPrice()
{
	return display_product_price;
}

void
CartingProduct::setDisplayProductPrice(bool  display_product_price)
{
	this->display_product_price = display_product_price;
}

std::list<CartingRetailer>
CartingProduct::getPreferredRetailers()
{
	return preferred_retailers;
}

void
CartingProduct::setPreferredRetailers(std::list <CartingRetailer> preferred_retailers)
{
	this->preferred_retailers = preferred_retailers;
}

bool
CartingProduct::getRandomizePreferredRetailers()
{
	return randomize_preferred_retailers;
}

void
CartingProduct::setRandomizePreferredRetailers(bool  randomize_preferred_retailers)
{
	this->randomize_preferred_retailers = randomize_preferred_retailers;
}


