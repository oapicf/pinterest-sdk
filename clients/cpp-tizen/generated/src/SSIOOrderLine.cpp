#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SSIOOrderLine.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SSIOOrderLine::SSIOOrderLine()
{
	//__init();
}

SSIOOrderLine::~SSIOOrderLine()
{
	//__cleanup();
}

void
SSIOOrderLine::__init()
{
	//salesforce_order_line_id = std::string();
	//ads_manager_order_line_id = std::string();
	//pin_order_id = std::string();
	//last_modified_date_time = std::string();
	//start_date = null;
	//end_date = null;
	//bill_to_company_name = std::string();
	//billing_contact_firstname = std::string();
	//billing_contact_lastname = std::string();
	//billing_contact_email = std::string();
	//media_contact_email = std::string();
	//media_contact_firstname = std::string();
	//media_contact_lastname = std::string();
	//currency_info = new Currency();
	//agency_link = std::string();
	//po_number = std::string();
	//order_name = std::string();
	//pmp_name = std::string();
	//accepted_terms_id = std::string();
	//accepted_terms_time = std::string();
	//budget_amount = double(0);
	//estimated_monthly_spend = double(0);
}

void
SSIOOrderLine::__cleanup()
{
	//if(salesforce_order_line_id != NULL) {
	//
	//delete salesforce_order_line_id;
	//salesforce_order_line_id = NULL;
	//}
	//if(ads_manager_order_line_id != NULL) {
	//
	//delete ads_manager_order_line_id;
	//ads_manager_order_line_id = NULL;
	//}
	//if(pin_order_id != NULL) {
	//
	//delete pin_order_id;
	//pin_order_id = NULL;
	//}
	//if(last_modified_date_time != NULL) {
	//
	//delete last_modified_date_time;
	//last_modified_date_time = NULL;
	//}
	//if(start_date != NULL) {
	//
	//delete start_date;
	//start_date = NULL;
	//}
	//if(end_date != NULL) {
	//
	//delete end_date;
	//end_date = NULL;
	//}
	//if(bill_to_company_name != NULL) {
	//
	//delete bill_to_company_name;
	//bill_to_company_name = NULL;
	//}
	//if(billing_contact_firstname != NULL) {
	//
	//delete billing_contact_firstname;
	//billing_contact_firstname = NULL;
	//}
	//if(billing_contact_lastname != NULL) {
	//
	//delete billing_contact_lastname;
	//billing_contact_lastname = NULL;
	//}
	//if(billing_contact_email != NULL) {
	//
	//delete billing_contact_email;
	//billing_contact_email = NULL;
	//}
	//if(media_contact_email != NULL) {
	//
	//delete media_contact_email;
	//media_contact_email = NULL;
	//}
	//if(media_contact_firstname != NULL) {
	//
	//delete media_contact_firstname;
	//media_contact_firstname = NULL;
	//}
	//if(media_contact_lastname != NULL) {
	//
	//delete media_contact_lastname;
	//media_contact_lastname = NULL;
	//}
	//if(currency_info != NULL) {
	//
	//delete currency_info;
	//currency_info = NULL;
	//}
	//if(agency_link != NULL) {
	//
	//delete agency_link;
	//agency_link = NULL;
	//}
	//if(po_number != NULL) {
	//
	//delete po_number;
	//po_number = NULL;
	//}
	//if(order_name != NULL) {
	//
	//delete order_name;
	//order_name = NULL;
	//}
	//if(pmp_name != NULL) {
	//
	//delete pmp_name;
	//pmp_name = NULL;
	//}
	//if(accepted_terms_id != NULL) {
	//
	//delete accepted_terms_id;
	//accepted_terms_id = NULL;
	//}
	//if(accepted_terms_time != NULL) {
	//
	//delete accepted_terms_time;
	//accepted_terms_time = NULL;
	//}
	//if(budget_amount != NULL) {
	//
	//delete budget_amount;
	//budget_amount = NULL;
	//}
	//if(estimated_monthly_spend != NULL) {
	//
	//delete estimated_monthly_spend;
	//estimated_monthly_spend = NULL;
	//}
	//
}

void
SSIOOrderLine::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *salesforce_order_line_idKey = "salesforce_order_line_id";
	node = json_object_get_member(pJsonObject, salesforce_order_line_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&salesforce_order_line_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *ads_manager_order_line_idKey = "ads_manager_order_line_id";
	node = json_object_get_member(pJsonObject, ads_manager_order_line_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ads_manager_order_line_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *pin_order_idKey = "pin_order_id";
	node = json_object_get_member(pJsonObject, pin_order_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&pin_order_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *last_modified_date_timeKey = "last_modified_date_time";
	node = json_object_get_member(pJsonObject, last_modified_date_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&last_modified_date_time, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *start_dateKey = "start_date";
	node = json_object_get_member(pJsonObject, start_dateKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&start_date, node, "Date", "Date");
		} else {
			
		}
	}
	const gchar *end_dateKey = "end_date";
	node = json_object_get_member(pJsonObject, end_dateKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&end_date, node, "Date", "Date");
		} else {
			
		}
	}
	const gchar *bill_to_company_nameKey = "bill_to_company_name";
	node = json_object_get_member(pJsonObject, bill_to_company_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&bill_to_company_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *billing_contact_firstnameKey = "billing_contact_firstname";
	node = json_object_get_member(pJsonObject, billing_contact_firstnameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&billing_contact_firstname, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *billing_contact_lastnameKey = "billing_contact_lastname";
	node = json_object_get_member(pJsonObject, billing_contact_lastnameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&billing_contact_lastname, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *billing_contact_emailKey = "billing_contact_email";
	node = json_object_get_member(pJsonObject, billing_contact_emailKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&billing_contact_email, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *media_contact_emailKey = "media_contact_email";
	node = json_object_get_member(pJsonObject, media_contact_emailKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&media_contact_email, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *media_contact_firstnameKey = "media_contact_firstname";
	node = json_object_get_member(pJsonObject, media_contact_firstnameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&media_contact_firstname, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *media_contact_lastnameKey = "media_contact_lastname";
	node = json_object_get_member(pJsonObject, media_contact_lastnameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&media_contact_lastname, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *currency_infoKey = "currency_info";
	node = json_object_get_member(pJsonObject, currency_infoKey);
	if (node !=NULL) {
	

		if (isprimitive("Currency")) {
			jsonToValue(&currency_info, node, "Currency", "Currency");
		} else {
			
			Currency* obj = static_cast<Currency*> (&currency_info);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *agency_linkKey = "agency_link";
	node = json_object_get_member(pJsonObject, agency_linkKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&agency_link, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *po_numberKey = "po_number";
	node = json_object_get_member(pJsonObject, po_numberKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&po_number, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *order_nameKey = "order_name";
	node = json_object_get_member(pJsonObject, order_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&order_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *pmp_nameKey = "pmp_name";
	node = json_object_get_member(pJsonObject, pmp_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&pmp_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *accepted_terms_idKey = "accepted_terms_id";
	node = json_object_get_member(pJsonObject, accepted_terms_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&accepted_terms_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *accepted_terms_timeKey = "accepted_terms_time";
	node = json_object_get_member(pJsonObject, accepted_terms_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&accepted_terms_time, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *budget_amountKey = "budget_amount";
	node = json_object_get_member(pJsonObject, budget_amountKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&budget_amount, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&budget_amount);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *estimated_monthly_spendKey = "estimated_monthly_spend";
	node = json_object_get_member(pJsonObject, estimated_monthly_spendKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&estimated_monthly_spend, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&estimated_monthly_spend);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

SSIOOrderLine::SSIOOrderLine(char* json)
{
	this->fromJson(json);
}

char*
SSIOOrderLine::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getSalesforceOrderLineId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *salesforce_order_line_idKey = "salesforce_order_line_id";
	json_object_set_member(pJsonObject, salesforce_order_line_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAdsManagerOrderLineId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ads_manager_order_line_idKey = "ads_manager_order_line_id";
	json_object_set_member(pJsonObject, ads_manager_order_line_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPinOrderId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *pin_order_idKey = "pin_order_id";
	json_object_set_member(pJsonObject, pin_order_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLastModifiedDateTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *last_modified_date_timeKey = "last_modified_date_time";
	json_object_set_member(pJsonObject, last_modified_date_timeKey, node);
	if (isprimitive("Date")) {
		Date obj = getStartDate();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *start_dateKey = "start_date";
	json_object_set_member(pJsonObject, start_dateKey, node);
	if (isprimitive("Date")) {
		Date obj = getEndDate();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *end_dateKey = "end_date";
	json_object_set_member(pJsonObject, end_dateKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBillToCompanyName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *bill_to_company_nameKey = "bill_to_company_name";
	json_object_set_member(pJsonObject, bill_to_company_nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBillingContactFirstname();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *billing_contact_firstnameKey = "billing_contact_firstname";
	json_object_set_member(pJsonObject, billing_contact_firstnameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBillingContactLastname();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *billing_contact_lastnameKey = "billing_contact_lastname";
	json_object_set_member(pJsonObject, billing_contact_lastnameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBillingContactEmail();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *billing_contact_emailKey = "billing_contact_email";
	json_object_set_member(pJsonObject, billing_contact_emailKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMediaContactEmail();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *media_contact_emailKey = "media_contact_email";
	json_object_set_member(pJsonObject, media_contact_emailKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMediaContactFirstname();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *media_contact_firstnameKey = "media_contact_firstname";
	json_object_set_member(pJsonObject, media_contact_firstnameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMediaContactLastname();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *media_contact_lastnameKey = "media_contact_lastname";
	json_object_set_member(pJsonObject, media_contact_lastnameKey, node);
	if (isprimitive("Currency")) {
		Currency obj = getCurrencyInfo();
		node = converttoJson(&obj, "Currency", "");
	}
	else {
		
		Currency obj = static_cast<Currency> (getCurrencyInfo());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *currency_infoKey = "currency_info";
	json_object_set_member(pJsonObject, currency_infoKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAgencyLink();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *agency_linkKey = "agency_link";
	json_object_set_member(pJsonObject, agency_linkKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPoNumber();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *po_numberKey = "po_number";
	json_object_set_member(pJsonObject, po_numberKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOrderName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *order_nameKey = "order_name";
	json_object_set_member(pJsonObject, order_nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPmpName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *pmp_nameKey = "pmp_name";
	json_object_set_member(pJsonObject, pmp_nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAcceptedTermsId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *accepted_terms_idKey = "accepted_terms_id";
	json_object_set_member(pJsonObject, accepted_terms_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAcceptedTermsTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *accepted_terms_timeKey = "accepted_terms_time";
	json_object_set_member(pJsonObject, accepted_terms_timeKey, node);
	if (isprimitive("long long")) {
		long long obj = getBudgetAmount();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getBudgetAmount());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *budget_amountKey = "budget_amount";
	json_object_set_member(pJsonObject, budget_amountKey, node);
	if (isprimitive("long long")) {
		long long obj = getEstimatedMonthlySpend();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getEstimatedMonthlySpend());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *estimated_monthly_spendKey = "estimated_monthly_spend";
	json_object_set_member(pJsonObject, estimated_monthly_spendKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
SSIOOrderLine::getSalesforceOrderLineId()
{
	return salesforce_order_line_id;
}

void
SSIOOrderLine::setSalesforceOrderLineId(std::string  salesforce_order_line_id)
{
	this->salesforce_order_line_id = salesforce_order_line_id;
}

std::string
SSIOOrderLine::getAdsManagerOrderLineId()
{
	return ads_manager_order_line_id;
}

void
SSIOOrderLine::setAdsManagerOrderLineId(std::string  ads_manager_order_line_id)
{
	this->ads_manager_order_line_id = ads_manager_order_line_id;
}

std::string
SSIOOrderLine::getPinOrderId()
{
	return pin_order_id;
}

void
SSIOOrderLine::setPinOrderId(std::string  pin_order_id)
{
	this->pin_order_id = pin_order_id;
}

std::string
SSIOOrderLine::getLastModifiedDateTime()
{
	return last_modified_date_time;
}

void
SSIOOrderLine::setLastModifiedDateTime(std::string  last_modified_date_time)
{
	this->last_modified_date_time = last_modified_date_time;
}

Date
SSIOOrderLine::getStartDate()
{
	return start_date;
}

void
SSIOOrderLine::setStartDate(Date  start_date)
{
	this->start_date = start_date;
}

Date
SSIOOrderLine::getEndDate()
{
	return end_date;
}

void
SSIOOrderLine::setEndDate(Date  end_date)
{
	this->end_date = end_date;
}

std::string
SSIOOrderLine::getBillToCompanyName()
{
	return bill_to_company_name;
}

void
SSIOOrderLine::setBillToCompanyName(std::string  bill_to_company_name)
{
	this->bill_to_company_name = bill_to_company_name;
}

std::string
SSIOOrderLine::getBillingContactFirstname()
{
	return billing_contact_firstname;
}

void
SSIOOrderLine::setBillingContactFirstname(std::string  billing_contact_firstname)
{
	this->billing_contact_firstname = billing_contact_firstname;
}

std::string
SSIOOrderLine::getBillingContactLastname()
{
	return billing_contact_lastname;
}

void
SSIOOrderLine::setBillingContactLastname(std::string  billing_contact_lastname)
{
	this->billing_contact_lastname = billing_contact_lastname;
}

std::string
SSIOOrderLine::getBillingContactEmail()
{
	return billing_contact_email;
}

void
SSIOOrderLine::setBillingContactEmail(std::string  billing_contact_email)
{
	this->billing_contact_email = billing_contact_email;
}

std::string
SSIOOrderLine::getMediaContactEmail()
{
	return media_contact_email;
}

void
SSIOOrderLine::setMediaContactEmail(std::string  media_contact_email)
{
	this->media_contact_email = media_contact_email;
}

std::string
SSIOOrderLine::getMediaContactFirstname()
{
	return media_contact_firstname;
}

void
SSIOOrderLine::setMediaContactFirstname(std::string  media_contact_firstname)
{
	this->media_contact_firstname = media_contact_firstname;
}

std::string
SSIOOrderLine::getMediaContactLastname()
{
	return media_contact_lastname;
}

void
SSIOOrderLine::setMediaContactLastname(std::string  media_contact_lastname)
{
	this->media_contact_lastname = media_contact_lastname;
}

Currency
SSIOOrderLine::getCurrencyInfo()
{
	return currency_info;
}

void
SSIOOrderLine::setCurrencyInfo(Currency  currency_info)
{
	this->currency_info = currency_info;
}

std::string
SSIOOrderLine::getAgencyLink()
{
	return agency_link;
}

void
SSIOOrderLine::setAgencyLink(std::string  agency_link)
{
	this->agency_link = agency_link;
}

std::string
SSIOOrderLine::getPoNumber()
{
	return po_number;
}

void
SSIOOrderLine::setPoNumber(std::string  po_number)
{
	this->po_number = po_number;
}

std::string
SSIOOrderLine::getOrderName()
{
	return order_name;
}

void
SSIOOrderLine::setOrderName(std::string  order_name)
{
	this->order_name = order_name;
}

std::string
SSIOOrderLine::getPmpName()
{
	return pmp_name;
}

void
SSIOOrderLine::setPmpName(std::string  pmp_name)
{
	this->pmp_name = pmp_name;
}

std::string
SSIOOrderLine::getAcceptedTermsId()
{
	return accepted_terms_id;
}

void
SSIOOrderLine::setAcceptedTermsId(std::string  accepted_terms_id)
{
	this->accepted_terms_id = accepted_terms_id;
}

std::string
SSIOOrderLine::getAcceptedTermsTime()
{
	return accepted_terms_time;
}

void
SSIOOrderLine::setAcceptedTermsTime(std::string  accepted_terms_time)
{
	this->accepted_terms_time = accepted_terms_time;
}

long long
SSIOOrderLine::getBudgetAmount()
{
	return budget_amount;
}

void
SSIOOrderLine::setBudgetAmount(long long  budget_amount)
{
	this->budget_amount = budget_amount;
}

long long
SSIOOrderLine::getEstimatedMonthlySpend()
{
	return estimated_monthly_spend;
}

void
SSIOOrderLine::setEstimatedMonthlySpend(long long  estimated_monthly_spend)
{
	this->estimated_monthly_spend = estimated_monthly_spend;
}


