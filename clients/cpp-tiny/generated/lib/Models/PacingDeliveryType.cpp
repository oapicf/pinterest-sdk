

#include "PacingDeliveryType.h"

using namespace Tiny;

PacingDeliveryType::PacingDeliveryType()
{
}

PacingDeliveryType::PacingDeliveryType(std::string jsonString)
{
	this->fromJson(jsonString);
}

PacingDeliveryType::~PacingDeliveryType()
{

}

void
PacingDeliveryType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
PacingDeliveryType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



