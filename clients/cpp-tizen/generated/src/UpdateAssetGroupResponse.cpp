#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateAssetGroupResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateAssetGroupResponse::UpdateAssetGroupResponse()
{
	//__init();
}

UpdateAssetGroupResponse::~UpdateAssetGroupResponse()
{
	//__cleanup();
}

void
UpdateAssetGroupResponse::__init()
{
	//new std::list()std::list> updated_asset_groups;
	//new std::list()std::list> exceptions;
}

void
UpdateAssetGroupResponse::__cleanup()
{
	//if(updated_asset_groups != NULL) {
	//updated_asset_groups.RemoveAll(true);
	//delete updated_asset_groups;
	//updated_asset_groups = NULL;
	//}
	//if(exceptions != NULL) {
	//exceptions.RemoveAll(true);
	//delete exceptions;
	//exceptions = NULL;
	//}
	//
}

void
UpdateAssetGroupResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *updated_asset_groupsKey = "updated_asset_groups";
	node = json_object_get_member(pJsonObject, updated_asset_groupsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AssetGroupBinding> new_list;
			AssetGroupBinding inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AssetGroupBinding")) {
					jsonToValue(&inst, temp_json, "AssetGroupBinding", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			updated_asset_groups = new_list;
		}
		
	}
	const gchar *exceptionsKey = "exceptions";
	node = json_object_get_member(pJsonObject, exceptionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<UpdateAssetGroupResponse_exceptions_inner> new_list;
			UpdateAssetGroupResponse_exceptions_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("UpdateAssetGroupResponse_exceptions_inner")) {
					jsonToValue(&inst, temp_json, "UpdateAssetGroupResponse_exceptions_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			exceptions = new_list;
		}
		
	}
}

UpdateAssetGroupResponse::UpdateAssetGroupResponse(char* json)
{
	this->fromJson(json);
}

char*
UpdateAssetGroupResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AssetGroupBinding")) {
		list<AssetGroupBinding> new_list = static_cast<list <AssetGroupBinding> > (getUpdatedAssetGroups());
		node = converttoJson(&new_list, "AssetGroupBinding", "array");
	} else {
		node = json_node_alloc();
		list<AssetGroupBinding> new_list = static_cast<list <AssetGroupBinding> > (getUpdatedAssetGroups());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AssetGroupBinding>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AssetGroupBinding obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *updated_asset_groupsKey = "updated_asset_groups";
	json_object_set_member(pJsonObject, updated_asset_groupsKey, node);
	if (isprimitive("UpdateAssetGroupResponse_exceptions_inner")) {
		list<UpdateAssetGroupResponse_exceptions_inner> new_list = static_cast<list <UpdateAssetGroupResponse_exceptions_inner> > (getExceptions());
		node = converttoJson(&new_list, "UpdateAssetGroupResponse_exceptions_inner", "array");
	} else {
		node = json_node_alloc();
		list<UpdateAssetGroupResponse_exceptions_inner> new_list = static_cast<list <UpdateAssetGroupResponse_exceptions_inner> > (getExceptions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<UpdateAssetGroupResponse_exceptions_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			UpdateAssetGroupResponse_exceptions_inner obj = *it;
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

std::list<AssetGroupBinding>
UpdateAssetGroupResponse::getUpdatedAssetGroups()
{
	return updated_asset_groups;
}

void
UpdateAssetGroupResponse::setUpdatedAssetGroups(std::list <AssetGroupBinding> updated_asset_groups)
{
	this->updated_asset_groups = updated_asset_groups;
}

std::list<UpdateAssetGroupResponse_exceptions_inner>
UpdateAssetGroupResponse::getExceptions()
{
	return exceptions;
}

void
UpdateAssetGroupResponse::setExceptions(std::list <UpdateAssetGroupResponse_exceptions_inner> exceptions)
{
	this->exceptions = exceptions;
}


