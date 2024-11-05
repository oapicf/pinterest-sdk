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
	//aPP_TYPE = new TargetingSpecAppType();
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
	

		if (isprimitive("TargetingSpecAppType")) {
			jsonToValue(&aPP_TYPE, node, "TargetingSpecAppType", "TargetingSpecAppType");
		} else {
			
			TargetingSpecAppType* obj = static_cast<TargetingSpecAppType*> (&aPP_TYPE);
			obj->fromJson(json_to_string(node, false));
			
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
	if (isprimitive("TargetingSpecAppType")) {
		TargetingSpecAppType obj = getAPPTYPE();
		node = converttoJson(&obj, "TargetingSpecAppType", "");
	}
	else {
		
		TargetingSpecAppType obj = static_cast<TargetingSpecAppType> (getAPPTYPE());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
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

TargetingSpecAppType
AppTypeMultipliers::getAPPTYPE()
{
	return aPP_TYPE;
}

void
AppTypeMultipliers::setAPPTYPE(TargetingSpecAppType  aPP_TYPE)
{
	this->aPP_TYPE = aPP_TYPE;
}


