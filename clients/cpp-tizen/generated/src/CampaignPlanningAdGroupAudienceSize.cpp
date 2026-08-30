#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignPlanningAdGroupAudienceSize.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignPlanningAdGroupAudienceSize::CampaignPlanningAdGroupAudienceSize()
{
	//__init();
}

CampaignPlanningAdGroupAudienceSize::~CampaignPlanningAdGroupAudienceSize()
{
	//__cleanup();
}

void
CampaignPlanningAdGroupAudienceSize::__init()
{
	//count_lower = int(0);
	//count_upper = int(0);
}

void
CampaignPlanningAdGroupAudienceSize::__cleanup()
{
	//if(count_lower != NULL) {
	//
	//delete count_lower;
	//count_lower = NULL;
	//}
	//if(count_upper != NULL) {
	//
	//delete count_upper;
	//count_upper = NULL;
	//}
	//
}

void
CampaignPlanningAdGroupAudienceSize::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *count_lowerKey = "count_lower";
	node = json_object_get_member(pJsonObject, count_lowerKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&count_lower, node, "int", "");
		} else {
			
		}
	}
	const gchar *count_upperKey = "count_upper";
	node = json_object_get_member(pJsonObject, count_upperKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&count_upper, node, "int", "");
		} else {
			
		}
	}
}

CampaignPlanningAdGroupAudienceSize::CampaignPlanningAdGroupAudienceSize(char* json)
{
	this->fromJson(json);
}

char*
CampaignPlanningAdGroupAudienceSize::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getCountLower();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *count_lowerKey = "count_lower";
	json_object_set_member(pJsonObject, count_lowerKey, node);
	if (isprimitive("int")) {
		int obj = getCountUpper();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *count_upperKey = "count_upper";
	json_object_set_member(pJsonObject, count_upperKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
CampaignPlanningAdGroupAudienceSize::getCountLower()
{
	return count_lower;
}

void
CampaignPlanningAdGroupAudienceSize::setCountLower(int  count_lower)
{
	this->count_lower = count_lower;
}

int
CampaignPlanningAdGroupAudienceSize::getCountUpper()
{
	return count_upper;
}

void
CampaignPlanningAdGroupAudienceSize::setCountUpper(int  count_upper)
{
	this->count_upper = count_upper;
}


