

#include "FrequencyGoalMetadataTimerange.h"

using namespace Tiny;

FrequencyGoalMetadataTimerange::FrequencyGoalMetadataTimerange()
{
}

FrequencyGoalMetadataTimerange::FrequencyGoalMetadataTimerange(std::string jsonString)
{
	this->fromJson(jsonString);
}

FrequencyGoalMetadataTimerange::~FrequencyGoalMetadataTimerange()
{

}

void
FrequencyGoalMetadataTimerange::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
FrequencyGoalMetadataTimerange::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



