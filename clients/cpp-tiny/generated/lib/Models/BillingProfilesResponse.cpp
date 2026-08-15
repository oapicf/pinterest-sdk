

#include "BillingProfilesResponse.h"

using namespace Tiny;

BillingProfilesResponse::BillingProfilesResponse()
{
	advertiser_id = std::string();
	billing_type = std::string();
	card_type = std::string();
	id = std::string();
	payment_method_brand = std::string();
	status = std::string();
}

BillingProfilesResponse::BillingProfilesResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

BillingProfilesResponse::~BillingProfilesResponse()
{

}

void
BillingProfilesResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *advertiser_idKey = "advertiser_id";

    if(object.has_key(advertiser_idKey))
    {
        bourne::json value = object[advertiser_idKey];



        jsonToValue(&advertiser_id, value, "std::string");


    }

    const char *billing_typeKey = "billing_type";

    if(object.has_key(billing_typeKey))
    {
        bourne::json value = object[billing_typeKey];



        jsonToValue(&billing_type, value, "std::string");


    }

    const char *card_typeKey = "card_type";

    if(object.has_key(card_typeKey))
    {
        bourne::json value = object[card_typeKey];



        jsonToValue(&card_type, value, "std::string");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *payment_method_brandKey = "payment_method_brand";

    if(object.has_key(payment_method_brandKey))
    {
        bourne::json value = object[payment_method_brandKey];



        jsonToValue(&payment_method_brand, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];



        jsonToValue(&status, value, "std::string");


    }


}

bourne::json
BillingProfilesResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["advertiser_id"] = getAdvertiserId();






    object["billing_type"] = getBillingType();






    object["card_type"] = getCardType();






    object["id"] = getId();






    object["payment_method_brand"] = getPaymentMethodBrand();






    object["status"] = getStatus();



    return object;

}

std::string
BillingProfilesResponse::getAdvertiserId()
{
	return advertiser_id;
}

void
BillingProfilesResponse::setAdvertiserId(std::string  advertiser_id)
{
	this->advertiser_id = advertiser_id;
}

std::string
BillingProfilesResponse::getBillingType()
{
	return billing_type;
}

void
BillingProfilesResponse::setBillingType(std::string  billing_type)
{
	this->billing_type = billing_type;
}

std::string
BillingProfilesResponse::getCardType()
{
	return card_type;
}

void
BillingProfilesResponse::setCardType(std::string  card_type)
{
	this->card_type = card_type;
}

std::string
BillingProfilesResponse::getId()
{
	return id;
}

void
BillingProfilesResponse::setId(std::string  id)
{
	this->id = id;
}

std::string
BillingProfilesResponse::getPaymentMethodBrand()
{
	return payment_method_brand;
}

void
BillingProfilesResponse::setPaymentMethodBrand(std::string  payment_method_brand)
{
	this->payment_method_brand = payment_method_brand;
}

std::string
BillingProfilesResponse::getStatus()
{
	return status;
}

void
BillingProfilesResponse::setStatus(std::string  status)
{
	this->status = status;
}



