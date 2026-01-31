#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignIdFilter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignIdFilter::CampaignIdFilter()
{
	//__init();
}

CampaignIdFilter::~CampaignIdFilter()
{
	//__cleanup();
}

void
CampaignIdFilter::__init()
{
	//new std::list()std::list> campaign_ids;
}

void
CampaignIdFilter::__cleanup()
{
	//if(campaign_ids != NULL) {
	//campaign_ids.RemoveAll(true);
	//delete campaign_ids;
	//campaign_ids = NULL;
	//}
	//
}

void
CampaignIdFilter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *campaign_idsKey = "campaign_ids";
	node = json_object_get_member(pJsonObject, campaign_idsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			campaign_ids = new_list;
		}
		
	}
}

CampaignIdFilter::CampaignIdFilter(char* json)
{
	this->fromJson(json);
}

char*
CampaignIdFilter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getCampaignIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCampaignIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *campaign_idsKey = "campaign_ids";
	json_object_set_member(pJsonObject, campaign_idsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
CampaignIdFilter::getCampaignIds()
{
	return campaign_ids;
}

void
CampaignIdFilter::setCampaignIds(std::list <std::string> campaign_ids)
{
	this->campaign_ids = campaign_ids;
}


