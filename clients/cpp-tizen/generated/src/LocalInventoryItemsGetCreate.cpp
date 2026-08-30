#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LocalInventoryItemsGetCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LocalInventoryItemsGetCreate::LocalInventoryItemsGetCreate()
{
	//__init();
}

LocalInventoryItemsGetCreate::~LocalInventoryItemsGetCreate()
{
	//__cleanup();
}

void
LocalInventoryItemsGetCreate::__init()
{
	//new std::list()std::list> item_filters;
}

void
LocalInventoryItemsGetCreate::__cleanup()
{
	//if(item_filters != NULL) {
	//item_filters.RemoveAll(true);
	//delete item_filters;
	//item_filters = NULL;
	//}
	//
}

void
LocalInventoryItemsGetCreate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *item_filtersKey = "item_filters";
	node = json_object_get_member(pJsonObject, item_filtersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ItemIdStoreCodePair> new_list;
			ItemIdStoreCodePair inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ItemIdStoreCodePair")) {
					jsonToValue(&inst, temp_json, "ItemIdStoreCodePair", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			item_filters = new_list;
		}
		
	}
}

LocalInventoryItemsGetCreate::LocalInventoryItemsGetCreate(char* json)
{
	this->fromJson(json);
}

char*
LocalInventoryItemsGetCreate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ItemIdStoreCodePair")) {
		list<ItemIdStoreCodePair> new_list = static_cast<list <ItemIdStoreCodePair> > (getItemFilters());
		node = converttoJson(&new_list, "ItemIdStoreCodePair", "array");
	} else {
		node = json_node_alloc();
		list<ItemIdStoreCodePair> new_list = static_cast<list <ItemIdStoreCodePair> > (getItemFilters());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ItemIdStoreCodePair>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ItemIdStoreCodePair obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *item_filtersKey = "item_filters";
	json_object_set_member(pJsonObject, item_filtersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<ItemIdStoreCodePair>
LocalInventoryItemsGetCreate::getItemFilters()
{
	return item_filters;
}

void
LocalInventoryItemsGetCreate::setItemFilters(std::list <ItemIdStoreCodePair> item_filters)
{
	this->item_filters = item_filters;
}


