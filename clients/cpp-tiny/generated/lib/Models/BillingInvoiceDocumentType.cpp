

#include "BillingInvoiceDocumentType.h"

using namespace Tiny;

BillingInvoiceDocumentType::BillingInvoiceDocumentType()
{
}

BillingInvoiceDocumentType::BillingInvoiceDocumentType(std::string jsonString)
{
	this->fromJson(jsonString);
}

BillingInvoiceDocumentType::~BillingInvoiceDocumentType()
{

}

void
BillingInvoiceDocumentType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
BillingInvoiceDocumentType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



