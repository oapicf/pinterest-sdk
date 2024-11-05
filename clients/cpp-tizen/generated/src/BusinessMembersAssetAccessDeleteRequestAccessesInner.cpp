#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Business_members_asset_access_delete_request_accesses_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Business_members_asset_access_delete_request_accesses_inner::Business_members_asset_access_delete_request_accesses_inner()
{
	//__init();
}

Business_members_asset_access_delete_request_accesses_inner::~Business_members_asset_access_delete_request_accesses_inner()
{
	//__cleanup();
}

void
Business_members_asset_access_delete_request_accesses_inner::__init()
{
	//asset_id = std::string();
	//member_id = std::string();
}

void
Business_members_asset_access_delete_request_accesses_inner::__cleanup()
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
	//
}

void
Business_members_asset_access_delete_request_accesses_inner::fromJson(char* jsonStr)
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
}

Business_members_asset_access_delete_request_accesses_inner::Business_members_asset_access_delete_request_accesses_inner(char* json)
{
	this->fromJson(json);
}

char*
Business_members_asset_access_delete_request_accesses_inner::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Business_members_asset_access_delete_request_accesses_inner::getAssetId()
{
	return asset_id;
}

void
Business_members_asset_access_delete_request_accesses_inner::setAssetId(std::string  asset_id)
{
	this->asset_id = asset_id;
}

std::string
Business_members_asset_access_delete_request_accesses_inner::getMemberId()
{
	return member_id;
}

void
Business_members_asset_access_delete_request_accesses_inner::setMemberId(std::string  member_id)
{
	this->member_id = member_id;
}


