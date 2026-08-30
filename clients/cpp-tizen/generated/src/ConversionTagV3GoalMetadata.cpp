#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionTagV3GoalMetadata.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionTagV3GoalMetadata::ConversionTagV3GoalMetadata()
{
	//__init();
}

ConversionTagV3GoalMetadata::~ConversionTagV3GoalMetadata()
{
	//__cleanup();
}

void
ConversionTagV3GoalMetadata::__init()
{
	//attribution_windows = new AttributionWindows();
	//conversion_event = new ConversionEvent();
	//conversion_tag_id = std::string();
	//cpa_goal_value_in_micro_currency = std::string();
	//is_roas_optimized = bool(false);
	//reporting_event = std::string();
}

void
ConversionTagV3GoalMetadata::__cleanup()
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
	//if(conversion_tag_id != NULL) {
	//
	//delete conversion_tag_id;
	//conversion_tag_id = NULL;
	//}
	//if(cpa_goal_value_in_micro_currency != NULL) {
	//
	//delete cpa_goal_value_in_micro_currency;
	//cpa_goal_value_in_micro_currency = NULL;
	//}
	//if(is_roas_optimized != NULL) {
	//
	//delete is_roas_optimized;
	//is_roas_optimized = NULL;
	//}
	//if(reporting_event != NULL) {
	//
	//delete reporting_event;
	//reporting_event = NULL;
	//}
	//
}

void
ConversionTagV3GoalMetadata::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *attribution_windowsKey = "attribution_windows";
	node = json_object_get_member(pJsonObject, attribution_windowsKey);
	if (node !=NULL) {
	

		if (isprimitive("AttributionWindows")) {
			jsonToValue(&attribution_windows, node, "AttributionWindows", "AttributionWindows");
		} else {
			
			AttributionWindows* obj = static_cast<AttributionWindows*> (&attribution_windows);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *conversion_eventKey = "conversion_event";
	node = json_object_get_member(pJsonObject, conversion_eventKey);
	if (node !=NULL) {
	

		if (isprimitive("ConversionEvent")) {
			jsonToValue(&conversion_event, node, "ConversionEvent", "ConversionEvent");
		} else {
			
			ConversionEvent* obj = static_cast<ConversionEvent*> (&conversion_event);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *conversion_tag_idKey = "conversion_tag_id";
	node = json_object_get_member(pJsonObject, conversion_tag_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&conversion_tag_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *cpa_goal_value_in_micro_currencyKey = "cpa_goal_value_in_micro_currency";
	node = json_object_get_member(pJsonObject, cpa_goal_value_in_micro_currencyKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&cpa_goal_value_in_micro_currency, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *is_roas_optimizedKey = "is_roas_optimized";
	node = json_object_get_member(pJsonObject, is_roas_optimizedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_roas_optimized, node, "bool", "");
		} else {
			
		}
	}
	const gchar *reporting_eventKey = "reporting_event";
	node = json_object_get_member(pJsonObject, reporting_eventKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&reporting_event, node, "std::string", "");
		} else {
			
		}
	}
}

ConversionTagV3GoalMetadata::ConversionTagV3GoalMetadata(char* json)
{
	this->fromJson(json);
}

char*
ConversionTagV3GoalMetadata::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AttributionWindows")) {
		AttributionWindows obj = getAttributionWindows();
		node = converttoJson(&obj, "AttributionWindows", "");
	}
	else {
		
		AttributionWindows obj = static_cast<AttributionWindows> (getAttributionWindows());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *attribution_windowsKey = "attribution_windows";
	json_object_set_member(pJsonObject, attribution_windowsKey, node);
	if (isprimitive("ConversionEvent")) {
		ConversionEvent obj = getConversionEvent();
		node = converttoJson(&obj, "ConversionEvent", "");
	}
	else {
		
		ConversionEvent obj = static_cast<ConversionEvent> (getConversionEvent());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *conversion_eventKey = "conversion_event";
	json_object_set_member(pJsonObject, conversion_eventKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getConversionTagId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *conversion_tag_idKey = "conversion_tag_id";
	json_object_set_member(pJsonObject, conversion_tag_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCpaGoalValueInMicroCurrency();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *cpa_goal_value_in_micro_currencyKey = "cpa_goal_value_in_micro_currency";
	json_object_set_member(pJsonObject, cpa_goal_value_in_micro_currencyKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsRoasOptimized();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_roas_optimizedKey = "is_roas_optimized";
	json_object_set_member(pJsonObject, is_roas_optimizedKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getReportingEvent();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *reporting_eventKey = "reporting_event";
	json_object_set_member(pJsonObject, reporting_eventKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

AttributionWindows
ConversionTagV3GoalMetadata::getAttributionWindows()
{
	return attribution_windows;
}

void
ConversionTagV3GoalMetadata::setAttributionWindows(AttributionWindows  attribution_windows)
{
	this->attribution_windows = attribution_windows;
}

ConversionEvent
ConversionTagV3GoalMetadata::getConversionEvent()
{
	return conversion_event;
}

void
ConversionTagV3GoalMetadata::setConversionEvent(ConversionEvent  conversion_event)
{
	this->conversion_event = conversion_event;
}

std::string
ConversionTagV3GoalMetadata::getConversionTagId()
{
	return conversion_tag_id;
}

void
ConversionTagV3GoalMetadata::setConversionTagId(std::string  conversion_tag_id)
{
	this->conversion_tag_id = conversion_tag_id;
}

std::string
ConversionTagV3GoalMetadata::getCpaGoalValueInMicroCurrency()
{
	return cpa_goal_value_in_micro_currency;
}

void
ConversionTagV3GoalMetadata::setCpaGoalValueInMicroCurrency(std::string  cpa_goal_value_in_micro_currency)
{
	this->cpa_goal_value_in_micro_currency = cpa_goal_value_in_micro_currency;
}

bool
ConversionTagV3GoalMetadata::getIsRoasOptimized()
{
	return is_roas_optimized;
}

void
ConversionTagV3GoalMetadata::setIsRoasOptimized(bool  is_roas_optimized)
{
	this->is_roas_optimized = is_roas_optimized;
}

std::string
ConversionTagV3GoalMetadata::getReportingEvent()
{
	return reporting_event;
}

void
ConversionTagV3GoalMetadata::setReportingEvent(std::string  reporting_event)
{
	this->reporting_event = reporting_event;
}


