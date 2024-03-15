#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OptimizationGoalMetadata_conversion_tag_v3_goal_metadata.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::OptimizationGoalMetadata_conversion_tag_v3_goal_metadata()
{
	//__init();
}

OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::~OptimizationGoalMetadata_conversion_tag_v3_goal_metadata()
{
	//__cleanup();
}

void
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::__init()
{
	//attribution_windows = new OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows();
	//conversion_event = std::string();
	//conversion_tag_id = std::string();
	//cpa_goal_value_in_micro_currency = std::string();
	//is_roas_optimized = bool(false);
	//learning_mode_type = std::string();
}

void
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::__cleanup()
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
	//if(learning_mode_type != NULL) {
	//
	//delete learning_mode_type;
	//learning_mode_type = NULL;
	//}
	//
}

void
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *attribution_windowsKey = "attribution_windows";
	node = json_object_get_member(pJsonObject, attribution_windowsKey);
	if (node !=NULL) {
	

		if (isprimitive("OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows")) {
			jsonToValue(&attribution_windows, node, "OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows", "OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows");
		} else {
			
			OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows* obj = static_cast<OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows*> (&attribution_windows);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *conversion_eventKey = "conversion_event";
	node = json_object_get_member(pJsonObject, conversion_eventKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&conversion_event, node, "std::string", "");
		} else {
			
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
	const gchar *learning_mode_typeKey = "learning_mode_type";
	node = json_object_get_member(pJsonObject, learning_mode_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&learning_mode_type, node, "std::string", "");
		} else {
			
		}
	}
}

OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::OptimizationGoalMetadata_conversion_tag_v3_goal_metadata(char* json)
{
	this->fromJson(json);
}

char*
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows")) {
		OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows obj = getAttributionWindows();
		node = converttoJson(&obj, "OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows", "");
	}
	else {
		
		OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows obj = static_cast<OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows> (getAttributionWindows());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *attribution_windowsKey = "attribution_windows";
	json_object_set_member(pJsonObject, attribution_windowsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getConversionEvent();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
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
		std::string obj = getLearningModeType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *learning_mode_typeKey = "learning_mode_type";
	json_object_set_member(pJsonObject, learning_mode_typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::getAttributionWindows()
{
	return attribution_windows;
}

void
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::setAttributionWindows(OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows  attribution_windows)
{
	this->attribution_windows = attribution_windows;
}

std::string
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::getConversionEvent()
{
	return conversion_event;
}

void
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::setConversionEvent(std::string  conversion_event)
{
	this->conversion_event = conversion_event;
}

std::string
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::getConversionTagId()
{
	return conversion_tag_id;
}

void
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::setConversionTagId(std::string  conversion_tag_id)
{
	this->conversion_tag_id = conversion_tag_id;
}

std::string
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::getCpaGoalValueInMicroCurrency()
{
	return cpa_goal_value_in_micro_currency;
}

void
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::setCpaGoalValueInMicroCurrency(std::string  cpa_goal_value_in_micro_currency)
{
	this->cpa_goal_value_in_micro_currency = cpa_goal_value_in_micro_currency;
}

bool
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::getIsRoasOptimized()
{
	return is_roas_optimized;
}

void
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::setIsRoasOptimized(bool  is_roas_optimized)
{
	this->is_roas_optimized = is_roas_optimized;
}

std::string
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::getLearningModeType()
{
	return learning_mode_type;
}

void
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::setLearningModeType(std::string  learning_mode_type)
{
	this->learning_mode_type = learning_mode_type;
}


