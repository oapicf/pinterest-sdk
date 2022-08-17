#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdGroupCreateRequest_allOf.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdGroupCreateRequest_allOf::AdGroupCreateRequest_allOf()
{
	//__init();
}

AdGroupCreateRequest_allOf::~AdGroupCreateRequest_allOf()
{
	//__cleanup();
}

void
AdGroupCreateRequest_allOf::__init()
{
	//targeting_spec = null;
}

void
AdGroupCreateRequest_allOf::__cleanup()
{
	//if(targeting_spec != NULL) {
	//
	//delete targeting_spec;
	//targeting_spec = NULL;
	//}
	//
}

void
AdGroupCreateRequest_allOf::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *targeting_specKey = "targeting_spec";
	node = json_object_get_member(pJsonObject, targeting_specKey);
	if (node !=NULL) {
	

		if (isprimitive("TargetingSpec")) {
			jsonToValue(&targeting_spec, node, "TargetingSpec", "TargetingSpec");
		} else {
			
			TargetingSpec* obj = static_cast<TargetingSpec*> (&targeting_spec);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AdGroupCreateRequest_allOf::AdGroupCreateRequest_allOf(char* json)
{
	this->fromJson(json);
}

char*
AdGroupCreateRequest_allOf::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("TargetingSpec")) {
		TargetingSpec obj = getTargetingSpec();
		node = converttoJson(&obj, "TargetingSpec", "");
	}
	else {
		
		TargetingSpec obj = static_cast<TargetingSpec> (getTargetingSpec());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *targeting_specKey = "targeting_spec";
	json_object_set_member(pJsonObject, targeting_specKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

TargetingSpec
AdGroupCreateRequest_allOf::getTargetingSpec()
{
	return targeting_spec;
}

void
AdGroupCreateRequest_allOf::setTargetingSpec(TargetingSpec  targeting_spec)
{
	this->targeting_spec = targeting_spec;
}


