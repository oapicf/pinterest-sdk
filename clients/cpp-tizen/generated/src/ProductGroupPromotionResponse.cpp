#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProductGroupPromotionResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProductGroupPromotionResponse::ProductGroupPromotionResponse()
{
	//__init();
}

ProductGroupPromotionResponse::~ProductGroupPromotionResponse()
{
	//__cleanup();
}

void
ProductGroupPromotionResponse::__init()
{
	//new std::list()std::list> items;
}

void
ProductGroupPromotionResponse::__cleanup()
{
	//if(items != NULL) {
	//items.RemoveAll(true);
	//delete items;
	//items = NULL;
	//}
	//
}

void
ProductGroupPromotionResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ProductGroupPromotionResponseItem> new_list;
			ProductGroupPromotionResponseItem inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ProductGroupPromotionResponseItem")) {
					jsonToValue(&inst, temp_json, "ProductGroupPromotionResponseItem", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			items = new_list;
		}
		
	}
}

ProductGroupPromotionResponse::ProductGroupPromotionResponse(char* json)
{
	this->fromJson(json);
}

char*
ProductGroupPromotionResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ProductGroupPromotionResponseItem")) {
		list<ProductGroupPromotionResponseItem> new_list = static_cast<list <ProductGroupPromotionResponseItem> > (getItems());
		node = converttoJson(&new_list, "ProductGroupPromotionResponseItem", "array");
	} else {
		node = json_node_alloc();
		list<ProductGroupPromotionResponseItem> new_list = static_cast<list <ProductGroupPromotionResponseItem> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ProductGroupPromotionResponseItem>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ProductGroupPromotionResponseItem obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *itemsKey = "items";
	json_object_set_member(pJsonObject, itemsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<ProductGroupPromotionResponseItem>
ProductGroupPromotionResponse::getItems()
{
	return items;
}

void
ProductGroupPromotionResponse::setItems(std::list <ProductGroupPromotionResponseItem> items)
{
	this->items = items;
}


