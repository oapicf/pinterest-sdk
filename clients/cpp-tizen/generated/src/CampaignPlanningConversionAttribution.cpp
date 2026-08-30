#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignPlanningConversionAttribution.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignPlanningConversionAttribution::CampaignPlanningConversionAttribution()
{
	//__init();
}

CampaignPlanningConversionAttribution::~CampaignPlanningConversionAttribution()
{
	//__cleanup();
}

void
CampaignPlanningConversionAttribution::__init()
{
	//click_window_days = null;
	//engagement_window_days = null;
	//view_window_days = null;
}

void
CampaignPlanningConversionAttribution::__cleanup()
{
	//if(click_window_days != NULL) {
	//
	//delete click_window_days;
	//click_window_days = NULL;
	//}
	//if(engagement_window_days != NULL) {
	//
	//delete engagement_window_days;
	//engagement_window_days = NULL;
	//}
	//if(view_window_days != NULL) {
	//
	//delete view_window_days;
	//view_window_days = NULL;
	//}
	//
}

void
CampaignPlanningConversionAttribution::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *click_window_daysKey = "click_window_days";
	node = json_object_get_member(pJsonObject, click_window_daysKey);
	if (node !=NULL) {
	

		if (isprimitive("CampaignPlanningConversionAttributionWindowDays")) {
			jsonToValue(&click_window_days, node, "CampaignPlanningConversionAttributionWindowDays", "CampaignPlanningConversionAttributionWindowDays");
		} else {
			
			CampaignPlanningConversionAttributionWindowDays* obj = static_cast<CampaignPlanningConversionAttributionWindowDays*> (&click_window_days);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *engagement_window_daysKey = "engagement_window_days";
	node = json_object_get_member(pJsonObject, engagement_window_daysKey);
	if (node !=NULL) {
	

		if (isprimitive("CampaignPlanningConversionAttributionWindowDays")) {
			jsonToValue(&engagement_window_days, node, "CampaignPlanningConversionAttributionWindowDays", "CampaignPlanningConversionAttributionWindowDays");
		} else {
			
			CampaignPlanningConversionAttributionWindowDays* obj = static_cast<CampaignPlanningConversionAttributionWindowDays*> (&engagement_window_days);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *view_window_daysKey = "view_window_days";
	node = json_object_get_member(pJsonObject, view_window_daysKey);
	if (node !=NULL) {
	

		if (isprimitive("CampaignPlanningConversionAttributionWindowDays")) {
			jsonToValue(&view_window_days, node, "CampaignPlanningConversionAttributionWindowDays", "CampaignPlanningConversionAttributionWindowDays");
		} else {
			
			CampaignPlanningConversionAttributionWindowDays* obj = static_cast<CampaignPlanningConversionAttributionWindowDays*> (&view_window_days);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CampaignPlanningConversionAttribution::CampaignPlanningConversionAttribution(char* json)
{
	this->fromJson(json);
}

char*
CampaignPlanningConversionAttribution::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CampaignPlanningConversionAttributionWindowDays")) {
		CampaignPlanningConversionAttributionWindowDays obj = getClickWindowDays();
		node = converttoJson(&obj, "CampaignPlanningConversionAttributionWindowDays", "");
	}
	else {
		
		CampaignPlanningConversionAttributionWindowDays obj = static_cast<CampaignPlanningConversionAttributionWindowDays> (getClickWindowDays());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *click_window_daysKey = "click_window_days";
	json_object_set_member(pJsonObject, click_window_daysKey, node);
	if (isprimitive("CampaignPlanningConversionAttributionWindowDays")) {
		CampaignPlanningConversionAttributionWindowDays obj = getEngagementWindowDays();
		node = converttoJson(&obj, "CampaignPlanningConversionAttributionWindowDays", "");
	}
	else {
		
		CampaignPlanningConversionAttributionWindowDays obj = static_cast<CampaignPlanningConversionAttributionWindowDays> (getEngagementWindowDays());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *engagement_window_daysKey = "engagement_window_days";
	json_object_set_member(pJsonObject, engagement_window_daysKey, node);
	if (isprimitive("CampaignPlanningConversionAttributionWindowDays")) {
		CampaignPlanningConversionAttributionWindowDays obj = getViewWindowDays();
		node = converttoJson(&obj, "CampaignPlanningConversionAttributionWindowDays", "");
	}
	else {
		
		CampaignPlanningConversionAttributionWindowDays obj = static_cast<CampaignPlanningConversionAttributionWindowDays> (getViewWindowDays());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *view_window_daysKey = "view_window_days";
	json_object_set_member(pJsonObject, view_window_daysKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CampaignPlanningConversionAttributionWindowDays
CampaignPlanningConversionAttribution::getClickWindowDays()
{
	return click_window_days;
}

void
CampaignPlanningConversionAttribution::setClickWindowDays(CampaignPlanningConversionAttributionWindowDays  click_window_days)
{
	this->click_window_days = click_window_days;
}

CampaignPlanningConversionAttributionWindowDays
CampaignPlanningConversionAttribution::getEngagementWindowDays()
{
	return engagement_window_days;
}

void
CampaignPlanningConversionAttribution::setEngagementWindowDays(CampaignPlanningConversionAttributionWindowDays  engagement_window_days)
{
	this->engagement_window_days = engagement_window_days;
}

CampaignPlanningConversionAttributionWindowDays
CampaignPlanningConversionAttribution::getViewWindowDays()
{
	return view_window_days;
}

void
CampaignPlanningConversionAttribution::setViewWindowDays(CampaignPlanningConversionAttributionWindowDays  view_window_days)
{
	this->view_window_days = view_window_days;
}


