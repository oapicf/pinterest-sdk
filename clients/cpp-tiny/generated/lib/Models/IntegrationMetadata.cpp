

#include "IntegrationMetadata.h"

using namespace Tiny;

IntegrationMetadata::IntegrationMetadata()
{
	additional_id_1 = std::string();
	connected_advertiser_id = std::string();
	connected_lba_id = std::string();
	connected_merchant_id = std::string();
	connected_tag_id = std::string();
	connected_user_id = std::string();
	created_timestamp = float(0);
	external_business_id = std::string();
	id = std::string();
	partner_access_token_expiry = float(0);
	partner_metadata = std::string();
	partner_refresh_token_expiry = float(0);
	scopes = std::string();
	updated_timestamp = float(0);
}

IntegrationMetadata::IntegrationMetadata(std::string jsonString)
{
	this->fromJson(jsonString);
}

IntegrationMetadata::~IntegrationMetadata()
{

}

void
IntegrationMetadata::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *additional_id_1Key = "additional_id_1";

    if(object.has_key(additional_id_1Key))
    {
        bourne::json value = object[additional_id_1Key];



        jsonToValue(&additional_id_1, value, "std::string");


    }

    const char *connected_advertiser_idKey = "connected_advertiser_id";

    if(object.has_key(connected_advertiser_idKey))
    {
        bourne::json value = object[connected_advertiser_idKey];



        jsonToValue(&connected_advertiser_id, value, "std::string");


    }

    const char *connected_lba_idKey = "connected_lba_id";

    if(object.has_key(connected_lba_idKey))
    {
        bourne::json value = object[connected_lba_idKey];



        jsonToValue(&connected_lba_id, value, "std::string");


    }

    const char *connected_merchant_idKey = "connected_merchant_id";

    if(object.has_key(connected_merchant_idKey))
    {
        bourne::json value = object[connected_merchant_idKey];



        jsonToValue(&connected_merchant_id, value, "std::string");


    }

    const char *connected_tag_idKey = "connected_tag_id";

    if(object.has_key(connected_tag_idKey))
    {
        bourne::json value = object[connected_tag_idKey];



        jsonToValue(&connected_tag_id, value, "std::string");


    }

    const char *connected_user_idKey = "connected_user_id";

    if(object.has_key(connected_user_idKey))
    {
        bourne::json value = object[connected_user_idKey];



        jsonToValue(&connected_user_id, value, "std::string");


    }

    const char *created_timestampKey = "created_timestamp";

    if(object.has_key(created_timestampKey))
    {
        bourne::json value = object[created_timestampKey];



        jsonToValue(&created_timestamp, value, "long");


    }

    const char *external_business_idKey = "external_business_id";

    if(object.has_key(external_business_idKey))
    {
        bourne::json value = object[external_business_idKey];



        jsonToValue(&external_business_id, value, "std::string");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *partner_access_token_expiryKey = "partner_access_token_expiry";

    if(object.has_key(partner_access_token_expiryKey))
    {
        bourne::json value = object[partner_access_token_expiryKey];



        jsonToValue(&partner_access_token_expiry, value, "long");


    }

    const char *partner_metadataKey = "partner_metadata";

    if(object.has_key(partner_metadataKey))
    {
        bourne::json value = object[partner_metadataKey];



        jsonToValue(&partner_metadata, value, "std::string");


    }

    const char *partner_refresh_token_expiryKey = "partner_refresh_token_expiry";

    if(object.has_key(partner_refresh_token_expiryKey))
    {
        bourne::json value = object[partner_refresh_token_expiryKey];



        jsonToValue(&partner_refresh_token_expiry, value, "long");


    }

    const char *scopesKey = "scopes";

    if(object.has_key(scopesKey))
    {
        bourne::json value = object[scopesKey];



        jsonToValue(&scopes, value, "std::string");


    }

    const char *updated_timestampKey = "updated_timestamp";

    if(object.has_key(updated_timestampKey))
    {
        bourne::json value = object[updated_timestampKey];



        jsonToValue(&updated_timestamp, value, "long");


    }


}

bourne::json
IntegrationMetadata::toJson()
{
    bourne::json object = bourne::json::object();





    object["additional_id_1"] = getAdditionalId1();






    object["connected_advertiser_id"] = getConnectedAdvertiserId();






    object["connected_lba_id"] = getConnectedLbaId();






    object["connected_merchant_id"] = getConnectedMerchantId();






    object["connected_tag_id"] = getConnectedTagId();






    object["connected_user_id"] = getConnectedUserId();






    object["created_timestamp"] = getCreatedTimestamp();






    object["external_business_id"] = getExternalBusinessId();






    object["id"] = getId();






    object["partner_access_token_expiry"] = getPartnerAccessTokenExpiry();






    object["partner_metadata"] = getPartnerMetadata();






    object["partner_refresh_token_expiry"] = getPartnerRefreshTokenExpiry();






    object["scopes"] = getScopes();






    object["updated_timestamp"] = getUpdatedTimestamp();



    return object;

}

std::string
IntegrationMetadata::getAdditionalId1()
{
	return additional_id_1;
}

void
IntegrationMetadata::setAdditionalId1(std::string  additional_id_1)
{
	this->additional_id_1 = additional_id_1;
}

std::string
IntegrationMetadata::getConnectedAdvertiserId()
{
	return connected_advertiser_id;
}

void
IntegrationMetadata::setConnectedAdvertiserId(std::string  connected_advertiser_id)
{
	this->connected_advertiser_id = connected_advertiser_id;
}

std::string
IntegrationMetadata::getConnectedLbaId()
{
	return connected_lba_id;
}

void
IntegrationMetadata::setConnectedLbaId(std::string  connected_lba_id)
{
	this->connected_lba_id = connected_lba_id;
}

std::string
IntegrationMetadata::getConnectedMerchantId()
{
	return connected_merchant_id;
}

void
IntegrationMetadata::setConnectedMerchantId(std::string  connected_merchant_id)
{
	this->connected_merchant_id = connected_merchant_id;
}

std::string
IntegrationMetadata::getConnectedTagId()
{
	return connected_tag_id;
}

void
IntegrationMetadata::setConnectedTagId(std::string  connected_tag_id)
{
	this->connected_tag_id = connected_tag_id;
}

std::string
IntegrationMetadata::getConnectedUserId()
{
	return connected_user_id;
}

void
IntegrationMetadata::setConnectedUserId(std::string  connected_user_id)
{
	this->connected_user_id = connected_user_id;
}

long
IntegrationMetadata::getCreatedTimestamp()
{
	return created_timestamp;
}

void
IntegrationMetadata::setCreatedTimestamp(long  created_timestamp)
{
	this->created_timestamp = created_timestamp;
}

std::string
IntegrationMetadata::getExternalBusinessId()
{
	return external_business_id;
}

void
IntegrationMetadata::setExternalBusinessId(std::string  external_business_id)
{
	this->external_business_id = external_business_id;
}

std::string
IntegrationMetadata::getId()
{
	return id;
}

void
IntegrationMetadata::setId(std::string  id)
{
	this->id = id;
}

long
IntegrationMetadata::getPartnerAccessTokenExpiry()
{
	return partner_access_token_expiry;
}

void
IntegrationMetadata::setPartnerAccessTokenExpiry(long  partner_access_token_expiry)
{
	this->partner_access_token_expiry = partner_access_token_expiry;
}

std::string
IntegrationMetadata::getPartnerMetadata()
{
	return partner_metadata;
}

void
IntegrationMetadata::setPartnerMetadata(std::string  partner_metadata)
{
	this->partner_metadata = partner_metadata;
}

long
IntegrationMetadata::getPartnerRefreshTokenExpiry()
{
	return partner_refresh_token_expiry;
}

void
IntegrationMetadata::setPartnerRefreshTokenExpiry(long  partner_refresh_token_expiry)
{
	this->partner_refresh_token_expiry = partner_refresh_token_expiry;
}

std::string
IntegrationMetadata::getScopes()
{
	return scopes;
}

void
IntegrationMetadata::setScopes(std::string  scopes)
{
	this->scopes = scopes;
}

long
IntegrationMetadata::getUpdatedTimestamp()
{
	return updated_timestamp;
}

void
IntegrationMetadata::setUpdatedTimestamp(long  updated_timestamp)
{
	this->updated_timestamp = updated_timestamp;
}



