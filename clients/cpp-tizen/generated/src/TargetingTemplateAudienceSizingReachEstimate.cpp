#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TargetingTemplateAudienceSizingReachEstimate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TargetingTemplateAudienceSizingReachEstimate::TargetingTemplateAudienceSizingReachEstimate()
{
	//__init();
}

TargetingTemplateAudienceSizingReachEstimate::~TargetingTemplateAudienceSizingReachEstimate()
{
	//__cleanup();
}

void
TargetingTemplateAudienceSizingReachEstimate::__init()
{
	//estimate = long(0);
	//lower_bound = long(0);
	//upper_bound = long(0);
}

void
TargetingTemplateAudienceSizingReachEstimate::__cleanup()
{
	//if(estimate != NULL) {
	//
	//delete estimate;
	//estimate = NULL;
	//}
	//if(lower_bound != NULL) {
	//
	//delete lower_bound;
	//lower_bound = NULL;
	//}
	//if(upper_bound != NULL) {
	//
	//delete upper_bound;
	//upper_bound = NULL;
	//}
	//
}

void
TargetingTemplateAudienceSizingReachEstimate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *estimateKey = "estimate";
	node = json_object_get_member(pJsonObject, estimateKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&estimate, node, "long long", "");
		} else {
			
		}
	}
	const gchar *lower_boundKey = "lower_bound";
	node = json_object_get_member(pJsonObject, lower_boundKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&lower_bound, node, "long long", "");
		} else {
			
		}
	}
	const gchar *upper_boundKey = "upper_bound";
	node = json_object_get_member(pJsonObject, upper_boundKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&upper_bound, node, "long long", "");
		} else {
			
		}
	}
}

TargetingTemplateAudienceSizingReachEstimate::TargetingTemplateAudienceSizingReachEstimate(char* json)
{
	this->fromJson(json);
}

char*
TargetingTemplateAudienceSizingReachEstimate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getEstimate();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *estimateKey = "estimate";
	json_object_set_member(pJsonObject, estimateKey, node);
	if (isprimitive("long long")) {
		long long obj = getLowerBound();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *lower_boundKey = "lower_bound";
	json_object_set_member(pJsonObject, lower_boundKey, node);
	if (isprimitive("long long")) {
		long long obj = getUpperBound();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *upper_boundKey = "upper_bound";
	json_object_set_member(pJsonObject, upper_boundKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
TargetingTemplateAudienceSizingReachEstimate::getEstimate()
{
	return estimate;
}

void
TargetingTemplateAudienceSizingReachEstimate::setEstimate(long long  estimate)
{
	this->estimate = estimate;
}

long long
TargetingTemplateAudienceSizingReachEstimate::getLowerBound()
{
	return lower_bound;
}

void
TargetingTemplateAudienceSizingReachEstimate::setLowerBound(long long  lower_bound)
{
	this->lower_bound = lower_bound;
}

long long
TargetingTemplateAudienceSizingReachEstimate::getUpperBound()
{
	return upper_bound;
}

void
TargetingTemplateAudienceSizingReachEstimate::setUpperBound(long long  upper_bound)
{
	this->upper_bound = upper_bound;
}


