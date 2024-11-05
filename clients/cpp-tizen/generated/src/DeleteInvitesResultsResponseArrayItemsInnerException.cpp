#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DeleteInvitesResultsResponseArray_items_inner_exception.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DeleteInvitesResultsResponseArray_items_inner_exception::DeleteInvitesResultsResponseArray_items_inner_exception()
{
	//__init();
}

DeleteInvitesResultsResponseArray_items_inner_exception::~DeleteInvitesResultsResponseArray_items_inner_exception()
{
	//__cleanup();
}

void
DeleteInvitesResultsResponseArray_items_inner_exception::__init()
{
	//invite_id = std::string();
	//message = std::string();
}

void
DeleteInvitesResultsResponseArray_items_inner_exception::__cleanup()
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
DeleteInvitesResultsResponseArray_items_inner_exception::fromJson(char* jsonStr)
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

DeleteInvitesResultsResponseArray_items_inner_exception::DeleteInvitesResultsResponseArray_items_inner_exception(char* json)
{
	this->fromJson(json);
}

char*
DeleteInvitesResultsResponseArray_items_inner_exception::toJson()
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
DeleteInvitesResultsResponseArray_items_inner_exception::getInviteId()
{
	return invite_id;
}

void
DeleteInvitesResultsResponseArray_items_inner_exception::setInviteId(std::string  invite_id)
{
	this->invite_id = invite_id;
}

std::string
DeleteInvitesResultsResponseArray_items_inner_exception::getMessage()
{
	return message;
}

void
DeleteInvitesResultsResponseArray_items_inner_exception::setMessage(std::string  message)
{
	this->message = message;
}


