

#include "CampaignAdPreview.h"

using namespace Tiny;

CampaignAdPreview::CampaignAdPreview()
{
	ad_account_id = std::string();
	ad_group_id = std::string();
	client_id = int(0);
	expires_at = int(0);
	is_active = bool(false);
	pin_id = int(0);
	pin_promotion_id = int(0);
	promoted_product_group_id = int(0);
	url = std::string();
	user_id = int(0);
	uuid = std::string();
}

CampaignAdPreview::CampaignAdPreview(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignAdPreview::~CampaignAdPreview()
{

}

void
CampaignAdPreview::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_account_idKey = "ad_account_id";

    if(object.has_key(ad_account_idKey))
    {
        bourne::json value = object[ad_account_idKey];



        jsonToValue(&ad_account_id, value, "std::string");


    }

    const char *ad_group_idKey = "ad_group_id";

    if(object.has_key(ad_group_idKey))
    {
        bourne::json value = object[ad_group_idKey];



        jsonToValue(&ad_group_id, value, "std::string");


    }

    const char *client_idKey = "client_id";

    if(object.has_key(client_idKey))
    {
        bourne::json value = object[client_idKey];



        jsonToValue(&client_id, value, "int");


    }

    const char *expires_atKey = "expires_at";

    if(object.has_key(expires_atKey))
    {
        bourne::json value = object[expires_atKey];



        jsonToValue(&expires_at, value, "int");


    }

    const char *is_activeKey = "is_active";

    if(object.has_key(is_activeKey))
    {
        bourne::json value = object[is_activeKey];



        jsonToValue(&is_active, value, "bool");


    }

    const char *pin_idKey = "pin_id";

    if(object.has_key(pin_idKey))
    {
        bourne::json value = object[pin_idKey];



        jsonToValue(&pin_id, value, "int");


    }

    const char *pin_promotion_idKey = "pin_promotion_id";

    if(object.has_key(pin_promotion_idKey))
    {
        bourne::json value = object[pin_promotion_idKey];



        jsonToValue(&pin_promotion_id, value, "int");


    }

    const char *promoted_product_group_idKey = "promoted_product_group_id";

    if(object.has_key(promoted_product_group_idKey))
    {
        bourne::json value = object[promoted_product_group_idKey];



        jsonToValue(&promoted_product_group_id, value, "int");


    }

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];



        jsonToValue(&url, value, "std::string");


    }

    const char *user_idKey = "user_id";

    if(object.has_key(user_idKey))
    {
        bourne::json value = object[user_idKey];



        jsonToValue(&user_id, value, "int");


    }

    const char *uuidKey = "uuid";

    if(object.has_key(uuidKey))
    {
        bourne::json value = object[uuidKey];



        jsonToValue(&uuid, value, "std::string");


    }


}

bourne::json
CampaignAdPreview::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_account_id"] = getAdAccountId();






    object["ad_group_id"] = getAdGroupId();






    object["client_id"] = getClientId();






    object["expires_at"] = getExpiresAt();






    object["is_active"] = isIsActive();






    object["pin_id"] = getPinId();






    object["pin_promotion_id"] = getPinPromotionId();






    object["promoted_product_group_id"] = getPromotedProductGroupId();






    object["url"] = getUrl();






    object["user_id"] = getUserId();






    object["uuid"] = getUuid();



    return object;

}

std::string
CampaignAdPreview::getAdAccountId()
{
	return ad_account_id;
}

void
CampaignAdPreview::setAdAccountId(std::string ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::string
CampaignAdPreview::getAdGroupId()
{
	return ad_group_id;
}

void
CampaignAdPreview::setAdGroupId(std::string ad_group_id)
{
	this->ad_group_id = ad_group_id;
}

int
CampaignAdPreview::getClientId()
{
	return client_id;
}

void
CampaignAdPreview::setClientId(int client_id)
{
	this->client_id = client_id;
}

int
CampaignAdPreview::getExpiresAt()
{
	return expires_at;
}

void
CampaignAdPreview::setExpiresAt(int expires_at)
{
	this->expires_at = expires_at;
}

bool
CampaignAdPreview::isIsActive()
{
	return is_active;
}

void
CampaignAdPreview::setIsActive(bool is_active)
{
	this->is_active = is_active;
}

int
CampaignAdPreview::getPinId()
{
	return pin_id;
}

void
CampaignAdPreview::setPinId(int pin_id)
{
	this->pin_id = pin_id;
}

int
CampaignAdPreview::getPinPromotionId()
{
	return pin_promotion_id;
}

void
CampaignAdPreview::setPinPromotionId(int pin_promotion_id)
{
	this->pin_promotion_id = pin_promotion_id;
}

int
CampaignAdPreview::getPromotedProductGroupId()
{
	return promoted_product_group_id;
}

void
CampaignAdPreview::setPromotedProductGroupId(int promoted_product_group_id)
{
	this->promoted_product_group_id = promoted_product_group_id;
}

std::string
CampaignAdPreview::getUrl()
{
	return url;
}

void
CampaignAdPreview::setUrl(std::string url)
{
	this->url = url;
}

int
CampaignAdPreview::getUserId()
{
	return user_id;
}

void
CampaignAdPreview::setUserId(int user_id)
{
	this->user_id = user_id;
}

std::string
CampaignAdPreview::getUuid()
{
	return uuid;
}

void
CampaignAdPreview::setUuid(std::string uuid)
{
	this->uuid = uuid;
}



