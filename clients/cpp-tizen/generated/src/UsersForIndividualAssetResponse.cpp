#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UsersForIndividualAssetResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UsersForIndividualAssetResponse::UsersForIndividualAssetResponse()
{
	//__init();
}

UsersForIndividualAssetResponse::~UsersForIndividualAssetResponse()
{
	//__cleanup();
}

void
UsersForIndividualAssetResponse::__init()
{
	//asset_id = std::string();
	//member_id = std::string();
	//new std::list()std::list> permissions;
}

void
UsersForIndividualAssetResponse::__cleanup()
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
UsersForIndividualAssetResponse::fromJson(char* jsonStr)
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
			permissions = new_list;
		}
		
	}
}

UsersForIndividualAssetResponse::UsersForIndividualAssetResponse(char* json)
{
	this->fromJson(json);
}

char*
UsersForIndividualAssetResponse::toJson()
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
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getPermissions());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getPermissions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
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
UsersForIndividualAssetResponse::getAssetId()
{
	return asset_id;
}

void
UsersForIndividualAssetResponse::setAssetId(std::string  asset_id)
{
	this->asset_id = asset_id;
}

std::string
UsersForIndividualAssetResponse::getMemberId()
{
	return member_id;
}

void
UsersForIndividualAssetResponse::setMemberId(std::string  member_id)
{
	this->member_id = member_id;
}

std::list<std::string>
UsersForIndividualAssetResponse::getPermissions()
{
	return permissions;
}

void
UsersForIndividualAssetResponse::setPermissions(std::list <std::string> permissions)
{
	this->permissions = permissions;
}


