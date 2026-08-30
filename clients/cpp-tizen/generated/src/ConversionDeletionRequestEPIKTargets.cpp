#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionDeletionRequestEPIKTargets.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionDeletionRequestEPIKTargets::ConversionDeletionRequestEPIKTargets()
{
	//__init();
}

ConversionDeletionRequestEPIKTargets::~ConversionDeletionRequestEPIKTargets()
{
	//__cleanup();
}

void
ConversionDeletionRequestEPIKTargets::__init()
{
	//new std::list()std::list> epiks;
}

void
ConversionDeletionRequestEPIKTargets::__cleanup()
{
	//if(epiks != NULL) {
	//epiks.RemoveAll(true);
	//delete epiks;
	//epiks = NULL;
	//}
	//
}

void
ConversionDeletionRequestEPIKTargets::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *epiksKey = "epiks";
	node = json_object_get_member(pJsonObject, epiksKey);
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
			epiks = new_list;
		}
		
	}
}

ConversionDeletionRequestEPIKTargets::ConversionDeletionRequestEPIKTargets(char* json)
{
	this->fromJson(json);
}

char*
ConversionDeletionRequestEPIKTargets::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getEpiks());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getEpiks());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *epiksKey = "epiks";
	json_object_set_member(pJsonObject, epiksKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
ConversionDeletionRequestEPIKTargets::getEpiks()
{
	return epiks;
}

void
ConversionDeletionRequestEPIKTargets::setEpiks(std::list <std::string> epiks)
{
	this->epiks = epiks;
}


