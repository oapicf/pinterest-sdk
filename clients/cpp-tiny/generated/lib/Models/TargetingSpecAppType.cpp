

#include "TargetingSpecAppType.h"

using namespace Tiny;

TargetingSpecAppType::TargetingSpecAppType()
{
}

TargetingSpecAppType::TargetingSpecAppType(std::string jsonString)
{
	this->fromJson(jsonString);
}

TargetingSpecAppType::~TargetingSpecAppType()
{

}

void
TargetingSpecAppType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
TargetingSpecAppType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



