#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DeleteMemberAccessResult.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DeleteMemberAccessResult::DeleteMemberAccessResult()
{
	//__init();
}

DeleteMemberAccessResult::~DeleteMemberAccessResult()
{
	//__cleanup();
}

void
DeleteMemberAccessResult::__init()
{
	//asset_id = std::string();
	//member_id = std::string();
}

void
DeleteMemberAccessResult::__cleanup()
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
DeleteMemberAccessResult::fromJson(char* jsonStr)
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

DeleteMemberAccessResult::DeleteMemberAccessResult(char* json)
{
	this->fromJson(json);
}

char*
DeleteMemberAccessResult::toJson()
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
DeleteMemberAccessResult::getAssetId()
{
	return asset_id;
}

void
DeleteMemberAccessResult::setAssetId(std::string  asset_id)
{
	this->asset_id = asset_id;
}

std::string
DeleteMemberAccessResult::getMemberId()
{
	return member_id;
}

void
DeleteMemberAccessResult::setMemberId(std::string  member_id)
{
	this->member_id = member_id;
}


