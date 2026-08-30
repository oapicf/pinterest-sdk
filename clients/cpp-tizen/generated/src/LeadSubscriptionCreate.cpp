#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LeadSubscriptionCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LeadSubscriptionCreate::LeadSubscriptionCreate()
{
	//__init();
}

LeadSubscriptionCreate::~LeadSubscriptionCreate()
{
	//__cleanup();
}

void
LeadSubscriptionCreate::__init()
{
	//lead_form_id = std::string();
	//webhook_url = std::string();
}

void
LeadSubscriptionCreate::__cleanup()
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
	//
}

void
LeadSubscriptionCreate::fromJson(char* jsonStr)
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
}

LeadSubscriptionCreate::LeadSubscriptionCreate(char* json)
{
	this->fromJson(json);
}

char*
LeadSubscriptionCreate::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
LeadSubscriptionCreate::getLeadFormId()
{
	return lead_form_id;
}

void
LeadSubscriptionCreate::setLeadFormId(std::string  lead_form_id)
{
	this->lead_form_id = lead_form_id;
}

std::string
LeadSubscriptionCreate::getWebhookUrl()
{
	return webhook_url;
}

void
LeadSubscriptionCreate::setWebhookUrl(std::string  webhook_url)
{
	this->webhook_url = webhook_url;
}


