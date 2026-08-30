#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TargetingSpecShoppingRetargeting.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TargetingSpecShoppingRetargeting::TargetingSpecShoppingRetargeting()
{
	//__init();
}

TargetingSpecShoppingRetargeting::~TargetingSpecShoppingRetargeting()
{
	//__cleanup();
}

void
TargetingSpecShoppingRetargeting::__init()
{
	//exclusion_window = int(0);
	//lookback_window = int(0);
	//new std::list()std::list> tag_types;
}

void
TargetingSpecShoppingRetargeting::__cleanup()
{
	//if(exclusion_window != NULL) {
	//
	//delete exclusion_window;
	//exclusion_window = NULL;
	//}
	//if(lookback_window != NULL) {
	//
	//delete lookback_window;
	//lookback_window = NULL;
	//}
	//if(tag_types != NULL) {
	//tag_types.RemoveAll(true);
	//delete tag_types;
	//tag_types = NULL;
	//}
	//
}

void
TargetingSpecShoppingRetargeting::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *exclusion_windowKey = "exclusion_window";
	node = json_object_get_member(pJsonObject, exclusion_windowKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&exclusion_window, node, "int", "");
		} else {
			
		}
	}
	const gchar *lookback_windowKey = "lookback_window";
	node = json_object_get_member(pJsonObject, lookback_windowKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&lookback_window, node, "int", "");
		} else {
			
		}
	}
	const gchar *tag_typesKey = "tag_types";
	node = json_object_get_member(pJsonObject, tag_typesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<int> new_list;
			int inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("int")) {
					jsonToValue(&inst, temp_json, "int", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			tag_types = new_list;
		}
		
	}
}

TargetingSpecShoppingRetargeting::TargetingSpecShoppingRetargeting(char* json)
{
	this->fromJson(json);
}

char*
TargetingSpecShoppingRetargeting::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getExclusionWindow();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *exclusion_windowKey = "exclusion_window";
	json_object_set_member(pJsonObject, exclusion_windowKey, node);
	if (isprimitive("int")) {
		int obj = getLookbackWindow();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *lookback_windowKey = "lookback_window";
	json_object_set_member(pJsonObject, lookback_windowKey, node);
	if (isprimitive("int")) {
		list<int> new_list = static_cast<list <int> > (getTagTypes());
		node = converttoJson(&new_list, "int", "array");
	} else {
		node = json_node_alloc();
		list<int> new_list = static_cast<list <int> > (getTagTypes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *tag_typesKey = "tag_types";
	json_object_set_member(pJsonObject, tag_typesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
TargetingSpecShoppingRetargeting::getExclusionWindow()
{
	return exclusion_window;
}

void
TargetingSpecShoppingRetargeting::setExclusionWindow(int  exclusion_window)
{
	this->exclusion_window = exclusion_window;
}

int
TargetingSpecShoppingRetargeting::getLookbackWindow()
{
	return lookback_window;
}

void
TargetingSpecShoppingRetargeting::setLookbackWindow(int  lookback_window)
{
	this->lookback_window = lookback_window;
}

std::list<int>
TargetingSpecShoppingRetargeting::getTagTypes()
{
	return tag_types;
}

void
TargetingSpecShoppingRetargeting::setTagTypes(std::list <int> tag_types)
{
	this->tag_types = tag_types;
}


