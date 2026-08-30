#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CancelInviteResultItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CancelInviteResultItem::CancelInviteResultItem()
{
	//__init();
}

CancelInviteResultItem::~CancelInviteResultItem()
{
	//__cleanup();
}

void
CancelInviteResultItem::__init()
{
	//exception = new CancelInviteException();
	//invite = new CancelInviteResult();
}

void
CancelInviteResultItem::__cleanup()
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
CancelInviteResultItem::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *exceptionKey = "exception";
	node = json_object_get_member(pJsonObject, exceptionKey);
	if (node !=NULL) {
	

		if (isprimitive("CancelInviteException")) {
			jsonToValue(&exception, node, "CancelInviteException", "CancelInviteException");
		} else {
			
			CancelInviteException* obj = static_cast<CancelInviteException*> (&exception);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *inviteKey = "invite";
	node = json_object_get_member(pJsonObject, inviteKey);
	if (node !=NULL) {
	

		if (isprimitive("CancelInviteResult")) {
			jsonToValue(&invite, node, "CancelInviteResult", "CancelInviteResult");
		} else {
			
			CancelInviteResult* obj = static_cast<CancelInviteResult*> (&invite);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CancelInviteResultItem::CancelInviteResultItem(char* json)
{
	this->fromJson(json);
}

char*
CancelInviteResultItem::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CancelInviteException")) {
		CancelInviteException obj = getException();
		node = converttoJson(&obj, "CancelInviteException", "");
	}
	else {
		
		CancelInviteException obj = static_cast<CancelInviteException> (getException());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *exceptionKey = "exception";
	json_object_set_member(pJsonObject, exceptionKey, node);
	if (isprimitive("CancelInviteResult")) {
		CancelInviteResult obj = getInvite();
		node = converttoJson(&obj, "CancelInviteResult", "");
	}
	else {
		
		CancelInviteResult obj = static_cast<CancelInviteResult> (getInvite());
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

CancelInviteException
CancelInviteResultItem::getException()
{
	return exception;
}

void
CancelInviteResultItem::setException(CancelInviteException  exception)
{
	this->exception = exception;
}

CancelInviteResult
CancelInviteResultItem::getInvite()
{
	return invite;
}

void
CancelInviteResultItem::setInvite(CancelInviteResult  invite)
{
	this->invite = invite;
}


