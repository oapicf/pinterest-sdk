#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PartnerMetadata.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PartnerMetadata::PartnerMetadata()
{
	//__init();
}

PartnerMetadata::~PartnerMetadata()
{
	//__cleanup();
}

void
PartnerMetadata::__init()
{
	//subscriber_key = std::string();
}

void
PartnerMetadata::__cleanup()
{
	//if(subscriber_key != NULL) {
	//
	//delete subscriber_key;
	//subscriber_key = NULL;
	//}
	//
}

void
PartnerMetadata::fromJson(char* jsonStr)
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

PartnerMetadata::PartnerMetadata(char* json)
{
	this->fromJson(json);
}

char*
PartnerMetadata::toJson()
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
PartnerMetadata::getSubscriberKey()
{
	return subscriber_key;
}

void
PartnerMetadata::setSubscriberKey(std::string  subscriber_key)
{
	this->subscriber_key = subscriber_key;
}


