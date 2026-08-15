

#include "SSIOInsertionOrderCommon.h"

using namespace Tiny;

SSIOInsertionOrderCommon::SSIOInsertionOrderCommon()
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
}

SSIOInsertionOrderCommon::SSIOInsertionOrderCommon(std::string jsonString)
{
	this->fromJson(jsonString);
}

SSIOInsertionOrderCommon::~SSIOInsertionOrderCommon()
{

}

void
SSIOInsertionOrderCommon::fromJson(std::string jsonObj)
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


}

bourne::json
SSIOInsertionOrderCommon::toJson()
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



    return object;

}

std::string
SSIOInsertionOrderCommon::getAgencyLink()
{
	return agency_link;
}

void
SSIOInsertionOrderCommon::setAgencyLink(std::string  agency_link)
{
	this->agency_link = agency_link;
}

std::string
SSIOInsertionOrderCommon::getBillingContactEmail()
{
	return billing_contact_email;
}

void
SSIOInsertionOrderCommon::setBillingContactEmail(std::string  billing_contact_email)
{
	this->billing_contact_email = billing_contact_email;
}

std::string
SSIOInsertionOrderCommon::getBillingContactFirstname()
{
	return billing_contact_firstname;
}

void
SSIOInsertionOrderCommon::setBillingContactFirstname(std::string  billing_contact_firstname)
{
	this->billing_contact_firstname = billing_contact_firstname;
}

std::string
SSIOInsertionOrderCommon::getBillingContactLastname()
{
	return billing_contact_lastname;
}

void
SSIOInsertionOrderCommon::setBillingContactLastname(std::string  billing_contact_lastname)
{
	this->billing_contact_lastname = billing_contact_lastname;
}

long
SSIOInsertionOrderCommon::getBudgetAmount()
{
	return budget_amount;
}

void
SSIOInsertionOrderCommon::setBudgetAmount(long  budget_amount)
{
	this->budget_amount = budget_amount;
}

std::string
SSIOInsertionOrderCommon::getEndDate()
{
	return end_date;
}

void
SSIOInsertionOrderCommon::setEndDate(std::string  end_date)
{
	this->end_date = end_date;
}

std::string
SSIOInsertionOrderCommon::getMediaContactEmail()
{
	return media_contact_email;
}

void
SSIOInsertionOrderCommon::setMediaContactEmail(std::string  media_contact_email)
{
	this->media_contact_email = media_contact_email;
}

std::string
SSIOInsertionOrderCommon::getMediaContactFirstname()
{
	return media_contact_firstname;
}

void
SSIOInsertionOrderCommon::setMediaContactFirstname(std::string  media_contact_firstname)
{
	this->media_contact_firstname = media_contact_firstname;
}

std::string
SSIOInsertionOrderCommon::getMediaContactLastname()
{
	return media_contact_lastname;
}

void
SSIOInsertionOrderCommon::setMediaContactLastname(std::string  media_contact_lastname)
{
	this->media_contact_lastname = media_contact_lastname;
}

std::string
SSIOInsertionOrderCommon::getPoNumber()
{
	return po_number;
}

void
SSIOInsertionOrderCommon::setPoNumber(std::string  po_number)
{
	this->po_number = po_number;
}

std::string
SSIOInsertionOrderCommon::getStartDate()
{
	return start_date;
}

void
SSIOInsertionOrderCommon::setStartDate(std::string  start_date)
{
	this->start_date = start_date;
}

std::string
SSIOInsertionOrderCommon::getUserEmail()
{
	return user_email;
}

void
SSIOInsertionOrderCommon::setUserEmail(std::string  user_email)
{
	this->user_email = user_email;
}



