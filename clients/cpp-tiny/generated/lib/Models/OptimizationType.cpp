

#include "OptimizationType.h"

using namespace Tiny;

OptimizationType::OptimizationType()
{
}

OptimizationType::OptimizationType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OptimizationType::~OptimizationType()
{

}

void
OptimizationType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OptimizationType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



