#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TargetingTypeFilter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TargetingTypeFilter::TargetingTypeFilter()
{
	//__init();
}

TargetingTypeFilter::~TargetingTypeFilter()
{
	//__cleanup();
}

void
TargetingTypeFilter::__init()
{
	//new std::list()std::list> targeting_types;
}

void
TargetingTypeFilter::__cleanup()
{
	//if(targeting_types != NULL) {
	//targeting_types.RemoveAll(true);
	//delete targeting_types;
	//targeting_types = NULL;
	//}
	//
}

void
TargetingTypeFilter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *targeting_typesKey = "targeting_types";
	node = json_object_get_member(pJsonObject, targeting_typesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AdsAnalyticsTargetingType> new_list;
			AdsAnalyticsTargetingType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AdsAnalyticsTargetingType")) {
					jsonToValue(&inst, temp_json, "AdsAnalyticsTargetingType", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			targeting_types = new_list;
		}
		
	}
}

TargetingTypeFilter::TargetingTypeFilter(char* json)
{
	this->fromJson(json);
}

char*
TargetingTypeFilter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AdsAnalyticsTargetingType")) {
		list<AdsAnalyticsTargetingType> new_list = static_cast<list <AdsAnalyticsTargetingType> > (getTargetingTypes());
		node = converttoJson(&new_list, "AdsAnalyticsTargetingType", "array");
	} else {
		node = json_node_alloc();
		list<AdsAnalyticsTargetingType> new_list = static_cast<list <AdsAnalyticsTargetingType> > (getTargetingTypes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AdsAnalyticsTargetingType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AdsAnalyticsTargetingType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *targeting_typesKey = "targeting_types";
	json_object_set_member(pJsonObject, targeting_typesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<AdsAnalyticsTargetingType>
TargetingTypeFilter::getTargetingTypes()
{
	return targeting_types;
}

void
TargetingTypeFilter::setTargetingTypes(std::list <AdsAnalyticsTargetingType> targeting_types)
{
	this->targeting_types = targeting_types;
}


