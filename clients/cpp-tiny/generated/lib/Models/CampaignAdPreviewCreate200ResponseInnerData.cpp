

#include "Campaign_ad_preview_create_200_response_inner_data.h"

using namespace Tiny;

Campaign_ad_preview_create_200_response_inner_data::Campaign_ad_preview_create_200_response_inner_data()
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
	exceptions = Pinterest.Lib.Error();
}

Campaign_ad_preview_create_200_response_inner_data::Campaign_ad_preview_create_200_response_inner_data(std::string jsonString)
{
	this->fromJson(jsonString);
}

Campaign_ad_preview_create_200_response_inner_data::~Campaign_ad_preview_create_200_response_inner_data()
{

}

void
Campaign_ad_preview_create_200_response_inner_data::fromJson(std::string jsonObj)
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

    const char *exceptionsKey = "exceptions";

    if(object.has_key(exceptionsKey))
    {
        bourne::json value = object[exceptionsKey];




        Pinterest.Lib.Error* obj = &exceptions;
		obj->fromJson(value.dump());

    }


}

bourne::json
Campaign_ad_preview_create_200_response_inner_data::toJson()
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







	object["exceptions"] = getExceptions().toJson();


    return object;

}

std::string
Campaign_ad_preview_create_200_response_inner_data::getAdAccountId()
{
	return ad_account_id;
}

void
Campaign_ad_preview_create_200_response_inner_data::setAdAccountId(std::string ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::string
Campaign_ad_preview_create_200_response_inner_data::getAdGroupId()
{
	return ad_group_id;
}

void
Campaign_ad_preview_create_200_response_inner_data::setAdGroupId(std::string ad_group_id)
{
	this->ad_group_id = ad_group_id;
}

int
Campaign_ad_preview_create_200_response_inner_data::getClientId()
{
	return client_id;
}

void
Campaign_ad_preview_create_200_response_inner_data::setClientId(int client_id)
{
	this->client_id = client_id;
}

int
Campaign_ad_preview_create_200_response_inner_data::getExpiresAt()
{
	return expires_at;
}

void
Campaign_ad_preview_create_200_response_inner_data::setExpiresAt(int expires_at)
{
	this->expires_at = expires_at;
}

bool
Campaign_ad_preview_create_200_response_inner_data::isIsActive()
{
	return is_active;
}

void
Campaign_ad_preview_create_200_response_inner_data::setIsActive(bool is_active)
{
	this->is_active = is_active;
}

int
Campaign_ad_preview_create_200_response_inner_data::getPinId()
{
	return pin_id;
}

void
Campaign_ad_preview_create_200_response_inner_data::setPinId(int pin_id)
{
	this->pin_id = pin_id;
}

int
Campaign_ad_preview_create_200_response_inner_data::getPinPromotionId()
{
	return pin_promotion_id;
}

void
Campaign_ad_preview_create_200_response_inner_data::setPinPromotionId(int pin_promotion_id)
{
	this->pin_promotion_id = pin_promotion_id;
}

int
Campaign_ad_preview_create_200_response_inner_data::getPromotedProductGroupId()
{
	return promoted_product_group_id;
}

void
Campaign_ad_preview_create_200_response_inner_data::setPromotedProductGroupId(int promoted_product_group_id)
{
	this->promoted_product_group_id = promoted_product_group_id;
}

std::string
Campaign_ad_preview_create_200_response_inner_data::getUrl()
{
	return url;
}

void
Campaign_ad_preview_create_200_response_inner_data::setUrl(std::string url)
{
	this->url = url;
}

int
Campaign_ad_preview_create_200_response_inner_data::getUserId()
{
	return user_id;
}

void
Campaign_ad_preview_create_200_response_inner_data::setUserId(int user_id)
{
	this->user_id = user_id;
}

std::string
Campaign_ad_preview_create_200_response_inner_data::getUuid()
{
	return uuid;
}

void
Campaign_ad_preview_create_200_response_inner_data::setUuid(std::string uuid)
{
	this->uuid = uuid;
}

Pinterest.Lib.Error
Campaign_ad_preview_create_200_response_inner_data::getExceptions()
{
	return exceptions;
}

void
Campaign_ad_preview_create_200_response_inner_data::setExceptions(Pinterest.Lib.Error exceptions)
{
	this->exceptions = exceptions;
}



