#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateInvitesResultsResponseArray_items_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateInvitesResultsResponseArray_items_inner::CreateInvitesResultsResponseArray_items_inner()
{
	//__init();
}

CreateInvitesResultsResponseArray_items_inner::~CreateInvitesResultsResponseArray_items_inner()
{
	//__cleanup();
}

void
CreateInvitesResultsResponseArray_items_inner::__init()
{
	//exception = new InviteExceptionResponse();
	//invite = new CreateInvitesResultsResponseArray_items_inner_invite();
}

void
CreateInvitesResultsResponseArray_items_inner::__cleanup()
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
CreateInvitesResultsResponseArray_items_inner::fromJson(char* jsonStr)
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
	

		if (isprimitive("CreateInvitesResultsResponseArray_items_inner_invite")) {
			jsonToValue(&invite, node, "CreateInvitesResultsResponseArray_items_inner_invite", "CreateInvitesResultsResponseArray_items_inner_invite");
		} else {
			
			CreateInvitesResultsResponseArray_items_inner_invite* obj = static_cast<CreateInvitesResultsResponseArray_items_inner_invite*> (&invite);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CreateInvitesResultsResponseArray_items_inner::CreateInvitesResultsResponseArray_items_inner(char* json)
{
	this->fromJson(json);
}

char*
CreateInvitesResultsResponseArray_items_inner::toJson()
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
	if (isprimitive("CreateInvitesResultsResponseArray_items_inner_invite")) {
		CreateInvitesResultsResponseArray_items_inner_invite obj = getInvite();
		node = converttoJson(&obj, "CreateInvitesResultsResponseArray_items_inner_invite", "");
	}
	else {
		
		CreateInvitesResultsResponseArray_items_inner_invite obj = static_cast<CreateInvitesResultsResponseArray_items_inner_invite> (getInvite());
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
CreateInvitesResultsResponseArray_items_inner::getException()
{
	return exception;
}

void
CreateInvitesResultsResponseArray_items_inner::setException(InviteExceptionResponse  exception)
{
	this->exception = exception;
}

CreateInvitesResultsResponseArray_items_inner_invite
CreateInvitesResultsResponseArray_items_inner::getInvite()
{
	return invite;
}

void
CreateInvitesResultsResponseArray_items_inner::setInvite(CreateInvitesResultsResponseArray_items_inner_invite  invite)
{
	this->invite = invite;
}


