

#include "BillingProfileStatus.h"

using namespace Tiny;

BillingProfileStatus::BillingProfileStatus()
{
}

BillingProfileStatus::BillingProfileStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

BillingProfileStatus::~BillingProfileStatus()
{

}

void
BillingProfileStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
BillingProfileStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



