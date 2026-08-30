

#include "ScheduleType.h"

using namespace Tiny;

ScheduleType::ScheduleType()
{
}

ScheduleType::ScheduleType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ScheduleType::~ScheduleType()
{

}

void
ScheduleType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ScheduleType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



