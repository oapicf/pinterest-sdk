#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "InviteExceptionResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

InviteExceptionResponse::InviteExceptionResponse()
{
	//__init();
}

InviteExceptionResponse::~InviteExceptionResponse()
{
	//__cleanup();
}

void
InviteExceptionResponse::__init()
{
	//invite_or_request_id = std::string();
	//code = int(0);
	//message = std::string();
	//new std::list()std::list> users_or_partner_ids;
}

void
InviteExceptionResponse::__cleanup()
{
	//if(invite_or_request_id != NULL) {
	//
	//delete invite_or_request_id;
	//invite_or_request_id = NULL;
	//}
	//if(code != NULL) {
	//
	//delete code;
	//code = NULL;
	//}
	//if(message != NULL) {
	//
	//delete message;
	//message = NULL;
	//}
	//if(users_or_partner_ids != NULL) {
	//users_or_partner_ids.RemoveAll(true);
	//delete users_or_partner_ids;
	//users_or_partner_ids = NULL;
	//}
	//
}

void
InviteExceptionResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *invite_or_request_idKey = "invite_or_request_id";
	node = json_object_get_member(pJsonObject, invite_or_request_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&invite_or_request_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *codeKey = "code";
	node = json_object_get_member(pJsonObject, codeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&code, node, "int", "");
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
	const gchar *users_or_partner_idsKey = "users_or_partner_ids";
	node = json_object_get_member(pJsonObject, users_or_partner_idsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			users_or_partner_ids = new_list;
		}
		
	}
}

InviteExceptionResponse::InviteExceptionResponse(char* json)
{
	this->fromJson(json);
}

char*
InviteExceptionResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getInviteOrRequestId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *invite_or_request_idKey = "invite_or_request_id";
	json_object_set_member(pJsonObject, invite_or_request_idKey, node);
	if (isprimitive("int")) {
		int obj = getCode();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *codeKey = "code";
	json_object_set_member(pJsonObject, codeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMessage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *messageKey = "message";
	json_object_set_member(pJsonObject, messageKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getUsersOrPartnerIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getUsersOrPartnerIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *users_or_partner_idsKey = "users_or_partner_ids";
	json_object_set_member(pJsonObject, users_or_partner_idsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
InviteExceptionResponse::getInviteOrRequestId()
{
	return invite_or_request_id;
}

void
InviteExceptionResponse::setInviteOrRequestId(std::string  invite_or_request_id)
{
	this->invite_or_request_id = invite_or_request_id;
}

int
InviteExceptionResponse::getCode()
{
	return code;
}

void
InviteExceptionResponse::setCode(int  code)
{
	this->code = code;
}

std::string
InviteExceptionResponse::getMessage()
{
	return message;
}

void
InviteExceptionResponse::setMessage(std::string  message)
{
	this->message = message;
}

std::list<std::string>
InviteExceptionResponse::getUsersOrPartnerIds()
{
	return users_or_partner_ids;
}

void
InviteExceptionResponse::setUsersOrPartnerIds(std::list <std::string> users_or_partner_ids)
{
	this->users_or_partner_ids = users_or_partner_ids;
}


