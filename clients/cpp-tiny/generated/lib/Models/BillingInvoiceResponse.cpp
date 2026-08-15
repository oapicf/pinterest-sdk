

#include "BillingInvoiceResponse.h"

using namespace Tiny;

BillingInvoiceResponse::BillingInvoiceResponse()
{
	ad_account_id = std::string();
	ad_account_name = std::string();
	amount_billed_micro_currency = int(0);
	amount_discount_micro_currency = int(0);
	amount_net_micro_currency = int(0);
	amount_tax_micro_currency = int(0);
	bill_to_country = std::string();
	billing_period_end_date = std::string();
	billing_period_start_date = std::string();
	currency = Currency();
	document_type = std::string();
	id = std::string();
	invoice_due_date = std::string();
	payment_terms = std::string();
	status = std::string();
}

BillingInvoiceResponse::BillingInvoiceResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

BillingInvoiceResponse::~BillingInvoiceResponse()
{

}

void
BillingInvoiceResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_account_idKey = "ad_account_id";

    if(object.has_key(ad_account_idKey))
    {
        bourne::json value = object[ad_account_idKey];



        jsonToValue(&ad_account_id, value, "std::string");


    }

    const char *ad_account_nameKey = "ad_account_name";

    if(object.has_key(ad_account_nameKey))
    {
        bourne::json value = object[ad_account_nameKey];



        jsonToValue(&ad_account_name, value, "std::string");


    }

    const char *amount_billed_micro_currencyKey = "amount_billed_micro_currency";

    if(object.has_key(amount_billed_micro_currencyKey))
    {
        bourne::json value = object[amount_billed_micro_currencyKey];



        jsonToValue(&amount_billed_micro_currency, value, "int");


    }

    const char *amount_discount_micro_currencyKey = "amount_discount_micro_currency";

    if(object.has_key(amount_discount_micro_currencyKey))
    {
        bourne::json value = object[amount_discount_micro_currencyKey];



        jsonToValue(&amount_discount_micro_currency, value, "int");


    }

    const char *amount_net_micro_currencyKey = "amount_net_micro_currency";

    if(object.has_key(amount_net_micro_currencyKey))
    {
        bourne::json value = object[amount_net_micro_currencyKey];



        jsonToValue(&amount_net_micro_currency, value, "int");


    }

    const char *amount_tax_micro_currencyKey = "amount_tax_micro_currency";

    if(object.has_key(amount_tax_micro_currencyKey))
    {
        bourne::json value = object[amount_tax_micro_currencyKey];



        jsonToValue(&amount_tax_micro_currency, value, "int");


    }

    const char *bill_to_countryKey = "bill_to_country";

    if(object.has_key(bill_to_countryKey))
    {
        bourne::json value = object[bill_to_countryKey];



        jsonToValue(&bill_to_country, value, "std::string");


    }

    const char *billing_period_end_dateKey = "billing_period_end_date";

    if(object.has_key(billing_period_end_dateKey))
    {
        bourne::json value = object[billing_period_end_dateKey];




        Date* obj = &billing_period_end_date;
		obj->fromJson(value.dump());

    }

    const char *billing_period_start_dateKey = "billing_period_start_date";

    if(object.has_key(billing_period_start_dateKey))
    {
        bourne::json value = object[billing_period_start_dateKey];




        Date* obj = &billing_period_start_date;
		obj->fromJson(value.dump());

    }

    const char *currencyKey = "currency";

    if(object.has_key(currencyKey))
    {
        bourne::json value = object[currencyKey];




        Currency* obj = &currency;
		obj->fromJson(value.dump());

    }

    const char *document_typeKey = "document_type";

    if(object.has_key(document_typeKey))
    {
        bourne::json value = object[document_typeKey];



        jsonToValue(&document_type, value, "std::string");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *invoice_due_dateKey = "invoice_due_date";

    if(object.has_key(invoice_due_dateKey))
    {
        bourne::json value = object[invoice_due_dateKey];




        Date* obj = &invoice_due_date;
		obj->fromJson(value.dump());

    }

    const char *payment_termsKey = "payment_terms";

    if(object.has_key(payment_termsKey))
    {
        bourne::json value = object[payment_termsKey];



        jsonToValue(&payment_terms, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];



        jsonToValue(&status, value, "std::string");


    }


}

bourne::json
BillingInvoiceResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_account_id"] = getAdAccountId();






    object["ad_account_name"] = getAdAccountName();






    object["amount_billed_micro_currency"] = getAmountBilledMicroCurrency();






    object["amount_discount_micro_currency"] = getAmountDiscountMicroCurrency();






    object["amount_net_micro_currency"] = getAmountNetMicroCurrency();






    object["amount_tax_micro_currency"] = getAmountTaxMicroCurrency();






    object["bill_to_country"] = getBillToCountry();







	object["billing_period_end_date"] = getBillingPeriodEndDate().toJson();






	object["billing_period_start_date"] = getBillingPeriodStartDate().toJson();






	object["currency"] = getCurrency().toJson();





    object["document_type"] = getDocumentType();






    object["id"] = getId();







	object["invoice_due_date"] = getInvoiceDueDate().toJson();





    object["payment_terms"] = getPaymentTerms();






    object["status"] = getStatus();



    return object;

}

std::string
BillingInvoiceResponse::getAdAccountId()
{
	return ad_account_id;
}

void
BillingInvoiceResponse::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::string
BillingInvoiceResponse::getAdAccountName()
{
	return ad_account_name;
}

void
BillingInvoiceResponse::setAdAccountName(std::string  ad_account_name)
{
	this->ad_account_name = ad_account_name;
}

int
BillingInvoiceResponse::getAmountBilledMicroCurrency()
{
	return amount_billed_micro_currency;
}

void
BillingInvoiceResponse::setAmountBilledMicroCurrency(int  amount_billed_micro_currency)
{
	this->amount_billed_micro_currency = amount_billed_micro_currency;
}

int
BillingInvoiceResponse::getAmountDiscountMicroCurrency()
{
	return amount_discount_micro_currency;
}

void
BillingInvoiceResponse::setAmountDiscountMicroCurrency(int  amount_discount_micro_currency)
{
	this->amount_discount_micro_currency = amount_discount_micro_currency;
}

int
BillingInvoiceResponse::getAmountNetMicroCurrency()
{
	return amount_net_micro_currency;
}

void
BillingInvoiceResponse::setAmountNetMicroCurrency(int  amount_net_micro_currency)
{
	this->amount_net_micro_currency = amount_net_micro_currency;
}

int
BillingInvoiceResponse::getAmountTaxMicroCurrency()
{
	return amount_tax_micro_currency;
}

void
BillingInvoiceResponse::setAmountTaxMicroCurrency(int  amount_tax_micro_currency)
{
	this->amount_tax_micro_currency = amount_tax_micro_currency;
}

std::string
BillingInvoiceResponse::getBillToCountry()
{
	return bill_to_country;
}

void
BillingInvoiceResponse::setBillToCountry(std::string  bill_to_country)
{
	this->bill_to_country = bill_to_country;
}

Date
BillingInvoiceResponse::getBillingPeriodEndDate()
{
	return billing_period_end_date;
}

void
BillingInvoiceResponse::setBillingPeriodEndDate(Date  billing_period_end_date)
{
	this->billing_period_end_date = billing_period_end_date;
}

Date
BillingInvoiceResponse::getBillingPeriodStartDate()
{
	return billing_period_start_date;
}

void
BillingInvoiceResponse::setBillingPeriodStartDate(Date  billing_period_start_date)
{
	this->billing_period_start_date = billing_period_start_date;
}

Currency
BillingInvoiceResponse::getCurrency()
{
	return currency;
}

void
BillingInvoiceResponse::setCurrency(Currency  currency)
{
	this->currency = currency;
}

std::string
BillingInvoiceResponse::getDocumentType()
{
	return document_type;
}

void
BillingInvoiceResponse::setDocumentType(std::string  document_type)
{
	this->document_type = document_type;
}

std::string
BillingInvoiceResponse::getId()
{
	return id;
}

void
BillingInvoiceResponse::setId(std::string  id)
{
	this->id = id;
}

Date
BillingInvoiceResponse::getInvoiceDueDate()
{
	return invoice_due_date;
}

void
BillingInvoiceResponse::setInvoiceDueDate(Date  invoice_due_date)
{
	this->invoice_due_date = invoice_due_date;
}

std::string
BillingInvoiceResponse::getPaymentTerms()
{
	return payment_terms;
}

void
BillingInvoiceResponse::setPaymentTerms(std::string  payment_terms)
{
	this->payment_terms = payment_terms;
}

std::string
BillingInvoiceResponse::getStatus()
{
	return status;
}

void
BillingInvoiceResponse::setStatus(std::string  status)
{
	this->status = status;
}



