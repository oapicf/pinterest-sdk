

#include "DiscountStatus.h"

using namespace Tiny;

DiscountStatus::DiscountStatus()
{
}

DiscountStatus::DiscountStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

DiscountStatus::~DiscountStatus()
{

}

void
DiscountStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
DiscountStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



