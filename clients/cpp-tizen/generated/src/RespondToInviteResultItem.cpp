#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RespondToInviteResultItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RespondToInviteResultItem::RespondToInviteResultItem()
{
	//__init();
}

RespondToInviteResultItem::~RespondToInviteResultItem()
{
	//__cleanup();
}

void
RespondToInviteResultItem::__init()
{
	//exception = new InviteExceptionResponse();
	//invite = null;
}

void
RespondToInviteResultItem::__cleanup()
{
	//if(exception != NULL) {
	//
	//delete exception;
	//exception = NULL;
	//}
	//if(invite != NULL) {
	//
	//delete invite;
	//invite = NULL;
	//}
	//
}

void
RespondToInviteResultItem::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *exceptionKey = "exception";
	node = json_object_get_member(pJsonObject, exceptionKey);
	if (node !=NULL) {
	

		if (isprimitive("InviteExceptionResponse")) {
			jsonToValue(&exception, node, "InviteExceptionResponse", "InviteExceptionResponse");
		} else {
			
			InviteExceptionResponse* obj = static_cast<InviteExceptionResponse*> (&exception);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *inviteKey = "invite";
	node = json_object_get_member(pJsonObject, inviteKey);
	if (node !=NULL) {
	

		if (isprimitive("BaseInviteDataResponse")) {
			jsonToValue(&invite, node, "BaseInviteDataResponse", "BaseInviteDataResponse");
		} else {
			
			BaseInviteDataResponse* obj = static_cast<BaseInviteDataResponse*> (&invite);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RespondToInviteResultItem::RespondToInviteResultItem(char* json)
{
	this->fromJson(json);
}

char*
RespondToInviteResultItem::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("InviteExceptionResponse")) {
		InviteExceptionResponse obj = getException();
		node = converttoJson(&obj, "InviteExceptionResponse", "");
	}
	else {
		
		InviteExceptionResponse obj = static_cast<InviteExceptionResponse> (getException());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *exceptionKey = "exception";
	json_object_set_member(pJsonObject, exceptionKey, node);
	if (isprimitive("BaseInviteDataResponse")) {
		BaseInviteDataResponse obj = getInvite();
		node = converttoJson(&obj, "BaseInviteDataResponse", "");
	}
	else {
		
		BaseInviteDataResponse obj = static_cast<BaseInviteDataResponse> (getInvite());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *inviteKey = "invite";
	json_object_set_member(pJsonObject, inviteKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

InviteExceptionResponse
RespondToInviteResultItem::getException()
{
	return exception;
}

void
RespondToInviteResultItem::setException(InviteExceptionResponse  exception)
{
	this->exception = exception;
}

BaseInviteDataResponse
RespondToInviteResultItem::getInvite()
{
	return invite;
}

void
RespondToInviteResultItem::setInvite(BaseInviteDataResponse  invite)
{
	this->invite = invite;
}


