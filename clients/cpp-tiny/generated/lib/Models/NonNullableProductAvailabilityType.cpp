

#include "NonNullableProductAvailabilityType.h"

using namespace Tiny;

NonNullableProductAvailabilityType::NonNullableProductAvailabilityType()
{
}

NonNullableProductAvailabilityType::NonNullableProductAvailabilityType(std::string jsonString)
{
	this->fromJson(jsonString);
}

NonNullableProductAvailabilityType::~NonNullableProductAvailabilityType()
{

}

void
NonNullableProductAvailabilityType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
NonNullableProductAvailabilityType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



