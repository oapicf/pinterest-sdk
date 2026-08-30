#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AssetGroupModificationReadOrUpdate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AssetGroupModificationReadOrUpdate::AssetGroupModificationReadOrUpdate()
{
	//__init();
}

AssetGroupModificationReadOrUpdate::~AssetGroupModificationReadOrUpdate()
{
	//__cleanup();
}

void
AssetGroupModificationReadOrUpdate::__init()
{
	//new std::list()std::list> asset_groups_to_update;
	//new std::list()std::list> exceptions;
	//new std::list()std::list> updated_asset_groups;
}

void
AssetGroupModificationReadOrUpdate::__cleanup()
{
	//if(asset_groups_to_update != NULL) {
	//asset_groups_to_update.RemoveAll(true);
	//delete asset_groups_to_update;
	//asset_groups_to_update = NULL;
	//}
	//if(exceptions != NULL) {
	//exceptions.RemoveAll(true);
	//delete exceptions;
	//exceptions = NULL;
	//}
	//if(updated_asset_groups != NULL) {
	//updated_asset_groups.RemoveAll(true);
	//delete updated_asset_groups;
	//updated_asset_groups = NULL;
	//}
	//
}

void
AssetGroupModificationReadOrUpdate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *asset_groups_to_updateKey = "asset_groups_to_update";
	node = json_object_get_member(pJsonObject, asset_groups_to_updateKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AssetGroupUpdateItemReadOrUpdateItem> new_list;
			AssetGroupUpdateItemReadOrUpdateItem inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AssetGroupUpdateItemReadOrUpdateItem")) {
					jsonToValue(&inst, temp_json, "AssetGroupUpdateItemReadOrUpdateItem", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			asset_groups_to_update = new_list;
		}
		
	}
	const gchar *exceptionsKey = "exceptions";
	node = json_object_get_member(pJsonObject, exceptionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AssetGroupUpdateError> new_list;
			AssetGroupUpdateError inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AssetGroupUpdateError")) {
					jsonToValue(&inst, temp_json, "AssetGroupUpdateError", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			exceptions = new_list;
		}
		
	}
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
}

AssetGroupModificationReadOrUpdate::AssetGroupModificationReadOrUpdate(char* json)
{
	this->fromJson(json);
}

char*
AssetGroupModificationReadOrUpdate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AssetGroupUpdateItemReadOrUpdateItem")) {
		list<AssetGroupUpdateItemReadOrUpdateItem> new_list = static_cast<list <AssetGroupUpdateItemReadOrUpdateItem> > (getAssetGroupsToUpdate());
		node = converttoJson(&new_list, "AssetGroupUpdateItemReadOrUpdateItem", "array");
	} else {
		node = json_node_alloc();
		list<AssetGroupUpdateItemReadOrUpdateItem> new_list = static_cast<list <AssetGroupUpdateItemReadOrUpdateItem> > (getAssetGroupsToUpdate());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AssetGroupUpdateItemReadOrUpdateItem>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AssetGroupUpdateItemReadOrUpdateItem obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *asset_groups_to_updateKey = "asset_groups_to_update";
	json_object_set_member(pJsonObject, asset_groups_to_updateKey, node);
	if (isprimitive("AssetGroupUpdateError")) {
		list<AssetGroupUpdateError> new_list = static_cast<list <AssetGroupUpdateError> > (getExceptions());
		node = converttoJson(&new_list, "AssetGroupUpdateError", "array");
	} else {
		node = json_node_alloc();
		list<AssetGroupUpdateError> new_list = static_cast<list <AssetGroupUpdateError> > (getExceptions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AssetGroupUpdateError>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AssetGroupUpdateError obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *exceptionsKey = "exceptions";
	json_object_set_member(pJsonObject, exceptionsKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<AssetGroupUpdateItemReadOrUpdateItem>
AssetGroupModificationReadOrUpdate::getAssetGroupsToUpdate()
{
	return asset_groups_to_update;
}

void
AssetGroupModificationReadOrUpdate::setAssetGroupsToUpdate(std::list <AssetGroupUpdateItemReadOrUpdateItem> asset_groups_to_update)
{
	this->asset_groups_to_update = asset_groups_to_update;
}

std::list<AssetGroupUpdateError>
AssetGroupModificationReadOrUpdate::getExceptions()
{
	return exceptions;
}

void
AssetGroupModificationReadOrUpdate::setExceptions(std::list <AssetGroupUpdateError> exceptions)
{
	this->exceptions = exceptions;
}

std::list<AssetGroupBinding>
AssetGroupModificationReadOrUpdate::getUpdatedAssetGroups()
{
	return updated_asset_groups;
}

void
AssetGroupModificationReadOrUpdate::setUpdatedAssetGroups(std::list <AssetGroupBinding> updated_asset_groups)
{
	this->updated_asset_groups = updated_asset_groups;
}


