

#include "SSIOEditInsertionOrderRequest.h"

using namespace Tiny;

SSIOEditInsertionOrderRequest::SSIOEditInsertionOrderRequest()
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
	ads_manager_order_line_id = std::string();
	oracle_line_id = std::string();
	salesforce_order_id = std::string();
	salesforce_order_line_id = std::string();
}

SSIOEditInsertionOrderRequest::SSIOEditInsertionOrderRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

SSIOEditInsertionOrderRequest::~SSIOEditInsertionOrderRequest()
{

}

void
SSIOEditInsertionOrderRequest::fromJson(std::string jsonObj)
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

    const char *ads_manager_order_line_idKey = "ads_manager_order_line_id";

    if(object.has_key(ads_manager_order_line_idKey))
    {
        bourne::json value = object[ads_manager_order_line_idKey];



        jsonToValue(&ads_manager_order_line_id, value, "std::string");


    }

    const char *oracle_line_idKey = "oracle_line_id";

    if(object.has_key(oracle_line_idKey))
    {
        bourne::json value = object[oracle_line_idKey];



        jsonToValue(&oracle_line_id, value, "std::string");


    }

    const char *salesforce_order_idKey = "salesforce_order_id";

    if(object.has_key(salesforce_order_idKey))
    {
        bourne::json value = object[salesforce_order_idKey];



        jsonToValue(&salesforce_order_id, value, "std::string");


    }

    const char *salesforce_order_line_idKey = "salesforce_order_line_id";

    if(object.has_key(salesforce_order_line_idKey))
    {
        bourne::json value = object[salesforce_order_line_idKey];



        jsonToValue(&salesforce_order_line_id, value, "std::string");


    }


}

bourne::json
SSIOEditInsertionOrderRequest::toJson()
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






    object["ads_manager_order_line_id"] = getAdsManagerOrderLineId();






    object["oracle_line_id"] = getOracleLineId();






    object["salesforce_order_id"] = getSalesforceOrderId();






    object["salesforce_order_line_id"] = getSalesforceOrderLineId();



    return object;

}

std::string
SSIOEditInsertionOrderRequest::getAgencyLink()
{
	return agency_link;
}

void
SSIOEditInsertionOrderRequest::setAgencyLink(std::string  agency_link)
{
	this->agency_link = agency_link;
}

std::string
SSIOEditInsertionOrderRequest::getBillingContactEmail()
{
	return billing_contact_email;
}

void
SSIOEditInsertionOrderRequest::setBillingContactEmail(std::string  billing_contact_email)
{
	this->billing_contact_email = billing_contact_email;
}

std::string
SSIOEditInsertionOrderRequest::getBillingContactFirstname()
{
	return billing_contact_firstname;
}

void
SSIOEditInsertionOrderRequest::setBillingContactFirstname(std::string  billing_contact_firstname)
{
	this->billing_contact_firstname = billing_contact_firstname;
}

std::string
SSIOEditInsertionOrderRequest::getBillingContactLastname()
{
	return billing_contact_lastname;
}

void
SSIOEditInsertionOrderRequest::setBillingContactLastname(std::string  billing_contact_lastname)
{
	this->billing_contact_lastname = billing_contact_lastname;
}

long
SSIOEditInsertionOrderRequest::getBudgetAmount()
{
	return budget_amount;
}

void
SSIOEditInsertionOrderRequest::setBudgetAmount(long  budget_amount)
{
	this->budget_amount = budget_amount;
}

std::string
SSIOEditInsertionOrderRequest::getEndDate()
{
	return end_date;
}

void
SSIOEditInsertionOrderRequest::setEndDate(std::string  end_date)
{
	this->end_date = end_date;
}

std::string
SSIOEditInsertionOrderRequest::getMediaContactEmail()
{
	return media_contact_email;
}

void
SSIOEditInsertionOrderRequest::setMediaContactEmail(std::string  media_contact_email)
{
	this->media_contact_email = media_contact_email;
}

std::string
SSIOEditInsertionOrderRequest::getMediaContactFirstname()
{
	return media_contact_firstname;
}

void
SSIOEditInsertionOrderRequest::setMediaContactFirstname(std::string  media_contact_firstname)
{
	this->media_contact_firstname = media_contact_firstname;
}

std::string
SSIOEditInsertionOrderRequest::getMediaContactLastname()
{
	return media_contact_lastname;
}

void
SSIOEditInsertionOrderRequest::setMediaContactLastname(std::string  media_contact_lastname)
{
	this->media_contact_lastname = media_contact_lastname;
}

std::string
SSIOEditInsertionOrderRequest::getPoNumber()
{
	return po_number;
}

void
SSIOEditInsertionOrderRequest::setPoNumber(std::string  po_number)
{
	this->po_number = po_number;
}

std::string
SSIOEditInsertionOrderRequest::getStartDate()
{
	return start_date;
}

void
SSIOEditInsertionOrderRequest::setStartDate(std::string  start_date)
{
	this->start_date = start_date;
}

std::string
SSIOEditInsertionOrderRequest::getUserEmail()
{
	return user_email;
}

void
SSIOEditInsertionOrderRequest::setUserEmail(std::string  user_email)
{
	this->user_email = user_email;
}

std::string
SSIOEditInsertionOrderRequest::getAdsManagerOrderLineId()
{
	return ads_manager_order_line_id;
}

void
SSIOEditInsertionOrderRequest::setAdsManagerOrderLineId(std::string  ads_manager_order_line_id)
{
	this->ads_manager_order_line_id = ads_manager_order_line_id;
}

std::string
SSIOEditInsertionOrderRequest::getOracleLineId()
{
	return oracle_line_id;
}

void
SSIOEditInsertionOrderRequest::setOracleLineId(std::string  oracle_line_id)
{
	this->oracle_line_id = oracle_line_id;
}

std::string
SSIOEditInsertionOrderRequest::getSalesforceOrderId()
{
	return salesforce_order_id;
}

void
SSIOEditInsertionOrderRequest::setSalesforceOrderId(std::string  salesforce_order_id)
{
	this->salesforce_order_id = salesforce_order_id;
}

std::string
SSIOEditInsertionOrderRequest::getSalesforceOrderLineId()
{
	return salesforce_order_line_id;
}

void
SSIOEditInsertionOrderRequest::setSalesforceOrderLineId(std::string  salesforce_order_line_id)
{
	this->salesforce_order_line_id = salesforce_order_line_id;
}



