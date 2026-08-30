

#include "TargetingStrategy.h"

using namespace Tiny;

TargetingStrategy::TargetingStrategy()
{
}

TargetingStrategy::TargetingStrategy(std::string jsonString)
{
	this->fromJson(jsonString);
}

TargetingStrategy::~TargetingStrategy()
{

}

void
TargetingStrategy::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
TargetingStrategy::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



