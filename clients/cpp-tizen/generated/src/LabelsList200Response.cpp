#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Labels_list_200_response.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Labels_list_200_response::Labels_list_200_response()
{
	//__init();
}

Labels_list_200_response::~Labels_list_200_response()
{
	//__cleanup();
}

void
Labels_list_200_response::__init()
{
	//bookmark = std::string();
	//new std::list()std::list> items;
}

void
Labels_list_200_response::__cleanup()
{
	//if(bookmark != NULL) {
	//
	//delete bookmark;
	//bookmark = NULL;
	//}
	//if(items != NULL) {
	//items.RemoveAll(true);
	//delete items;
	//items = NULL;
	//}
	//
}

void
Labels_list_200_response::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *bookmarkKey = "bookmark";
	node = json_object_get_member(pJsonObject, bookmarkKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&bookmark, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Label> new_list;
			Label inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Label")) {
					jsonToValue(&inst, temp_json, "Label", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			items = new_list;
		}
		
	}
}

Labels_list_200_response::Labels_list_200_response(char* json)
{
	this->fromJson(json);
}

char*
Labels_list_200_response::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getBookmark();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *bookmarkKey = "bookmark";
	json_object_set_member(pJsonObject, bookmarkKey, node);
	if (isprimitive("Label")) {
		list<Label> new_list = static_cast<list <Label> > (getItems());
		node = converttoJson(&new_list, "Label", "array");
	} else {
		node = json_node_alloc();
		list<Label> new_list = static_cast<list <Label> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Label>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Label obj = *it;
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
Labels_list_200_response::getBookmark()
{
	return bookmark;
}

void
Labels_list_200_response::setBookmark(std::string  bookmark)
{
	this->bookmark = bookmark;
}

std::list<Label>
Labels_list_200_response::getItems()
{
	return items;
}

void
Labels_list_200_response::setItems(std::list <Label> items)
{
	this->items = items;
}


