#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "IntegrationMetadata.h"

using namespace std;
using namespace Tizen::ArtikCloud;

IntegrationMetadata::IntegrationMetadata()
{
	//__init();
}

IntegrationMetadata::~IntegrationMetadata()
{
	//__cleanup();
}

void
IntegrationMetadata::__init()
{
	//id = std::string();
	//external_business_id = std::string();
	//connected_merchant_id = std::string();
	//connected_user_id = std::string();
	//connected_advertiser_id = std::string();
	//connected_lba_id = std::string();
	//connected_tag_id = std::string();
	//partner_access_token_expiry = double(0);
	//partner_refresh_token_expiry = double(0);
	//scopes = std::string();
	//created_timestamp = double(0);
	//updated_timestamp = double(0);
	//additional_id_1 = std::string();
	//partner_metadata = std::string();
}

void
IntegrationMetadata::__cleanup()
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
	//if(created_timestamp != NULL) {
	//
	//delete created_timestamp;
	//created_timestamp = NULL;
	//}
	//if(updated_timestamp != NULL) {
	//
	//delete updated_timestamp;
	//updated_timestamp = NULL;
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
IntegrationMetadata::fromJson(char* jsonStr)
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
	const gchar *created_timestampKey = "created_timestamp";
	node = json_object_get_member(pJsonObject, created_timestampKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&created_timestamp, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&created_timestamp);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *updated_timestampKey = "updated_timestamp";
	node = json_object_get_member(pJsonObject, updated_timestampKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&updated_timestamp, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&updated_timestamp);
			obj->fromJson(json_to_string(node, false));
			
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

IntegrationMetadata::IntegrationMetadata(char* json)
{
	this->fromJson(json);
}

char*
IntegrationMetadata::toJson()
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
	if (isprimitive("long long")) {
		long long obj = getCreatedTimestamp();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getCreatedTimestamp());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *created_timestampKey = "created_timestamp";
	json_object_set_member(pJsonObject, created_timestampKey, node);
	if (isprimitive("long long")) {
		long long obj = getUpdatedTimestamp();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getUpdatedTimestamp());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *updated_timestampKey = "updated_timestamp";
	json_object_set_member(pJsonObject, updated_timestampKey, node);
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
IntegrationMetadata::getId()
{
	return id;
}

void
IntegrationMetadata::setId(std::string  id)
{
	this->id = id;
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
IntegrationMetadata::getConnectedUserId()
{
	return connected_user_id;
}

void
IntegrationMetadata::setConnectedUserId(std::string  connected_user_id)
{
	this->connected_user_id = connected_user_id;
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
IntegrationMetadata::getConnectedTagId()
{
	return connected_tag_id;
}

void
IntegrationMetadata::setConnectedTagId(std::string  connected_tag_id)
{
	this->connected_tag_id = connected_tag_id;
}

long long
IntegrationMetadata::getPartnerAccessTokenExpiry()
{
	return partner_access_token_expiry;
}

void
IntegrationMetadata::setPartnerAccessTokenExpiry(long long  partner_access_token_expiry)
{
	this->partner_access_token_expiry = partner_access_token_expiry;
}

long long
IntegrationMetadata::getPartnerRefreshTokenExpiry()
{
	return partner_refresh_token_expiry;
}

void
IntegrationMetadata::setPartnerRefreshTokenExpiry(long long  partner_refresh_token_expiry)
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

long long
IntegrationMetadata::getCreatedTimestamp()
{
	return created_timestamp;
}

void
IntegrationMetadata::setCreatedTimestamp(long long  created_timestamp)
{
	this->created_timestamp = created_timestamp;
}

long long
IntegrationMetadata::getUpdatedTimestamp()
{
	return updated_timestamp;
}

void
IntegrationMetadata::setUpdatedTimestamp(long long  updated_timestamp)
{
	this->updated_timestamp = updated_timestamp;
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
IntegrationMetadata::getPartnerMetadata()
{
	return partner_metadata;
}

void
IntegrationMetadata::setPartnerMetadata(std::string  partner_metadata)
{
	this->partner_metadata = partner_metadata;
}


