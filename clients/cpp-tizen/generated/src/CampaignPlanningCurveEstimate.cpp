#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignPlanningCurveEstimate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignPlanningCurveEstimate::CampaignPlanningCurveEstimate()
{
	//__init();
}

CampaignPlanningCurveEstimate::~CampaignPlanningCurveEstimate()
{
	//__cleanup();
}

void
CampaignPlanningCurveEstimate::__init()
{
	//estimation_type = null;
	//new std::list()std::list> points;
}

void
CampaignPlanningCurveEstimate::__cleanup()
{
	//if(estimation_type != NULL) {
	//
	//delete estimation_type;
	//estimation_type = NULL;
	//}
	//if(points != NULL) {
	//points.RemoveAll(true);
	//delete points;
	//points = NULL;
	//}
	//
}

void
CampaignPlanningCurveEstimate::fromJson(char* jsonStr)
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
	const gchar *pointsKey = "points";
	node = json_object_get_member(pJsonObject, pointsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CampaignPlanningPointEstimate> new_list;
			CampaignPlanningPointEstimate inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CampaignPlanningPointEstimate")) {
					jsonToValue(&inst, temp_json, "CampaignPlanningPointEstimate", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			points = new_list;
		}
		
	}
}

CampaignPlanningCurveEstimate::CampaignPlanningCurveEstimate(char* json)
{
	this->fromJson(json);
}

char*
CampaignPlanningCurveEstimate::toJson()
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
		list<CampaignPlanningPointEstimate> new_list = static_cast<list <CampaignPlanningPointEstimate> > (getPoints());
		node = converttoJson(&new_list, "CampaignPlanningPointEstimate", "array");
	} else {
		node = json_node_alloc();
		list<CampaignPlanningPointEstimate> new_list = static_cast<list <CampaignPlanningPointEstimate> > (getPoints());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CampaignPlanningPointEstimate>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CampaignPlanningPointEstimate obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *pointsKey = "points";
	json_object_set_member(pJsonObject, pointsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CampaignPlanningEstimationType
CampaignPlanningCurveEstimate::getEstimationType()
{
	return estimation_type;
}

void
CampaignPlanningCurveEstimate::setEstimationType(CampaignPlanningEstimationType  estimation_type)
{
	this->estimation_type = estimation_type;
}

std::list<CampaignPlanningPointEstimate>
CampaignPlanningCurveEstimate::getPoints()
{
	return points;
}

void
CampaignPlanningCurveEstimate::setPoints(std::list <CampaignPlanningPointEstimate> points)
{
	this->points = points;
}


