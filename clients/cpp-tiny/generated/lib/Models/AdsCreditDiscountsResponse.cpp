

#include "AdsCreditDiscountsResponse.h"

using namespace Tiny;

AdsCreditDiscountsResponse::AdsCreditDiscountsResponse()
{
	active = bool(false);
	advertiser_id = std::string();
	discountCurrency = std::string();
	discountInMicroCurrency = float(0);
	discountType = null;
	remainingDiscountInMicroCurrency = float(0);
	title = std::string();
}

AdsCreditDiscountsResponse::AdsCreditDiscountsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdsCreditDiscountsResponse::~AdsCreditDiscountsResponse()
{

}

void
AdsCreditDiscountsResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *activeKey = "active";

    if(object.has_key(activeKey))
    {
        bourne::json value = object[activeKey];



        jsonToValue(&active, value, "bool");


    }

    const char *advertiser_idKey = "advertiser_id";

    if(object.has_key(advertiser_idKey))
    {
        bourne::json value = object[advertiser_idKey];



        jsonToValue(&advertiser_id, value, "std::string");


    }

    const char *discountCurrencyKey = "discountCurrency";

    if(object.has_key(discountCurrencyKey))
    {
        bourne::json value = object[discountCurrencyKey];



        jsonToValue(&discountCurrency, value, "std::string");


    }

    const char *discountInMicroCurrencyKey = "discountInMicroCurrency";

    if(object.has_key(discountInMicroCurrencyKey))
    {
        bourne::json value = object[discountInMicroCurrencyKey];



        jsonToValue(&discountInMicroCurrency, value, "long");


    }

    const char *discountTypeKey = "discountType";

    if(object.has_key(discountTypeKey))
    {
        bourne::json value = object[discountTypeKey];




        AdsCreditDiscountType* obj = &discountType;
		obj->fromJson(value.dump());

    }

    const char *remainingDiscountInMicroCurrencyKey = "remainingDiscountInMicroCurrency";

    if(object.has_key(remainingDiscountInMicroCurrencyKey))
    {
        bourne::json value = object[remainingDiscountInMicroCurrencyKey];



        jsonToValue(&remainingDiscountInMicroCurrency, value, "long");


    }

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];



        jsonToValue(&title, value, "std::string");


    }


}

bourne::json
AdsCreditDiscountsResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["active"] = isActive();






    object["advertiser_id"] = getAdvertiserId();






    object["discountCurrency"] = getDiscountCurrency();






    object["discountInMicroCurrency"] = getDiscountInMicroCurrency();







	object["discountType"] = getDiscountType().toJson();





    object["remainingDiscountInMicroCurrency"] = getRemainingDiscountInMicroCurrency();






    object["title"] = getTitle();



    return object;

}

bool
AdsCreditDiscountsResponse::isActive()
{
	return active;
}

void
AdsCreditDiscountsResponse::setActive(bool active)
{
	this->active = active;
}

std::string
AdsCreditDiscountsResponse::getAdvertiserId()
{
	return advertiser_id;
}

void
AdsCreditDiscountsResponse::setAdvertiserId(std::string advertiser_id)
{
	this->advertiser_id = advertiser_id;
}

std::string
AdsCreditDiscountsResponse::getDiscountCurrency()
{
	return discountCurrency;
}

void
AdsCreditDiscountsResponse::setDiscountCurrency(std::string discountCurrency)
{
	this->discountCurrency = discountCurrency;
}

long
AdsCreditDiscountsResponse::getDiscountInMicroCurrency()
{
	return discountInMicroCurrency;
}

void
AdsCreditDiscountsResponse::setDiscountInMicroCurrency(long discountInMicroCurrency)
{
	this->discountInMicroCurrency = discountInMicroCurrency;
}

AdsCreditDiscountType
AdsCreditDiscountsResponse::getDiscountType()
{
	return discountType;
}

void
AdsCreditDiscountsResponse::setDiscountType(AdsCreditDiscountType discountType)
{
	this->discountType = discountType;
}

long
AdsCreditDiscountsResponse::getRemainingDiscountInMicroCurrency()
{
	return remainingDiscountInMicroCurrency;
}

void
AdsCreditDiscountsResponse::setRemainingDiscountInMicroCurrency(long remainingDiscountInMicroCurrency)
{
	this->remainingDiscountInMicroCurrency = remainingDiscountInMicroCurrency;
}

std::string
AdsCreditDiscountsResponse::getTitle()
{
	return title;
}

void
AdsCreditDiscountsResponse::setTitle(std::string title)
{
	this->title = title;
}



