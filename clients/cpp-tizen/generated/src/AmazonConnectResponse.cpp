#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AmazonConnectResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AmazonConnectResponse::AmazonConnectResponse()
{
	//__init();
}

AmazonConnectResponse::~AmazonConnectResponse()
{
	//__cleanup();
}

void
AmazonConnectResponse::__init()
{
	//message = std::string();
}

void
AmazonConnectResponse::__cleanup()
{
	//if(message != NULL) {
	//
	//delete message;
	//message = NULL;
	//}
	//
}

void
AmazonConnectResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *messageKey = "message";
	node = json_object_get_member(pJsonObject, messageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&message, node, "std::string", "");
		} else {
			
		}
	}
}

AmazonConnectResponse::AmazonConnectResponse(char* json)
{
	this->fromJson(json);
}

char*
AmazonConnectResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getMessage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *messageKey = "message";
	json_object_set_member(pJsonObject, messageKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AmazonConnectResponse::getMessage()
{
	return message;
}

void
AmazonConnectResponse::setMessage(std::string  message)
{
	this->message = message;
}


