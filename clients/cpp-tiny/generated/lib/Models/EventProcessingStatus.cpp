

#include "EventProcessingStatus.h"

using namespace Tiny;

EventProcessingStatus::EventProcessingStatus()
{
}

EventProcessingStatus::EventProcessingStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

EventProcessingStatus::~EventProcessingStatus()
{

}

void
EventProcessingStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
EventProcessingStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



