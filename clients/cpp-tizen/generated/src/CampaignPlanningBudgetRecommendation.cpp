#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignPlanningBudgetRecommendation.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignPlanningBudgetRecommendation::CampaignPlanningBudgetRecommendation()
{
	//__init();
}

CampaignPlanningBudgetRecommendation::~CampaignPlanningBudgetRecommendation()
{
	//__cleanup();
}

void
CampaignPlanningBudgetRecommendation::__init()
{
	//budget_recommendation = int(0);
	//new std::list()std::list> experiment_campaign_budget_recommendation;
	//lifetime_days_recommendation = int(0);
	//new std::list()std::list> point_estimations;
}

void
CampaignPlanningBudgetRecommendation::__cleanup()
{
	//if(budget_recommendation != NULL) {
	//
	//delete budget_recommendation;
	//budget_recommendation = NULL;
	//}
	//if(experiment_campaign_budget_recommendation != NULL) {
	//experiment_campaign_budget_recommendation.RemoveAll(true);
	//delete experiment_campaign_budget_recommendation;
	//experiment_campaign_budget_recommendation = NULL;
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
	//
}

void
CampaignPlanningBudgetRecommendation::fromJson(char* jsonStr)
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
	const gchar *experiment_campaign_budget_recommendationKey = "experiment_campaign_budget_recommendation";
	node = json_object_get_member(pJsonObject, experiment_campaign_budget_recommendationKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CampaignPlanningExperimentBudgetRecommendation> new_list;
			CampaignPlanningExperimentBudgetRecommendation inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CampaignPlanningExperimentBudgetRecommendation")) {
					jsonToValue(&inst, temp_json, "CampaignPlanningExperimentBudgetRecommendation", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			experiment_campaign_budget_recommendation = new_list;
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
}

CampaignPlanningBudgetRecommendation::CampaignPlanningBudgetRecommendation(char* json)
{
	this->fromJson(json);
}

char*
CampaignPlanningBudgetRecommendation::toJson()
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
	if (isprimitive("CampaignPlanningExperimentBudgetRecommendation")) {
		list<CampaignPlanningExperimentBudgetRecommendation> new_list = static_cast<list <CampaignPlanningExperimentBudgetRecommendation> > (getExperimentCampaignBudgetRecommendation());
		node = converttoJson(&new_list, "CampaignPlanningExperimentBudgetRecommendation", "array");
	} else {
		node = json_node_alloc();
		list<CampaignPlanningExperimentBudgetRecommendation> new_list = static_cast<list <CampaignPlanningExperimentBudgetRecommendation> > (getExperimentCampaignBudgetRecommendation());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CampaignPlanningExperimentBudgetRecommendation>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CampaignPlanningExperimentBudgetRecommendation obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *experiment_campaign_budget_recommendationKey = "experiment_campaign_budget_recommendation";
	json_object_set_member(pJsonObject, experiment_campaign_budget_recommendationKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
CampaignPlanningBudgetRecommendation::getBudgetRecommendation()
{
	return budget_recommendation;
}

void
CampaignPlanningBudgetRecommendation::setBudgetRecommendation(int  budget_recommendation)
{
	this->budget_recommendation = budget_recommendation;
}

std::list<CampaignPlanningExperimentBudgetRecommendation>
CampaignPlanningBudgetRecommendation::getExperimentCampaignBudgetRecommendation()
{
	return experiment_campaign_budget_recommendation;
}

void
CampaignPlanningBudgetRecommendation::setExperimentCampaignBudgetRecommendation(std::list <CampaignPlanningExperimentBudgetRecommendation> experiment_campaign_budget_recommendation)
{
	this->experiment_campaign_budget_recommendation = experiment_campaign_budget_recommendation;
}

int
CampaignPlanningBudgetRecommendation::getLifetimeDaysRecommendation()
{
	return lifetime_days_recommendation;
}

void
CampaignPlanningBudgetRecommendation::setLifetimeDaysRecommendation(int  lifetime_days_recommendation)
{
	this->lifetime_days_recommendation = lifetime_days_recommendation;
}

std::list<CampaignPlanningBudgetRecommendationPoint>
CampaignPlanningBudgetRecommendation::getPointEstimations()
{
	return point_estimations;
}

void
CampaignPlanningBudgetRecommendation::setPointEstimations(std::list <CampaignPlanningBudgetRecommendationPoint> point_estimations)
{
	this->point_estimations = point_estimations;
}


