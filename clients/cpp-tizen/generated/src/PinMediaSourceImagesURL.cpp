#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PinMediaSourceImagesURL.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PinMediaSourceImagesURL::PinMediaSourceImagesURL()
{
	//__init();
}

PinMediaSourceImagesURL::~PinMediaSourceImagesURL()
{
	//__cleanup();
}

void
PinMediaSourceImagesURL::__init()
{
	//source_type = std::string();
	//new std::list()std::list> items;
	//index = int(0);
}

void
PinMediaSourceImagesURL::__cleanup()
{
	//if(source_type != NULL) {
	//
	//delete source_type;
	//source_type = NULL;
	//}
	//if(items != NULL) {
	//items.RemoveAll(true);
	//delete items;
	//items = NULL;
	//}
	//if(index != NULL) {
	//
	//delete index;
	//index = NULL;
	//}
	//
}

void
PinMediaSourceImagesURL::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *source_typeKey = "source_type";
	node = json_object_get_member(pJsonObject, source_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&source_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PinMediaSourceImagesURL_items_inner> new_list;
			PinMediaSourceImagesURL_items_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PinMediaSourceImagesURL_items_inner")) {
					jsonToValue(&inst, temp_json, "PinMediaSourceImagesURL_items_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			items = new_list;
		}
		
	}
	const gchar *indexKey = "index";
	node = json_object_get_member(pJsonObject, indexKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&index, node, "int", "");
		} else {
			
		}
	}
}

PinMediaSourceImagesURL::PinMediaSourceImagesURL(char* json)
{
	this->fromJson(json);
}

char*
PinMediaSourceImagesURL::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getSourceType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *source_typeKey = "source_type";
	json_object_set_member(pJsonObject, source_typeKey, node);
	if (isprimitive("PinMediaSourceImagesURL_items_inner")) {
		list<PinMediaSourceImagesURL_items_inner> new_list = static_cast<list <PinMediaSourceImagesURL_items_inner> > (getItems());
		node = converttoJson(&new_list, "PinMediaSourceImagesURL_items_inner", "array");
	} else {
		node = json_node_alloc();
		list<PinMediaSourceImagesURL_items_inner> new_list = static_cast<list <PinMediaSourceImagesURL_items_inner> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PinMediaSourceImagesURL_items_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PinMediaSourceImagesURL_items_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *itemsKey = "items";
	json_object_set_member(pJsonObject, itemsKey, node);
	if (isprimitive("int")) {
		int obj = getIndex();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *indexKey = "index";
	json_object_set_member(pJsonObject, indexKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
PinMediaSourceImagesURL::getSourceType()
{
	return source_type;
}

void
PinMediaSourceImagesURL::setSourceType(std::string  source_type)
{
	this->source_type = source_type;
}

std::list<PinMediaSourceImagesURL_items_inner>
PinMediaSourceImagesURL::getItems()
{
	return items;
}

void
PinMediaSourceImagesURL::setItems(std::list <PinMediaSourceImagesURL_items_inner> items)
{
	this->items = items;
}

int
PinMediaSourceImagesURL::getIndex()
{
	return index;
}

void
PinMediaSourceImagesURL::setIndex(int  index)
{
	this->index = index;
}


