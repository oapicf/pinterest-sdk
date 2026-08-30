

#include "ScheduleAction.h"

using namespace Tiny;

ScheduleAction::ScheduleAction()
{
}

ScheduleAction::ScheduleAction(std::string jsonString)
{
	this->fromJson(jsonString);
}

ScheduleAction::~ScheduleAction()
{

}

void
ScheduleAction::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ScheduleAction::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



