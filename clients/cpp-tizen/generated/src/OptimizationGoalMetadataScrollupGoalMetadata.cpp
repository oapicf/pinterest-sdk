#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OptimizationGoalMetadata_scrollup_goal_metadata.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OptimizationGoalMetadata_scrollup_goal_metadata::OptimizationGoalMetadata_scrollup_goal_metadata()
{
	//__init();
}

OptimizationGoalMetadata_scrollup_goal_metadata::~OptimizationGoalMetadata_scrollup_goal_metadata()
{
	//__cleanup();
}

void
OptimizationGoalMetadata_scrollup_goal_metadata::__init()
{
	//scrollup_goal_value_in_micro_currency = std::string();
}

void
OptimizationGoalMetadata_scrollup_goal_metadata::__cleanup()
{
	//if(scrollup_goal_value_in_micro_currency != NULL) {
	//
	//delete scrollup_goal_value_in_micro_currency;
	//scrollup_goal_value_in_micro_currency = NULL;
	//}
	//
}

void
OptimizationGoalMetadata_scrollup_goal_metadata::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *scrollup_goal_value_in_micro_currencyKey = "scrollup_goal_value_in_micro_currency";
	node = json_object_get_member(pJsonObject, scrollup_goal_value_in_micro_currencyKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&scrollup_goal_value_in_micro_currency, node, "std::string", "");
		} else {
			
		}
	}
}

OptimizationGoalMetadata_scrollup_goal_metadata::OptimizationGoalMetadata_scrollup_goal_metadata(char* json)
{
	this->fromJson(json);
}

char*
OptimizationGoalMetadata_scrollup_goal_metadata::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getScrollupGoalValueInMicroCurrency();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *scrollup_goal_value_in_micro_currencyKey = "scrollup_goal_value_in_micro_currency";
	json_object_set_member(pJsonObject, scrollup_goal_value_in_micro_currencyKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
OptimizationGoalMetadata_scrollup_goal_metadata::getScrollupGoalValueInMicroCurrency()
{
	return scrollup_goal_value_in_micro_currency;
}

void
OptimizationGoalMetadata_scrollup_goal_metadata::setScrollupGoalValueInMicroCurrency(std::string  scrollup_goal_value_in_micro_currency)
{
	this->scrollup_goal_value_in_micro_currency = scrollup_goal_value_in_micro_currency;
}


