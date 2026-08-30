

#include "BillingProfilesResponse.h"

using namespace Tiny;

BillingProfilesResponse::BillingProfilesResponse()
{
	advertiser_id = std::string();
	billing_type = null;
	card_type = null;
	id = std::string();
	payment_method_brand = null;
	status = null;
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




        BillingType* obj = &billing_type;
		obj->fromJson(value.dump());

    }

    const char *card_typeKey = "card_type";

    if(object.has_key(card_typeKey))
    {
        bourne::json value = object[card_typeKey];




        BillingProfileCardType* obj = &card_type;
		obj->fromJson(value.dump());

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




        BillingProfilePaymentMethodBrand* obj = &payment_method_brand;
		obj->fromJson(value.dump());

    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        BillingProfileStatus* obj = &status;
		obj->fromJson(value.dump());

    }


}

bourne::json
BillingProfilesResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["advertiser_id"] = getAdvertiserId();







	object["billing_type"] = getBillingType().toJson();






	object["card_type"] = getCardType().toJson();





    object["id"] = getId();







	object["payment_method_brand"] = getPaymentMethodBrand().toJson();






	object["status"] = getStatus().toJson();


    return object;

}

std::string
BillingProfilesResponse::getAdvertiserId()
{
	return advertiser_id;
}

void
BillingProfilesResponse::setAdvertiserId(std::string advertiser_id)
{
	this->advertiser_id = advertiser_id;
}

BillingType
BillingProfilesResponse::getBillingType()
{
	return billing_type;
}

void
BillingProfilesResponse::setBillingType(BillingType billing_type)
{
	this->billing_type = billing_type;
}

BillingProfileCardType
BillingProfilesResponse::getCardType()
{
	return card_type;
}

void
BillingProfilesResponse::setCardType(BillingProfileCardType card_type)
{
	this->card_type = card_type;
}

std::string
BillingProfilesResponse::getId()
{
	return id;
}

void
BillingProfilesResponse::setId(std::string id)
{
	this->id = id;
}

BillingProfilePaymentMethodBrand
BillingProfilesResponse::getPaymentMethodBrand()
{
	return payment_method_brand;
}

void
BillingProfilesResponse::setPaymentMethodBrand(BillingProfilePaymentMethodBrand payment_method_brand)
{
	this->payment_method_brand = payment_method_brand;
}

BillingProfileStatus
BillingProfilesResponse::getStatus()
{
	return status;
}

void
BillingProfilesResponse::setStatus(BillingProfileStatus status)
{
	this->status = status;
}



