#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignDeliveryEstimatesResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignDeliveryEstimatesResponse::CampaignDeliveryEstimatesResponse()
{
	//__init();
}

CampaignDeliveryEstimatesResponse::~CampaignDeliveryEstimatesResponse()
{
	//__cleanup();
}

void
CampaignDeliveryEstimatesResponse::__init()
{
	//new std::list()std::list> curves;
	//derived_metrics = new CampaignDeliveryEstimatesDerivedMetrics();
	//max_potential_spend = int(0);
}

void
CampaignDeliveryEstimatesResponse::__cleanup()
{
	//if(curves != NULL) {
	//curves.RemoveAll(true);
	//delete curves;
	//curves = NULL;
	//}
	//if(derived_metrics != NULL) {
	//
	//delete derived_metrics;
	//derived_metrics = NULL;
	//}
	//if(max_potential_spend != NULL) {
	//
	//delete max_potential_spend;
	//max_potential_spend = NULL;
	//}
	//
}

void
CampaignDeliveryEstimatesResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *curvesKey = "curves";
	node = json_object_get_member(pJsonObject, curvesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CampaignPlanningCurveEstimate> new_list;
			CampaignPlanningCurveEstimate inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CampaignPlanningCurveEstimate")) {
					jsonToValue(&inst, temp_json, "CampaignPlanningCurveEstimate", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			curves = new_list;
		}
		
	}
	const gchar *derived_metricsKey = "derived_metrics";
	node = json_object_get_member(pJsonObject, derived_metricsKey);
	if (node !=NULL) {
	

		if (isprimitive("CampaignDeliveryEstimatesDerivedMetrics")) {
			jsonToValue(&derived_metrics, node, "CampaignDeliveryEstimatesDerivedMetrics", "CampaignDeliveryEstimatesDerivedMetrics");
		} else {
			
			CampaignDeliveryEstimatesDerivedMetrics* obj = static_cast<CampaignDeliveryEstimatesDerivedMetrics*> (&derived_metrics);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *max_potential_spendKey = "max_potential_spend";
	node = json_object_get_member(pJsonObject, max_potential_spendKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&max_potential_spend, node, "int", "");
		} else {
			
		}
	}
}

CampaignDeliveryEstimatesResponse::CampaignDeliveryEstimatesResponse(char* json)
{
	this->fromJson(json);
}

char*
CampaignDeliveryEstimatesResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CampaignPlanningCurveEstimate")) {
		list<CampaignPlanningCurveEstimate> new_list = static_cast<list <CampaignPlanningCurveEstimate> > (getCurves());
		node = converttoJson(&new_list, "CampaignPlanningCurveEstimate", "array");
	} else {
		node = json_node_alloc();
		list<CampaignPlanningCurveEstimate> new_list = static_cast<list <CampaignPlanningCurveEstimate> > (getCurves());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CampaignPlanningCurveEstimate>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CampaignPlanningCurveEstimate obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *curvesKey = "curves";
	json_object_set_member(pJsonObject, curvesKey, node);
	if (isprimitive("CampaignDeliveryEstimatesDerivedMetrics")) {
		CampaignDeliveryEstimatesDerivedMetrics obj = getDerivedMetrics();
		node = converttoJson(&obj, "CampaignDeliveryEstimatesDerivedMetrics", "");
	}
	else {
		
		CampaignDeliveryEstimatesDerivedMetrics obj = static_cast<CampaignDeliveryEstimatesDerivedMetrics> (getDerivedMetrics());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *derived_metricsKey = "derived_metrics";
	json_object_set_member(pJsonObject, derived_metricsKey, node);
	if (isprimitive("int")) {
		int obj = getMaxPotentialSpend();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *max_potential_spendKey = "max_potential_spend";
	json_object_set_member(pJsonObject, max_potential_spendKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<CampaignPlanningCurveEstimate>
CampaignDeliveryEstimatesResponse::getCurves()
{
	return curves;
}

void
CampaignDeliveryEstimatesResponse::setCurves(std::list <CampaignPlanningCurveEstimate> curves)
{
	this->curves = curves;
}

CampaignDeliveryEstimatesDerivedMetrics
CampaignDeliveryEstimatesResponse::getDerivedMetrics()
{
	return derived_metrics;
}

void
CampaignDeliveryEstimatesResponse::setDerivedMetrics(CampaignDeliveryEstimatesDerivedMetrics  derived_metrics)
{
	this->derived_metrics = derived_metrics;
}

int
CampaignDeliveryEstimatesResponse::getMaxPotentialSpend()
{
	return max_potential_spend;
}

void
CampaignDeliveryEstimatesResponse::setMaxPotentialSpend(int  max_potential_spend)
{
	this->max_potential_spend = max_potential_spend;
}


