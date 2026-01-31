#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignAudienceMultipliers.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignAudienceMultipliers::CampaignAudienceMultipliers()
{
	//__init();
}

CampaignAudienceMultipliers::~CampaignAudienceMultipliers()
{
	//__cleanup();
}

void
CampaignAudienceMultipliers::__init()
{
	//aUDIENCE_ID = std::string();
}

void
CampaignAudienceMultipliers::__cleanup()
{
	//if(aUDIENCE_ID != NULL) {
	//
	//delete aUDIENCE_ID;
	//aUDIENCE_ID = NULL;
	//}
	//
}

void
CampaignAudienceMultipliers::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *aUDIENCE_IDKey = "AUDIENCE_ID";
	node = json_object_get_member(pJsonObject, aUDIENCE_IDKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&aUDIENCE_ID, node, "std::string", "");
		} else {
			
		}
	}
}

CampaignAudienceMultipliers::CampaignAudienceMultipliers(char* json)
{
	this->fromJson(json);
}

char*
CampaignAudienceMultipliers::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAUDIENCEID();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *aUDIENCE_IDKey = "AUDIENCE_ID";
	json_object_set_member(pJsonObject, aUDIENCE_IDKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CampaignAudienceMultipliers::getAUDIENCEID()
{
	return aUDIENCE_ID;
}

void
CampaignAudienceMultipliers::setAUDIENCEID(std::string  aUDIENCE_ID)
{
	this->aUDIENCE_ID = aUDIENCE_ID;
}


