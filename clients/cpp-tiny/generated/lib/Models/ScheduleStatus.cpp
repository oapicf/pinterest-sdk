

#include "ScheduleStatus.h"

using namespace Tiny;

ScheduleStatus::ScheduleStatus()
{
}

ScheduleStatus::ScheduleStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

ScheduleStatus::~ScheduleStatus()
{

}

void
ScheduleStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ScheduleStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



