#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignPlanningExperimentBudgetRecommendation.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignPlanningExperimentBudgetRecommendation::CampaignPlanningExperimentBudgetRecommendation()
{
	//__init();
}

CampaignPlanningExperimentBudgetRecommendation::~CampaignPlanningExperimentBudgetRecommendation()
{
	//__cleanup();
}

void
CampaignPlanningExperimentBudgetRecommendation::__init()
{
	//budget_recommendation = int(0);
	//lifetime_days_recommendation = int(0);
	//new std::list()std::list> point_estimations;
	//version_id = std::string();
}

void
CampaignPlanningExperimentBudgetRecommendation::__cleanup()
{
	//if(budget_recommendation != NULL) {
	//
	//delete budget_recommendation;
	//budget_recommendation = NULL;
	//}
	//if(lifetime_days_recommendation != NULL) {
	//
	//delete lifetime_days_recommendation;
	//lifetime_days_recommendation = NULL;
	//}
	//if(point_estimations != NULL) {
	//point_estimations.RemoveAll(true);
	//delete point_estimations;
	//point_estimations = NULL;
	//}
	//if(version_id != NULL) {
	//
	//delete version_id;
	//version_id = NULL;
	//}
	//
}

void
CampaignPlanningExperimentBudgetRecommendation::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *budget_recommendationKey = "budget_recommendation";
	node = json_object_get_member(pJsonObject, budget_recommendationKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&budget_recommendation, node, "int", "");
		} else {
			
		}
	}
	const gchar *lifetime_days_recommendationKey = "lifetime_days_recommendation";
	node = json_object_get_member(pJsonObject, lifetime_days_recommendationKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&lifetime_days_recommendation, node, "int", "");
		} else {
			
		}
	}
	const gchar *point_estimationsKey = "point_estimations";
	node = json_object_get_member(pJsonObject, point_estimationsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CampaignPlanningBudgetRecommendationPoint> new_list;
			CampaignPlanningBudgetRecommendationPoint inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CampaignPlanningBudgetRecommendationPoint")) {
					jsonToValue(&inst, temp_json, "CampaignPlanningBudgetRecommendationPoint", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			point_estimations = new_list;
		}
		
	}
	const gchar *version_idKey = "version_id";
	node = json_object_get_member(pJsonObject, version_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&version_id, node, "std::string", "");
		} else {
			
		}
	}
}

CampaignPlanningExperimentBudgetRecommendation::CampaignPlanningExperimentBudgetRecommendation(char* json)
{
	this->fromJson(json);
}

char*
CampaignPlanningExperimentBudgetRecommendation::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getBudgetRecommendation();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *budget_recommendationKey = "budget_recommendation";
	json_object_set_member(pJsonObject, budget_recommendationKey, node);
	if (isprimitive("int")) {
		int obj = getLifetimeDaysRecommendation();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *lifetime_days_recommendationKey = "lifetime_days_recommendation";
	json_object_set_member(pJsonObject, lifetime_days_recommendationKey, node);
	if (isprimitive("CampaignPlanningBudgetRecommendationPoint")) {
		list<CampaignPlanningBudgetRecommendationPoint> new_list = static_cast<list <CampaignPlanningBudgetRecommendationPoint> > (getPointEstimations());
		node = converttoJson(&new_list, "CampaignPlanningBudgetRecommendationPoint", "array");
	} else {
		node = json_node_alloc();
		list<CampaignPlanningBudgetRecommendationPoint> new_list = static_cast<list <CampaignPlanningBudgetRecommendationPoint> > (getPointEstimations());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CampaignPlanningBudgetRecommendationPoint>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CampaignPlanningBudgetRecommendationPoint obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *point_estimationsKey = "point_estimations";
	json_object_set_member(pJsonObject, point_estimationsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVersionId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *version_idKey = "version_id";
	json_object_set_member(pJsonObject, version_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
CampaignPlanningExperimentBudgetRecommendation::getBudgetRecommendation()
{
	return budget_recommendation;
}

void
CampaignPlanningExperimentBudgetRecommendation::setBudgetRecommendation(int  budget_recommendation)
{
	this->budget_recommendation = budget_recommendation;
}

int
CampaignPlanningExperimentBudgetRecommendation::getLifetimeDaysRecommendation()
{
	return lifetime_days_recommendation;
}

void
CampaignPlanningExperimentBudgetRecommendation::setLifetimeDaysRecommendation(int  lifetime_days_recommendation)
{
	this->lifetime_days_recommendation = lifetime_days_recommendation;
}

std::list<CampaignPlanningBudgetRecommendationPoint>
CampaignPlanningExperimentBudgetRecommendation::getPointEstimations()
{
	return point_estimations;
}

void
CampaignPlanningExperimentBudgetRecommendation::setPointEstimations(std::list <CampaignPlanningBudgetRecommendationPoint> point_estimations)
{
	this->point_estimations = point_estimations;
}

std::string
CampaignPlanningExperimentBudgetRecommendation::getVersionId()
{
	return version_id;
}

void
CampaignPlanningExperimentBudgetRecommendation::setVersionId(std::string  version_id)
{
	this->version_id = version_id;
}


