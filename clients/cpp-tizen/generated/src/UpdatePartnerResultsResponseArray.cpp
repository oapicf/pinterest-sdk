#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdatePartnerResultsResponseArray.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdatePartnerResultsResponseArray::UpdatePartnerResultsResponseArray()
{
	//__init();
}

UpdatePartnerResultsResponseArray::~UpdatePartnerResultsResponseArray()
{
	//__cleanup();
}

void
UpdatePartnerResultsResponseArray::__init()
{
	//new std::list()std::list> items;
}

void
UpdatePartnerResultsResponseArray::__cleanup()
{
	//if(items != NULL) {
	//items.RemoveAll(true);
	//delete items;
	//items = NULL;
	//}
	//
}

void
UpdatePartnerResultsResponseArray::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<UpdatePartnerResultsResponseArray_items_inner> new_list;
			UpdatePartnerResultsResponseArray_items_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("UpdatePartnerResultsResponseArray_items_inner")) {
					jsonToValue(&inst, temp_json, "UpdatePartnerResultsResponseArray_items_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			items = new_list;
		}
		
	}
}

UpdatePartnerResultsResponseArray::UpdatePartnerResultsResponseArray(char* json)
{
	this->fromJson(json);
}

char*
UpdatePartnerResultsResponseArray::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("UpdatePartnerResultsResponseArray_items_inner")) {
		list<UpdatePartnerResultsResponseArray_items_inner> new_list = static_cast<list <UpdatePartnerResultsResponseArray_items_inner> > (getItems());
		node = converttoJson(&new_list, "UpdatePartnerResultsResponseArray_items_inner", "array");
	} else {
		node = json_node_alloc();
		list<UpdatePartnerResultsResponseArray_items_inner> new_list = static_cast<list <UpdatePartnerResultsResponseArray_items_inner> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<UpdatePartnerResultsResponseArray_items_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			UpdatePartnerResultsResponseArray_items_inner obj = *it;
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

std::list<UpdatePartnerResultsResponseArray_items_inner>
UpdatePartnerResultsResponseArray::getItems()
{
	return items;
}

void
UpdatePartnerResultsResponseArray::setItems(std::list <UpdatePartnerResultsResponseArray_items_inner> items)
{
	this->items = items;
}


