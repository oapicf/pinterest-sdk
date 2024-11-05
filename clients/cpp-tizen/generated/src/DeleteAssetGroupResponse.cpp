#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DeleteAssetGroupResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DeleteAssetGroupResponse::DeleteAssetGroupResponse()
{
	//__init();
}

DeleteAssetGroupResponse::~DeleteAssetGroupResponse()
{
	//__cleanup();
}

void
DeleteAssetGroupResponse::__init()
{
	//new std::list()std::list> deleted_asset_groups;
	//new std::list()std::list> exceptions;
}

void
DeleteAssetGroupResponse::__cleanup()
{
	//if(deleted_asset_groups != NULL) {
	//deleted_asset_groups.RemoveAll(true);
	//delete deleted_asset_groups;
	//deleted_asset_groups = NULL;
	//}
	//if(exceptions != NULL) {
	//exceptions.RemoveAll(true);
	//delete exceptions;
	//exceptions = NULL;
	//}
	//
}

void
DeleteAssetGroupResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *deleted_asset_groupsKey = "deleted_asset_groups";
	node = json_object_get_member(pJsonObject, deleted_asset_groupsKey);
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
			deleted_asset_groups = new_list;
		}
		
	}
	const gchar *exceptionsKey = "exceptions";
	node = json_object_get_member(pJsonObject, exceptionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<DeleteAssetGroupResponse_exceptions_inner> new_list;
			DeleteAssetGroupResponse_exceptions_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("DeleteAssetGroupResponse_exceptions_inner")) {
					jsonToValue(&inst, temp_json, "DeleteAssetGroupResponse_exceptions_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			exceptions = new_list;
		}
		
	}
}

DeleteAssetGroupResponse::DeleteAssetGroupResponse(char* json)
{
	this->fromJson(json);
}

char*
DeleteAssetGroupResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getDeletedAssetGroups());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getDeletedAssetGroups());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *deleted_asset_groupsKey = "deleted_asset_groups";
	json_object_set_member(pJsonObject, deleted_asset_groupsKey, node);
	if (isprimitive("DeleteAssetGroupResponse_exceptions_inner")) {
		list<DeleteAssetGroupResponse_exceptions_inner> new_list = static_cast<list <DeleteAssetGroupResponse_exceptions_inner> > (getExceptions());
		node = converttoJson(&new_list, "DeleteAssetGroupResponse_exceptions_inner", "array");
	} else {
		node = json_node_alloc();
		list<DeleteAssetGroupResponse_exceptions_inner> new_list = static_cast<list <DeleteAssetGroupResponse_exceptions_inner> > (getExceptions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<DeleteAssetGroupResponse_exceptions_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			DeleteAssetGroupResponse_exceptions_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *exceptionsKey = "exceptions";
	json_object_set_member(pJsonObject, exceptionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
DeleteAssetGroupResponse::getDeletedAssetGroups()
{
	return deleted_asset_groups;
}

void
DeleteAssetGroupResponse::setDeletedAssetGroups(std::list <std::string> deleted_asset_groups)
{
	this->deleted_asset_groups = deleted_asset_groups;
}

std::list<DeleteAssetGroupResponse_exceptions_inner>
DeleteAssetGroupResponse::getExceptions()
{
	return exceptions;
}

void
DeleteAssetGroupResponse::setExceptions(std::list <DeleteAssetGroupResponse_exceptions_inner> exceptions)
{
	this->exceptions = exceptions;
}


