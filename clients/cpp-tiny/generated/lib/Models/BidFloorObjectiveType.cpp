

#include "BidFloorObjectiveType.h"

using namespace Tiny;

BidFloorObjectiveType::BidFloorObjectiveType()
{
}

BidFloorObjectiveType::BidFloorObjectiveType(std::string jsonString)
{
	this->fromJson(jsonString);
}

BidFloorObjectiveType::~BidFloorObjectiveType()
{

}

void
BidFloorObjectiveType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
BidFloorObjectiveType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



