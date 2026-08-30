#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignPlanningResponseErrorCode.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignPlanningResponseErrorCode::CampaignPlanningResponseErrorCode()
{
	//__init();
}

CampaignPlanningResponseErrorCode::~CampaignPlanningResponseErrorCode()
{
	//__cleanup();
}

void
CampaignPlanningResponseErrorCode::__init()
{
}

void
CampaignPlanningResponseErrorCode::__cleanup()
{
	//
}

void
CampaignPlanningResponseErrorCode::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

CampaignPlanningResponseErrorCode::CampaignPlanningResponseErrorCode(char* json)
{
	this->fromJson(json);
}

char*
CampaignPlanningResponseErrorCode::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}


