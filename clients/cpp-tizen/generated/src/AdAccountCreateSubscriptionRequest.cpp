#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdAccountCreateSubscriptionRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdAccountCreateSubscriptionRequest::AdAccountCreateSubscriptionRequest()
{
	//__init();
}

AdAccountCreateSubscriptionRequest::~AdAccountCreateSubscriptionRequest()
{
	//__cleanup();
}

void
AdAccountCreateSubscriptionRequest::__init()
{
	//webhook_url = std::string();
	//lead_form_id = std::string();
	//partner_access_token = std::string();
	//partner_refresh_token = std::string();
	//partner_metadata = new AdAccountCreateSubscriptionRequest_partner_metadata();
}

void
AdAccountCreateSubscriptionRequest::__cleanup()
{
	//if(webhook_url != NULL) {
	//
	//delete webhook_url;
	//webhook_url = NULL;
	//}
	//if(lead_form_id != NULL) {
	//
	//delete lead_form_id;
	//lead_form_id = NULL;
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
	//if(partner_metadata != NULL) {
	//
	//delete partner_metadata;
	//partner_metadata = NULL;
	//}
	//
}

void
AdAccountCreateSubscriptionRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *webhook_urlKey = "webhook_url";
	node = json_object_get_member(pJsonObject, webhook_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&webhook_url, node, "std::string", "");
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
	const gchar *partner_metadataKey = "partner_metadata";
	node = json_object_get_member(pJsonObject, partner_metadataKey);
	if (node !=NULL) {
	

		if (isprimitive("AdAccountCreateSubscriptionRequest_partner_metadata")) {
			jsonToValue(&partner_metadata, node, "AdAccountCreateSubscriptionRequest_partner_metadata", "AdAccountCreateSubscriptionRequest_partner_metadata");
		} else {
			
			AdAccountCreateSubscriptionRequest_partner_metadata* obj = static_cast<AdAccountCreateSubscriptionRequest_partner_metadata*> (&partner_metadata);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AdAccountCreateSubscriptionRequest::AdAccountCreateSubscriptionRequest(char* json)
{
	this->fromJson(json);
}

char*
AdAccountCreateSubscriptionRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getWebhookUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *webhook_urlKey = "webhook_url";
	json_object_set_member(pJsonObject, webhook_urlKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLeadFormId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *lead_form_idKey = "lead_form_id";
	json_object_set_member(pJsonObject, lead_form_idKey, node);
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
	if (isprimitive("AdAccountCreateSubscriptionRequest_partner_metadata")) {
		AdAccountCreateSubscriptionRequest_partner_metadata obj = getPartnerMetadata();
		node = converttoJson(&obj, "AdAccountCreateSubscriptionRequest_partner_metadata", "");
	}
	else {
		
		AdAccountCreateSubscriptionRequest_partner_metadata obj = static_cast<AdAccountCreateSubscriptionRequest_partner_metadata> (getPartnerMetadata());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
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
AdAccountCreateSubscriptionRequest::getWebhookUrl()
{
	return webhook_url;
}

void
AdAccountCreateSubscriptionRequest::setWebhookUrl(std::string  webhook_url)
{
	this->webhook_url = webhook_url;
}

std::string
AdAccountCreateSubscriptionRequest::getLeadFormId()
{
	return lead_form_id;
}

void
AdAccountCreateSubscriptionRequest::setLeadFormId(std::string  lead_form_id)
{
	this->lead_form_id = lead_form_id;
}

std::string
AdAccountCreateSubscriptionRequest::getPartnerAccessToken()
{
	return partner_access_token;
}

void
AdAccountCreateSubscriptionRequest::setPartnerAccessToken(std::string  partner_access_token)
{
	this->partner_access_token = partner_access_token;
}

std::string
AdAccountCreateSubscriptionRequest::getPartnerRefreshToken()
{
	return partner_refresh_token;
}

void
AdAccountCreateSubscriptionRequest::setPartnerRefreshToken(std::string  partner_refresh_token)
{
	this->partner_refresh_token = partner_refresh_token;
}

AdAccountCreateSubscriptionRequest_partner_metadata
AdAccountCreateSubscriptionRequest::getPartnerMetadata()
{
	return partner_metadata;
}

void
AdAccountCreateSubscriptionRequest::setPartnerMetadata(AdAccountCreateSubscriptionRequest_partner_metadata  partner_metadata)
{
	this->partner_metadata = partner_metadata;
}


