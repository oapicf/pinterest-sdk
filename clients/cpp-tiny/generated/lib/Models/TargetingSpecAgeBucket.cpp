

#include "TargetingSpecAgeBucket.h"

using namespace Tiny;

TargetingSpecAgeBucket::TargetingSpecAgeBucket()
{
}

TargetingSpecAgeBucket::TargetingSpecAgeBucket(std::string jsonString)
{
	this->fromJson(jsonString);
}

TargetingSpecAgeBucket::~TargetingSpecAgeBucket()
{

}

void
TargetingSpecAgeBucket::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
TargetingSpecAgeBucket::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



