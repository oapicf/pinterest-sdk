#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateAssetGroupResponse_exceptions_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateAssetGroupResponse_exceptions_inner::UpdateAssetGroupResponse_exceptions_inner()
{
	//__init();
}

UpdateAssetGroupResponse_exceptions_inner::~UpdateAssetGroupResponse_exceptions_inner()
{
	//__cleanup();
}

void
UpdateAssetGroupResponse_exceptions_inner::__init()
{
	//code = int(0);
	//message = std::string();
	//asset_group_id = std::string();
}

void
UpdateAssetGroupResponse_exceptions_inner::__cleanup()
{
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
	//if(asset_group_id != NULL) {
	//
	//delete asset_group_id;
	//asset_group_id = NULL;
	//}
	//
}

void
UpdateAssetGroupResponse_exceptions_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *asset_group_idKey = "asset_group_id";
	node = json_object_get_member(pJsonObject, asset_group_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&asset_group_id, node, "std::string", "");
		} else {
			
		}
	}
}

UpdateAssetGroupResponse_exceptions_inner::UpdateAssetGroupResponse_exceptions_inner(char* json)
{
	this->fromJson(json);
}

char*
UpdateAssetGroupResponse_exceptions_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("std::string")) {
		std::string obj = getAssetGroupId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *asset_group_idKey = "asset_group_id";
	json_object_set_member(pJsonObject, asset_group_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
UpdateAssetGroupResponse_exceptions_inner::getCode()
{
	return code;
}

void
UpdateAssetGroupResponse_exceptions_inner::setCode(int  code)
{
	this->code = code;
}

std::string
UpdateAssetGroupResponse_exceptions_inner::getMessage()
{
	return message;
}

void
UpdateAssetGroupResponse_exceptions_inner::setMessage(std::string  message)
{
	this->message = message;
}

std::string
UpdateAssetGroupResponse_exceptions_inner::getAssetGroupId()
{
	return asset_group_id;
}

void
UpdateAssetGroupResponse_exceptions_inner::setAssetGroupId(std::string  asset_group_id)
{
	this->asset_group_id = asset_group_id;
}


