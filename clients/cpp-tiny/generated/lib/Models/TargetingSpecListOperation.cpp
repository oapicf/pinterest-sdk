

#include "TargetingSpecListOperation.h"

using namespace Tiny;

TargetingSpecListOperation::TargetingSpecListOperation()
{
}

TargetingSpecListOperation::TargetingSpecListOperation(std::string jsonString)
{
	this->fromJson(jsonString);
}

TargetingSpecListOperation::~TargetingSpecListOperation()
{

}

void
TargetingSpecListOperation::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
TargetingSpecListOperation::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



