#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "IntegrationRequestPatch.h"

using namespace std;
using namespace Tizen::ArtikCloud;

IntegrationRequestPatch::IntegrationRequestPatch()
{
	//__init();
}

IntegrationRequestPatch::~IntegrationRequestPatch()
{
	//__cleanup();
}

void
IntegrationRequestPatch::__init()
{
	//connected_merchant_id = std::string();
	//connected_advertiser_id = std::string();
	//connected_lba_id = std::string();
	//connected_tag_id = std::string();
	//partner_access_token = std::string();
	//partner_refresh_token = std::string();
	//partner_primary_email = std::string();
	//partner_access_token_expiry = double(0);
	//partner_refresh_token_expiry = double(0);
	//scopes = std::string();
	//additional_id_1 = std::string();
	//partner_metadata = std::string();
}

void
IntegrationRequestPatch::__cleanup()
{
	//if(connected_merchant_id != NULL) {
	//
	//delete connected_merchant_id;
	//connected_merchant_id = NULL;
	//}
	//if(connected_advertiser_id != NULL) {
	//
	//delete connected_advertiser_id;
	//connected_advertiser_id = NULL;
	//}
	//if(connected_lba_id != NULL) {
	//
	//delete connected_lba_id;
	//connected_lba_id = NULL;
	//}
	//if(connected_tag_id != NULL) {
	//
	//delete connected_tag_id;
	//connected_tag_id = NULL;
	//}
	//if(partner_access_token != NULL) {
	//
	//delete partner_access_token;
	//partner_access_token = NULL;
	//}
	//if(partner_refresh_token != NULL) {
	//
	//delete partner_refresh_token;
	//partner_refresh_token = NULL;
	//}
	//if(partner_primary_email != NULL) {
	//
	//delete partner_primary_email;
	//partner_primary_email = NULL;
	//}
	//if(partner_access_token_expiry != NULL) {
	//
	//delete partner_access_token_expiry;
	//partner_access_token_expiry = NULL;
	//}
	//if(partner_refresh_token_expiry != NULL) {
	//
	//delete partner_refresh_token_expiry;
	//partner_refresh_token_expiry = NULL;
	//}
	//if(scopes != NULL) {
	//
	//delete scopes;
	//scopes = NULL;
	//}
	//if(additional_id_1 != NULL) {
	//
	//delete additional_id_1;
	//additional_id_1 = NULL;
	//}
	//if(partner_metadata != NULL) {
	//
	//delete partner_metadata;
	//partner_metadata = NULL;
	//}
	//
}

void
IntegrationRequestPatch::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *connected_merchant_idKey = "connected_merchant_id";
	node = json_object_get_member(pJsonObject, connected_merchant_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&connected_merchant_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *connected_advertiser_idKey = "connected_advertiser_id";
	node = json_object_get_member(pJsonObject, connected_advertiser_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&connected_advertiser_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *connected_lba_idKey = "connected_lba_id";
	node = json_object_get_member(pJsonObject, connected_lba_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&connected_lba_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *connected_tag_idKey = "connected_tag_id";
	node = json_object_get_member(pJsonObject, connected_tag_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&connected_tag_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *partner_access_tokenKey = "partner_access_token";
	node = json_object_get_member(pJsonObject, partner_access_tokenKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&partner_access_token, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *partner_refresh_tokenKey = "partner_refresh_token";
	node = json_object_get_member(pJsonObject, partner_refresh_tokenKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&partner_refresh_token, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *partner_primary_emailKey = "partner_primary_email";
	node = json_object_get_member(pJsonObject, partner_primary_emailKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&partner_primary_email, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *partner_access_token_expiryKey = "partner_access_token_expiry";
	node = json_object_get_member(pJsonObject, partner_access_token_expiryKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&partner_access_token_expiry, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&partner_access_token_expiry);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *partner_refresh_token_expiryKey = "partner_refresh_token_expiry";
	node = json_object_get_member(pJsonObject, partner_refresh_token_expiryKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&partner_refresh_token_expiry, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&partner_refresh_token_expiry);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *scopesKey = "scopes";
	node = json_object_get_member(pJsonObject, scopesKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&scopes, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *additional_id_1Key = "additional_id_1";
	node = json_object_get_member(pJsonObject, additional_id_1Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&additional_id_1, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *partner_metadataKey = "partner_metadata";
	node = json_object_get_member(pJsonObject, partner_metadataKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&partner_metadata, node, "std::string", "");
		} else {
			
		}
	}
}

IntegrationRequestPatch::IntegrationRequestPatch(char* json)
{
	this->fromJson(json);
}

char*
IntegrationRequestPatch::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getConnectedMerchantId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *connected_merchant_idKey = "connected_merchant_id";
	json_object_set_member(pJsonObject, connected_merchant_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getConnectedAdvertiserId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *connected_advertiser_idKey = "connected_advertiser_id";
	json_object_set_member(pJsonObject, connected_advertiser_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getConnectedLbaId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *connected_lba_idKey = "connected_lba_id";
	json_object_set_member(pJsonObject, connected_lba_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getConnectedTagId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *connected_tag_idKey = "connected_tag_id";
	json_object_set_member(pJsonObject, connected_tag_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPartnerAccessToken();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *partner_access_tokenKey = "partner_access_token";
	json_object_set_member(pJsonObject, partner_access_tokenKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPartnerRefreshToken();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *partner_refresh_tokenKey = "partner_refresh_token";
	json_object_set_member(pJsonObject, partner_refresh_tokenKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPartnerPrimaryEmail();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *partner_primary_emailKey = "partner_primary_email";
	json_object_set_member(pJsonObject, partner_primary_emailKey, node);
	if (isprimitive("long long")) {
		long long obj = getPartnerAccessTokenExpiry();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getPartnerAccessTokenExpiry());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *partner_access_token_expiryKey = "partner_access_token_expiry";
	json_object_set_member(pJsonObject, partner_access_token_expiryKey, node);
	if (isprimitive("long long")) {
		long long obj = getPartnerRefreshTokenExpiry();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getPartnerRefreshTokenExpiry());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *partner_refresh_token_expiryKey = "partner_refresh_token_expiry";
	json_object_set_member(pJsonObject, partner_refresh_token_expiryKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getScopes();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *scopesKey = "scopes";
	json_object_set_member(pJsonObject, scopesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAdditionalId1();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *additional_id_1Key = "additional_id_1";
	json_object_set_member(pJsonObject, additional_id_1Key, node);
	if (isprimitive("std::string")) {
		std::string obj = getPartnerMetadata();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *partner_metadataKey = "partner_metadata";
	json_object_set_member(pJsonObject, partner_metadataKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
IntegrationRequestPatch::getConnectedMerchantId()
{
	return connected_merchant_id;
}

void
IntegrationRequestPatch::setConnectedMerchantId(std::string  connected_merchant_id)
{
	this->connected_merchant_id = connected_merchant_id;
}

std::string
IntegrationRequestPatch::getConnectedAdvertiserId()
{
	return connected_advertiser_id;
}

void
IntegrationRequestPatch::setConnectedAdvertiserId(std::string  connected_advertiser_id)
{
	this->connected_advertiser_id = connected_advertiser_id;
}

std::string
IntegrationRequestPatch::getConnectedLbaId()
{
	return connected_lba_id;
}

void
IntegrationRequestPatch::setConnectedLbaId(std::string  connected_lba_id)
{
	this->connected_lba_id = connected_lba_id;
}

std::string
IntegrationRequestPatch::getConnectedTagId()
{
	return connected_tag_id;
}

void
IntegrationRequestPatch::setConnectedTagId(std::string  connected_tag_id)
{
	this->connected_tag_id = connected_tag_id;
}

std::string
IntegrationRequestPatch::getPartnerAccessToken()
{
	return partner_access_token;
}

void
IntegrationRequestPatch::setPartnerAccessToken(std::string  partner_access_token)
{
	this->partner_access_token = partner_access_token;
}

std::string
IntegrationRequestPatch::getPartnerRefreshToken()
{
	return partner_refresh_token;
}

void
IntegrationRequestPatch::setPartnerRefreshToken(std::string  partner_refresh_token)
{
	this->partner_refresh_token = partner_refresh_token;
}

std::string
IntegrationRequestPatch::getPartnerPrimaryEmail()
{
	return partner_primary_email;
}

void
IntegrationRequestPatch::setPartnerPrimaryEmail(std::string  partner_primary_email)
{
	this->partner_primary_email = partner_primary_email;
}

long long
IntegrationRequestPatch::getPartnerAccessTokenExpiry()
{
	return partner_access_token_expiry;
}

void
IntegrationRequestPatch::setPartnerAccessTokenExpiry(long long  partner_access_token_expiry)
{
	this->partner_access_token_expiry = partner_access_token_expiry;
}

long long
IntegrationRequestPatch::getPartnerRefreshTokenExpiry()
{
	return partner_refresh_token_expiry;
}

void
IntegrationRequestPatch::setPartnerRefreshTokenExpiry(long long  partner_refresh_token_expiry)
{
	this->partner_refresh_token_expiry = partner_refresh_token_expiry;
}

std::string
IntegrationRequestPatch::getScopes()
{
	return scopes;
}

void
IntegrationRequestPatch::setScopes(std::string  scopes)
{
	this->scopes = scopes;
}

std::string
IntegrationRequestPatch::getAdditionalId1()
{
	return additional_id_1;
}

void
IntegrationRequestPatch::setAdditionalId1(std::string  additional_id_1)
{
	this->additional_id_1 = additional_id_1;
}

std::string
IntegrationRequestPatch::getPartnerMetadata()
{
	return partner_metadata;
}

void
IntegrationRequestPatch::setPartnerMetadata(std::string  partner_metadata)
{
	this->partner_metadata = partner_metadata;
}


