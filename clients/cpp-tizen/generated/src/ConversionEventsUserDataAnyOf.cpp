#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionEventsUserData_anyOf.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionEventsUserData_anyOf::ConversionEventsUserData_anyOf()
{
	//__init();
}

ConversionEventsUserData_anyOf::~ConversionEventsUserData_anyOf()
{
	//__cleanup();
}

void
ConversionEventsUserData_anyOf::__init()
{
	//new std::list()std::list> em;
}

void
ConversionEventsUserData_anyOf::__cleanup()
{
	//if(em != NULL) {
	//em.RemoveAll(true);
	//delete em;
	//em = NULL;
	//}
	//
}

void
ConversionEventsUserData_anyOf::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *emKey = "em";
	node = json_object_get_member(pJsonObject, emKey);
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
			em = new_list;
		}
		
	}
}

ConversionEventsUserData_anyOf::ConversionEventsUserData_anyOf(char* json)
{
	this->fromJson(json);
}

char*
ConversionEventsUserData_anyOf::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getEm());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getEm());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *emKey = "em";
	json_object_set_member(pJsonObject, emKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
ConversionEventsUserData_anyOf::getEm()
{
	return em;
}

void
ConversionEventsUserData_anyOf::setEm(std::list <std::string> em)
{
	this->em = em;
}


