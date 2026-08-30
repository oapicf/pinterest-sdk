

#include "TargetingSpecTargetingStrategyItems.h"

using namespace Tiny;

TargetingSpecTargetingStrategyItems::TargetingSpecTargetingStrategyItems()
{
}

TargetingSpecTargetingStrategyItems::TargetingSpecTargetingStrategyItems(std::string jsonString)
{
	this->fromJson(jsonString);
}

TargetingSpecTargetingStrategyItems::~TargetingSpecTargetingStrategyItems()
{

}

void
TargetingSpecTargetingStrategyItems::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
TargetingSpecTargetingStrategyItems::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



