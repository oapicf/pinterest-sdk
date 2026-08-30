#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignPlanningConversionRate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignPlanningConversionRate::CampaignPlanningConversionRate()
{
	//__init();
}

CampaignPlanningConversionRate::~CampaignPlanningConversionRate()
{
	//__cleanup();
}

void
CampaignPlanningConversionRate::__init()
{
	//attribution_windows = new CampaignPlanningConversionAttribution();
	//conversion_event = new CampaignPlanningConversionEvent();
	//conversion_rate = float(0);
}

void
CampaignPlanningConversionRate::__cleanup()
{
	//if(attribution_windows != NULL) {
	//
	//delete attribution_windows;
	//attribution_windows = NULL;
	//}
	//if(conversion_event != NULL) {
	//
	//delete conversion_event;
	//conversion_event = NULL;
	//}
	//if(conversion_rate != NULL) {
	//
	//delete conversion_rate;
	//conversion_rate = NULL;
	//}
	//
}

void
CampaignPlanningConversionRate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *attribution_windowsKey = "attribution_windows";
	node = json_object_get_member(pJsonObject, attribution_windowsKey);
	if (node !=NULL) {
	

		if (isprimitive("CampaignPlanningConversionAttribution")) {
			jsonToValue(&attribution_windows, node, "CampaignPlanningConversionAttribution", "CampaignPlanningConversionAttribution");
		} else {
			
			CampaignPlanningConversionAttribution* obj = static_cast<CampaignPlanningConversionAttribution*> (&attribution_windows);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *conversion_eventKey = "conversion_event";
	node = json_object_get_member(pJsonObject, conversion_eventKey);
	if (node !=NULL) {
	

		if (isprimitive("CampaignPlanningConversionEvent")) {
			jsonToValue(&conversion_event, node, "CampaignPlanningConversionEvent", "CampaignPlanningConversionEvent");
		} else {
			
			CampaignPlanningConversionEvent* obj = static_cast<CampaignPlanningConversionEvent*> (&conversion_event);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *conversion_rateKey = "conversion_rate";
	node = json_object_get_member(pJsonObject, conversion_rateKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&conversion_rate, node, "float", "");
		} else {
			
		}
	}
}

CampaignPlanningConversionRate::CampaignPlanningConversionRate(char* json)
{
	this->fromJson(json);
}

char*
CampaignPlanningConversionRate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CampaignPlanningConversionAttribution")) {
		CampaignPlanningConversionAttribution obj = getAttributionWindows();
		node = converttoJson(&obj, "CampaignPlanningConversionAttribution", "");
	}
	else {
		
		CampaignPlanningConversionAttribution obj = static_cast<CampaignPlanningConversionAttribution> (getAttributionWindows());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *attribution_windowsKey = "attribution_windows";
	json_object_set_member(pJsonObject, attribution_windowsKey, node);
	if (isprimitive("CampaignPlanningConversionEvent")) {
		CampaignPlanningConversionEvent obj = getConversionEvent();
		node = converttoJson(&obj, "CampaignPlanningConversionEvent", "");
	}
	else {
		
		CampaignPlanningConversionEvent obj = static_cast<CampaignPlanningConversionEvent> (getConversionEvent());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *conversion_eventKey = "conversion_event";
	json_object_set_member(pJsonObject, conversion_eventKey, node);
	if (isprimitive("float")) {
		float obj = getConversionRate();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *conversion_rateKey = "conversion_rate";
	json_object_set_member(pJsonObject, conversion_rateKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CampaignPlanningConversionAttribution
CampaignPlanningConversionRate::getAttributionWindows()
{
	return attribution_windows;
}

void
CampaignPlanningConversionRate::setAttributionWindows(CampaignPlanningConversionAttribution  attribution_windows)
{
	this->attribution_windows = attribution_windows;
}

CampaignPlanningConversionEvent
CampaignPlanningConversionRate::getConversionEvent()
{
	return conversion_event;
}

void
CampaignPlanningConversionRate::setConversionEvent(CampaignPlanningConversionEvent  conversion_event)
{
	this->conversion_event = conversion_event;
}

float
CampaignPlanningConversionRate::getConversionRate()
{
	return conversion_rate;
}

void
CampaignPlanningConversionRate::setConversionRate(float  conversion_rate)
{
	this->conversion_rate = conversion_rate;
}


