

#include "TargetingAdvertiserCountry.h"

using namespace Tiny;

TargetingAdvertiserCountry::TargetingAdvertiserCountry()
{
}

TargetingAdvertiserCountry::TargetingAdvertiserCountry(std::string jsonString)
{
	this->fromJson(jsonString);
}

TargetingAdvertiserCountry::~TargetingAdvertiserCountry()
{

}

void
TargetingAdvertiserCountry::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
TargetingAdvertiserCountry::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



