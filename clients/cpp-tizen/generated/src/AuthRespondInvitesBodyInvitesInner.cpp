#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AuthRespondInvitesBody_invites_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AuthRespondInvitesBody_invites_inner::AuthRespondInvitesBody_invites_inner()
{
	//__init();
}

AuthRespondInvitesBody_invites_inner::~AuthRespondInvitesBody_invites_inner()
{
	//__cleanup();
}

void
AuthRespondInvitesBody_invites_inner::__init()
{
	//action = new AuthRespondInvitesBody_invites_inner_action();
	//invite_id = std::string();
}

void
AuthRespondInvitesBody_invites_inner::__cleanup()
{
	//if(action != NULL) {
	//
	//delete action;
	//action = NULL;
	//}
	//if(invite_id != NULL) {
	//
	//delete invite_id;
	//invite_id = NULL;
	//}
	//
}

void
AuthRespondInvitesBody_invites_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *actionKey = "action";
	node = json_object_get_member(pJsonObject, actionKey);
	if (node !=NULL) {
	

		if (isprimitive("AuthRespondInvitesBody_invites_inner_action")) {
			jsonToValue(&action, node, "AuthRespondInvitesBody_invites_inner_action", "AuthRespondInvitesBody_invites_inner_action");
		} else {
			
			AuthRespondInvitesBody_invites_inner_action* obj = static_cast<AuthRespondInvitesBody_invites_inner_action*> (&action);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *invite_idKey = "invite_id";
	node = json_object_get_member(pJsonObject, invite_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&invite_id, node, "std::string", "");
		} else {
			
		}
	}
}

AuthRespondInvitesBody_invites_inner::AuthRespondInvitesBody_invites_inner(char* json)
{
	this->fromJson(json);
}

char*
AuthRespondInvitesBody_invites_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AuthRespondInvitesBody_invites_inner_action")) {
		AuthRespondInvitesBody_invites_inner_action obj = getAction();
		node = converttoJson(&obj, "AuthRespondInvitesBody_invites_inner_action", "");
	}
	else {
		
		AuthRespondInvitesBody_invites_inner_action obj = static_cast<AuthRespondInvitesBody_invites_inner_action> (getAction());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *actionKey = "action";
	json_object_set_member(pJsonObject, actionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getInviteId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *invite_idKey = "invite_id";
	json_object_set_member(pJsonObject, invite_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

AuthRespondInvitesBody_invites_inner_action
AuthRespondInvitesBody_invites_inner::getAction()
{
	return action;
}

void
AuthRespondInvitesBody_invites_inner::setAction(AuthRespondInvitesBody_invites_inner_action  action)
{
	this->action = action;
}

std::string
AuthRespondInvitesBody_invites_inner::getInviteId()
{
	return invite_id;
}

void
AuthRespondInvitesBody_invites_inner::setInviteId(std::string  invite_id)
{
	this->invite_id = invite_id;
}


