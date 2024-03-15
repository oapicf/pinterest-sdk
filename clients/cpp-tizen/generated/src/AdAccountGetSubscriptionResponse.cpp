#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdAccountGetSubscriptionResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdAccountGetSubscriptionResponse::AdAccountGetSubscriptionResponse()
{
	//__init();
}

AdAccountGetSubscriptionResponse::~AdAccountGetSubscriptionResponse()
{
	//__cleanup();
}

void
AdAccountGetSubscriptionResponse::__init()
{
	//lead_form_id = std::string();
	//webhook_url = std::string();
	//id = std::string();
	//user_account_id = std::string();
	//ad_account_id = std::string();
	//api_version = std::string();
	//cryptographic_key = std::string();
	//cryptographic_algorithm = std::string();
	//created_time = int(0);
}

void
AdAccountGetSubscriptionResponse::__cleanup()
{
	//if(lead_form_id != NULL) {
	//
	//delete lead_form_id;
	//lead_form_id = NULL;
	//}
	//if(webhook_url != NULL) {
	//
	//delete webhook_url;
	//webhook_url = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(user_account_id != NULL) {
	//
	//delete user_account_id;
	//user_account_id = NULL;
	//}
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
	//if(cryptographic_key != NULL) {
	//
	//delete cryptographic_key;
	//cryptographic_key = NULL;
	//}
	//if(cryptographic_algorithm != NULL) {
	//
	//delete cryptographic_algorithm;
	//cryptographic_algorithm = NULL;
	//}
	//if(created_time != NULL) {
	//
	//delete created_time;
	//created_time = NULL;
	//}
	//
}

void
AdAccountGetSubscriptionResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *lead_form_idKey = "lead_form_id";
	node = json_object_get_member(pJsonObject, lead_form_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&lead_form_id, node, "std::string", "");
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
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
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
	const gchar *cryptographic_keyKey = "cryptographic_key";
	node = json_object_get_member(pJsonObject, cryptographic_keyKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&cryptographic_key, node, "std::string", "");
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
	const gchar *created_timeKey = "created_time";
	node = json_object_get_member(pJsonObject, created_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&created_time, node, "int", "");
		} else {
			
		}
	}
}

AdAccountGetSubscriptionResponse::AdAccountGetSubscriptionResponse(char* json)
{
	this->fromJson(json);
}

char*
AdAccountGetSubscriptionResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getLeadFormId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *lead_form_idKey = "lead_form_id";
	json_object_set_member(pJsonObject, lead_form_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getWebhookUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *webhook_urlKey = "webhook_url";
	json_object_set_member(pJsonObject, webhook_urlKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUserAccountId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *user_account_idKey = "user_account_id";
	json_object_set_member(pJsonObject, user_account_idKey, node);
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
	if (isprimitive("std::string")) {
		std::string obj = getCryptographicKey();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *cryptographic_keyKey = "cryptographic_key";
	json_object_set_member(pJsonObject, cryptographic_keyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCryptographicAlgorithm();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *cryptographic_algorithmKey = "cryptographic_algorithm";
	json_object_set_member(pJsonObject, cryptographic_algorithmKey, node);
	if (isprimitive("int")) {
		int obj = getCreatedTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_timeKey = "created_time";
	json_object_set_member(pJsonObject, created_timeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AdAccountGetSubscriptionResponse::getLeadFormId()
{
	return lead_form_id;
}

void
AdAccountGetSubscriptionResponse::setLeadFormId(std::string  lead_form_id)
{
	this->lead_form_id = lead_form_id;
}

std::string
AdAccountGetSubscriptionResponse::getWebhookUrl()
{
	return webhook_url;
}

void
AdAccountGetSubscriptionResponse::setWebhookUrl(std::string  webhook_url)
{
	this->webhook_url = webhook_url;
}

std::string
AdAccountGetSubscriptionResponse::getId()
{
	return id;
}

void
AdAccountGetSubscriptionResponse::setId(std::string  id)
{
	this->id = id;
}

std::string
AdAccountGetSubscriptionResponse::getUserAccountId()
{
	return user_account_id;
}

void
AdAccountGetSubscriptionResponse::setUserAccountId(std::string  user_account_id)
{
	this->user_account_id = user_account_id;
}

std::string
AdAccountGetSubscriptionResponse::getAdAccountId()
{
	return ad_account_id;
}

void
AdAccountGetSubscriptionResponse::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::string
AdAccountGetSubscriptionResponse::getApiVersion()
{
	return api_version;
}

void
AdAccountGetSubscriptionResponse::setApiVersion(std::string  api_version)
{
	this->api_version = api_version;
}

std::string
AdAccountGetSubscriptionResponse::getCryptographicKey()
{
	return cryptographic_key;
}

void
AdAccountGetSubscriptionResponse::setCryptographicKey(std::string  cryptographic_key)
{
	this->cryptographic_key = cryptographic_key;
}

std::string
AdAccountGetSubscriptionResponse::getCryptographicAlgorithm()
{
	return cryptographic_algorithm;
}

void
AdAccountGetSubscriptionResponse::setCryptographicAlgorithm(std::string  cryptographic_algorithm)
{
	this->cryptographic_algorithm = cryptographic_algorithm;
}

int
AdAccountGetSubscriptionResponse::getCreatedTime()
{
	return created_time;
}

void
AdAccountGetSubscriptionResponse::setCreatedTime(int  created_time)
{
	this->created_time = created_time;
}


