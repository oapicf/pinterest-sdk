#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DeleteMemberAccessResultsResponseArray.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DeleteMemberAccessResultsResponseArray::DeleteMemberAccessResultsResponseArray()
{
	//__init();
}

DeleteMemberAccessResultsResponseArray::~DeleteMemberAccessResultsResponseArray()
{
	//__cleanup();
}

void
DeleteMemberAccessResultsResponseArray::__init()
{
	//new std::list()std::list> items;
}

void
DeleteMemberAccessResultsResponseArray::__cleanup()
{
	//if(items != NULL) {
	//items.RemoveAll(true);
	//delete items;
	//items = NULL;
	//}
	//
}

void
DeleteMemberAccessResultsResponseArray::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<DeleteMemberAccessResult> new_list;
			DeleteMemberAccessResult inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("DeleteMemberAccessResult")) {
					jsonToValue(&inst, temp_json, "DeleteMemberAccessResult", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			items = new_list;
		}
		
	}
}

DeleteMemberAccessResultsResponseArray::DeleteMemberAccessResultsResponseArray(char* json)
{
	this->fromJson(json);
}

char*
DeleteMemberAccessResultsResponseArray::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("DeleteMemberAccessResult")) {
		list<DeleteMemberAccessResult> new_list = static_cast<list <DeleteMemberAccessResult> > (getItems());
		node = converttoJson(&new_list, "DeleteMemberAccessResult", "array");
	} else {
		node = json_node_alloc();
		list<DeleteMemberAccessResult> new_list = static_cast<list <DeleteMemberAccessResult> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<DeleteMemberAccessResult>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			DeleteMemberAccessResult obj = *it;
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

std::list<DeleteMemberAccessResult>
DeleteMemberAccessResultsResponseArray::getItems()
{
	return items;
}

void
DeleteMemberAccessResultsResponseArray::setItems(std::list <DeleteMemberAccessResult> items)
{
	this->items = items;
}


