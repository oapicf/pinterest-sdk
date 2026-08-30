

#include "BillingInvoice.h"

using namespace Tiny;

BillingInvoice::BillingInvoice()
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
	document_type = null;
	id = std::string();
	invoice_due_date = std::string();
	payment_terms = std::string();
	status = null;
}

BillingInvoice::BillingInvoice(std::string jsonString)
{
	this->fromJson(jsonString);
}

BillingInvoice::~BillingInvoice()
{

}

void
BillingInvoice::fromJson(std::string jsonObj)
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




        BillingInvoiceDocumentType* obj = &document_type;
		obj->fromJson(value.dump());

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




        BillingInvoiceStatus* obj = &status;
		obj->fromJson(value.dump());

    }


}

bourne::json
BillingInvoice::toJson()
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






	object["document_type"] = getDocumentType().toJson();





    object["id"] = getId();







	object["invoice_due_date"] = getInvoiceDueDate().toJson();





    object["payment_terms"] = getPaymentTerms();







	object["status"] = getStatus().toJson();


    return object;

}

std::string
BillingInvoice::getAdAccountId()
{
	return ad_account_id;
}

void
BillingInvoice::setAdAccountId(std::string ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::string
BillingInvoice::getAdAccountName()
{
	return ad_account_name;
}

void
BillingInvoice::setAdAccountName(std::string ad_account_name)
{
	this->ad_account_name = ad_account_name;
}

int
BillingInvoice::getAmountBilledMicroCurrency()
{
	return amount_billed_micro_currency;
}

void
BillingInvoice::setAmountBilledMicroCurrency(int amount_billed_micro_currency)
{
	this->amount_billed_micro_currency = amount_billed_micro_currency;
}

int
BillingInvoice::getAmountDiscountMicroCurrency()
{
	return amount_discount_micro_currency;
}

void
BillingInvoice::setAmountDiscountMicroCurrency(int amount_discount_micro_currency)
{
	this->amount_discount_micro_currency = amount_discount_micro_currency;
}

int
BillingInvoice::getAmountNetMicroCurrency()
{
	return amount_net_micro_currency;
}

void
BillingInvoice::setAmountNetMicroCurrency(int amount_net_micro_currency)
{
	this->amount_net_micro_currency = amount_net_micro_currency;
}

int
BillingInvoice::getAmountTaxMicroCurrency()
{
	return amount_tax_micro_currency;
}

void
BillingInvoice::setAmountTaxMicroCurrency(int amount_tax_micro_currency)
{
	this->amount_tax_micro_currency = amount_tax_micro_currency;
}

std::string
BillingInvoice::getBillToCountry()
{
	return bill_to_country;
}

void
BillingInvoice::setBillToCountry(std::string bill_to_country)
{
	this->bill_to_country = bill_to_country;
}

Date
BillingInvoice::getBillingPeriodEndDate()
{
	return billing_period_end_date;
}

void
BillingInvoice::setBillingPeriodEndDate(Date billing_period_end_date)
{
	this->billing_period_end_date = billing_period_end_date;
}

Date
BillingInvoice::getBillingPeriodStartDate()
{
	return billing_period_start_date;
}

void
BillingInvoice::setBillingPeriodStartDate(Date billing_period_start_date)
{
	this->billing_period_start_date = billing_period_start_date;
}

Currency
BillingInvoice::getCurrency()
{
	return currency;
}

void
BillingInvoice::setCurrency(Currency currency)
{
	this->currency = currency;
}

BillingInvoiceDocumentType
BillingInvoice::getDocumentType()
{
	return document_type;
}

void
BillingInvoice::setDocumentType(BillingInvoiceDocumentType document_type)
{
	this->document_type = document_type;
}

std::string
BillingInvoice::getId()
{
	return id;
}

void
BillingInvoice::setId(std::string id)
{
	this->id = id;
}

Date
BillingInvoice::getInvoiceDueDate()
{
	return invoice_due_date;
}

void
BillingInvoice::setInvoiceDueDate(Date invoice_due_date)
{
	this->invoice_due_date = invoice_due_date;
}

std::string
BillingInvoice::getPaymentTerms()
{
	return payment_terms;
}

void
BillingInvoice::setPaymentTerms(std::string payment_terms)
{
	this->payment_terms = payment_terms;
}

BillingInvoiceStatus
BillingInvoice::getStatus()
{
	return status;
}

void
BillingInvoice::setStatus(BillingInvoiceStatus status)
{
	this->status = status;
}



