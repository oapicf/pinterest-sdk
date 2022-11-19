#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionEventsUserData_anyOf_1.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionEventsUserData_anyOf_1::ConversionEventsUserData_anyOf_1()
{
	//__init();
}

ConversionEventsUserData_anyOf_1::~ConversionEventsUserData_anyOf_1()
{
	//__cleanup();
}

void
ConversionEventsUserData_anyOf_1::__init()
{
	//new std::list()std::list> hashed_maids;
}

void
ConversionEventsUserData_anyOf_1::__cleanup()
{
	//if(hashed_maids != NULL) {
	//hashed_maids.RemoveAll(true);
	//delete hashed_maids;
	//hashed_maids = NULL;
	//}
	//
}

void
ConversionEventsUserData_anyOf_1::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *hashed_maidsKey = "hashed_maids";
	node = json_object_get_member(pJsonObject, hashed_maidsKey);
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
			hashed_maids = new_list;
		}
		
	}
}

ConversionEventsUserData_anyOf_1::ConversionEventsUserData_anyOf_1(char* json)
{
	this->fromJson(json);
}

char*
ConversionEventsUserData_anyOf_1::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getHashedMaids());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getHashedMaids());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *hashed_maidsKey = "hashed_maids";
	json_object_set_member(pJsonObject, hashed_maidsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
ConversionEventsUserData_anyOf_1::getHashedMaids()
{
	return hashed_maids;
}

void
ConversionEventsUserData_anyOf_1::setHashedMaids(std::list <std::string> hashed_maids)
{
	this->hashed_maids = hashed_maids;
}


