

#include "DeliveryEstimateObjectiveType.h"

using namespace Tiny;

DeliveryEstimateObjectiveType::DeliveryEstimateObjectiveType()
{
}

DeliveryEstimateObjectiveType::DeliveryEstimateObjectiveType(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeliveryEstimateObjectiveType::~DeliveryEstimateObjectiveType()
{

}

void
DeliveryEstimateObjectiveType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
DeliveryEstimateObjectiveType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



