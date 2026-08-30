

#include "BillingType.h"

using namespace Tiny;

BillingType::BillingType()
{
}

BillingType::BillingType(std::string jsonString)
{
	this->fromJson(jsonString);
}

BillingType::~BillingType()
{

}

void
BillingType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
BillingType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



