#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PinMediaWithVideos_allOf.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PinMediaWithVideos_allOf::PinMediaWithVideos_allOf()
{
	//__init();
}

PinMediaWithVideos_allOf::~PinMediaWithVideos_allOf()
{
	//__cleanup();
}

void
PinMediaWithVideos_allOf::__init()
{
	//new std::list()std::list> items;
}

void
PinMediaWithVideos_allOf::__cleanup()
{
	//if(items != NULL) {
	//items.RemoveAll(true);
	//delete items;
	//items = NULL;
	//}
	//
}

void
PinMediaWithVideos_allOf::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<VideoMetadata> new_list;
			VideoMetadata inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("VideoMetadata")) {
					jsonToValue(&inst, temp_json, "VideoMetadata", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			items = new_list;
		}
		
	}
}

PinMediaWithVideos_allOf::PinMediaWithVideos_allOf(char* json)
{
	this->fromJson(json);
}

char*
PinMediaWithVideos_allOf::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("VideoMetadata")) {
		list<VideoMetadata> new_list = static_cast<list <VideoMetadata> > (getItems());
		node = converttoJson(&new_list, "VideoMetadata", "array");
	} else {
		node = json_node_alloc();
		list<VideoMetadata> new_list = static_cast<list <VideoMetadata> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<VideoMetadata>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			VideoMetadata obj = *it;
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

std::list<VideoMetadata>
PinMediaWithVideos_allOf::getItems()
{
	return items;
}

void
PinMediaWithVideos_allOf::setItems(std::list <VideoMetadata> items)
{
	this->items = items;
}


