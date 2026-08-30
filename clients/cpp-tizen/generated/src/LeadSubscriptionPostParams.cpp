#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LeadSubscriptionPostParams.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LeadSubscriptionPostParams::LeadSubscriptionPostParams()
{
	//__init();
}

LeadSubscriptionPostParams::~LeadSubscriptionPostParams()
{
	//__cleanup();
}

void
LeadSubscriptionPostParams::__init()
{
	//ad_account_id = std::string();
	//api_version = std::string();
	//created_time = int(0);
	//cryptographic_algorithm = std::string();
	//cryptographic_key = std::string();
	//id = std::string();
	//lead_form_id = std::string();
	//user_account_id = std::string();
	//webhook_url = std::string();
	//partner_access_token = std::string();
	//partner_metadata = null;
	//partner_refresh_token = std::string();
}

void
LeadSubscriptionPostParams::__cleanup()
{
	//if(ad_account_id != NULL) {
	//
	//delete ad_account_id;
	//ad_account_id = NULL;
	//}
	//if(api_version != NULL) {
	//
	//delete api_version;
	//api_version = NULL;
	//}
	//if(created_time != NULL) {
	//
	//delete created_time;
	//created_time = NULL;
	//}
	//if(cryptographic_algorithm != NULL) {
	//
	//delete cryptographic_algorithm;
	//cryptographic_algorithm = NULL;
	//}
	//if(cryptographic_key != NULL) {
	//
	//delete cryptographic_key;
	//cryptographic_key = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(lead_form_id != NULL) {
	//
	//delete lead_form_id;
	//lead_form_id = NULL;
	//}
	//if(user_account_id != NULL) {
	//
	//delete user_account_id;
	//user_account_id = NULL;
	//}
	//if(webhook_url != NULL) {
	//
	//delete webhook_url;
	//webhook_url = NULL;
	//}
	//if(partner_access_token != NULL) {
	//
	//delete partner_access_token;
	//partner_access_token = NULL;
	//}
	//if(partner_metadata != NULL) {
	//
	//delete partner_metadata;
	//partner_metadata = NULL;
	//}
	//if(partner_refresh_token != NULL) {
	//
	//delete partner_refresh_token;
	//partner_refresh_token = NULL;
	//}
	//
}

void
LeadSubscriptionPostParams::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ad_account_idKey = "ad_account_id";
	node = json_object_get_member(pJsonObject, ad_account_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ad_account_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *api_versionKey = "api_version";
	node = json_object_get_member(pJsonObject, api_versionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&api_version, node, "std::string", "");
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
	const gchar *cryptographic_algorithmKey = "cryptographic_algorithm";
	node = json_object_get_member(pJsonObject, cryptographic_algorithmKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&cryptographic_algorithm, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *cryptographic_keyKey = "cryptographic_key";
	node = json_object_get_member(pJsonObject, cryptographic_keyKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&cryptographic_key, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *lead_form_idKey = "lead_form_id";
	node = json_object_get_member(pJsonObject, lead_form_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&lead_form_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *user_account_idKey = "user_account_id";
	node = json_object_get_member(pJsonObject, user_account_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&user_account_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *webhook_urlKey = "webhook_url";
	node = json_object_get_member(pJsonObject, webhook_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&webhook_url, node, "std::string", "");
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
	const gchar *partner_metadataKey = "partner_metadata";
	node = json_object_get_member(pJsonObject, partner_metadataKey);
	if (node !=NULL) {
	

		if (isprimitive("PartnerMetadata")) {
			jsonToValue(&partner_metadata, node, "PartnerMetadata", "PartnerMetadata");
		} else {
			
			PartnerMetadata* obj = static_cast<PartnerMetadata*> (&partner_metadata);
			obj->fromJson(json_to_string(node, false));
			
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
}

LeadSubscriptionPostParams::LeadSubscriptionPostParams(char* json)
{
	this->fromJson(json);
}

char*
LeadSubscriptionPostParams::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAdAccountId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ad_account_idKey = "ad_account_id";
	json_object_set_member(pJsonObject, ad_account_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getApiVersion();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *api_versionKey = "api_version";
	json_object_set_member(pJsonObject, api_versionKey, node);
	if (isprimitive("int")) {
		int obj = getCreatedTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_timeKey = "created_time";
	json_object_set_member(pJsonObject, created_timeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCryptographicAlgorithm();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *cryptographic_algorithmKey = "cryptographic_algorithm";
	json_object_set_member(pJsonObject, cryptographic_algorithmKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCryptographicKey();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *cryptographic_keyKey = "cryptographic_key";
	json_object_set_member(pJsonObject, cryptographic_keyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLeadFormId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *lead_form_idKey = "lead_form_id";
	json_object_set_member(pJsonObject, lead_form_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUserAccountId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *user_account_idKey = "user_account_id";
	json_object_set_member(pJsonObject, user_account_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getWebhookUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *webhook_urlKey = "webhook_url";
	json_object_set_member(pJsonObject, webhook_urlKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPartnerAccessToken();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *partner_access_tokenKey = "partner_access_token";
	json_object_set_member(pJsonObject, partner_access_tokenKey, node);
	if (isprimitive("PartnerMetadata")) {
		PartnerMetadata obj = getPartnerMetadata();
		node = converttoJson(&obj, "PartnerMetadata", "");
	}
	else {
		
		PartnerMetadata obj = static_cast<PartnerMetadata> (getPartnerMetadata());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *partner_metadataKey = "partner_metadata";
	json_object_set_member(pJsonObject, partner_metadataKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPartnerRefreshToken();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *partner_refresh_tokenKey = "partner_refresh_token";
	json_object_set_member(pJsonObject, partner_refresh_tokenKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
LeadSubscriptionPostParams::getAdAccountId()
{
	return ad_account_id;
}

void
LeadSubscriptionPostParams::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::string
LeadSubscriptionPostParams::getApiVersion()
{
	return api_version;
}

void
LeadSubscriptionPostParams::setApiVersion(std::string  api_version)
{
	this->api_version = api_version;
}

int
LeadSubscriptionPostParams::getCreatedTime()
{
	return created_time;
}

void
LeadSubscriptionPostParams::setCreatedTime(int  created_time)
{
	this->created_time = created_time;
}

std::string
LeadSubscriptionPostParams::getCryptographicAlgorithm()
{
	return cryptographic_algorithm;
}

void
LeadSubscriptionPostParams::setCryptographicAlgorithm(std::string  cryptographic_algorithm)
{
	this->cryptographic_algorithm = cryptographic_algorithm;
}

std::string
LeadSubscriptionPostParams::getCryptographicKey()
{
	return cryptographic_key;
}

void
LeadSubscriptionPostParams::setCryptographicKey(std::string  cryptographic_key)
{
	this->cryptographic_key = cryptographic_key;
}

std::string
LeadSubscriptionPostParams::getId()
{
	return id;
}

void
LeadSubscriptionPostParams::setId(std::string  id)
{
	this->id = id;
}

std::string
LeadSubscriptionPostParams::getLeadFormId()
{
	return lead_form_id;
}

void
LeadSubscriptionPostParams::setLeadFormId(std::string  lead_form_id)
{
	this->lead_form_id = lead_form_id;
}

std::string
LeadSubscriptionPostParams::getUserAccountId()
{
	return user_account_id;
}

void
LeadSubscriptionPostParams::setUserAccountId(std::string  user_account_id)
{
	this->user_account_id = user_account_id;
}

std::string
LeadSubscriptionPostParams::getWebhookUrl()
{
	return webhook_url;
}

void
LeadSubscriptionPostParams::setWebhookUrl(std::string  webhook_url)
{
	this->webhook_url = webhook_url;
}

std::string
LeadSubscriptionPostParams::getPartnerAccessToken()
{
	return partner_access_token;
}

void
LeadSubscriptionPostParams::setPartnerAccessToken(std::string  partner_access_token)
{
	this->partner_access_token = partner_access_token;
}

PartnerMetadata
LeadSubscriptionPostParams::getPartnerMetadata()
{
	return partner_metadata;
}

void
LeadSubscriptionPostParams::setPartnerMetadata(PartnerMetadata  partner_metadata)
{
	this->partner_metadata = partner_metadata;
}

std::string
LeadSubscriptionPostParams::getPartnerRefreshToken()
{
	return partner_refresh_token;
}

void
LeadSubscriptionPostParams::setPartnerRefreshToken(std::string  partner_refresh_token)
{
	this->partner_refresh_token = partner_refresh_token;
}


