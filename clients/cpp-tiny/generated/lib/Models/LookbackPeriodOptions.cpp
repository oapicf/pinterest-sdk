

#include "LookbackPeriodOptions.h"

using namespace Tiny;

LookbackPeriodOptions::LookbackPeriodOptions()
{
}

LookbackPeriodOptions::LookbackPeriodOptions(std::string jsonString)
{
	this->fromJson(jsonString);
}

LookbackPeriodOptions::~LookbackPeriodOptions()
{

}

void
LookbackPeriodOptions::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
LookbackPeriodOptions::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



