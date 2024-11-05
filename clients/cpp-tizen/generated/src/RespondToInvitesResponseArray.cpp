#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RespondToInvitesResponseArray.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RespondToInvitesResponseArray::RespondToInvitesResponseArray()
{
	//__init();
}

RespondToInvitesResponseArray::~RespondToInvitesResponseArray()
{
	//__cleanup();
}

void
RespondToInvitesResponseArray::__init()
{
	//new std::list()std::list> items;
}

void
RespondToInvitesResponseArray::__cleanup()
{
	//if(items != NULL) {
	//items.RemoveAll(true);
	//delete items;
	//items = NULL;
	//}
	//
}

void
RespondToInvitesResponseArray::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<RespondToInvitesResponseArray_items_inner> new_list;
			RespondToInvitesResponseArray_items_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("RespondToInvitesResponseArray_items_inner")) {
					jsonToValue(&inst, temp_json, "RespondToInvitesResponseArray_items_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			items = new_list;
		}
		
	}
}

RespondToInvitesResponseArray::RespondToInvitesResponseArray(char* json)
{
	this->fromJson(json);
}

char*
RespondToInvitesResponseArray::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("RespondToInvitesResponseArray_items_inner")) {
		list<RespondToInvitesResponseArray_items_inner> new_list = static_cast<list <RespondToInvitesResponseArray_items_inner> > (getItems());
		node = converttoJson(&new_list, "RespondToInvitesResponseArray_items_inner", "array");
	} else {
		node = json_node_alloc();
		list<RespondToInvitesResponseArray_items_inner> new_list = static_cast<list <RespondToInvitesResponseArray_items_inner> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<RespondToInvitesResponseArray_items_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			RespondToInvitesResponseArray_items_inner obj = *it;
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

std::list<RespondToInvitesResponseArray_items_inner>
RespondToInvitesResponseArray::getItems()
{
	return items;
}

void
RespondToInvitesResponseArray::setItems(std::list <RespondToInvitesResponseArray_items_inner> items)
{
	this->items = items;
}


