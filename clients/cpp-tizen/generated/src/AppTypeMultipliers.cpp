#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AppTypeMultipliers.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AppTypeMultipliers::AppTypeMultipliers()
{
	//__init();
}

AppTypeMultipliers::~AppTypeMultipliers()
{
	//__cleanup();
}

void
AppTypeMultipliers::__init()
{
	//aPP_TYPE = std::string();
}

void
AppTypeMultipliers::__cleanup()
{
	//if(aPP_TYPE != NULL) {
	//
	//delete aPP_TYPE;
	//aPP_TYPE = NULL;
	//}
	//
}

void
AppTypeMultipliers::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *aPP_TYPEKey = "APP_TYPE";
	node = json_object_get_member(pJsonObject, aPP_TYPEKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&aPP_TYPE, node, "std::string", "");
		} else {
			
		}
	}
}

AppTypeMultipliers::AppTypeMultipliers(char* json)
{
	this->fromJson(json);
}

char*
AppTypeMultipliers::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAPPTYPE();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *aPP_TYPEKey = "APP_TYPE";
	json_object_set_member(pJsonObject, aPP_TYPEKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AppTypeMultipliers::getAPPTYPE()
{
	return aPP_TYPE;
}

void
AppTypeMultipliers::setAPPTYPE(std::string  aPP_TYPE)
{
	this->aPP_TYPE = aPP_TYPE;
}


