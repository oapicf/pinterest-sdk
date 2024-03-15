#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OptimizationGoalMetadata_frequency_goal_metadata.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OptimizationGoalMetadata_frequency_goal_metadata::OptimizationGoalMetadata_frequency_goal_metadata()
{
	//__init();
}

OptimizationGoalMetadata_frequency_goal_metadata::~OptimizationGoalMetadata_frequency_goal_metadata()
{
	//__cleanup();
}

void
OptimizationGoalMetadata_frequency_goal_metadata::__init()
{
	//frequency = int(0);
	//timerange = std::string();
}

void
OptimizationGoalMetadata_frequency_goal_metadata::__cleanup()
{
	//if(frequency != NULL) {
	//
	//delete frequency;
	//frequency = NULL;
	//}
	//if(timerange != NULL) {
	//
	//delete timerange;
	//timerange = NULL;
	//}
	//
}

void
OptimizationGoalMetadata_frequency_goal_metadata::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *frequencyKey = "frequency";
	node = json_object_get_member(pJsonObject, frequencyKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&frequency, node, "int", "");
		} else {
			
		}
	}
	const gchar *timerangeKey = "timerange";
	node = json_object_get_member(pJsonObject, timerangeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&timerange, node, "std::string", "");
		} else {
			
		}
	}
}

OptimizationGoalMetadata_frequency_goal_metadata::OptimizationGoalMetadata_frequency_goal_metadata(char* json)
{
	this->fromJson(json);
}

char*
OptimizationGoalMetadata_frequency_goal_metadata::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getFrequency();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *frequencyKey = "frequency";
	json_object_set_member(pJsonObject, frequencyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTimerange();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *timerangeKey = "timerange";
	json_object_set_member(pJsonObject, timerangeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
OptimizationGoalMetadata_frequency_goal_metadata::getFrequency()
{
	return frequency;
}

void
OptimizationGoalMetadata_frequency_goal_metadata::setFrequency(int  frequency)
{
	this->frequency = frequency;
}

std::string
OptimizationGoalMetadata_frequency_goal_metadata::getTimerange()
{
	return timerange;
}

void
OptimizationGoalMetadata_frequency_goal_metadata::setTimerange(std::string  timerange)
{
	this->timerange = timerange;
}


