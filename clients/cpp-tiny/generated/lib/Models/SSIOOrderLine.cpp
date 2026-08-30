

#include "SSIOOrderLine.h"

using namespace Tiny;

SSIOOrderLine::SSIOOrderLine()
{
	accepted_terms_id = std::string();
	accepted_terms_time = std::string();
	ads_manager_order_line_id = std::string();
	agency_link = std::string();
	bill_to_company_name = std::string();
	billing_contact_email = std::string();
	billing_contact_firstname = std::string();
	billing_contact_lastname = std::string();
	budget_amount = float(0);
	currency_info = Currency();
	end_date = std::string();
	estimated_monthly_spend = float(0);
	last_modified_date_time = std::string();
	media_contact_email = std::string();
	media_contact_firstname = std::string();
	media_contact_lastname = std::string();
	order_name = std::string();
	pin_order_id = std::string();
	pmp_name = std::string();
	po_number = std::string();
	salesforce_order_line_id = std::string();
	start_date = std::string();
}

SSIOOrderLine::SSIOOrderLine(std::string jsonString)
{
	this->fromJson(jsonString);
}

SSIOOrderLine::~SSIOOrderLine()
{

}

void
SSIOOrderLine::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *accepted_terms_idKey = "accepted_terms_id";

    if(object.has_key(accepted_terms_idKey))
    {
        bourne::json value = object[accepted_terms_idKey];



        jsonToValue(&accepted_terms_id, value, "std::string");


    }

    const char *accepted_terms_timeKey = "accepted_terms_time";

    if(object.has_key(accepted_terms_timeKey))
    {
        bourne::json value = object[accepted_terms_timeKey];



        jsonToValue(&accepted_terms_time, value, "std::string");


    }

    const char *ads_manager_order_line_idKey = "ads_manager_order_line_id";

    if(object.has_key(ads_manager_order_line_idKey))
    {
        bourne::json value = object[ads_manager_order_line_idKey];



        jsonToValue(&ads_manager_order_line_id, value, "std::string");


    }

    const char *agency_linkKey = "agency_link";

    if(object.has_key(agency_linkKey))
    {
        bourne::json value = object[agency_linkKey];



        jsonToValue(&agency_link, value, "std::string");


    }

    const char *bill_to_company_nameKey = "bill_to_company_name";

    if(object.has_key(bill_to_company_nameKey))
    {
        bourne::json value = object[bill_to_company_nameKey];



        jsonToValue(&bill_to_company_name, value, "std::string");


    }

    const char *billing_contact_emailKey = "billing_contact_email";

    if(object.has_key(billing_contact_emailKey))
    {
        bourne::json value = object[billing_contact_emailKey];



        jsonToValue(&billing_contact_email, value, "std::string");


    }

    const char *billing_contact_firstnameKey = "billing_contact_firstname";

    if(object.has_key(billing_contact_firstnameKey))
    {
        bourne::json value = object[billing_contact_firstnameKey];



        jsonToValue(&billing_contact_firstname, value, "std::string");


    }

    const char *billing_contact_lastnameKey = "billing_contact_lastname";

    if(object.has_key(billing_contact_lastnameKey))
    {
        bourne::json value = object[billing_contact_lastnameKey];



        jsonToValue(&billing_contact_lastname, value, "std::string");


    }

    const char *budget_amountKey = "budget_amount";

    if(object.has_key(budget_amountKey))
    {
        bourne::json value = object[budget_amountKey];



        jsonToValue(&budget_amount, value, "long");


    }

    const char *currency_infoKey = "currency_info";

    if(object.has_key(currency_infoKey))
    {
        bourne::json value = object[currency_infoKey];




        Currency* obj = &currency_info;
		obj->fromJson(value.dump());

    }

    const char *end_dateKey = "end_date";

    if(object.has_key(end_dateKey))
    {
        bourne::json value = object[end_dateKey];




        Date* obj = &end_date;
		obj->fromJson(value.dump());

    }

    const char *estimated_monthly_spendKey = "estimated_monthly_spend";

    if(object.has_key(estimated_monthly_spendKey))
    {
        bourne::json value = object[estimated_monthly_spendKey];



        jsonToValue(&estimated_monthly_spend, value, "long");


    }

    const char *last_modified_date_timeKey = "last_modified_date_time";

    if(object.has_key(last_modified_date_timeKey))
    {
        bourne::json value = object[last_modified_date_timeKey];



        jsonToValue(&last_modified_date_time, value, "std::string");


    }

    const char *media_contact_emailKey = "media_contact_email";

    if(object.has_key(media_contact_emailKey))
    {
        bourne::json value = object[media_contact_emailKey];



        jsonToValue(&media_contact_email, value, "std::string");


    }

    const char *media_contact_firstnameKey = "media_contact_firstname";

    if(object.has_key(media_contact_firstnameKey))
    {
        bourne::json value = object[media_contact_firstnameKey];



        jsonToValue(&media_contact_firstname, value, "std::string");


    }

    const char *media_contact_lastnameKey = "media_contact_lastname";

    if(object.has_key(media_contact_lastnameKey))
    {
        bourne::json value = object[media_contact_lastnameKey];



        jsonToValue(&media_contact_lastname, value, "std::string");


    }

    const char *order_nameKey = "order_name";

    if(object.has_key(order_nameKey))
    {
        bourne::json value = object[order_nameKey];



        jsonToValue(&order_name, value, "std::string");


    }

    const char *pin_order_idKey = "pin_order_id";

    if(object.has_key(pin_order_idKey))
    {
        bourne::json value = object[pin_order_idKey];



        jsonToValue(&pin_order_id, value, "std::string");


    }

    const char *pmp_nameKey = "pmp_name";

    if(object.has_key(pmp_nameKey))
    {
        bourne::json value = object[pmp_nameKey];



        jsonToValue(&pmp_name, value, "std::string");


    }

    const char *po_numberKey = "po_number";

    if(object.has_key(po_numberKey))
    {
        bourne::json value = object[po_numberKey];



        jsonToValue(&po_number, value, "std::string");


    }

    const char *salesforce_order_line_idKey = "salesforce_order_line_id";

    if(object.has_key(salesforce_order_line_idKey))
    {
        bourne::json value = object[salesforce_order_line_idKey];



        jsonToValue(&salesforce_order_line_id, value, "std::string");


    }

    const char *start_dateKey = "start_date";

    if(object.has_key(start_dateKey))
    {
        bourne::json value = object[start_dateKey];




        Date* obj = &start_date;
		obj->fromJson(value.dump());

    }


}

bourne::json
SSIOOrderLine::toJson()
{
    bourne::json object = bourne::json::object();





    object["accepted_terms_id"] = getAcceptedTermsId();






    object["accepted_terms_time"] = getAcceptedTermsTime();






    object["ads_manager_order_line_id"] = getAdsManagerOrderLineId();






    object["agency_link"] = getAgencyLink();






    object["bill_to_company_name"] = getBillToCompanyName();






    object["billing_contact_email"] = getBillingContactEmail();






    object["billing_contact_firstname"] = getBillingContactFirstname();






    object["billing_contact_lastname"] = getBillingContactLastname();






    object["budget_amount"] = getBudgetAmount();







	object["currency_info"] = getCurrencyInfo().toJson();






	object["end_date"] = getEndDate().toJson();





    object["estimated_monthly_spend"] = getEstimatedMonthlySpend();






    object["last_modified_date_time"] = getLastModifiedDateTime();






    object["media_contact_email"] = getMediaContactEmail();






    object["media_contact_firstname"] = getMediaContactFirstname();






    object["media_contact_lastname"] = getMediaContactLastname();






    object["order_name"] = getOrderName();






    object["pin_order_id"] = getPinOrderId();






    object["pmp_name"] = getPmpName();






    object["po_number"] = getPoNumber();






    object["salesforce_order_line_id"] = getSalesforceOrderLineId();







	object["start_date"] = getStartDate().toJson();


    return object;

}

std::string
SSIOOrderLine::getAcceptedTermsId()
{
	return accepted_terms_id;
}

void
SSIOOrderLine::setAcceptedTermsId(std::string accepted_terms_id)
{
	this->accepted_terms_id = accepted_terms_id;
}

std::string
SSIOOrderLine::getAcceptedTermsTime()
{
	return accepted_terms_time;
}

void
SSIOOrderLine::setAcceptedTermsTime(std::string accepted_terms_time)
{
	this->accepted_terms_time = accepted_terms_time;
}

std::string
SSIOOrderLine::getAdsManagerOrderLineId()
{
	return ads_manager_order_line_id;
}

void
SSIOOrderLine::setAdsManagerOrderLineId(std::string ads_manager_order_line_id)
{
	this->ads_manager_order_line_id = ads_manager_order_line_id;
}

std::string
SSIOOrderLine::getAgencyLink()
{
	return agency_link;
}

void
SSIOOrderLine::setAgencyLink(std::string agency_link)
{
	this->agency_link = agency_link;
}

std::string
SSIOOrderLine::getBillToCompanyName()
{
	return bill_to_company_name;
}

void
SSIOOrderLine::setBillToCompanyName(std::string bill_to_company_name)
{
	this->bill_to_company_name = bill_to_company_name;
}

std::string
SSIOOrderLine::getBillingContactEmail()
{
	return billing_contact_email;
}

void
SSIOOrderLine::setBillingContactEmail(std::string billing_contact_email)
{
	this->billing_contact_email = billing_contact_email;
}

std::string
SSIOOrderLine::getBillingContactFirstname()
{
	return billing_contact_firstname;
}

void
SSIOOrderLine::setBillingContactFirstname(std::string billing_contact_firstname)
{
	this->billing_contact_firstname = billing_contact_firstname;
}

std::string
SSIOOrderLine::getBillingContactLastname()
{
	return billing_contact_lastname;
}

void
SSIOOrderLine::setBillingContactLastname(std::string billing_contact_lastname)
{
	this->billing_contact_lastname = billing_contact_lastname;
}

long
SSIOOrderLine::getBudgetAmount()
{
	return budget_amount;
}

void
SSIOOrderLine::setBudgetAmount(long budget_amount)
{
	this->budget_amount = budget_amount;
}

Currency
SSIOOrderLine::getCurrencyInfo()
{
	return currency_info;
}

void
SSIOOrderLine::setCurrencyInfo(Currency currency_info)
{
	this->currency_info = currency_info;
}

Date
SSIOOrderLine::getEndDate()
{
	return end_date;
}

void
SSIOOrderLine::setEndDate(Date end_date)
{
	this->end_date = end_date;
}

long
SSIOOrderLine::getEstimatedMonthlySpend()
{
	return estimated_monthly_spend;
}

void
SSIOOrderLine::setEstimatedMonthlySpend(long estimated_monthly_spend)
{
	this->estimated_monthly_spend = estimated_monthly_spend;
}

std::string
SSIOOrderLine::getLastModifiedDateTime()
{
	return last_modified_date_time;
}

void
SSIOOrderLine::setLastModifiedDateTime(std::string last_modified_date_time)
{
	this->last_modified_date_time = last_modified_date_time;
}

std::string
SSIOOrderLine::getMediaContactEmail()
{
	return media_contact_email;
}

void
SSIOOrderLine::setMediaContactEmail(std::string media_contact_email)
{
	this->media_contact_email = media_contact_email;
}

std::string
SSIOOrderLine::getMediaContactFirstname()
{
	return media_contact_firstname;
}

void
SSIOOrderLine::setMediaContactFirstname(std::string media_contact_firstname)
{
	this->media_contact_firstname = media_contact_firstname;
}

std::string
SSIOOrderLine::getMediaContactLastname()
{
	return media_contact_lastname;
}

void
SSIOOrderLine::setMediaContactLastname(std::string media_contact_lastname)
{
	this->media_contact_lastname = media_contact_lastname;
}

std::string
SSIOOrderLine::getOrderName()
{
	return order_name;
}

void
SSIOOrderLine::setOrderName(std::string order_name)
{
	this->order_name = order_name;
}

std::string
SSIOOrderLine::getPinOrderId()
{
	return pin_order_id;
}

void
SSIOOrderLine::setPinOrderId(std::string pin_order_id)
{
	this->pin_order_id = pin_order_id;
}

std::string
SSIOOrderLine::getPmpName()
{
	return pmp_name;
}

void
SSIOOrderLine::setPmpName(std::string pmp_name)
{
	this->pmp_name = pmp_name;
}

std::string
SSIOOrderLine::getPoNumber()
{
	return po_number;
}

void
SSIOOrderLine::setPoNumber(std::string po_number)
{
	this->po_number = po_number;
}

std::string
SSIOOrderLine::getSalesforceOrderLineId()
{
	return salesforce_order_line_id;
}

void
SSIOOrderLine::setSalesforceOrderLineId(std::string salesforce_order_line_id)
{
	this->salesforce_order_line_id = salesforce_order_line_id;
}

Date
SSIOOrderLine::getStartDate()
{
	return start_date;
}

void
SSIOOrderLine::setStartDate(Date start_date)
{
	this->start_date = start_date;
}



