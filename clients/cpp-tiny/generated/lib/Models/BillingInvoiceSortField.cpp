

#include "BillingInvoiceSortField.h"

using namespace Tiny;

BillingInvoiceSortField::BillingInvoiceSortField()
{
}

BillingInvoiceSortField::BillingInvoiceSortField(std::string jsonString)
{
	this->fromJson(jsonString);
}

BillingInvoiceSortField::~BillingInvoiceSortField()
{

}

void
BillingInvoiceSortField::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
BillingInvoiceSortField::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



