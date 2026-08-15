

#include "ProductAvailabilityType.h"

using namespace Tiny;

ProductAvailabilityType::ProductAvailabilityType()
{
}

ProductAvailabilityType::ProductAvailabilityType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProductAvailabilityType::~ProductAvailabilityType()
{

}

void
ProductAvailabilityType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ProductAvailabilityType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



