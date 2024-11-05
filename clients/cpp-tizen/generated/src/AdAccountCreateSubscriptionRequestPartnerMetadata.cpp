#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdAccountCreateSubscriptionRequest_partner_metadata.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdAccountCreateSubscriptionRequest_partner_metadata::AdAccountCreateSubscriptionRequest_partner_metadata()
{
	//__init();
}

AdAccountCreateSubscriptionRequest_partner_metadata::~AdAccountCreateSubscriptionRequest_partner_metadata()
{
	//__cleanup();
}

void
AdAccountCreateSubscriptionRequest_partner_metadata::__init()
{
	//subscriber_key = std::string();
}

void
AdAccountCreateSubscriptionRequest_partner_metadata::__cleanup()
{
	//if(subscriber_key != NULL) {
	//
	//delete subscriber_key;
	//subscriber_key = NULL;
	//}
	//
}

void
AdAccountCreateSubscriptionRequest_partner_metadata::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *subscriber_keyKey = "subscriber_key";
	node = json_object_get_member(pJsonObject, subscriber_keyKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&subscriber_key, node, "std::string", "");
		} else {
			
		}
	}
}

AdAccountCreateSubscriptionRequest_partner_metadata::AdAccountCreateSubscriptionRequest_partner_metadata(char* json)
{
	this->fromJson(json);
}

char*
AdAccountCreateSubscriptionRequest_partner_metadata::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getSubscriberKey();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *subscriber_keyKey = "subscriber_key";
	json_object_set_member(pJsonObject, subscriber_keyKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AdAccountCreateSubscriptionRequest_partner_metadata::getSubscriberKey()
{
	return subscriber_key;
}

void
AdAccountCreateSubscriptionRequest_partner_metadata::setSubscriberKey(std::string  subscriber_key)
{
	this->subscriber_key = subscriber_key;
}


