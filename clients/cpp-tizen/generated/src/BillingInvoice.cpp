#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BillingInvoice.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BillingInvoice::BillingInvoice()
{
	//__init();
}

BillingInvoice::~BillingInvoice()
{
	//__cleanup();
}

void
BillingInvoice::__init()
{
	//ad_account_id = std::string();
	//ad_account_name = std::string();
	//amount_billed_micro_currency = int(0);
	//amount_discount_micro_currency = int(0);
	//amount_net_micro_currency = int(0);
	//amount_tax_micro_currency = int(0);
	//bill_to_country = std::string();
	//billing_period_end_date = null;
	//billing_period_start_date = null;
	//currency = new Currency();
	//document_type = null;
	//id = std::string();
	//invoice_due_date = null;
	//payment_terms = std::string();
	//status = null;
}

void
BillingInvoice::__cleanup()
{
	//if(ad_account_id != NULL) {
	//
	//delete ad_account_id;
	//ad_account_id = NULL;
	//}
	//if(ad_account_name != NULL) {
	//
	//delete ad_account_name;
	//ad_account_name = NULL;
	//}
	//if(amount_billed_micro_currency != NULL) {
	//
	//delete amount_billed_micro_currency;
	//amount_billed_micro_currency = NULL;
	//}
	//if(amount_discount_micro_currency != NULL) {
	//
	//delete amount_discount_micro_currency;
	//amount_discount_micro_currency = NULL;
	//}
	//if(amount_net_micro_currency != NULL) {
	//
	//delete amount_net_micro_currency;
	//amount_net_micro_currency = NULL;
	//}
	//if(amount_tax_micro_currency != NULL) {
	//
	//delete amount_tax_micro_currency;
	//amount_tax_micro_currency = NULL;
	//}
	//if(bill_to_country != NULL) {
	//
	//delete bill_to_country;
	//bill_to_country = NULL;
	//}
	//if(billing_period_end_date != NULL) {
	//
	//delete billing_period_end_date;
	//billing_period_end_date = NULL;
	//}
	//if(billing_period_start_date != NULL) {
	//
	//delete billing_period_start_date;
	//billing_period_start_date = NULL;
	//}
	//if(currency != NULL) {
	//
	//delete currency;
	//currency = NULL;
	//}
	//if(document_type != NULL) {
	//
	//delete document_type;
	//document_type = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(invoice_due_date != NULL) {
	//
	//delete invoice_due_date;
	//invoice_due_date = NULL;
	//}
	//if(payment_terms != NULL) {
	//
	//delete payment_terms;
	//payment_terms = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//
}

void
BillingInvoice::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ad_account_idKey = "ad_account_id";
	node = json_object_get_member(pJsonObject, ad_account_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ad_account_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *ad_account_nameKey = "ad_account_name";
	node = json_object_get_member(pJsonObject, ad_account_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ad_account_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *amount_billed_micro_currencyKey = "amount_billed_micro_currency";
	node = json_object_get_member(pJsonObject, amount_billed_micro_currencyKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&amount_billed_micro_currency, node, "int", "");
		} else {
			
		}
	}
	const gchar *amount_discount_micro_currencyKey = "amount_discount_micro_currency";
	node = json_object_get_member(pJsonObject, amount_discount_micro_currencyKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&amount_discount_micro_currency, node, "int", "");
		} else {
			
		}
	}
	const gchar *amount_net_micro_currencyKey = "amount_net_micro_currency";
	node = json_object_get_member(pJsonObject, amount_net_micro_currencyKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&amount_net_micro_currency, node, "int", "");
		} else {
			
		}
	}
	const gchar *amount_tax_micro_currencyKey = "amount_tax_micro_currency";
	node = json_object_get_member(pJsonObject, amount_tax_micro_currencyKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&amount_tax_micro_currency, node, "int", "");
		} else {
			
		}
	}
	const gchar *bill_to_countryKey = "bill_to_country";
	node = json_object_get_member(pJsonObject, bill_to_countryKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&bill_to_country, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *billing_period_end_dateKey = "billing_period_end_date";
	node = json_object_get_member(pJsonObject, billing_period_end_dateKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&billing_period_end_date, node, "Date", "Date");
		} else {
			
		}
	}
	const gchar *billing_period_start_dateKey = "billing_period_start_date";
	node = json_object_get_member(pJsonObject, billing_period_start_dateKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&billing_period_start_date, node, "Date", "Date");
		} else {
			
		}
	}
	const gchar *currencyKey = "currency";
	node = json_object_get_member(pJsonObject, currencyKey);
	if (node !=NULL) {
	

		if (isprimitive("Currency")) {
			jsonToValue(&currency, node, "Currency", "Currency");
		} else {
			
			Currency* obj = static_cast<Currency*> (&currency);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *document_typeKey = "document_type";
	node = json_object_get_member(pJsonObject, document_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("BillingInvoiceDocumentType")) {
			jsonToValue(&document_type, node, "BillingInvoiceDocumentType", "BillingInvoiceDocumentType");
		} else {
			
			BillingInvoiceDocumentType* obj = static_cast<BillingInvoiceDocumentType*> (&document_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *invoice_due_dateKey = "invoice_due_date";
	node = json_object_get_member(pJsonObject, invoice_due_dateKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&invoice_due_date, node, "Date", "Date");
		} else {
			
		}
	}
	const gchar *payment_termsKey = "payment_terms";
	node = json_object_get_member(pJsonObject, payment_termsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&payment_terms, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("BillingInvoiceStatus")) {
			jsonToValue(&status, node, "BillingInvoiceStatus", "BillingInvoiceStatus");
		} else {
			
			BillingInvoiceStatus* obj = static_cast<BillingInvoiceStatus*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

BillingInvoice::BillingInvoice(char* json)
{
	this->fromJson(json);
}

char*
BillingInvoice::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAdAccountId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ad_account_idKey = "ad_account_id";
	json_object_set_member(pJsonObject, ad_account_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAdAccountName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ad_account_nameKey = "ad_account_name";
	json_object_set_member(pJsonObject, ad_account_nameKey, node);
	if (isprimitive("int")) {
		int obj = getAmountBilledMicroCurrency();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *amount_billed_micro_currencyKey = "amount_billed_micro_currency";
	json_object_set_member(pJsonObject, amount_billed_micro_currencyKey, node);
	if (isprimitive("int")) {
		int obj = getAmountDiscountMicroCurrency();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *amount_discount_micro_currencyKey = "amount_discount_micro_currency";
	json_object_set_member(pJsonObject, amount_discount_micro_currencyKey, node);
	if (isprimitive("int")) {
		int obj = getAmountNetMicroCurrency();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *amount_net_micro_currencyKey = "amount_net_micro_currency";
	json_object_set_member(pJsonObject, amount_net_micro_currencyKey, node);
	if (isprimitive("int")) {
		int obj = getAmountTaxMicroCurrency();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *amount_tax_micro_currencyKey = "amount_tax_micro_currency";
	json_object_set_member(pJsonObject, amount_tax_micro_currencyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBillToCountry();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *bill_to_countryKey = "bill_to_country";
	json_object_set_member(pJsonObject, bill_to_countryKey, node);
	if (isprimitive("Date")) {
		Date obj = getBillingPeriodEndDate();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *billing_period_end_dateKey = "billing_period_end_date";
	json_object_set_member(pJsonObject, billing_period_end_dateKey, node);
	if (isprimitive("Date")) {
		Date obj = getBillingPeriodStartDate();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *billing_period_start_dateKey = "billing_period_start_date";
	json_object_set_member(pJsonObject, billing_period_start_dateKey, node);
	if (isprimitive("Currency")) {
		Currency obj = getCurrency();
		node = converttoJson(&obj, "Currency", "");
	}
	else {
		
		Currency obj = static_cast<Currency> (getCurrency());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *currencyKey = "currency";
	json_object_set_member(pJsonObject, currencyKey, node);
	if (isprimitive("BillingInvoiceDocumentType")) {
		BillingInvoiceDocumentType obj = getDocumentType();
		node = converttoJson(&obj, "BillingInvoiceDocumentType", "");
	}
	else {
		
		BillingInvoiceDocumentType obj = static_cast<BillingInvoiceDocumentType> (getDocumentType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *document_typeKey = "document_type";
	json_object_set_member(pJsonObject, document_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("Date")) {
		Date obj = getInvoiceDueDate();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *invoice_due_dateKey = "invoice_due_date";
	json_object_set_member(pJsonObject, invoice_due_dateKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPaymentTerms();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *payment_termsKey = "payment_terms";
	json_object_set_member(pJsonObject, payment_termsKey, node);
	if (isprimitive("BillingInvoiceStatus")) {
		BillingInvoiceStatus obj = getStatus();
		node = converttoJson(&obj, "BillingInvoiceStatus", "");
	}
	else {
		
		BillingInvoiceStatus obj = static_cast<BillingInvoiceStatus> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
BillingInvoice::getAdAccountId()
{
	return ad_account_id;
}

void
BillingInvoice::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::string
BillingInvoice::getAdAccountName()
{
	return ad_account_name;
}

void
BillingInvoice::setAdAccountName(std::string  ad_account_name)
{
	this->ad_account_name = ad_account_name;
}

int
BillingInvoice::getAmountBilledMicroCurrency()
{
	return amount_billed_micro_currency;
}

void
BillingInvoice::setAmountBilledMicroCurrency(int  amount_billed_micro_currency)
{
	this->amount_billed_micro_currency = amount_billed_micro_currency;
}

int
BillingInvoice::getAmountDiscountMicroCurrency()
{
	return amount_discount_micro_currency;
}

void
BillingInvoice::setAmountDiscountMicroCurrency(int  amount_discount_micro_currency)
{
	this->amount_discount_micro_currency = amount_discount_micro_currency;
}

int
BillingInvoice::getAmountNetMicroCurrency()
{
	return amount_net_micro_currency;
}

void
BillingInvoice::setAmountNetMicroCurrency(int  amount_net_micro_currency)
{
	this->amount_net_micro_currency = amount_net_micro_currency;
}

int
BillingInvoice::getAmountTaxMicroCurrency()
{
	return amount_tax_micro_currency;
}

void
BillingInvoice::setAmountTaxMicroCurrency(int  amount_tax_micro_currency)
{
	this->amount_tax_micro_currency = amount_tax_micro_currency;
}

std::string
BillingInvoice::getBillToCountry()
{
	return bill_to_country;
}

void
BillingInvoice::setBillToCountry(std::string  bill_to_country)
{
	this->bill_to_country = bill_to_country;
}

Date
BillingInvoice::getBillingPeriodEndDate()
{
	return billing_period_end_date;
}

void
BillingInvoice::setBillingPeriodEndDate(Date  billing_period_end_date)
{
	this->billing_period_end_date = billing_period_end_date;
}

Date
BillingInvoice::getBillingPeriodStartDate()
{
	return billing_period_start_date;
}

void
BillingInvoice::setBillingPeriodStartDate(Date  billing_period_start_date)
{
	this->billing_period_start_date = billing_period_start_date;
}

Currency
BillingInvoice::getCurrency()
{
	return currency;
}

void
BillingInvoice::setCurrency(Currency  currency)
{
	this->currency = currency;
}

BillingInvoiceDocumentType
BillingInvoice::getDocumentType()
{
	return document_type;
}

void
BillingInvoice::setDocumentType(BillingInvoiceDocumentType  document_type)
{
	this->document_type = document_type;
}

std::string
BillingInvoice::getId()
{
	return id;
}

void
BillingInvoice::setId(std::string  id)
{
	this->id = id;
}

Date
BillingInvoice::getInvoiceDueDate()
{
	return invoice_due_date;
}

void
BillingInvoice::setInvoiceDueDate(Date  invoice_due_date)
{
	this->invoice_due_date = invoice_due_date;
}

std::string
BillingInvoice::getPaymentTerms()
{
	return payment_terms;
}

void
BillingInvoice::setPaymentTerms(std::string  payment_terms)
{
	this->payment_terms = payment_terms;
}

BillingInvoiceStatus
BillingInvoice::getStatus()
{
	return status;
}

void
BillingInvoice::setStatus(BillingInvoiceStatus  status)
{
	this->status = status;
}


