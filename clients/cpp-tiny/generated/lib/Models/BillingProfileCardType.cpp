

#include "BillingProfileCardType.h"

using namespace Tiny;

BillingProfileCardType::BillingProfileCardType()
{
}

BillingProfileCardType::BillingProfileCardType(std::string jsonString)
{
	this->fromJson(jsonString);
}

BillingProfileCardType::~BillingProfileCardType()
{

}

void
BillingProfileCardType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
BillingProfileCardType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



