#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ScrollupGoalMetadata.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ScrollupGoalMetadata::ScrollupGoalMetadata()
{
	//__init();
}

ScrollupGoalMetadata::~ScrollupGoalMetadata()
{
	//__cleanup();
}

void
ScrollupGoalMetadata::__init()
{
	//scrollup_goal_value_in_micro_currency = std::string();
}

void
ScrollupGoalMetadata::__cleanup()
{
	//if(scrollup_goal_value_in_micro_currency != NULL) {
	//
	//delete scrollup_goal_value_in_micro_currency;
	//scrollup_goal_value_in_micro_currency = NULL;
	//}
	//
}

void
ScrollupGoalMetadata::fromJson(char* jsonStr)
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

ScrollupGoalMetadata::ScrollupGoalMetadata(char* json)
{
	this->fromJson(json);
}

char*
ScrollupGoalMetadata::toJson()
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
ScrollupGoalMetadata::getScrollupGoalValueInMicroCurrency()
{
	return scrollup_goal_value_in_micro_currency;
}

void
ScrollupGoalMetadata::setScrollupGoalValueInMicroCurrency(std::string  scrollup_goal_value_in_micro_currency)
{
	this->scrollup_goal_value_in_micro_currency = scrollup_goal_value_in_micro_currency;
}


