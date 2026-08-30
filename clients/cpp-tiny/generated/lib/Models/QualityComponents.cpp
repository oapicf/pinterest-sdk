

#include "QualityComponents.h"

using namespace Tiny;

QualityComponents::QualityComponents()
{
	advertiser_external_id = null<QualityComponentDetails>();
	click_id_epik = null<QualityComponentDetails>();
	external_event_id = null<QualityComponentDetails>();
	hashed_email = null<QualityComponentDetails>();
	hashed_maid = null<QualityComponentDetails>();
	ip_address = null<QualityComponentDetails>();
	order_id = null<QualityComponentDetails>();
	order_value = null<QualityComponentDetails>();
	product_id = null<QualityComponentDetails>();
	source_url = null<QualityComponentDetails>();
	user_agent = null<QualityComponentDetails>();
}

QualityComponents::QualityComponents(std::string jsonString)
{
	this->fromJson(jsonString);
}

QualityComponents::~QualityComponents()
{

}

void
QualityComponents::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *advertiser_external_idKey = "advertiser_external_id";

    if(object.has_key(advertiser_external_idKey))
    {
        bourne::json value = object[advertiser_external_idKey];


    }

    const char *click_id_epikKey = "click_id_epik";

    if(object.has_key(click_id_epikKey))
    {
        bourne::json value = object[click_id_epikKey];


    }

    const char *external_event_idKey = "external_event_id";

    if(object.has_key(external_event_idKey))
    {
        bourne::json value = object[external_event_idKey];


    }

    const char *hashed_emailKey = "hashed_email";

    if(object.has_key(hashed_emailKey))
    {
        bourne::json value = object[hashed_emailKey];


    }

    const char *hashed_maidKey = "hashed_maid";

    if(object.has_key(hashed_maidKey))
    {
        bourne::json value = object[hashed_maidKey];


    }

    const char *ip_addressKey = "ip_address";

    if(object.has_key(ip_addressKey))
    {
        bourne::json value = object[ip_addressKey];


    }

    const char *order_idKey = "order_id";

    if(object.has_key(order_idKey))
    {
        bourne::json value = object[order_idKey];


    }

    const char *order_valueKey = "order_value";

    if(object.has_key(order_valueKey))
    {
        bourne::json value = object[order_valueKey];


    }

    const char *product_idKey = "product_id";

    if(object.has_key(product_idKey))
    {
        bourne::json value = object[product_idKey];


    }

    const char *source_urlKey = "source_url";

    if(object.has_key(source_urlKey))
    {
        bourne::json value = object[source_urlKey];


    }

    const char *user_agentKey = "user_agent";

    if(object.has_key(user_agentKey))
    {
        bourne::json value = object[user_agentKey];


    }


}

bourne::json
QualityComponents::toJson()
{
    bourne::json object = bourne::json::object();



































    return object;

}

std::map<std::string, QualityComponentDetails>
QualityComponents::getAdvertiserExternalId()
{
	return advertiser_external_id;
}

void
QualityComponents::setAdvertiserExternalId(std::map<std::string, QualityComponentDetails> advertiser_external_id)
{
	this->advertiser_external_id = advertiser_external_id;
}

std::map<std::string, QualityComponentDetails>
QualityComponents::getClickIdEpik()
{
	return click_id_epik;
}

void
QualityComponents::setClickIdEpik(std::map<std::string, QualityComponentDetails> click_id_epik)
{
	this->click_id_epik = click_id_epik;
}

std::map<std::string, QualityComponentDetails>
QualityComponents::getExternalEventId()
{
	return external_event_id;
}

void
QualityComponents::setExternalEventId(std::map<std::string, QualityComponentDetails> external_event_id)
{
	this->external_event_id = external_event_id;
}

std::map<std::string, QualityComponentDetails>
QualityComponents::getHashedEmail()
{
	return hashed_email;
}

void
QualityComponents::setHashedEmail(std::map<std::string, QualityComponentDetails> hashed_email)
{
	this->hashed_email = hashed_email;
}

std::map<std::string, QualityComponentDetails>
QualityComponents::getHashedMaid()
{
	return hashed_maid;
}

void
QualityComponents::setHashedMaid(std::map<std::string, QualityComponentDetails> hashed_maid)
{
	this->hashed_maid = hashed_maid;
}

std::map<std::string, QualityComponentDetails>
QualityComponents::getIpAddress()
{
	return ip_address;
}

void
QualityComponents::setIpAddress(std::map<std::string, QualityComponentDetails> ip_address)
{
	this->ip_address = ip_address;
}

std::map<std::string, QualityComponentDetails>
QualityComponents::getOrderId()
{
	return order_id;
}

void
QualityComponents::setOrderId(std::map<std::string, QualityComponentDetails> order_id)
{
	this->order_id = order_id;
}

std::map<std::string, QualityComponentDetails>
QualityComponents::getOrderValue()
{
	return order_value;
}

void
QualityComponents::setOrderValue(std::map<std::string, QualityComponentDetails> order_value)
{
	this->order_value = order_value;
}

std::map<std::string, QualityComponentDetails>
QualityComponents::getProductId()
{
	return product_id;
}

void
QualityComponents::setProductId(std::map<std::string, QualityComponentDetails> product_id)
{
	this->product_id = product_id;
}

std::map<std::string, QualityComponentDetails>
QualityComponents::getSourceUrl()
{
	return source_url;
}

void
QualityComponents::setSourceUrl(std::map<std::string, QualityComponentDetails> source_url)
{
	this->source_url = source_url;
}

std::map<std::string, QualityComponentDetails>
QualityComponents::getUserAgent()
{
	return user_agent;
}

void
QualityComponents::setUserAgent(std::map<std::string, QualityComponentDetails> user_agent)
{
	this->user_agent = user_agent;
}



