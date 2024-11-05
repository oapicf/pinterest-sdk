#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdvancedAuctionProcessedItems.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdvancedAuctionProcessedItems::AdvancedAuctionProcessedItems()
{
	//__init();
}

AdvancedAuctionProcessedItems::~AdvancedAuctionProcessedItems()
{
	//__cleanup();
}

void
AdvancedAuctionProcessedItems::__init()
{
	//catalog_id = std::string();
	//new std::list()std::list> items;
}

void
AdvancedAuctionProcessedItems::__cleanup()
{
	//if(catalog_id != NULL) {
	//
	//delete catalog_id;
	//catalog_id = NULL;
	//}
	//if(items != NULL) {
	//items.RemoveAll(true);
	//delete items;
	//items = NULL;
	//}
	//
}

void
AdvancedAuctionProcessedItems::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *catalog_idKey = "catalog_id";
	node = json_object_get_member(pJsonObject, catalog_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&catalog_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AdvancedAuctionProcessedItem> new_list;
			AdvancedAuctionProcessedItem inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AdvancedAuctionProcessedItem")) {
					jsonToValue(&inst, temp_json, "AdvancedAuctionProcessedItem", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			items = new_list;
		}
		
	}
}

AdvancedAuctionProcessedItems::AdvancedAuctionProcessedItems(char* json)
{
	this->fromJson(json);
}

char*
AdvancedAuctionProcessedItems::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getCatalogId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *catalog_idKey = "catalog_id";
	json_object_set_member(pJsonObject, catalog_idKey, node);
	if (isprimitive("AdvancedAuctionProcessedItem")) {
		list<AdvancedAuctionProcessedItem> new_list = static_cast<list <AdvancedAuctionProcessedItem> > (getItems());
		node = converttoJson(&new_list, "AdvancedAuctionProcessedItem", "array");
	} else {
		node = json_node_alloc();
		list<AdvancedAuctionProcessedItem> new_list = static_cast<list <AdvancedAuctionProcessedItem> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AdvancedAuctionProcessedItem>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AdvancedAuctionProcessedItem obj = *it;
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

std::string
AdvancedAuctionProcessedItems::getCatalogId()
{
	return catalog_id;
}

void
AdvancedAuctionProcessedItems::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}

std::list<AdvancedAuctionProcessedItem>
AdvancedAuctionProcessedItems::getItems()
{
	return items;
}

void
AdvancedAuctionProcessedItems::setItems(std::list <AdvancedAuctionProcessedItem> items)
{
	this->items = items;
}


