#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AuthRespondInvitesBody_invites_inner_action.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AuthRespondInvitesBody_invites_inner_action::AuthRespondInvitesBody_invites_inner_action()
{
	//__init();
}

AuthRespondInvitesBody_invites_inner_action::~AuthRespondInvitesBody_invites_inner_action()
{
	//__cleanup();
}

void
AuthRespondInvitesBody_invites_inner_action::__init()
{
	//accept_invite = bool(false);
	//new std::map()std::map> asset_id_to_permissions;
}

void
AuthRespondInvitesBody_invites_inner_action::__cleanup()
{
	//if(accept_invite != NULL) {
	//
	//delete accept_invite;
	//accept_invite = NULL;
	//}
	//if(asset_id_to_permissions != NULL) {
	//asset_id_to_permissions.RemoveAll(true);
	//delete asset_id_to_permissions;
	//asset_id_to_permissions = NULL;
	//}
	//
}

void
AuthRespondInvitesBody_invites_inner_action::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *accept_inviteKey = "accept_invite";
	node = json_object_get_member(pJsonObject, accept_inviteKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&accept_invite, node, "bool", "");
		} else {
			
		}
	}
	const gchar *asset_id_to_permissionsKey = "asset_id_to_permissions";
	node = json_object_get_member(pJsonObject, asset_id_to_permissionsKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			asset_id_to_permissions = new_map;
		}
		
	}
}

AuthRespondInvitesBody_invites_inner_action::AuthRespondInvitesBody_invites_inner_action(char* json)
{
	this->fromJson(json);
}

char*
AuthRespondInvitesBody_invites_inner_action::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getAcceptInvite();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *accept_inviteKey = "accept_invite";
	json_object_set_member(pJsonObject, accept_inviteKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getAssetIdToPermissions());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *asset_id_to_permissionsKey = "asset_id_to_permissions";
	json_object_set_member(pJsonObject, asset_id_to_permissionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
AuthRespondInvitesBody_invites_inner_action::getAcceptInvite()
{
	return accept_invite;
}

void
AuthRespondInvitesBody_invites_inner_action::setAcceptInvite(bool  accept_invite)
{
	this->accept_invite = accept_invite;
}

std::map<string, string>
AuthRespondInvitesBody_invites_inner_action::getAssetIdToPermissions()
{
	return asset_id_to_permissions;
}

void
AuthRespondInvitesBody_invites_inner_action::setAssetIdToPermissions(std::map <string, string> asset_id_to_permissions)
{
	this->asset_id_to_permissions = asset_id_to_permissions;
}


