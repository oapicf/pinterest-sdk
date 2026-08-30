#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CancelInviteException.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CancelInviteException::CancelInviteException()
{
	//__init();
}

CancelInviteException::~CancelInviteException()
{
	//__cleanup();
}

void
CancelInviteException::__init()
{
	//invite_id = std::string();
	//message = std::string();
}

void
CancelInviteException::__cleanup()
{
	//if(invite_id != NULL) {
	//
	//delete invite_id;
	//invite_id = NULL;
	//}
	//if(message != NULL) {
	//
	//delete message;
	//message = NULL;
	//}
	//
}

void
CancelInviteException::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *invite_idKey = "invite_id";
	node = json_object_get_member(pJsonObject, invite_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&invite_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *messageKey = "message";
	node = json_object_get_member(pJsonObject, messageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&message, node, "std::string", "");
		} else {
			
		}
	}
}

CancelInviteException::CancelInviteException(char* json)
{
	this->fromJson(json);
}

char*
CancelInviteException::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getInviteId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *invite_idKey = "invite_id";
	json_object_set_member(pJsonObject, invite_idKey, node);
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
CancelInviteException::getInviteId()
{
	return invite_id;
}

void
CancelInviteException::setInviteId(std::string  invite_id)
{
	this->invite_id = invite_id;
}

std::string
CancelInviteException::getMessage()
{
	return message;
}

void
CancelInviteException::setMessage(std::string  message)
{
	this->message = message;
}


