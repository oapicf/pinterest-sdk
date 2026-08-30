

#include "SSIOInsertionOrderCreate.h"

using namespace Tiny;

SSIOInsertionOrderCreate::SSIOInsertionOrderCreate()
{
	accepted_terms_id = std::string();
	accepted_terms_time = int(0);
	agency_link = std::string();
	billing_contact_email = std::string();
	billing_contact_firstname = std::string();
	billing_contact_lastname = std::string();
	billto_billing_address_id = std::string();
	billto_business_address_id = std::string();
	billto_company_id = std::string();
	budget_amount = float(0);
	currency_info = Currency();
	end_date = std::string();
	estimated_monthly_spend = float(0);
	media_contact_email = std::string();
	media_contact_firstname = std::string();
	media_contact_lastname = std::string();
	order_line_type = null;
	order_name = std::string();
	pmp_id = std::string();
	po_number = std::string();
	start_date = std::string();
	user_email = std::string();
}

SSIOInsertionOrderCreate::SSIOInsertionOrderCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

SSIOInsertionOrderCreate::~SSIOInsertionOrderCreate()
{

}

void
SSIOInsertionOrderCreate::fromJson(std::string jsonObj)
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



        jsonToValue(&accepted_terms_time, value, "int");


    }

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

    const char *budget_amountKey = "budget_amount";

    if(object.has_key(budget_amountKey))
    {
        bourne::json value = object[budget_amountKey];



        jsonToValue(&budget_amount, value, "double");


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



        jsonToValue(&end_date, value, "std::string");


    }

    const char *estimated_monthly_spendKey = "estimated_monthly_spend";

    if(object.has_key(estimated_monthly_spendKey))
    {
        bourne::json value = object[estimated_monthly_spendKey];



        jsonToValue(&estimated_monthly_spend, value, "double");


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

    const char *order_line_typeKey = "order_line_type";

    if(object.has_key(order_line_typeKey))
    {
        bourne::json value = object[order_line_typeKey];




        SSIOOrderLineType* obj = &order_line_type;
		obj->fromJson(value.dump());

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


}

bourne::json
SSIOInsertionOrderCreate::toJson()
{
    bourne::json object = bourne::json::object();





    object["accepted_terms_id"] = getAcceptedTermsId();






    object["accepted_terms_time"] = getAcceptedTermsTime();






    object["agency_link"] = getAgencyLink();






    object["billing_contact_email"] = getBillingContactEmail();






    object["billing_contact_firstname"] = getBillingContactFirstname();






    object["billing_contact_lastname"] = getBillingContactLastname();






    object["billto_billing_address_id"] = getBilltoBillingAddressId();






    object["billto_business_address_id"] = getBilltoBusinessAddressId();






    object["billto_company_id"] = getBilltoCompanyId();






    object["budget_amount"] = getBudgetAmount();







	object["currency_info"] = getCurrencyInfo().toJson();





    object["end_date"] = getEndDate();






    object["estimated_monthly_spend"] = getEstimatedMonthlySpend();






    object["media_contact_email"] = getMediaContactEmail();






    object["media_contact_firstname"] = getMediaContactFirstname();






    object["media_contact_lastname"] = getMediaContactLastname();







	object["order_line_type"] = getOrderLineType().toJson();





    object["order_name"] = getOrderName();






    object["pmp_id"] = getPmpId();






    object["po_number"] = getPoNumber();






    object["start_date"] = getStartDate();






    object["user_email"] = getUserEmail();



    return object;

}

std::string
SSIOInsertionOrderCreate::getAcceptedTermsId()
{
	return accepted_terms_id;
}

void
SSIOInsertionOrderCreate::setAcceptedTermsId(std::string accepted_terms_id)
{
	this->accepted_terms_id = accepted_terms_id;
}

int
SSIOInsertionOrderCreate::getAcceptedTermsTime()
{
	return accepted_terms_time;
}

void
SSIOInsertionOrderCreate::setAcceptedTermsTime(int accepted_terms_time)
{
	this->accepted_terms_time = accepted_terms_time;
}

std::string
SSIOInsertionOrderCreate::getAgencyLink()
{
	return agency_link;
}

void
SSIOInsertionOrderCreate::setAgencyLink(std::string agency_link)
{
	this->agency_link = agency_link;
}

std::string
SSIOInsertionOrderCreate::getBillingContactEmail()
{
	return billing_contact_email;
}

void
SSIOInsertionOrderCreate::setBillingContactEmail(std::string billing_contact_email)
{
	this->billing_contact_email = billing_contact_email;
}

std::string
SSIOInsertionOrderCreate::getBillingContactFirstname()
{
	return billing_contact_firstname;
}

void
SSIOInsertionOrderCreate::setBillingContactFirstname(std::string billing_contact_firstname)
{
	this->billing_contact_firstname = billing_contact_firstname;
}

std::string
SSIOInsertionOrderCreate::getBillingContactLastname()
{
	return billing_contact_lastname;
}

void
SSIOInsertionOrderCreate::setBillingContactLastname(std::string billing_contact_lastname)
{
	this->billing_contact_lastname = billing_contact_lastname;
}

std::string
SSIOInsertionOrderCreate::getBilltoBillingAddressId()
{
	return billto_billing_address_id;
}

void
SSIOInsertionOrderCreate::setBilltoBillingAddressId(std::string billto_billing_address_id)
{
	this->billto_billing_address_id = billto_billing_address_id;
}

std::string
SSIOInsertionOrderCreate::getBilltoBusinessAddressId()
{
	return billto_business_address_id;
}

void
SSIOInsertionOrderCreate::setBilltoBusinessAddressId(std::string billto_business_address_id)
{
	this->billto_business_address_id = billto_business_address_id;
}

std::string
SSIOInsertionOrderCreate::getBilltoCompanyId()
{
	return billto_company_id;
}

void
SSIOInsertionOrderCreate::setBilltoCompanyId(std::string billto_company_id)
{
	this->billto_company_id = billto_company_id;
}

double
SSIOInsertionOrderCreate::getBudgetAmount()
{
	return budget_amount;
}

void
SSIOInsertionOrderCreate::setBudgetAmount(double budget_amount)
{
	this->budget_amount = budget_amount;
}

Currency
SSIOInsertionOrderCreate::getCurrencyInfo()
{
	return currency_info;
}

void
SSIOInsertionOrderCreate::setCurrencyInfo(Currency currency_info)
{
	this->currency_info = currency_info;
}

std::string
SSIOInsertionOrderCreate::getEndDate()
{
	return end_date;
}

void
SSIOInsertionOrderCreate::setEndDate(std::string end_date)
{
	this->end_date = end_date;
}

double
SSIOInsertionOrderCreate::getEstimatedMonthlySpend()
{
	return estimated_monthly_spend;
}

void
SSIOInsertionOrderCreate::setEstimatedMonthlySpend(double estimated_monthly_spend)
{
	this->estimated_monthly_spend = estimated_monthly_spend;
}

std::string
SSIOInsertionOrderCreate::getMediaContactEmail()
{
	return media_contact_email;
}

void
SSIOInsertionOrderCreate::setMediaContactEmail(std::string media_contact_email)
{
	this->media_contact_email = media_contact_email;
}

std::string
SSIOInsertionOrderCreate::getMediaContactFirstname()
{
	return media_contact_firstname;
}

void
SSIOInsertionOrderCreate::setMediaContactFirstname(std::string media_contact_firstname)
{
	this->media_contact_firstname = media_contact_firstname;
}

std::string
SSIOInsertionOrderCreate::getMediaContactLastname()
{
	return media_contact_lastname;
}

void
SSIOInsertionOrderCreate::setMediaContactLastname(std::string media_contact_lastname)
{
	this->media_contact_lastname = media_contact_lastname;
}

SSIOOrderLineType
SSIOInsertionOrderCreate::getOrderLineType()
{
	return order_line_type;
}

void
SSIOInsertionOrderCreate::setOrderLineType(SSIOOrderLineType order_line_type)
{
	this->order_line_type = order_line_type;
}

std::string
SSIOInsertionOrderCreate::getOrderName()
{
	return order_name;
}

void
SSIOInsertionOrderCreate::setOrderName(std::string order_name)
{
	this->order_name = order_name;
}

std::string
SSIOInsertionOrderCreate::getPmpId()
{
	return pmp_id;
}

void
SSIOInsertionOrderCreate::setPmpId(std::string pmp_id)
{
	this->pmp_id = pmp_id;
}

std::string
SSIOInsertionOrderCreate::getPoNumber()
{
	return po_number;
}

void
SSIOInsertionOrderCreate::setPoNumber(std::string po_number)
{
	this->po_number = po_number;
}

std::string
SSIOInsertionOrderCreate::getStartDate()
{
	return start_date;
}

void
SSIOInsertionOrderCreate::setStartDate(std::string start_date)
{
	this->start_date = start_date;
}

std::string
SSIOInsertionOrderCreate::getUserEmail()
{
	return user_email;
}

void
SSIOInsertionOrderCreate::setUserEmail(std::string user_email)
{
	this->user_email = user_email;
}



