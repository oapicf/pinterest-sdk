

#include "AdvancedAuctionOperation.h"

using namespace Tiny;

AdvancedAuctionOperation::AdvancedAuctionOperation()
{
}

AdvancedAuctionOperation::AdvancedAuctionOperation(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdvancedAuctionOperation::~AdvancedAuctionOperation()
{

}

void
AdvancedAuctionOperation::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AdvancedAuctionOperation::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



