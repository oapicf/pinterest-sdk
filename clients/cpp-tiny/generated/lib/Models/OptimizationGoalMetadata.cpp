

#include "OptimizationGoalMetadata.h"

using namespace Tiny;

OptimizationGoalMetadata::OptimizationGoalMetadata()
{
	conversion_tag_v3_goal_metadata = ConversionTagV3GoalMetadata();
	frequency_goal_metadata = FrequencyGoalMetadata();
	scrollup_goal_metadata = ScrollupGoalMetadata();
}

OptimizationGoalMetadata::OptimizationGoalMetadata(std::string jsonString)
{
	this->fromJson(jsonString);
}

OptimizationGoalMetadata::~OptimizationGoalMetadata()
{

}

void
OptimizationGoalMetadata::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *conversion_tag_v3_goal_metadataKey = "conversion_tag_v3_goal_metadata";

    if(object.has_key(conversion_tag_v3_goal_metadataKey))
    {
        bourne::json value = object[conversion_tag_v3_goal_metadataKey];




        ConversionTagV3GoalMetadata* obj = &conversion_tag_v3_goal_metadata;
		obj->fromJson(value.dump());

    }

    const char *frequency_goal_metadataKey = "frequency_goal_metadata";

    if(object.has_key(frequency_goal_metadataKey))
    {
        bourne::json value = object[frequency_goal_metadataKey];




        FrequencyGoalMetadata* obj = &frequency_goal_metadata;
		obj->fromJson(value.dump());

    }

    const char *scrollup_goal_metadataKey = "scrollup_goal_metadata";

    if(object.has_key(scrollup_goal_metadataKey))
    {
        bourne::json value = object[scrollup_goal_metadataKey];




        ScrollupGoalMetadata* obj = &scrollup_goal_metadata;
		obj->fromJson(value.dump());

    }


}

bourne::json
OptimizationGoalMetadata::toJson()
{
    bourne::json object = bourne::json::object();






	object["conversion_tag_v3_goal_metadata"] = getConversionTagV3GoalMetadata().toJson();






	object["frequency_goal_metadata"] = getFrequencyGoalMetadata().toJson();






	object["scrollup_goal_metadata"] = getScrollupGoalMetadata().toJson();


    return object;

}

ConversionTagV3GoalMetadata
OptimizationGoalMetadata::getConversionTagV3GoalMetadata()
{
	return conversion_tag_v3_goal_metadata;
}

void
OptimizationGoalMetadata::setConversionTagV3GoalMetadata(ConversionTagV3GoalMetadata conversion_tag_v3_goal_metadata)
{
	this->conversion_tag_v3_goal_metadata = conversion_tag_v3_goal_metadata;
}

FrequencyGoalMetadata
OptimizationGoalMetadata::getFrequencyGoalMetadata()
{
	return frequency_goal_metadata;
}

void
OptimizationGoalMetadata::setFrequencyGoalMetadata(FrequencyGoalMetadata frequency_goal_metadata)
{
	this->frequency_goal_metadata = frequency_goal_metadata;
}

ScrollupGoalMetadata
OptimizationGoalMetadata::getScrollupGoalMetadata()
{
	return scrollup_goal_metadata;
}

void
OptimizationGoalMetadata::setScrollupGoalMetadata(ScrollupGoalMetadata scrollup_goal_metadata)
{
	this->scrollup_goal_metadata = scrollup_goal_metadata;
}



