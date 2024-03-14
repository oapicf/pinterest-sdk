#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PinMediaWithImages.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PinMediaWithImages::PinMediaWithImages()
{
	//__init();
}

PinMediaWithImages::~PinMediaWithImages()
{
	//__cleanup();
}

void
PinMediaWithImages::__init()
{
	//media_type = std::string();
	//new std::list()std::list> items;
}

void
PinMediaWithImages::__cleanup()
{
	//if(media_type != NULL) {
	//
	//delete media_type;
	//media_type = NULL;
	//}
	//if(items != NULL) {
	//items.RemoveAll(true);
	//delete items;
	//items = NULL;
	//}
	//
}

void
PinMediaWithImages::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *media_typeKey = "media_type";
	node = json_object_get_member(pJsonObject, media_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&media_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ImageMetadata> new_list;
			ImageMetadata inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ImageMetadata")) {
					jsonToValue(&inst, temp_json, "ImageMetadata", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			items = new_list;
		}
		
	}
}

PinMediaWithImages::PinMediaWithImages(char* json)
{
	this->fromJson(json);
}

char*
PinMediaWithImages::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getMediaType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *media_typeKey = "media_type";
	json_object_set_member(pJsonObject, media_typeKey, node);
	if (isprimitive("ImageMetadata")) {
		list<ImageMetadata> new_list = static_cast<list <ImageMetadata> > (getItems());
		node = converttoJson(&new_list, "ImageMetadata", "array");
	} else {
		node = json_node_alloc();
		list<ImageMetadata> new_list = static_cast<list <ImageMetadata> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ImageMetadata>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ImageMetadata obj = *it;
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
PinMediaWithImages::getMediaType()
{
	return media_type;
}

void
PinMediaWithImages::setMediaType(std::string  media_type)
{
	this->media_type = media_type;
}

std::list<ImageMetadata>
PinMediaWithImages::getItems()
{
	return items;
}

void
PinMediaWithImages::setItems(std::list <ImageMetadata> items)
{
	this->items = items;
}


