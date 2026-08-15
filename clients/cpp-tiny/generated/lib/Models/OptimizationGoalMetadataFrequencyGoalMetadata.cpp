

#include "OptimizationGoalMetadata_frequency_goal_metadata.h"

using namespace Tiny;

OptimizationGoalMetadata_frequency_goal_metadata::OptimizationGoalMetadata_frequency_goal_metadata()
{
	frequency = int(0);
	timerange = std::string();
}

OptimizationGoalMetadata_frequency_goal_metadata::OptimizationGoalMetadata_frequency_goal_metadata(std::string jsonString)
{
	this->fromJson(jsonString);
}

OptimizationGoalMetadata_frequency_goal_metadata::~OptimizationGoalMetadata_frequency_goal_metadata()
{

}

void
OptimizationGoalMetadata_frequency_goal_metadata::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *frequencyKey = "frequency";

    if(object.has_key(frequencyKey))
    {
        bourne::json value = object[frequencyKey];



        jsonToValue(&frequency, value, "int");


    }

    const char *timerangeKey = "timerange";

    if(object.has_key(timerangeKey))
    {
        bourne::json value = object[timerangeKey];



        jsonToValue(&timerange, value, "std::string");


    }


}

bourne::json
OptimizationGoalMetadata_frequency_goal_metadata::toJson()
{
    bourne::json object = bourne::json::object();





    object["frequency"] = getFrequency();






    object["timerange"] = getTimerange();



    return object;

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



