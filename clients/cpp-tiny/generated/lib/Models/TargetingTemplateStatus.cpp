

#include "TargetingTemplateStatus.h"

using namespace Tiny;

TargetingTemplateStatus::TargetingTemplateStatus()
{
}

TargetingTemplateStatus::TargetingTemplateStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

TargetingTemplateStatus::~TargetingTemplateStatus()
{

}

void
TargetingTemplateStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
TargetingTemplateStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



