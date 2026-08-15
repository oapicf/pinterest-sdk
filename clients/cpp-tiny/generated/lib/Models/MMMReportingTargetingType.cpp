

#include "MMMReportingTargetingType.h"

using namespace Tiny;

MMMReportingTargetingType::MMMReportingTargetingType()
{
}

MMMReportingTargetingType::MMMReportingTargetingType(std::string jsonString)
{
	this->fromJson(jsonString);
}

MMMReportingTargetingType::~MMMReportingTargetingType()
{

}

void
MMMReportingTargetingType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
MMMReportingTargetingType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



