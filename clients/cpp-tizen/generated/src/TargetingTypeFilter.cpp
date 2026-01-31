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
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
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
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getTargetingTypes());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getTargetingTypes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
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

std::list<std::string>
TargetingTypeFilter::getTargetingTypes()
{
	return targeting_types;
}

void
TargetingTypeFilter::setTargetingTypes(std::list <std::string> targeting_types)
{
	this->targeting_types = targeting_types;
}


