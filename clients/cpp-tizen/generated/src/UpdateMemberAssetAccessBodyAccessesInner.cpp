#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateMemberAssetAccessBody_accesses_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateMemberAssetAccessBody_accesses_inner::UpdateMemberAssetAccessBody_accesses_inner()
{
	//__init();
}

UpdateMemberAssetAccessBody_accesses_inner::~UpdateMemberAssetAccessBody_accesses_inner()
{
	//__cleanup();
}

void
UpdateMemberAssetAccessBody_accesses_inner::__init()
{
	//asset_id = std::string();
	//member_id = std::string();
	//new std::list()std::list> permissions;
}

void
UpdateMemberAssetAccessBody_accesses_inner::__cleanup()
{
	//if(asset_id != NULL) {
	//
	//delete asset_id;
	//asset_id = NULL;
	//}
	//if(member_id != NULL) {
	//
	//delete member_id;
	//member_id = NULL;
	//}
	//if(permissions != NULL) {
	//permissions.RemoveAll(true);
	//delete permissions;
	//permissions = NULL;
	//}
	//
}

void
UpdateMemberAssetAccessBody_accesses_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *asset_idKey = "asset_id";
	node = json_object_get_member(pJsonObject, asset_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&asset_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *member_idKey = "member_id";
	node = json_object_get_member(pJsonObject, member_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&member_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *permissionsKey = "permissions";
	node = json_object_get_member(pJsonObject, permissionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Permissions> new_list;
			Permissions inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Permissions")) {
					jsonToValue(&inst, temp_json, "Permissions", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			permissions = new_list;
		}
		
	}
}

UpdateMemberAssetAccessBody_accesses_inner::UpdateMemberAssetAccessBody_accesses_inner(char* json)
{
	this->fromJson(json);
}

char*
UpdateMemberAssetAccessBody_accesses_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAssetId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *asset_idKey = "asset_id";
	json_object_set_member(pJsonObject, asset_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMemberId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *member_idKey = "member_id";
	json_object_set_member(pJsonObject, member_idKey, node);
	if (isprimitive("Permissions")) {
		list<Permissions> new_list = static_cast<list <Permissions> > (getPermissions());
		node = converttoJson(&new_list, "Permissions", "array");
	} else {
		node = json_node_alloc();
		list<Permissions> new_list = static_cast<list <Permissions> > (getPermissions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Permissions>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Permissions obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *permissionsKey = "permissions";
	json_object_set_member(pJsonObject, permissionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
UpdateMemberAssetAccessBody_accesses_inner::getAssetId()
{
	return asset_id;
}

void
UpdateMemberAssetAccessBody_accesses_inner::setAssetId(std::string  asset_id)
{
	this->asset_id = asset_id;
}

std::string
UpdateMemberAssetAccessBody_accesses_inner::getMemberId()
{
	return member_id;
}

void
UpdateMemberAssetAccessBody_accesses_inner::setMemberId(std::string  member_id)
{
	this->member_id = member_id;
}

std::list<Permissions>
UpdateMemberAssetAccessBody_accesses_inner::getPermissions()
{
	return permissions;
}

void
UpdateMemberAssetAccessBody_accesses_inner::setPermissions(std::list <Permissions> permissions)
{
	this->permissions = permissions;
}


