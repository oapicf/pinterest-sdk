

#include "TargetingSpecGender.h"

using namespace Tiny;

TargetingSpecGender::TargetingSpecGender()
{
}

TargetingSpecGender::TargetingSpecGender(std::string jsonString)
{
	this->fromJson(jsonString);
}

TargetingSpecGender::~TargetingSpecGender()
{

}

void
TargetingSpecGender::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
TargetingSpecGender::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



