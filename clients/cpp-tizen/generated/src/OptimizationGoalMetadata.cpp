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
	//conversion_tag_v3_goal_metadata = new OptimizationGoalMetadata_conversion_tag_v3_goal_metadata();
	//frequency_goal_metadata = new OptimizationGoalMetadata_frequency_goal_metadata();
	//scrollup_goal_metadata = new OptimizationGoalMetadata_scrollup_goal_metadata();
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
	

		if (isprimitive("OptimizationGoalMetadata_conversion_tag_v3_goal_metadata")) {
			jsonToValue(&conversion_tag_v3_goal_metadata, node, "OptimizationGoalMetadata_conversion_tag_v3_goal_metadata", "OptimizationGoalMetadata_conversion_tag_v3_goal_metadata");
		} else {
			
			OptimizationGoalMetadata_conversion_tag_v3_goal_metadata* obj = static_cast<OptimizationGoalMetadata_conversion_tag_v3_goal_metadata*> (&conversion_tag_v3_goal_metadata);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *frequency_goal_metadataKey = "frequency_goal_metadata";
	node = json_object_get_member(pJsonObject, frequency_goal_metadataKey);
	if (node !=NULL) {
	

		if (isprimitive("OptimizationGoalMetadata_frequency_goal_metadata")) {
			jsonToValue(&frequency_goal_metadata, node, "OptimizationGoalMetadata_frequency_goal_metadata", "OptimizationGoalMetadata_frequency_goal_metadata");
		} else {
			
			OptimizationGoalMetadata_frequency_goal_metadata* obj = static_cast<OptimizationGoalMetadata_frequency_goal_metadata*> (&frequency_goal_metadata);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *scrollup_goal_metadataKey = "scrollup_goal_metadata";
	node = json_object_get_member(pJsonObject, scrollup_goal_metadataKey);
	if (node !=NULL) {
	

		if (isprimitive("OptimizationGoalMetadata_scrollup_goal_metadata")) {
			jsonToValue(&scrollup_goal_metadata, node, "OptimizationGoalMetadata_scrollup_goal_metadata", "OptimizationGoalMetadata_scrollup_goal_metadata");
		} else {
			
			OptimizationGoalMetadata_scrollup_goal_metadata* obj = static_cast<OptimizationGoalMetadata_scrollup_goal_metadata*> (&scrollup_goal_metadata);
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
	if (isprimitive("OptimizationGoalMetadata_conversion_tag_v3_goal_metadata")) {
		OptimizationGoalMetadata_conversion_tag_v3_goal_metadata obj = getConversionTagV3GoalMetadata();
		node = converttoJson(&obj, "OptimizationGoalMetadata_conversion_tag_v3_goal_metadata", "");
	}
	else {
		
		OptimizationGoalMetadata_conversion_tag_v3_goal_metadata obj = static_cast<OptimizationGoalMetadata_conversion_tag_v3_goal_metadata> (getConversionTagV3GoalMetadata());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *conversion_tag_v3_goal_metadataKey = "conversion_tag_v3_goal_metadata";
	json_object_set_member(pJsonObject, conversion_tag_v3_goal_metadataKey, node);
	if (isprimitive("OptimizationGoalMetadata_frequency_goal_metadata")) {
		OptimizationGoalMetadata_frequency_goal_metadata obj = getFrequencyGoalMetadata();
		node = converttoJson(&obj, "OptimizationGoalMetadata_frequency_goal_metadata", "");
	}
	else {
		
		OptimizationGoalMetadata_frequency_goal_metadata obj = static_cast<OptimizationGoalMetadata_frequency_goal_metadata> (getFrequencyGoalMetadata());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *frequency_goal_metadataKey = "frequency_goal_metadata";
	json_object_set_member(pJsonObject, frequency_goal_metadataKey, node);
	if (isprimitive("OptimizationGoalMetadata_scrollup_goal_metadata")) {
		OptimizationGoalMetadata_scrollup_goal_metadata obj = getScrollupGoalMetadata();
		node = converttoJson(&obj, "OptimizationGoalMetadata_scrollup_goal_metadata", "");
	}
	else {
		
		OptimizationGoalMetadata_scrollup_goal_metadata obj = static_cast<OptimizationGoalMetadata_scrollup_goal_metadata> (getScrollupGoalMetadata());
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

OptimizationGoalMetadata_conversion_tag_v3_goal_metadata
OptimizationGoalMetadata::getConversionTagV3GoalMetadata()
{
	return conversion_tag_v3_goal_metadata;
}

void
OptimizationGoalMetadata::setConversionTagV3GoalMetadata(OptimizationGoalMetadata_conversion_tag_v3_goal_metadata  conversion_tag_v3_goal_metadata)
{
	this->conversion_tag_v3_goal_metadata = conversion_tag_v3_goal_metadata;
}

OptimizationGoalMetadata_frequency_goal_metadata
OptimizationGoalMetadata::getFrequencyGoalMetadata()
{
	return frequency_goal_metadata;
}

void
OptimizationGoalMetadata::setFrequencyGoalMetadata(OptimizationGoalMetadata_frequency_goal_metadata  frequency_goal_metadata)
{
	this->frequency_goal_metadata = frequency_goal_metadata;
}

OptimizationGoalMetadata_scrollup_goal_metadata
OptimizationGoalMetadata::getScrollupGoalMetadata()
{
	return scrollup_goal_metadata;
}

void
OptimizationGoalMetadata::setScrollupGoalMetadata(OptimizationGoalMetadata_scrollup_goal_metadata  scrollup_goal_metadata)
{
	this->scrollup_goal_metadata = scrollup_goal_metadata;
}


