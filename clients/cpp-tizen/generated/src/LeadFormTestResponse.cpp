#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LeadFormTestResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LeadFormTestResponse::LeadFormTestResponse()
{
	//__init();
}

LeadFormTestResponse::~LeadFormTestResponse()
{
	//__cleanup();
}

void
LeadFormTestResponse::__init()
{
	//subscription_id = std::string();
}

void
LeadFormTestResponse::__cleanup()
{
	//if(subscription_id != NULL) {
	//
	//delete subscription_id;
	//subscription_id = NULL;
	//}
	//
}

void
LeadFormTestResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *subscription_idKey = "subscription_id";
	node = json_object_get_member(pJsonObject, subscription_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&subscription_id, node, "std::string", "");
		} else {
			
		}
	}
}

LeadFormTestResponse::LeadFormTestResponse(char* json)
{
	this->fromJson(json);
}

char*
LeadFormTestResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getSubscriptionId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *subscription_idKey = "subscription_id";
	json_object_set_member(pJsonObject, subscription_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
LeadFormTestResponse::getSubscriptionId()
{
	return subscription_id;
}

void
LeadFormTestResponse::setSubscriptionId(std::string  subscription_id)
{
	this->subscription_id = subscription_id;
}


