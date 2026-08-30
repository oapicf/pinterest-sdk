#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignPlanningPointEstimate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignPlanningPointEstimate::CampaignPlanningPointEstimate()
{
	//__init();
}

CampaignPlanningPointEstimate::~CampaignPlanningPointEstimate()
{
	//__cleanup();
}

void
CampaignPlanningPointEstimate::__init()
{
	//budget = int(0);
	//double_y = double(0);
	//max_y = int(0);
	//min_y = int(0);
	//y = int(0);
}

void
CampaignPlanningPointEstimate::__cleanup()
{
	//if(budget != NULL) {
	//
	//delete budget;
	//budget = NULL;
	//}
	//if(double_y != NULL) {
	//
	//delete double_y;
	//double_y = NULL;
	//}
	//if(max_y != NULL) {
	//
	//delete max_y;
	//max_y = NULL;
	//}
	//if(min_y != NULL) {
	//
	//delete min_y;
	//min_y = NULL;
	//}
	//if(y != NULL) {
	//
	//delete y;
	//y = NULL;
	//}
	//
}

void
CampaignPlanningPointEstimate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *budgetKey = "budget";
	node = json_object_get_member(pJsonObject, budgetKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&budget, node, "int", "");
		} else {
			
		}
	}
	const gchar *double_yKey = "double_y";
	node = json_object_get_member(pJsonObject, double_yKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&double_y, node, "double", "");
		} else {
			
		}
	}
	const gchar *max_yKey = "max_y";
	node = json_object_get_member(pJsonObject, max_yKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&max_y, node, "int", "");
		} else {
			
		}
	}
	const gchar *min_yKey = "min_y";
	node = json_object_get_member(pJsonObject, min_yKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&min_y, node, "int", "");
		} else {
			
		}
	}
	const gchar *yKey = "y";
	node = json_object_get_member(pJsonObject, yKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&y, node, "int", "");
		} else {
			
		}
	}
}

CampaignPlanningPointEstimate::CampaignPlanningPointEstimate(char* json)
{
	this->fromJson(json);
}

char*
CampaignPlanningPointEstimate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getBudget();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *budgetKey = "budget";
	json_object_set_member(pJsonObject, budgetKey, node);
	if (isprimitive("double")) {
		double obj = getDoubleY();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *double_yKey = "double_y";
	json_object_set_member(pJsonObject, double_yKey, node);
	if (isprimitive("int")) {
		int obj = getMaxY();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *max_yKey = "max_y";
	json_object_set_member(pJsonObject, max_yKey, node);
	if (isprimitive("int")) {
		int obj = getMinY();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *min_yKey = "min_y";
	json_object_set_member(pJsonObject, min_yKey, node);
	if (isprimitive("int")) {
		int obj = getY();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *yKey = "y";
	json_object_set_member(pJsonObject, yKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
CampaignPlanningPointEstimate::getBudget()
{
	return budget;
}

void
CampaignPlanningPointEstimate::setBudget(int  budget)
{
	this->budget = budget;
}

double
CampaignPlanningPointEstimate::getDoubleY()
{
	return double_y;
}

void
CampaignPlanningPointEstimate::setDoubleY(double  double_y)
{
	this->double_y = double_y;
}

int
CampaignPlanningPointEstimate::getMaxY()
{
	return max_y;
}

void
CampaignPlanningPointEstimate::setMaxY(int  max_y)
{
	this->max_y = max_y;
}

int
CampaignPlanningPointEstimate::getMinY()
{
	return min_y;
}

void
CampaignPlanningPointEstimate::setMinY(int  min_y)
{
	this->min_y = min_y;
}

int
CampaignPlanningPointEstimate::getY()
{
	return y;
}

void
CampaignPlanningPointEstimate::setY(int  y)
{
	this->y = y;
}


