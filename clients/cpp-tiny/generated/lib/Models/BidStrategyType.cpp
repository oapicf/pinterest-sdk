

#include "BidStrategyType.h"

using namespace Tiny;

BidStrategyType::BidStrategyType()
{
}

BidStrategyType::BidStrategyType(std::string jsonString)
{
	this->fromJson(jsonString);
}

BidStrategyType::~BidStrategyType()
{

}

void
BidStrategyType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
BidStrategyType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



