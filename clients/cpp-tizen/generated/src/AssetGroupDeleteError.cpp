#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AssetGroupDeleteError.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AssetGroupDeleteError::AssetGroupDeleteError()
{
	//__init();
}

AssetGroupDeleteError::~AssetGroupDeleteError()
{
	//__cleanup();
}

void
AssetGroupDeleteError::__init()
{
	//asset_group_id = std::string();
	//code = int(0);
	//message = std::string();
}

void
AssetGroupDeleteError::__cleanup()
{
	//if(asset_group_id != NULL) {
	//
	//delete asset_group_id;
	//asset_group_id = NULL;
	//}
	//if(code != NULL) {
	//
	//delete code;
	//code = NULL;
	//}
	//if(message != NULL) {
	//
	//delete message;
	//message = NULL;
	//}
	//
}

void
AssetGroupDeleteError::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *asset_group_idKey = "asset_group_id";
	node = json_object_get_member(pJsonObject, asset_group_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&asset_group_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *codeKey = "code";
	node = json_object_get_member(pJsonObject, codeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&code, node, "int", "");
		} else {
			
		}
	}
	const gchar *messageKey = "message";
	node = json_object_get_member(pJsonObject, messageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&message, node, "std::string", "");
		} else {
			
		}
	}
}

AssetGroupDeleteError::AssetGroupDeleteError(char* json)
{
	this->fromJson(json);
}

char*
AssetGroupDeleteError::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAssetGroupId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *asset_group_idKey = "asset_group_id";
	json_object_set_member(pJsonObject, asset_group_idKey, node);
	if (isprimitive("int")) {
		int obj = getCode();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *codeKey = "code";
	json_object_set_member(pJsonObject, codeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMessage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *messageKey = "message";
	json_object_set_member(pJsonObject, messageKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AssetGroupDeleteError::getAssetGroupId()
{
	return asset_group_id;
}

void
AssetGroupDeleteError::setAssetGroupId(std::string  asset_group_id)
{
	this->asset_group_id = asset_group_id;
}

int
AssetGroupDeleteError::getCode()
{
	return code;
}

void
AssetGroupDeleteError::setCode(int  code)
{
	this->code = code;
}

std::string
AssetGroupDeleteError::getMessage()
{
	return message;
}

void
AssetGroupDeleteError::setMessage(std::string  message)
{
	this->message = message;
}


