

#include "IntegrationRecord.h"

using namespace Tiny;

IntegrationRecord::IntegrationRecord()
{
	additional_id_1 = std::string();
	connected_advertiser_id = std::string();
	connected_lba_id = std::string();
	connected_merchant_id = std::string();
	connected_tag_id = std::string();
	connected_user_id = std::string();
	created_time = int(0);
	external_business_id = std::string();
	id = null;
	partner_access_token = std::string();
	partner_access_token_expiry = int(0);
	partner_metadata = std::string();
	partner_primary_email = std::string();
	partner_refresh_token = std::string();
	partner_refresh_token_expiry = int(0);
	scopes = std::string();
	updated_time = int(0);
}

IntegrationRecord::IntegrationRecord(std::string jsonString)
{
	this->fromJson(jsonString);
}

IntegrationRecord::~IntegrationRecord()
{

}

void
IntegrationRecord::fromJson(std::string jsonObj)
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

    const char *created_timeKey = "created_time";

    if(object.has_key(created_timeKey))
    {
        bourne::json value = object[created_timeKey];



        jsonToValue(&created_time, value, "int");


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

    const char *partner_access_tokenKey = "partner_access_token";

    if(object.has_key(partner_access_tokenKey))
    {
        bourne::json value = object[partner_access_tokenKey];



        jsonToValue(&partner_access_token, value, "std::string");


    }

    const char *partner_access_token_expiryKey = "partner_access_token_expiry";

    if(object.has_key(partner_access_token_expiryKey))
    {
        bourne::json value = object[partner_access_token_expiryKey];



        jsonToValue(&partner_access_token_expiry, value, "int");


    }

    const char *partner_metadataKey = "partner_metadata";

    if(object.has_key(partner_metadataKey))
    {
        bourne::json value = object[partner_metadataKey];



        jsonToValue(&partner_metadata, value, "std::string");


    }

    const char *partner_primary_emailKey = "partner_primary_email";

    if(object.has_key(partner_primary_emailKey))
    {
        bourne::json value = object[partner_primary_emailKey];



        jsonToValue(&partner_primary_email, value, "std::string");


    }

    const char *partner_refresh_tokenKey = "partner_refresh_token";

    if(object.has_key(partner_refresh_tokenKey))
    {
        bourne::json value = object[partner_refresh_tokenKey];



        jsonToValue(&partner_refresh_token, value, "std::string");


    }

    const char *partner_refresh_token_expiryKey = "partner_refresh_token_expiry";

    if(object.has_key(partner_refresh_token_expiryKey))
    {
        bourne::json value = object[partner_refresh_token_expiryKey];



        jsonToValue(&partner_refresh_token_expiry, value, "int");


    }

    const char *scopesKey = "scopes";

    if(object.has_key(scopesKey))
    {
        bourne::json value = object[scopesKey];



        jsonToValue(&scopes, value, "std::string");


    }

    const char *updated_timeKey = "updated_time";

    if(object.has_key(updated_timeKey))
    {
        bourne::json value = object[updated_timeKey];



        jsonToValue(&updated_time, value, "int");


    }


}

bourne::json
IntegrationRecord::toJson()
{
    bourne::json object = bourne::json::object();





    object["additional_id_1"] = getAdditionalId1();






    object["connected_advertiser_id"] = getConnectedAdvertiserId();






    object["connected_lba_id"] = getConnectedLbaId();






    object["connected_merchant_id"] = getConnectedMerchantId();






    object["connected_tag_id"] = getConnectedTagId();






    object["connected_user_id"] = getConnectedUserId();






    object["created_time"] = getCreatedTime();






    object["external_business_id"] = getExternalBusinessId();






    object["id"] = getId();






    object["partner_access_token"] = getPartnerAccessToken();






    object["partner_access_token_expiry"] = getPartnerAccessTokenExpiry();






    object["partner_metadata"] = getPartnerMetadata();






    object["partner_primary_email"] = getPartnerPrimaryEmail();






    object["partner_refresh_token"] = getPartnerRefreshToken();






    object["partner_refresh_token_expiry"] = getPartnerRefreshTokenExpiry();






    object["scopes"] = getScopes();






    object["updated_time"] = getUpdatedTime();



    return object;

}

std::string
IntegrationRecord::getAdditionalId1()
{
	return additional_id_1;
}

void
IntegrationRecord::setAdditionalId1(std::string additional_id_1)
{
	this->additional_id_1 = additional_id_1;
}

std::string
IntegrationRecord::getConnectedAdvertiserId()
{
	return connected_advertiser_id;
}

void
IntegrationRecord::setConnectedAdvertiserId(std::string connected_advertiser_id)
{
	this->connected_advertiser_id = connected_advertiser_id;
}

std::string
IntegrationRecord::getConnectedLbaId()
{
	return connected_lba_id;
}

void
IntegrationRecord::setConnectedLbaId(std::string connected_lba_id)
{
	this->connected_lba_id = connected_lba_id;
}

std::string
IntegrationRecord::getConnectedMerchantId()
{
	return connected_merchant_id;
}

void
IntegrationRecord::setConnectedMerchantId(std::string connected_merchant_id)
{
	this->connected_merchant_id = connected_merchant_id;
}

std::string
IntegrationRecord::getConnectedTagId()
{
	return connected_tag_id;
}

void
IntegrationRecord::setConnectedTagId(std::string connected_tag_id)
{
	this->connected_tag_id = connected_tag_id;
}

std::string
IntegrationRecord::getConnectedUserId()
{
	return connected_user_id;
}

void
IntegrationRecord::setConnectedUserId(std::string connected_user_id)
{
	this->connected_user_id = connected_user_id;
}

int
IntegrationRecord::getCreatedTime()
{
	return created_time;
}

void
IntegrationRecord::setCreatedTime(int created_time)
{
	this->created_time = created_time;
}

std::string
IntegrationRecord::getExternalBusinessId()
{
	return external_business_id;
}

void
IntegrationRecord::setExternalBusinessId(std::string external_business_id)
{
	this->external_business_id = external_business_id;
}

std::string
IntegrationRecord::getId()
{
	return id;
}

void
IntegrationRecord::setId(std::string id)
{
	this->id = id;
}

std::string
IntegrationRecord::getPartnerAccessToken()
{
	return partner_access_token;
}

void
IntegrationRecord::setPartnerAccessToken(std::string partner_access_token)
{
	this->partner_access_token = partner_access_token;
}

int
IntegrationRecord::getPartnerAccessTokenExpiry()
{
	return partner_access_token_expiry;
}

void
IntegrationRecord::setPartnerAccessTokenExpiry(int partner_access_token_expiry)
{
	this->partner_access_token_expiry = partner_access_token_expiry;
}

std::string
IntegrationRecord::getPartnerMetadata()
{
	return partner_metadata;
}

void
IntegrationRecord::setPartnerMetadata(std::string partner_metadata)
{
	this->partner_metadata = partner_metadata;
}

std::string
IntegrationRecord::getPartnerPrimaryEmail()
{
	return partner_primary_email;
}

void
IntegrationRecord::setPartnerPrimaryEmail(std::string partner_primary_email)
{
	this->partner_primary_email = partner_primary_email;
}

std::string
IntegrationRecord::getPartnerRefreshToken()
{
	return partner_refresh_token;
}

void
IntegrationRecord::setPartnerRefreshToken(std::string partner_refresh_token)
{
	this->partner_refresh_token = partner_refresh_token;
}

int
IntegrationRecord::getPartnerRefreshTokenExpiry()
{
	return partner_refresh_token_expiry;
}

void
IntegrationRecord::setPartnerRefreshTokenExpiry(int partner_refresh_token_expiry)
{
	this->partner_refresh_token_expiry = partner_refresh_token_expiry;
}

std::string
IntegrationRecord::getScopes()
{
	return scopes;
}

void
IntegrationRecord::setScopes(std::string scopes)
{
	this->scopes = scopes;
}

int
IntegrationRecord::getUpdatedTime()
{
	return updated_time;
}

void
IntegrationRecord::setUpdatedTime(int updated_time)
{
	this->updated_time = updated_time;
}



