

#include "FrequencyGoalMetadata.h"

using namespace Tiny;

FrequencyGoalMetadata::FrequencyGoalMetadata()
{
	frequency = int(0);
	timerange = FrequencyGoalMetadataTimerange();
}

FrequencyGoalMetadata::FrequencyGoalMetadata(std::string jsonString)
{
	this->fromJson(jsonString);
}

FrequencyGoalMetadata::~FrequencyGoalMetadata()
{

}

void
FrequencyGoalMetadata::fromJson(std::string jsonObj)
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




        FrequencyGoalMetadataTimerange* obj = &timerange;
		obj->fromJson(value.dump());

    }


}

bourne::json
FrequencyGoalMetadata::toJson()
{
    bourne::json object = bourne::json::object();





    object["frequency"] = getFrequency();







	object["timerange"] = getTimerange().toJson();


    return object;

}

int
FrequencyGoalMetadata::getFrequency()
{
	return frequency;
}

void
FrequencyGoalMetadata::setFrequency(int frequency)
{
	this->frequency = frequency;
}

FrequencyGoalMetadataTimerange
FrequencyGoalMetadata::getTimerange()
{
	return timerange;
}

void
FrequencyGoalMetadata::setTimerange(FrequencyGoalMetadataTimerange timerange)
{
	this->timerange = timerange;
}



