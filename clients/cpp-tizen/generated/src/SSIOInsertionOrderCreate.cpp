#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SSIOInsertionOrderCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SSIOInsertionOrderCreate::SSIOInsertionOrderCreate()
{
	//__init();
}

SSIOInsertionOrderCreate::~SSIOInsertionOrderCreate()
{
	//__cleanup();
}

void
SSIOInsertionOrderCreate::__init()
{
	//accepted_terms_id = std::string();
	//accepted_terms_time = int(0);
	//agency_link = std::string();
	//billing_contact_email = std::string();
	//billing_contact_firstname = std::string();
	//billing_contact_lastname = std::string();
	//billto_billing_address_id = std::string();
	//billto_business_address_id = std::string();
	//billto_company_id = std::string();
	//budget_amount = double(0);
	//currency_info = new Currency();
	//end_date = std::string();
	//estimated_monthly_spend = double(0);
	//media_contact_email = std::string();
	//media_contact_firstname = std::string();
	//media_contact_lastname = std::string();
	//order_line_type = null;
	//order_name = std::string();
	//pmp_id = std::string();
	//po_number = std::string();
	//start_date = std::string();
	//user_email = std::string();
}

void
SSIOInsertionOrderCreate::__cleanup()
{
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
	//if(agency_link != NULL) {
	//
	//delete agency_link;
	//agency_link = NULL;
	//}
	//if(billing_contact_email != NULL) {
	//
	//delete billing_contact_email;
	//billing_contact_email = NULL;
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
	//if(billto_billing_address_id != NULL) {
	//
	//delete billto_billing_address_id;
	//billto_billing_address_id = NULL;
	//}
	//if(billto_business_address_id != NULL) {
	//
	//delete billto_business_address_id;
	//billto_business_address_id = NULL;
	//}
	//if(billto_company_id != NULL) {
	//
	//delete billto_company_id;
	//billto_company_id = NULL;
	//}
	//if(budget_amount != NULL) {
	//
	//delete budget_amount;
	//budget_amount = NULL;
	//}
	//if(currency_info != NULL) {
	//
	//delete currency_info;
	//currency_info = NULL;
	//}
	//if(end_date != NULL) {
	//
	//delete end_date;
	//end_date = NULL;
	//}
	//if(estimated_monthly_spend != NULL) {
	//
	//delete estimated_monthly_spend;
	//estimated_monthly_spend = NULL;
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
	//if(order_line_type != NULL) {
	//
	//delete order_line_type;
	//order_line_type = NULL;
	//}
	//if(order_name != NULL) {
	//
	//delete order_name;
	//order_name = NULL;
	//}
	//if(pmp_id != NULL) {
	//
	//delete pmp_id;
	//pmp_id = NULL;
	//}
	//if(po_number != NULL) {
	//
	//delete po_number;
	//po_number = NULL;
	//}
	//if(start_date != NULL) {
	//
	//delete start_date;
	//start_date = NULL;
	//}
	//if(user_email != NULL) {
	//
	//delete user_email;
	//user_email = NULL;
	//}
	//
}

void
SSIOInsertionOrderCreate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	

		if (isprimitive("int")) {
			jsonToValue(&accepted_terms_time, node, "int", "");
		} else {
			
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
	const gchar *billing_contact_emailKey = "billing_contact_email";
	node = json_object_get_member(pJsonObject, billing_contact_emailKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&billing_contact_email, node, "std::string", "");
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
	const gchar *billto_billing_address_idKey = "billto_billing_address_id";
	node = json_object_get_member(pJsonObject, billto_billing_address_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&billto_billing_address_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *billto_business_address_idKey = "billto_business_address_id";
	node = json_object_get_member(pJsonObject, billto_business_address_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&billto_business_address_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *billto_company_idKey = "billto_company_id";
	node = json_object_get_member(pJsonObject, billto_company_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&billto_company_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *budget_amountKey = "budget_amount";
	node = json_object_get_member(pJsonObject, budget_amountKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&budget_amount, node, "double", "");
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
	const gchar *end_dateKey = "end_date";
	node = json_object_get_member(pJsonObject, end_dateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&end_date, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *estimated_monthly_spendKey = "estimated_monthly_spend";
	node = json_object_get_member(pJsonObject, estimated_monthly_spendKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&estimated_monthly_spend, node, "double", "");
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
	const gchar *order_line_typeKey = "order_line_type";
	node = json_object_get_member(pJsonObject, order_line_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("SSIOOrderLineType")) {
			jsonToValue(&order_line_type, node, "SSIOOrderLineType", "SSIOOrderLineType");
		} else {
			
			SSIOOrderLineType* obj = static_cast<SSIOOrderLineType*> (&order_line_type);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *pmp_idKey = "pmp_id";
	node = json_object_get_member(pJsonObject, pmp_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&pmp_id, node, "std::string", "");
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
	const gchar *start_dateKey = "start_date";
	node = json_object_get_member(pJsonObject, start_dateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&start_date, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *user_emailKey = "user_email";
	node = json_object_get_member(pJsonObject, user_emailKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&user_email, node, "std::string", "");
		} else {
			
		}
	}
}

SSIOInsertionOrderCreate::SSIOInsertionOrderCreate(char* json)
{
	this->fromJson(json);
}

char*
SSIOInsertionOrderCreate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAcceptedTermsId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *accepted_terms_idKey = "accepted_terms_id";
	json_object_set_member(pJsonObject, accepted_terms_idKey, node);
	if (isprimitive("int")) {
		int obj = getAcceptedTermsTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *accepted_terms_timeKey = "accepted_terms_time";
	json_object_set_member(pJsonObject, accepted_terms_timeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAgencyLink();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *agency_linkKey = "agency_link";
	json_object_set_member(pJsonObject, agency_linkKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBillingContactEmail();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *billing_contact_emailKey = "billing_contact_email";
	json_object_set_member(pJsonObject, billing_contact_emailKey, node);
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
		std::string obj = getBilltoBillingAddressId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *billto_billing_address_idKey = "billto_billing_address_id";
	json_object_set_member(pJsonObject, billto_billing_address_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBilltoBusinessAddressId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *billto_business_address_idKey = "billto_business_address_id";
	json_object_set_member(pJsonObject, billto_business_address_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBilltoCompanyId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *billto_company_idKey = "billto_company_id";
	json_object_set_member(pJsonObject, billto_company_idKey, node);
	if (isprimitive("double")) {
		double obj = getBudgetAmount();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *budget_amountKey = "budget_amount";
	json_object_set_member(pJsonObject, budget_amountKey, node);
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
		std::string obj = getEndDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *end_dateKey = "end_date";
	json_object_set_member(pJsonObject, end_dateKey, node);
	if (isprimitive("double")) {
		double obj = getEstimatedMonthlySpend();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *estimated_monthly_spendKey = "estimated_monthly_spend";
	json_object_set_member(pJsonObject, estimated_monthly_spendKey, node);
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
	if (isprimitive("SSIOOrderLineType")) {
		SSIOOrderLineType obj = getOrderLineType();
		node = converttoJson(&obj, "SSIOOrderLineType", "");
	}
	else {
		
		SSIOOrderLineType obj = static_cast<SSIOOrderLineType> (getOrderLineType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *order_line_typeKey = "order_line_type";
	json_object_set_member(pJsonObject, order_line_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOrderName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *order_nameKey = "order_name";
	json_object_set_member(pJsonObject, order_nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPmpId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *pmp_idKey = "pmp_id";
	json_object_set_member(pJsonObject, pmp_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPoNumber();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *po_numberKey = "po_number";
	json_object_set_member(pJsonObject, po_numberKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStartDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *start_dateKey = "start_date";
	json_object_set_member(pJsonObject, start_dateKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUserEmail();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *user_emailKey = "user_email";
	json_object_set_member(pJsonObject, user_emailKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
SSIOInsertionOrderCreate::getAcceptedTermsId()
{
	return accepted_terms_id;
}

void
SSIOInsertionOrderCreate::setAcceptedTermsId(std::string  accepted_terms_id)
{
	this->accepted_terms_id = accepted_terms_id;
}

int
SSIOInsertionOrderCreate::getAcceptedTermsTime()
{
	return accepted_terms_time;
}

void
SSIOInsertionOrderCreate::setAcceptedTermsTime(int  accepted_terms_time)
{
	this->accepted_terms_time = accepted_terms_time;
}

std::string
SSIOInsertionOrderCreate::getAgencyLink()
{
	return agency_link;
}

void
SSIOInsertionOrderCreate::setAgencyLink(std::string  agency_link)
{
	this->agency_link = agency_link;
}

std::string
SSIOInsertionOrderCreate::getBillingContactEmail()
{
	return billing_contact_email;
}

void
SSIOInsertionOrderCreate::setBillingContactEmail(std::string  billing_contact_email)
{
	this->billing_contact_email = billing_contact_email;
}

std::string
SSIOInsertionOrderCreate::getBillingContactFirstname()
{
	return billing_contact_firstname;
}

void
SSIOInsertionOrderCreate::setBillingContactFirstname(std::string  billing_contact_firstname)
{
	this->billing_contact_firstname = billing_contact_firstname;
}

std::string
SSIOInsertionOrderCreate::getBillingContactLastname()
{
	return billing_contact_lastname;
}

void
SSIOInsertionOrderCreate::setBillingContactLastname(std::string  billing_contact_lastname)
{
	this->billing_contact_lastname = billing_contact_lastname;
}

std::string
SSIOInsertionOrderCreate::getBilltoBillingAddressId()
{
	return billto_billing_address_id;
}

void
SSIOInsertionOrderCreate::setBilltoBillingAddressId(std::string  billto_billing_address_id)
{
	this->billto_billing_address_id = billto_billing_address_id;
}

std::string
SSIOInsertionOrderCreate::getBilltoBusinessAddressId()
{
	return billto_business_address_id;
}

void
SSIOInsertionOrderCreate::setBilltoBusinessAddressId(std::string  billto_business_address_id)
{
	this->billto_business_address_id = billto_business_address_id;
}

std::string
SSIOInsertionOrderCreate::getBilltoCompanyId()
{
	return billto_company_id;
}

void
SSIOInsertionOrderCreate::setBilltoCompanyId(std::string  billto_company_id)
{
	this->billto_company_id = billto_company_id;
}

double
SSIOInsertionOrderCreate::getBudgetAmount()
{
	return budget_amount;
}

void
SSIOInsertionOrderCreate::setBudgetAmount(double  budget_amount)
{
	this->budget_amount = budget_amount;
}

Currency
SSIOInsertionOrderCreate::getCurrencyInfo()
{
	return currency_info;
}

void
SSIOInsertionOrderCreate::setCurrencyInfo(Currency  currency_info)
{
	this->currency_info = currency_info;
}

std::string
SSIOInsertionOrderCreate::getEndDate()
{
	return end_date;
}

void
SSIOInsertionOrderCreate::setEndDate(std::string  end_date)
{
	this->end_date = end_date;
}

double
SSIOInsertionOrderCreate::getEstimatedMonthlySpend()
{
	return estimated_monthly_spend;
}

void
SSIOInsertionOrderCreate::setEstimatedMonthlySpend(double  estimated_monthly_spend)
{
	this->estimated_monthly_spend = estimated_monthly_spend;
}

std::string
SSIOInsertionOrderCreate::getMediaContactEmail()
{
	return media_contact_email;
}

void
SSIOInsertionOrderCreate::setMediaContactEmail(std::string  media_contact_email)
{
	this->media_contact_email = media_contact_email;
}

std::string
SSIOInsertionOrderCreate::getMediaContactFirstname()
{
	return media_contact_firstname;
}

void
SSIOInsertionOrderCreate::setMediaContactFirstname(std::string  media_contact_firstname)
{
	this->media_contact_firstname = media_contact_firstname;
}

std::string
SSIOInsertionOrderCreate::getMediaContactLastname()
{
	return media_contact_lastname;
}

void
SSIOInsertionOrderCreate::setMediaContactLastname(std::string  media_contact_lastname)
{
	this->media_contact_lastname = media_contact_lastname;
}

SSIOOrderLineType
SSIOInsertionOrderCreate::getOrderLineType()
{
	return order_line_type;
}

void
SSIOInsertionOrderCreate::setOrderLineType(SSIOOrderLineType  order_line_type)
{
	this->order_line_type = order_line_type;
}

std::string
SSIOInsertionOrderCreate::getOrderName()
{
	return order_name;
}

void
SSIOInsertionOrderCreate::setOrderName(std::string  order_name)
{
	this->order_name = order_name;
}

std::string
SSIOInsertionOrderCreate::getPmpId()
{
	return pmp_id;
}

void
SSIOInsertionOrderCreate::setPmpId(std::string  pmp_id)
{
	this->pmp_id = pmp_id;
}

std::string
SSIOInsertionOrderCreate::getPoNumber()
{
	return po_number;
}

void
SSIOInsertionOrderCreate::setPoNumber(std::string  po_number)
{
	this->po_number = po_number;
}

std::string
SSIOInsertionOrderCreate::getStartDate()
{
	return start_date;
}

void
SSIOInsertionOrderCreate::setStartDate(std::string  start_date)
{
	this->start_date = start_date;
}

std::string
SSIOInsertionOrderCreate::getUserEmail()
{
	return user_email;
}

void
SSIOInsertionOrderCreate::setUserEmail(std::string  user_email)
{
	this->user_email = user_email;
}


