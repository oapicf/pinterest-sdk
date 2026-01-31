#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignObjectivesFilter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignObjectivesFilter::CampaignObjectivesFilter()
{
	//__init();
}

CampaignObjectivesFilter::~CampaignObjectivesFilter()
{
	//__cleanup();
}

void
CampaignObjectivesFilter::__init()
{
	//new std::list()std::list> campaign_objective_types;
}

void
CampaignObjectivesFilter::__cleanup()
{
	//if(campaign_objective_types != NULL) {
	//campaign_objective_types.RemoveAll(true);
	//delete campaign_objective_types;
	//campaign_objective_types = NULL;
	//}
	//
}

void
CampaignObjectivesFilter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *campaign_objective_typesKey = "campaign_objective_types";
	node = json_object_get_member(pJsonObject, campaign_objective_typesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ObjectiveType> new_list;
			ObjectiveType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ObjectiveType")) {
					jsonToValue(&inst, temp_json, "ObjectiveType", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			campaign_objective_types = new_list;
		}
		
	}
}

CampaignObjectivesFilter::CampaignObjectivesFilter(char* json)
{
	this->fromJson(json);
}

char*
CampaignObjectivesFilter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ObjectiveType")) {
		list<ObjectiveType> new_list = static_cast<list <ObjectiveType> > (getCampaignObjectiveTypes());
		node = converttoJson(&new_list, "ObjectiveType", "array");
	} else {
		node = json_node_alloc();
		list<ObjectiveType> new_list = static_cast<list <ObjectiveType> > (getCampaignObjectiveTypes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ObjectiveType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ObjectiveType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *campaign_objective_typesKey = "campaign_objective_types";
	json_object_set_member(pJsonObject, campaign_objective_typesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<ObjectiveType>
CampaignObjectivesFilter::getCampaignObjectiveTypes()
{
	return campaign_objective_types;
}

void
CampaignObjectivesFilter::setCampaignObjectiveTypes(std::list <ObjectiveType> campaign_objective_types)
{
	this->campaign_objective_types = campaign_objective_types;
}


