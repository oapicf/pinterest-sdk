#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "IntegrationRecord.h"

using namespace std;
using namespace Tizen::ArtikCloud;

IntegrationRecord::IntegrationRecord()
{
	//__init();
}

IntegrationRecord::~IntegrationRecord()
{
	//__cleanup();
}

void
IntegrationRecord::__init()
{
	//id = std::string();
	//external_business_id = std::string();
	//connected_merchant_id = std::string();
	//connected_user_id = std::string();
	//connected_advertiser_id = std::string();
	//connected_lba_id = std::string();
	//connected_tag_id = std::string();
	//partner_access_token = std::string();
	//partner_refresh_token = std::string();
	//partner_primary_email = std::string();
	//partner_access_token_expiry = int(0);
	//partner_refresh_token_expiry = int(0);
	//scopes = std::string();
	//partner_metadata = std::string();
	//additional_id_1 = std::string();
	//created_time = int(0);
	//updated_time = int(0);
}

void
IntegrationRecord::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(external_business_id != NULL) {
	//
	//delete external_business_id;
	//external_business_id = NULL;
	//}
	//if(connected_merchant_id != NULL) {
	//
	//delete connected_merchant_id;
	//connected_merchant_id = NULL;
	//}
	//if(connected_user_id != NULL) {
	//
	//delete connected_user_id;
	//connected_user_id = NULL;
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
	//if(partner_metadata != NULL) {
	//
	//delete partner_metadata;
	//partner_metadata = NULL;
	//}
	//if(additional_id_1 != NULL) {
	//
	//delete additional_id_1;
	//additional_id_1 = NULL;
	//}
	//if(created_time != NULL) {
	//
	//delete created_time;
	//created_time = NULL;
	//}
	//if(updated_time != NULL) {
	//
	//delete updated_time;
	//updated_time = NULL;
	//}
	//
}

void
IntegrationRecord::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *external_business_idKey = "external_business_id";
	node = json_object_get_member(pJsonObject, external_business_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&external_business_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *connected_merchant_idKey = "connected_merchant_id";
	node = json_object_get_member(pJsonObject, connected_merchant_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&connected_merchant_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *connected_user_idKey = "connected_user_id";
	node = json_object_get_member(pJsonObject, connected_user_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&connected_user_id, node, "std::string", "");
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
	

		if (isprimitive("int")) {
			jsonToValue(&partner_access_token_expiry, node, "int", "");
		} else {
			
		}
	}
	const gchar *partner_refresh_token_expiryKey = "partner_refresh_token_expiry";
	node = json_object_get_member(pJsonObject, partner_refresh_token_expiryKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&partner_refresh_token_expiry, node, "int", "");
		} else {
			
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
	const gchar *partner_metadataKey = "partner_metadata";
	node = json_object_get_member(pJsonObject, partner_metadataKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&partner_metadata, node, "std::string", "");
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
	const gchar *created_timeKey = "created_time";
	node = json_object_get_member(pJsonObject, created_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&created_time, node, "int", "");
		} else {
			
		}
	}
	const gchar *updated_timeKey = "updated_time";
	node = json_object_get_member(pJsonObject, updated_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&updated_time, node, "int", "");
		} else {
			
		}
	}
}

IntegrationRecord::IntegrationRecord(char* json)
{
	this->fromJson(json);
}

char*
IntegrationRecord::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getExternalBusinessId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *external_business_idKey = "external_business_id";
	json_object_set_member(pJsonObject, external_business_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getConnectedMerchantId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *connected_merchant_idKey = "connected_merchant_id";
	json_object_set_member(pJsonObject, connected_merchant_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getConnectedUserId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *connected_user_idKey = "connected_user_id";
	json_object_set_member(pJsonObject, connected_user_idKey, node);
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
	if (isprimitive("int")) {
		int obj = getPartnerAccessTokenExpiry();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *partner_access_token_expiryKey = "partner_access_token_expiry";
	json_object_set_member(pJsonObject, partner_access_token_expiryKey, node);
	if (isprimitive("int")) {
		int obj = getPartnerRefreshTokenExpiry();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
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
		std::string obj = getPartnerMetadata();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *partner_metadataKey = "partner_metadata";
	json_object_set_member(pJsonObject, partner_metadataKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAdditionalId1();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *additional_id_1Key = "additional_id_1";
	json_object_set_member(pJsonObject, additional_id_1Key, node);
	if (isprimitive("int")) {
		int obj = getCreatedTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_timeKey = "created_time";
	json_object_set_member(pJsonObject, created_timeKey, node);
	if (isprimitive("int")) {
		int obj = getUpdatedTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *updated_timeKey = "updated_time";
	json_object_set_member(pJsonObject, updated_timeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
IntegrationRecord::getId()
{
	return id;
}

void
IntegrationRecord::setId(std::string  id)
{
	this->id = id;
}

std::string
IntegrationRecord::getExternalBusinessId()
{
	return external_business_id;
}

void
IntegrationRecord::setExternalBusinessId(std::string  external_business_id)
{
	this->external_business_id = external_business_id;
}

std::string
IntegrationRecord::getConnectedMerchantId()
{
	return connected_merchant_id;
}

void
IntegrationRecord::setConnectedMerchantId(std::string  connected_merchant_id)
{
	this->connected_merchant_id = connected_merchant_id;
}

std::string
IntegrationRecord::getConnectedUserId()
{
	return connected_user_id;
}

void
IntegrationRecord::setConnectedUserId(std::string  connected_user_id)
{
	this->connected_user_id = connected_user_id;
}

std::string
IntegrationRecord::getConnectedAdvertiserId()
{
	return connected_advertiser_id;
}

void
IntegrationRecord::setConnectedAdvertiserId(std::string  connected_advertiser_id)
{
	this->connected_advertiser_id = connected_advertiser_id;
}

std::string
IntegrationRecord::getConnectedLbaId()
{
	return connected_lba_id;
}

void
IntegrationRecord::setConnectedLbaId(std::string  connected_lba_id)
{
	this->connected_lba_id = connected_lba_id;
}

std::string
IntegrationRecord::getConnectedTagId()
{
	return connected_tag_id;
}

void
IntegrationRecord::setConnectedTagId(std::string  connected_tag_id)
{
	this->connected_tag_id = connected_tag_id;
}

std::string
IntegrationRecord::getPartnerAccessToken()
{
	return partner_access_token;
}

void
IntegrationRecord::setPartnerAccessToken(std::string  partner_access_token)
{
	this->partner_access_token = partner_access_token;
}

std::string
IntegrationRecord::getPartnerRefreshToken()
{
	return partner_refresh_token;
}

void
IntegrationRecord::setPartnerRefreshToken(std::string  partner_refresh_token)
{
	this->partner_refresh_token = partner_refresh_token;
}

std::string
IntegrationRecord::getPartnerPrimaryEmail()
{
	return partner_primary_email;
}

void
IntegrationRecord::setPartnerPrimaryEmail(std::string  partner_primary_email)
{
	this->partner_primary_email = partner_primary_email;
}

int
IntegrationRecord::getPartnerAccessTokenExpiry()
{
	return partner_access_token_expiry;
}

void
IntegrationRecord::setPartnerAccessTokenExpiry(int  partner_access_token_expiry)
{
	this->partner_access_token_expiry = partner_access_token_expiry;
}

int
IntegrationRecord::getPartnerRefreshTokenExpiry()
{
	return partner_refresh_token_expiry;
}

void
IntegrationRecord::setPartnerRefreshTokenExpiry(int  partner_refresh_token_expiry)
{
	this->partner_refresh_token_expiry = partner_refresh_token_expiry;
}

std::string
IntegrationRecord::getScopes()
{
	return scopes;
}

void
IntegrationRecord::setScopes(std::string  scopes)
{
	this->scopes = scopes;
}

std::string
IntegrationRecord::getPartnerMetadata()
{
	return partner_metadata;
}

void
IntegrationRecord::setPartnerMetadata(std::string  partner_metadata)
{
	this->partner_metadata = partner_metadata;
}

std::string
IntegrationRecord::getAdditionalId1()
{
	return additional_id_1;
}

void
IntegrationRecord::setAdditionalId1(std::string  additional_id_1)
{
	this->additional_id_1 = additional_id_1;
}

int
IntegrationRecord::getCreatedTime()
{
	return created_time;
}

void
IntegrationRecord::setCreatedTime(int  created_time)
{
	this->created_time = created_time;
}

int
IntegrationRecord::getUpdatedTime()
{
	return updated_time;
}

void
IntegrationRecord::setUpdatedTime(int  updated_time)
{
	this->updated_time = updated_time;
}


