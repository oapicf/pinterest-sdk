#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateAssetInvitesRequestItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateAssetInvitesRequestItem::CreateAssetInvitesRequestItem()
{
	//__init();
}

CreateAssetInvitesRequestItem::~CreateAssetInvitesRequestItem()
{
	//__cleanup();
}

void
CreateAssetInvitesRequestItem::__init()
{
	//invite_id = std::string();
	//invite_type = new InviteType();
	//new std::map()std::map> asset_id_to_permissions;
}

void
CreateAssetInvitesRequestItem::__cleanup()
{
	//if(invite_id != NULL) {
	//
	//delete invite_id;
	//invite_id = NULL;
	//}
	//if(invite_type != NULL) {
	//
	//delete invite_type;
	//invite_type = NULL;
	//}
	//if(asset_id_to_permissions != NULL) {
	//asset_id_to_permissions.RemoveAll(true);
	//delete asset_id_to_permissions;
	//asset_id_to_permissions = NULL;
	//}
	//
}

void
CreateAssetInvitesRequestItem::fromJson(char* jsonStr)
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
	const gchar *invite_typeKey = "invite_type";
	node = json_object_get_member(pJsonObject, invite_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("InviteType")) {
			jsonToValue(&invite_type, node, "InviteType", "InviteType");
		} else {
			
			InviteType* obj = static_cast<InviteType*> (&invite_type);
			obj->fromJson(json_to_string(node, false));
			
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

CreateAssetInvitesRequestItem::CreateAssetInvitesRequestItem(char* json)
{
	this->fromJson(json);
}

char*
CreateAssetInvitesRequestItem::toJson()
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
	if (isprimitive("InviteType")) {
		InviteType obj = getInviteType();
		node = converttoJson(&obj, "InviteType", "");
	}
	else {
		
		InviteType obj = static_cast<InviteType> (getInviteType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *invite_typeKey = "invite_type";
	json_object_set_member(pJsonObject, invite_typeKey, node);


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

std::string
CreateAssetInvitesRequestItem::getInviteId()
{
	return invite_id;
}

void
CreateAssetInvitesRequestItem::setInviteId(std::string  invite_id)
{
	this->invite_id = invite_id;
}

InviteType
CreateAssetInvitesRequestItem::getInviteType()
{
	return invite_type;
}

void
CreateAssetInvitesRequestItem::setInviteType(InviteType  invite_type)
{
	this->invite_type = invite_type;
}

std::map<string, string>
CreateAssetInvitesRequestItem::getAssetIdToPermissions()
{
	return asset_id_to_permissions;
}

void
CreateAssetInvitesRequestItem::setAssetIdToPermissions(std::map <string, string> asset_id_to_permissions)
{
	this->asset_id_to_permissions = asset_id_to_permissions;
}


