#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OptimizationGoalMetadata.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OptimizationGoalMetadata::OptimizationGoalMetadata()
{
	//__init();
}

OptimizationGoalMetadata::~OptimizationGoalMetadata()
{
	//__cleanup();
}

void
OptimizationGoalMetadata::__init()
{
	//conversion_tag_v3_goal_metadata = new ConversionTagV3GoalMetadata();
	//frequency_goal_metadata = new FrequencyGoalMetadata();
	//scrollup_goal_metadata = new ScrollupGoalMetadata();
}

void
OptimizationGoalMetadata::__cleanup()
{
	//if(conversion_tag_v3_goal_metadata != NULL) {
	//
	//delete conversion_tag_v3_goal_metadata;
	//conversion_tag_v3_goal_metadata = NULL;
	//}
	//if(frequency_goal_metadata != NULL) {
	//
	//delete frequency_goal_metadata;
	//frequency_goal_metadata = NULL;
	//}
	//if(scrollup_goal_metadata != NULL) {
	//
	//delete scrollup_goal_metadata;
	//scrollup_goal_metadata = NULL;
	//}
	//
}

void
OptimizationGoalMetadata::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *conversion_tag_v3_goal_metadataKey = "conversion_tag_v3_goal_metadata";
	node = json_object_get_member(pJsonObject, conversion_tag_v3_goal_metadataKey);
	if (node !=NULL) {
	

		if (isprimitive("ConversionTagV3GoalMetadata")) {
			jsonToValue(&conversion_tag_v3_goal_metadata, node, "ConversionTagV3GoalMetadata", "ConversionTagV3GoalMetadata");
		} else {
			
			ConversionTagV3GoalMetadata* obj = static_cast<ConversionTagV3GoalMetadata*> (&conversion_tag_v3_goal_metadata);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *frequency_goal_metadataKey = "frequency_goal_metadata";
	node = json_object_get_member(pJsonObject, frequency_goal_metadataKey);
	if (node !=NULL) {
	

		if (isprimitive("FrequencyGoalMetadata")) {
			jsonToValue(&frequency_goal_metadata, node, "FrequencyGoalMetadata", "FrequencyGoalMetadata");
		} else {
			
			FrequencyGoalMetadata* obj = static_cast<FrequencyGoalMetadata*> (&frequency_goal_metadata);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *scrollup_goal_metadataKey = "scrollup_goal_metadata";
	node = json_object_get_member(pJsonObject, scrollup_goal_metadataKey);
	if (node !=NULL) {
	

		if (isprimitive("ScrollupGoalMetadata")) {
			jsonToValue(&scrollup_goal_metadata, node, "ScrollupGoalMetadata", "ScrollupGoalMetadata");
		} else {
			
			ScrollupGoalMetadata* obj = static_cast<ScrollupGoalMetadata*> (&scrollup_goal_metadata);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OptimizationGoalMetadata::OptimizationGoalMetadata(char* json)
{
	this->fromJson(json);
}

char*
OptimizationGoalMetadata::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConversionTagV3GoalMetadata")) {
		ConversionTagV3GoalMetadata obj = getConversionTagV3GoalMetadata();
		node = converttoJson(&obj, "ConversionTagV3GoalMetadata", "");
	}
	else {
		
		ConversionTagV3GoalMetadata obj = static_cast<ConversionTagV3GoalMetadata> (getConversionTagV3GoalMetadata());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *conversion_tag_v3_goal_metadataKey = "conversion_tag_v3_goal_metadata";
	json_object_set_member(pJsonObject, conversion_tag_v3_goal_metadataKey, node);
	if (isprimitive("FrequencyGoalMetadata")) {
		FrequencyGoalMetadata obj = getFrequencyGoalMetadata();
		node = converttoJson(&obj, "FrequencyGoalMetadata", "");
	}
	else {
		
		FrequencyGoalMetadata obj = static_cast<FrequencyGoalMetadata> (getFrequencyGoalMetadata());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *frequency_goal_metadataKey = "frequency_goal_metadata";
	json_object_set_member(pJsonObject, frequency_goal_metadataKey, node);
	if (isprimitive("ScrollupGoalMetadata")) {
		ScrollupGoalMetadata obj = getScrollupGoalMetadata();
		node = converttoJson(&obj, "ScrollupGoalMetadata", "");
	}
	else {
		
		ScrollupGoalMetadata obj = static_cast<ScrollupGoalMetadata> (getScrollupGoalMetadata());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *scrollup_goal_metadataKey = "scrollup_goal_metadata";
	json_object_set_member(pJsonObject, scrollup_goal_metadataKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConversionTagV3GoalMetadata
OptimizationGoalMetadata::getConversionTagV3GoalMetadata()
{
	return conversion_tag_v3_goal_metadata;
}

void
OptimizationGoalMetadata::setConversionTagV3GoalMetadata(ConversionTagV3GoalMetadata  conversion_tag_v3_goal_metadata)
{
	this->conversion_tag_v3_goal_metadata = conversion_tag_v3_goal_metadata;
}

FrequencyGoalMetadata
OptimizationGoalMetadata::getFrequencyGoalMetadata()
{
	return frequency_goal_metadata;
}

void
OptimizationGoalMetadata::setFrequencyGoalMetadata(FrequencyGoalMetadata  frequency_goal_metadata)
{
	this->frequency_goal_metadata = frequency_goal_metadata;
}

ScrollupGoalMetadata
OptimizationGoalMetadata::getScrollupGoalMetadata()
{
	return scrollup_goal_metadata;
}

void
OptimizationGoalMetadata::setScrollupGoalMetadata(ScrollupGoalMetadata  scrollup_goal_metadata)
{
	this->scrollup_goal_metadata = scrollup_goal_metadata;
}


