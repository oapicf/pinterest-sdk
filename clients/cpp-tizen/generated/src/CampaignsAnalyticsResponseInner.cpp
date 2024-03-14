#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignsAnalyticsResponse_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignsAnalyticsResponse_inner::CampaignsAnalyticsResponse_inner()
{
	//__init();
}

CampaignsAnalyticsResponse_inner::~CampaignsAnalyticsResponse_inner()
{
	//__cleanup();
}

void
CampaignsAnalyticsResponse_inner::__init()
{
	//cAMPAIGN_ID = std::string();
	//dATE = null;
}

void
CampaignsAnalyticsResponse_inner::__cleanup()
{
	//if(cAMPAIGN_ID != NULL) {
	//
	//delete cAMPAIGN_ID;
	//cAMPAIGN_ID = NULL;
	//}
	//if(dATE != NULL) {
	//
	//delete dATE;
	//dATE = NULL;
	//}
	//
}

void
CampaignsAnalyticsResponse_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cAMPAIGN_IDKey = "CAMPAIGN_ID";
	node = json_object_get_member(pJsonObject, cAMPAIGN_IDKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&cAMPAIGN_ID, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *dATEKey = "DATE";
	node = json_object_get_member(pJsonObject, dATEKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&dATE, node, "Date", "Date");
		} else {
			
		}
	}
}

CampaignsAnalyticsResponse_inner::CampaignsAnalyticsResponse_inner(char* json)
{
	this->fromJson(json);
}

char*
CampaignsAnalyticsResponse_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getCAMPAIGNID();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *cAMPAIGN_IDKey = "CAMPAIGN_ID";
	json_object_set_member(pJsonObject, cAMPAIGN_IDKey, node);
	if (isprimitive("Date")) {
		Date obj = getDATE();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *dATEKey = "DATE";
	json_object_set_member(pJsonObject, dATEKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CampaignsAnalyticsResponse_inner::getCAMPAIGNID()
{
	return cAMPAIGN_ID;
}

void
CampaignsAnalyticsResponse_inner::setCAMPAIGNID(std::string  cAMPAIGN_ID)
{
	this->cAMPAIGN_ID = cAMPAIGN_ID;
}

Date
CampaignsAnalyticsResponse_inner::getDATE()
{
	return dATE;
}

void
CampaignsAnalyticsResponse_inner::setDATE(Date  dATE)
{
	this->dATE = dATE;
}


