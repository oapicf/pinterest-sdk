#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AuthRespondInvitesBodyItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AuthRespondInvitesBodyItem::AuthRespondInvitesBodyItem()
{
	//__init();
}

AuthRespondInvitesBodyItem::~AuthRespondInvitesBodyItem()
{
	//__cleanup();
}

void
AuthRespondInvitesBodyItem::__init()
{
	//action = new AuthRespondInviteAction();
	//invite_id = std::string();
}

void
AuthRespondInvitesBodyItem::__cleanup()
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
AuthRespondInvitesBodyItem::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *actionKey = "action";
	node = json_object_get_member(pJsonObject, actionKey);
	if (node !=NULL) {
	

		if (isprimitive("AuthRespondInviteAction")) {
			jsonToValue(&action, node, "AuthRespondInviteAction", "AuthRespondInviteAction");
		} else {
			
			AuthRespondInviteAction* obj = static_cast<AuthRespondInviteAction*> (&action);
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

AuthRespondInvitesBodyItem::AuthRespondInvitesBodyItem(char* json)
{
	this->fromJson(json);
}

char*
AuthRespondInvitesBodyItem::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AuthRespondInviteAction")) {
		AuthRespondInviteAction obj = getAction();
		node = converttoJson(&obj, "AuthRespondInviteAction", "");
	}
	else {
		
		AuthRespondInviteAction obj = static_cast<AuthRespondInviteAction> (getAction());
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

AuthRespondInviteAction
AuthRespondInvitesBodyItem::getAction()
{
	return action;
}

void
AuthRespondInvitesBodyItem::setAction(AuthRespondInviteAction  action)
{
	this->action = action;
}

std::string
AuthRespondInvitesBodyItem::getInviteId()
{
	return invite_id;
}

void
AuthRespondInvitesBodyItem::setInviteId(std::string  invite_id)
{
	this->invite_id = invite_id;
}


