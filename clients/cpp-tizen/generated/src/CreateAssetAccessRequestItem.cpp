#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateAssetAccessRequestItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateAssetAccessRequestItem::CreateAssetAccessRequestItem()
{
	//__init();
}

CreateAssetAccessRequestItem::~CreateAssetAccessRequestItem()
{
	//__cleanup();
}

void
CreateAssetAccessRequestItem::__init()
{
	//new std::map()std::map> asset_id_to_permissions;
	//partner_id = std::string();
}

void
CreateAssetAccessRequestItem::__cleanup()
{
	//if(asset_id_to_permissions != NULL) {
	//asset_id_to_permissions.RemoveAll(true);
	//delete asset_id_to_permissions;
	//asset_id_to_permissions = NULL;
	//}
	//if(partner_id != NULL) {
	//
	//delete partner_id;
	//partner_id = NULL;
	//}
	//
}

void
CreateAssetAccessRequestItem::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *partner_idKey = "partner_id";
	node = json_object_get_member(pJsonObject, partner_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&partner_id, node, "std::string", "");
		} else {
			
		}
	}
}

CreateAssetAccessRequestItem::CreateAssetAccessRequestItem(char* json)
{
	this->fromJson(json);
}

char*
CreateAssetAccessRequestItem::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;


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
	if (isprimitive("std::string")) {
		std::string obj = getPartnerId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *partner_idKey = "partner_id";
	json_object_set_member(pJsonObject, partner_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::map<string, string>
CreateAssetAccessRequestItem::getAssetIdToPermissions()
{
	return asset_id_to_permissions;
}

void
CreateAssetAccessRequestItem::setAssetIdToPermissions(std::map <string, string> asset_id_to_permissions)
{
	this->asset_id_to_permissions = asset_id_to_permissions;
}

std::string
CreateAssetAccessRequestItem::getPartnerId()
{
	return partner_id;
}

void
CreateAssetAccessRequestItem::setPartnerId(std::string  partner_id)
{
	this->partner_id = partner_id;
}


