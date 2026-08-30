

#include "BillingInvoiceStatus.h"

using namespace Tiny;

BillingInvoiceStatus::BillingInvoiceStatus()
{
}

BillingInvoiceStatus::BillingInvoiceStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

BillingInvoiceStatus::~BillingInvoiceStatus()
{

}

void
BillingInvoiceStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
BillingInvoiceStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



