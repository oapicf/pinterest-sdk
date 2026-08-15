

#include "IntegrationRequest.h"

using namespace Tiny;

IntegrationRequest::IntegrationRequest()
{
	additional_id_1 = std::string();
	connected_advertiser_id = std::string();
	connected_lba_id = std::string();
	connected_merchant_id = std::string();
	connected_tag_id = std::string();
	external_business_id = std::string();
	partner_access_token = std::string();
	partner_access_token_expiry = int(0);
	partner_metadata = std::string();
	partner_primary_email = std::string();
	partner_refresh_token = std::string();
	partner_refresh_token_expiry = int(0);
	scopes = std::string();
}

IntegrationRequest::IntegrationRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

IntegrationRequest::~IntegrationRequest()
{

}

void
IntegrationRequest::fromJson(std::string jsonObj)
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

    const char *external_business_idKey = "external_business_id";

    if(object.has_key(external_business_idKey))
    {
        bourne::json value = object[external_business_idKey];



        jsonToValue(&external_business_id, value, "std::string");


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


}

bourne::json
IntegrationRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["additional_id_1"] = getAdditionalId1();






    object["connected_advertiser_id"] = getConnectedAdvertiserId();






    object["connected_lba_id"] = getConnectedLbaId();






    object["connected_merchant_id"] = getConnectedMerchantId();






    object["connected_tag_id"] = getConnectedTagId();






    object["external_business_id"] = getExternalBusinessId();






    object["partner_access_token"] = getPartnerAccessToken();






    object["partner_access_token_expiry"] = getPartnerAccessTokenExpiry();






    object["partner_metadata"] = getPartnerMetadata();






    object["partner_primary_email"] = getPartnerPrimaryEmail();






    object["partner_refresh_token"] = getPartnerRefreshToken();






    object["partner_refresh_token_expiry"] = getPartnerRefreshTokenExpiry();






    object["scopes"] = getScopes();



    return object;

}

std::string
IntegrationRequest::getAdditionalId1()
{
	return additional_id_1;
}

void
IntegrationRequest::setAdditionalId1(std::string  additional_id_1)
{
	this->additional_id_1 = additional_id_1;
}

std::string
IntegrationRequest::getConnectedAdvertiserId()
{
	return connected_advertiser_id;
}

void
IntegrationRequest::setConnectedAdvertiserId(std::string  connected_advertiser_id)
{
	this->connected_advertiser_id = connected_advertiser_id;
}

std::string
IntegrationRequest::getConnectedLbaId()
{
	return connected_lba_id;
}

void
IntegrationRequest::setConnectedLbaId(std::string  connected_lba_id)
{
	this->connected_lba_id = connected_lba_id;
}

std::string
IntegrationRequest::getConnectedMerchantId()
{
	return connected_merchant_id;
}

void
IntegrationRequest::setConnectedMerchantId(std::string  connected_merchant_id)
{
	this->connected_merchant_id = connected_merchant_id;
}

std::string
IntegrationRequest::getConnectedTagId()
{
	return connected_tag_id;
}

void
IntegrationRequest::setConnectedTagId(std::string  connected_tag_id)
{
	this->connected_tag_id = connected_tag_id;
}

std::string
IntegrationRequest::getExternalBusinessId()
{
	return external_business_id;
}

void
IntegrationRequest::setExternalBusinessId(std::string  external_business_id)
{
	this->external_business_id = external_business_id;
}

std::string
IntegrationRequest::getPartnerAccessToken()
{
	return partner_access_token;
}

void
IntegrationRequest::setPartnerAccessToken(std::string  partner_access_token)
{
	this->partner_access_token = partner_access_token;
}

int
IntegrationRequest::getPartnerAccessTokenExpiry()
{
	return partner_access_token_expiry;
}

void
IntegrationRequest::setPartnerAccessTokenExpiry(int  partner_access_token_expiry)
{
	this->partner_access_token_expiry = partner_access_token_expiry;
}

std::string
IntegrationRequest::getPartnerMetadata()
{
	return partner_metadata;
}

void
IntegrationRequest::setPartnerMetadata(std::string  partner_metadata)
{
	this->partner_metadata = partner_metadata;
}

std::string
IntegrationRequest::getPartnerPrimaryEmail()
{
	return partner_primary_email;
}

void
IntegrationRequest::setPartnerPrimaryEmail(std::string  partner_primary_email)
{
	this->partner_primary_email = partner_primary_email;
}

std::string
IntegrationRequest::getPartnerRefreshToken()
{
	return partner_refresh_token;
}

void
IntegrationRequest::setPartnerRefreshToken(std::string  partner_refresh_token)
{
	this->partner_refresh_token = partner_refresh_token;
}

int
IntegrationRequest::getPartnerRefreshTokenExpiry()
{
	return partner_refresh_token_expiry;
}

void
IntegrationRequest::setPartnerRefreshTokenExpiry(int  partner_refresh_token_expiry)
{
	this->partner_refresh_token_expiry = partner_refresh_token_expiry;
}

std::string
IntegrationRequest::getScopes()
{
	return scopes;
}

void
IntegrationRequest::setScopes(std::string  scopes)
{
	this->scopes = scopes;
}



