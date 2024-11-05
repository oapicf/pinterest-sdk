#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateMemberAssetsResultsResponseArray.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateMemberAssetsResultsResponseArray::UpdateMemberAssetsResultsResponseArray()
{
	//__init();
}

UpdateMemberAssetsResultsResponseArray::~UpdateMemberAssetsResultsResponseArray()
{
	//__cleanup();
}

void
UpdateMemberAssetsResultsResponseArray::__init()
{
	//new std::list()std::list> items;
}

void
UpdateMemberAssetsResultsResponseArray::__cleanup()
{
	//if(items != NULL) {
	//items.RemoveAll(true);
	//delete items;
	//items = NULL;
	//}
	//
}

void
UpdateMemberAssetsResultsResponseArray::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<UpdateMemberAssetsResultsResponseArray_items_inner> new_list;
			UpdateMemberAssetsResultsResponseArray_items_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("UpdateMemberAssetsResultsResponseArray_items_inner")) {
					jsonToValue(&inst, temp_json, "UpdateMemberAssetsResultsResponseArray_items_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			items = new_list;
		}
		
	}
}

UpdateMemberAssetsResultsResponseArray::UpdateMemberAssetsResultsResponseArray(char* json)
{
	this->fromJson(json);
}

char*
UpdateMemberAssetsResultsResponseArray::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("UpdateMemberAssetsResultsResponseArray_items_inner")) {
		list<UpdateMemberAssetsResultsResponseArray_items_inner> new_list = static_cast<list <UpdateMemberAssetsResultsResponseArray_items_inner> > (getItems());
		node = converttoJson(&new_list, "UpdateMemberAssetsResultsResponseArray_items_inner", "array");
	} else {
		node = json_node_alloc();
		list<UpdateMemberAssetsResultsResponseArray_items_inner> new_list = static_cast<list <UpdateMemberAssetsResultsResponseArray_items_inner> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<UpdateMemberAssetsResultsResponseArray_items_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			UpdateMemberAssetsResultsResponseArray_items_inner obj = *it;
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

std::list<UpdateMemberAssetsResultsResponseArray_items_inner>
UpdateMemberAssetsResultsResponseArray::getItems()
{
	return items;
}

void
UpdateMemberAssetsResultsResponseArray::setItems(std::list <UpdateMemberAssetsResultsResponseArray_items_inner> items)
{
	this->items = items;
}


