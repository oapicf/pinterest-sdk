#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignAdPreviewCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignAdPreviewCreate::CampaignAdPreviewCreate()
{
	//__init();
}

CampaignAdPreviewCreate::~CampaignAdPreviewCreate()
{
	//__cleanup();
}

void
CampaignAdPreviewCreate::__init()
{
	//ad_group_id = std::string();
}

void
CampaignAdPreviewCreate::__cleanup()
{
	//if(ad_group_id != NULL) {
	//
	//delete ad_group_id;
	//ad_group_id = NULL;
	//}
	//
}

void
CampaignAdPreviewCreate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ad_group_idKey = "ad_group_id";
	node = json_object_get_member(pJsonObject, ad_group_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ad_group_id, node, "std::string", "");
		} else {
			
		}
	}
}

CampaignAdPreviewCreate::CampaignAdPreviewCreate(char* json)
{
	this->fromJson(json);
}

char*
CampaignAdPreviewCreate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAdGroupId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ad_group_idKey = "ad_group_id";
	json_object_set_member(pJsonObject, ad_group_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CampaignAdPreviewCreate::getAdGroupId()
{
	return ad_group_id;
}

void
CampaignAdPreviewCreate::setAdGroupId(std::string  ad_group_id)
{
	this->ad_group_id = ad_group_id;
}


