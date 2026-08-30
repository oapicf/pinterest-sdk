#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignPlanningBudgetRecommendationPoint.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignPlanningBudgetRecommendationPoint::CampaignPlanningBudgetRecommendationPoint()
{
	//__init();
}

CampaignPlanningBudgetRecommendationPoint::~CampaignPlanningBudgetRecommendationPoint()
{
	//__cleanup();
}

void
CampaignPlanningBudgetRecommendationPoint::__init()
{
	//estimation_type = null;
	//point_estimate = null;
}

void
CampaignPlanningBudgetRecommendationPoint::__cleanup()
{
	//if(estimation_type != NULL) {
	//
	//delete estimation_type;
	//estimation_type = NULL;
	//}
	//if(point_estimate != NULL) {
	//
	//delete point_estimate;
	//point_estimate = NULL;
	//}
	//
}

void
CampaignPlanningBudgetRecommendationPoint::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *estimation_typeKey = "estimation_type";
	node = json_object_get_member(pJsonObject, estimation_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("CampaignPlanningEstimationType")) {
			jsonToValue(&estimation_type, node, "CampaignPlanningEstimationType", "CampaignPlanningEstimationType");
		} else {
			
			CampaignPlanningEstimationType* obj = static_cast<CampaignPlanningEstimationType*> (&estimation_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *point_estimateKey = "point_estimate";
	node = json_object_get_member(pJsonObject, point_estimateKey);
	if (node !=NULL) {
	

		if (isprimitive("CampaignPlanningPointEstimate")) {
			jsonToValue(&point_estimate, node, "CampaignPlanningPointEstimate", "CampaignPlanningPointEstimate");
		} else {
			
			CampaignPlanningPointEstimate* obj = static_cast<CampaignPlanningPointEstimate*> (&point_estimate);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CampaignPlanningBudgetRecommendationPoint::CampaignPlanningBudgetRecommendationPoint(char* json)
{
	this->fromJson(json);
}

char*
CampaignPlanningBudgetRecommendationPoint::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CampaignPlanningEstimationType")) {
		CampaignPlanningEstimationType obj = getEstimationType();
		node = converttoJson(&obj, "CampaignPlanningEstimationType", "");
	}
	else {
		
		CampaignPlanningEstimationType obj = static_cast<CampaignPlanningEstimationType> (getEstimationType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *estimation_typeKey = "estimation_type";
	json_object_set_member(pJsonObject, estimation_typeKey, node);
	if (isprimitive("CampaignPlanningPointEstimate")) {
		CampaignPlanningPointEstimate obj = getPointEstimate();
		node = converttoJson(&obj, "CampaignPlanningPointEstimate", "");
	}
	else {
		
		CampaignPlanningPointEstimate obj = static_cast<CampaignPlanningPointEstimate> (getPointEstimate());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *point_estimateKey = "point_estimate";
	json_object_set_member(pJsonObject, point_estimateKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CampaignPlanningEstimationType
CampaignPlanningBudgetRecommendationPoint::getEstimationType()
{
	return estimation_type;
}

void
CampaignPlanningBudgetRecommendationPoint::setEstimationType(CampaignPlanningEstimationType  estimation_type)
{
	this->estimation_type = estimation_type;
}

CampaignPlanningPointEstimate
CampaignPlanningBudgetRecommendationPoint::getPointEstimate()
{
	return point_estimate;
}

void
CampaignPlanningBudgetRecommendationPoint::setPointEstimate(CampaignPlanningPointEstimate  point_estimate)
{
	this->point_estimate = point_estimate;
}


