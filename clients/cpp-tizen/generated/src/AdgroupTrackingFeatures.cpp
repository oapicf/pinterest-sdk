#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdgroupTrackingFeatures.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdgroupTrackingFeatures::AdgroupTrackingFeatures()
{
	//__init();
}

AdgroupTrackingFeatures::~AdgroupTrackingFeatures()
{
	//__cleanup();
}

void
AdgroupTrackingFeatures::__init()
{
	//new std::list()std::list> enabled;
}

void
AdgroupTrackingFeatures::__cleanup()
{
	//if(enabled != NULL) {
	//enabled.RemoveAll(true);
	//delete enabled;
	//enabled = NULL;
	//}
	//
}

void
AdgroupTrackingFeatures::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *enabledKey = "enabled";
	node = json_object_get_member(pJsonObject, enabledKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AdgroupTrackingFeatureType> new_list;
			AdgroupTrackingFeatureType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AdgroupTrackingFeatureType")) {
					jsonToValue(&inst, temp_json, "AdgroupTrackingFeatureType", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			enabled = new_list;
		}
		
	}
}

AdgroupTrackingFeatures::AdgroupTrackingFeatures(char* json)
{
	this->fromJson(json);
}

char*
AdgroupTrackingFeatures::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AdgroupTrackingFeatureType")) {
		list<AdgroupTrackingFeatureType> new_list = static_cast<list <AdgroupTrackingFeatureType> > (getEnabled());
		node = converttoJson(&new_list, "AdgroupTrackingFeatureType", "array");
	} else {
		node = json_node_alloc();
		list<AdgroupTrackingFeatureType> new_list = static_cast<list <AdgroupTrackingFeatureType> > (getEnabled());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AdgroupTrackingFeatureType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AdgroupTrackingFeatureType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *enabledKey = "enabled";
	json_object_set_member(pJsonObject, enabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<AdgroupTrackingFeatureType>
AdgroupTrackingFeatures::getEnabled()
{
	return enabled;
}

void
AdgroupTrackingFeatures::setEnabled(std::list <AdgroupTrackingFeatureType> enabled)
{
	this->enabled = enabled;
}


