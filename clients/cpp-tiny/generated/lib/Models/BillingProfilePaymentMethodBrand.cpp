

#include "BillingProfilePaymentMethodBrand.h"

using namespace Tiny;

BillingProfilePaymentMethodBrand::BillingProfilePaymentMethodBrand()
{
}

BillingProfilePaymentMethodBrand::BillingProfilePaymentMethodBrand(std::string jsonString)
{
	this->fromJson(jsonString);
}

BillingProfilePaymentMethodBrand::~BillingProfilePaymentMethodBrand()
{

}

void
BillingProfilePaymentMethodBrand::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
BillingProfilePaymentMethodBrand::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



