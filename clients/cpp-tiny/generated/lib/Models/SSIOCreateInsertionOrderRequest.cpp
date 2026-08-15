

#include "SSIOCreateInsertionOrderRequest.h"

using namespace Tiny;

SSIOCreateInsertionOrderRequest::SSIOCreateInsertionOrderRequest()
{
	agency_link = std::string();
	billing_contact_email = std::string();
	billing_contact_firstname = std::string();
	billing_contact_lastname = std::string();
	budget_amount = float(0);
	end_date = std::string();
	media_contact_email = std::string();
	media_contact_firstname = std::string();
	media_contact_lastname = std::string();
	po_number = std::string();
	start_date = std::string();
	user_email = std::string();
	accepted_terms_id = std::string();
	accepted_terms_time = int(0);
	billto_billing_address_id = std::string();
	billto_business_address_id = std::string();
	billto_company_id = std::string();
	currency_info = Currency();
	estimated_monthly_spend = float(0);
	order_line_type = std::string();
	order_name = std::string();
	pmp_id = std::string();
}

SSIOCreateInsertionOrderRequest::SSIOCreateInsertionOrderRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

SSIOCreateInsertionOrderRequest::~SSIOCreateInsertionOrderRequest()
{

}

void
SSIOCreateInsertionOrderRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *agency_linkKey = "agency_link";

    if(object.has_key(agency_linkKey))
    {
        bourne::json value = object[agency_linkKey];



        jsonToValue(&agency_link, value, "std::string");


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

    const char *end_dateKey = "end_date";

    if(object.has_key(end_dateKey))
    {
        bourne::json value = object[end_dateKey];



        jsonToValue(&end_date, value, "std::string");


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

    const char *po_numberKey = "po_number";

    if(object.has_key(po_numberKey))
    {
        bourne::json value = object[po_numberKey];



        jsonToValue(&po_number, value, "std::string");


    }

    const char *start_dateKey = "start_date";

    if(object.has_key(start_dateKey))
    {
        bourne::json value = object[start_dateKey];



        jsonToValue(&start_date, value, "std::string");


    }

    const char *user_emailKey = "user_email";

    if(object.has_key(user_emailKey))
    {
        bourne::json value = object[user_emailKey];



        jsonToValue(&user_email, value, "std::string");


    }

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



        jsonToValue(&accepted_terms_time, value, "int");


    }

    const char *billto_billing_address_idKey = "billto_billing_address_id";

    if(object.has_key(billto_billing_address_idKey))
    {
        bourne::json value = object[billto_billing_address_idKey];



        jsonToValue(&billto_billing_address_id, value, "std::string");


    }

    const char *billto_business_address_idKey = "billto_business_address_id";

    if(object.has_key(billto_business_address_idKey))
    {
        bourne::json value = object[billto_business_address_idKey];



        jsonToValue(&billto_business_address_id, value, "std::string");


    }

    const char *billto_company_idKey = "billto_company_id";

    if(object.has_key(billto_company_idKey))
    {
        bourne::json value = object[billto_company_idKey];



        jsonToValue(&billto_company_id, value, "std::string");


    }

    const char *currency_infoKey = "currency_info";

    if(object.has_key(currency_infoKey))
    {
        bourne::json value = object[currency_infoKey];




        Currency* obj = &currency_info;
		obj->fromJson(value.dump());

    }

    const char *estimated_monthly_spendKey = "estimated_monthly_spend";

    if(object.has_key(estimated_monthly_spendKey))
    {
        bourne::json value = object[estimated_monthly_spendKey];



        jsonToValue(&estimated_monthly_spend, value, "long");


    }

    const char *order_line_typeKey = "order_line_type";

    if(object.has_key(order_line_typeKey))
    {
        bourne::json value = object[order_line_typeKey];



        jsonToValue(&order_line_type, value, "std::string");


    }

    const char *order_nameKey = "order_name";

    if(object.has_key(order_nameKey))
    {
        bourne::json value = object[order_nameKey];



        jsonToValue(&order_name, value, "std::string");


    }

    const char *pmp_idKey = "pmp_id";

    if(object.has_key(pmp_idKey))
    {
        bourne::json value = object[pmp_idKey];



        jsonToValue(&pmp_id, value, "std::string");


    }


}

bourne::json
SSIOCreateInsertionOrderRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["agency_link"] = getAgencyLink();






    object["billing_contact_email"] = getBillingContactEmail();






    object["billing_contact_firstname"] = getBillingContactFirstname();






    object["billing_contact_lastname"] = getBillingContactLastname();






    object["budget_amount"] = getBudgetAmount();






    object["end_date"] = getEndDate();






    object["media_contact_email"] = getMediaContactEmail();






    object["media_contact_firstname"] = getMediaContactFirstname();






    object["media_contact_lastname"] = getMediaContactLastname();






    object["po_number"] = getPoNumber();






    object["start_date"] = getStartDate();






    object["user_email"] = getUserEmail();






    object["accepted_terms_id"] = getAcceptedTermsId();






    object["accepted_terms_time"] = getAcceptedTermsTime();






    object["billto_billing_address_id"] = getBilltoBillingAddressId();






    object["billto_business_address_id"] = getBilltoBusinessAddressId();






    object["billto_company_id"] = getBilltoCompanyId();







	object["currency_info"] = getCurrencyInfo().toJson();





    object["estimated_monthly_spend"] = getEstimatedMonthlySpend();






    object["order_line_type"] = getOrderLineType();






    object["order_name"] = getOrderName();






    object["pmp_id"] = getPmpId();



    return object;

}

std::string
SSIOCreateInsertionOrderRequest::getAgencyLink()
{
	return agency_link;
}

void
SSIOCreateInsertionOrderRequest::setAgencyLink(std::string  agency_link)
{
	this->agency_link = agency_link;
}

std::string
SSIOCreateInsertionOrderRequest::getBillingContactEmail()
{
	return billing_contact_email;
}

void
SSIOCreateInsertionOrderRequest::setBillingContactEmail(std::string  billing_contact_email)
{
	this->billing_contact_email = billing_contact_email;
}

std::string
SSIOCreateInsertionOrderRequest::getBillingContactFirstname()
{
	return billing_contact_firstname;
}

void
SSIOCreateInsertionOrderRequest::setBillingContactFirstname(std::string  billing_contact_firstname)
{
	this->billing_contact_firstname = billing_contact_firstname;
}

std::string
SSIOCreateInsertionOrderRequest::getBillingContactLastname()
{
	return billing_contact_lastname;
}

void
SSIOCreateInsertionOrderRequest::setBillingContactLastname(std::string  billing_contact_lastname)
{
	this->billing_contact_lastname = billing_contact_lastname;
}

long
SSIOCreateInsertionOrderRequest::getBudgetAmount()
{
	return budget_amount;
}

void
SSIOCreateInsertionOrderRequest::setBudgetAmount(long  budget_amount)
{
	this->budget_amount = budget_amount;
}

std::string
SSIOCreateInsertionOrderRequest::getEndDate()
{
	return end_date;
}

void
SSIOCreateInsertionOrderRequest::setEndDate(std::string  end_date)
{
	this->end_date = end_date;
}

std::string
SSIOCreateInsertionOrderRequest::getMediaContactEmail()
{
	return media_contact_email;
}

void
SSIOCreateInsertionOrderRequest::setMediaContactEmail(std::string  media_contact_email)
{
	this->media_contact_email = media_contact_email;
}

std::string
SSIOCreateInsertionOrderRequest::getMediaContactFirstname()
{
	return media_contact_firstname;
}

void
SSIOCreateInsertionOrderRequest::setMediaContactFirstname(std::string  media_contact_firstname)
{
	this->media_contact_firstname = media_contact_firstname;
}

std::string
SSIOCreateInsertionOrderRequest::getMediaContactLastname()
{
	return media_contact_lastname;
}

void
SSIOCreateInsertionOrderRequest::setMediaContactLastname(std::string  media_contact_lastname)
{
	this->media_contact_lastname = media_contact_lastname;
}

std::string
SSIOCreateInsertionOrderRequest::getPoNumber()
{
	return po_number;
}

void
SSIOCreateInsertionOrderRequest::setPoNumber(std::string  po_number)
{
	this->po_number = po_number;
}

std::string
SSIOCreateInsertionOrderRequest::getStartDate()
{
	return start_date;
}

void
SSIOCreateInsertionOrderRequest::setStartDate(std::string  start_date)
{
	this->start_date = start_date;
}

std::string
SSIOCreateInsertionOrderRequest::getUserEmail()
{
	return user_email;
}

void
SSIOCreateInsertionOrderRequest::setUserEmail(std::string  user_email)
{
	this->user_email = user_email;
}

std::string
SSIOCreateInsertionOrderRequest::getAcceptedTermsId()
{
	return accepted_terms_id;
}

void
SSIOCreateInsertionOrderRequest::setAcceptedTermsId(std::string  accepted_terms_id)
{
	this->accepted_terms_id = accepted_terms_id;
}

int
SSIOCreateInsertionOrderRequest::getAcceptedTermsTime()
{
	return accepted_terms_time;
}

void
SSIOCreateInsertionOrderRequest::setAcceptedTermsTime(int  accepted_terms_time)
{
	this->accepted_terms_time = accepted_terms_time;
}

std::string
SSIOCreateInsertionOrderRequest::getBilltoBillingAddressId()
{
	return billto_billing_address_id;
}

void
SSIOCreateInsertionOrderRequest::setBilltoBillingAddressId(std::string  billto_billing_address_id)
{
	this->billto_billing_address_id = billto_billing_address_id;
}

std::string
SSIOCreateInsertionOrderRequest::getBilltoBusinessAddressId()
{
	return billto_business_address_id;
}

void
SSIOCreateInsertionOrderRequest::setBilltoBusinessAddressId(std::string  billto_business_address_id)
{
	this->billto_business_address_id = billto_business_address_id;
}

std::string
SSIOCreateInsertionOrderRequest::getBilltoCompanyId()
{
	return billto_company_id;
}

void
SSIOCreateInsertionOrderRequest::setBilltoCompanyId(std::string  billto_company_id)
{
	this->billto_company_id = billto_company_id;
}

Currency
SSIOCreateInsertionOrderRequest::getCurrencyInfo()
{
	return currency_info;
}

void
SSIOCreateInsertionOrderRequest::setCurrencyInfo(Currency  currency_info)
{
	this->currency_info = currency_info;
}

long
SSIOCreateInsertionOrderRequest::getEstimatedMonthlySpend()
{
	return estimated_monthly_spend;
}

void
SSIOCreateInsertionOrderRequest::setEstimatedMonthlySpend(long  estimated_monthly_spend)
{
	this->estimated_monthly_spend = estimated_monthly_spend;
}

std::string
SSIOCreateInsertionOrderRequest::getOrderLineType()
{
	return order_line_type;
}

void
SSIOCreateInsertionOrderRequest::setOrderLineType(std::string  order_line_type)
{
	this->order_line_type = order_line_type;
}

std::string
SSIOCreateInsertionOrderRequest::getOrderName()
{
	return order_name;
}

void
SSIOCreateInsertionOrderRequest::setOrderName(std::string  order_name)
{
	this->order_name = order_name;
}

std::string
SSIOCreateInsertionOrderRequest::getPmpId()
{
	return pmp_id;
}

void
SSIOCreateInsertionOrderRequest::setPmpId(std::string  pmp_id)
{
	this->pmp_id = pmp_id;
}



