#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdvancedAuctionItems.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdvancedAuctionItems::AdvancedAuctionItems()
{
	//__init();
}

AdvancedAuctionItems::~AdvancedAuctionItems()
{
	//__cleanup();
}

void
AdvancedAuctionItems::__init()
{
	//catalog_id = std::string();
	//new std::list()std::list> items;
}

void
AdvancedAuctionItems::__cleanup()
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
AdvancedAuctionItems::fromJson(char* jsonStr)
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
			list<AdvancedAuctionItem> new_list;
			AdvancedAuctionItem inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AdvancedAuctionItem")) {
					jsonToValue(&inst, temp_json, "AdvancedAuctionItem", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			items = new_list;
		}
		
	}
}

AdvancedAuctionItems::AdvancedAuctionItems(char* json)
{
	this->fromJson(json);
}

char*
AdvancedAuctionItems::toJson()
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
	if (isprimitive("AdvancedAuctionItem")) {
		list<AdvancedAuctionItem> new_list = static_cast<list <AdvancedAuctionItem> > (getItems());
		node = converttoJson(&new_list, "AdvancedAuctionItem", "array");
	} else {
		node = json_node_alloc();
		list<AdvancedAuctionItem> new_list = static_cast<list <AdvancedAuctionItem> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AdvancedAuctionItem>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AdvancedAuctionItem obj = *it;
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
AdvancedAuctionItems::getCatalogId()
{
	return catalog_id;
}

void
AdvancedAuctionItems::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}

std::list<AdvancedAuctionItem>
AdvancedAuctionItems::getItems()
{
	return items;
}

void
AdvancedAuctionItems::setItems(std::list <AdvancedAuctionItem> items)
{
	this->items = items;
}


