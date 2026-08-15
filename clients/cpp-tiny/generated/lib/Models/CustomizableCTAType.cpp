

#include "CustomizableCTAType.h"

using namespace Tiny;

CustomizableCTAType::CustomizableCTAType()
{
}

CustomizableCTAType::CustomizableCTAType(std::string jsonString)
{
	this->fromJson(jsonString);
}

CustomizableCTAType::~CustomizableCTAType()
{

}

void
CustomizableCTAType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CustomizableCTAType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



