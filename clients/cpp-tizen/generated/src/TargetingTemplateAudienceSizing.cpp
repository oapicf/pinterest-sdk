#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TargetingTemplateAudienceSizing.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TargetingTemplateAudienceSizing::TargetingTemplateAudienceSizing()
{
	//__init();
}

TargetingTemplateAudienceSizing::~TargetingTemplateAudienceSizing()
{
	//__cleanup();
}

void
TargetingTemplateAudienceSizing::__init()
{
	//reach_estimate = new TargetingTemplateAudienceSizing_reach_estimate();
}

void
TargetingTemplateAudienceSizing::__cleanup()
{
	//if(reach_estimate != NULL) {
	//
	//delete reach_estimate;
	//reach_estimate = NULL;
	//}
	//
}

void
TargetingTemplateAudienceSizing::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *reach_estimateKey = "reach_estimate";
	node = json_object_get_member(pJsonObject, reach_estimateKey);
	if (node !=NULL) {
	

		if (isprimitive("TargetingTemplateAudienceSizing_reach_estimate")) {
			jsonToValue(&reach_estimate, node, "TargetingTemplateAudienceSizing_reach_estimate", "TargetingTemplateAudienceSizing_reach_estimate");
		} else {
			
			TargetingTemplateAudienceSizing_reach_estimate* obj = static_cast<TargetingTemplateAudienceSizing_reach_estimate*> (&reach_estimate);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

TargetingTemplateAudienceSizing::TargetingTemplateAudienceSizing(char* json)
{
	this->fromJson(json);
}

char*
TargetingTemplateAudienceSizing::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("TargetingTemplateAudienceSizing_reach_estimate")) {
		TargetingTemplateAudienceSizing_reach_estimate obj = getReachEstimate();
		node = converttoJson(&obj, "TargetingTemplateAudienceSizing_reach_estimate", "");
	}
	else {
		
		TargetingTemplateAudienceSizing_reach_estimate obj = static_cast<TargetingTemplateAudienceSizing_reach_estimate> (getReachEstimate());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *reach_estimateKey = "reach_estimate";
	json_object_set_member(pJsonObject, reach_estimateKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

TargetingTemplateAudienceSizing_reach_estimate
TargetingTemplateAudienceSizing::getReachEstimate()
{
	return reach_estimate;
}

void
TargetingTemplateAudienceSizing::setReachEstimate(TargetingTemplateAudienceSizing_reach_estimate  reach_estimate)
{
	this->reach_estimate = reach_estimate;
}


