#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateAssetGroupBody_asset_groups_to_update_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateAssetGroupBody_asset_groups_to_update_inner::UpdateAssetGroupBody_asset_groups_to_update_inner()
{
	//__init();
}

UpdateAssetGroupBody_asset_groups_to_update_inner::~UpdateAssetGroupBody_asset_groups_to_update_inner()
{
	//__cleanup();
}

void
UpdateAssetGroupBody_asset_groups_to_update_inner::__init()
{
	//asset_group_id = std::string();
	//name = std::string();
	//description = std::string();
	//new std::list()std::list> asset_group_types;
	//new std::list()std::list> assets_to_add;
	//new std::list()std::list> assets_to_remove;
}

void
UpdateAssetGroupBody_asset_groups_to_update_inner::__cleanup()
{
	//if(asset_group_id != NULL) {
	//
	//delete asset_group_id;
	//asset_group_id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(asset_group_types != NULL) {
	//asset_group_types.RemoveAll(true);
	//delete asset_group_types;
	//asset_group_types = NULL;
	//}
	//if(assets_to_add != NULL) {
	//assets_to_add.RemoveAll(true);
	//delete assets_to_add;
	//assets_to_add = NULL;
	//}
	//if(assets_to_remove != NULL) {
	//assets_to_remove.RemoveAll(true);
	//delete assets_to_remove;
	//assets_to_remove = NULL;
	//}
	//
}

void
UpdateAssetGroupBody_asset_groups_to_update_inner::fromJson(char* jsonStr)
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *asset_group_typesKey = "asset_group_types";
	node = json_object_get_member(pJsonObject, asset_group_typesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AssetGroupType> new_list;
			AssetGroupType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AssetGroupType")) {
					jsonToValue(&inst, temp_json, "AssetGroupType", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			asset_group_types = new_list;
		}
		
	}
	const gchar *assets_to_addKey = "assets_to_add";
	node = json_object_get_member(pJsonObject, assets_to_addKey);
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
			assets_to_add = new_list;
		}
		
	}
	const gchar *assets_to_removeKey = "assets_to_remove";
	node = json_object_get_member(pJsonObject, assets_to_removeKey);
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
			assets_to_remove = new_list;
		}
		
	}
}

UpdateAssetGroupBody_asset_groups_to_update_inner::UpdateAssetGroupBody_asset_groups_to_update_inner(char* json)
{
	this->fromJson(json);
}

char*
UpdateAssetGroupBody_asset_groups_to_update_inner::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("AssetGroupType")) {
		list<AssetGroupType> new_list = static_cast<list <AssetGroupType> > (getAssetGroupTypes());
		node = converttoJson(&new_list, "AssetGroupType", "array");
	} else {
		node = json_node_alloc();
		list<AssetGroupType> new_list = static_cast<list <AssetGroupType> > (getAssetGroupTypes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AssetGroupType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AssetGroupType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *asset_group_typesKey = "asset_group_types";
	json_object_set_member(pJsonObject, asset_group_typesKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getAssetsToAdd());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getAssetsToAdd());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *assets_to_addKey = "assets_to_add";
	json_object_set_member(pJsonObject, assets_to_addKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getAssetsToRemove());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getAssetsToRemove());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *assets_to_removeKey = "assets_to_remove";
	json_object_set_member(pJsonObject, assets_to_removeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
UpdateAssetGroupBody_asset_groups_to_update_inner::getAssetGroupId()
{
	return asset_group_id;
}

void
UpdateAssetGroupBody_asset_groups_to_update_inner::setAssetGroupId(std::string  asset_group_id)
{
	this->asset_group_id = asset_group_id;
}

std::string
UpdateAssetGroupBody_asset_groups_to_update_inner::getName()
{
	return name;
}

void
UpdateAssetGroupBody_asset_groups_to_update_inner::setName(std::string  name)
{
	this->name = name;
}

std::string
UpdateAssetGroupBody_asset_groups_to_update_inner::getDescription()
{
	return description;
}

void
UpdateAssetGroupBody_asset_groups_to_update_inner::setDescription(std::string  description)
{
	this->description = description;
}

std::list<AssetGroupType>
UpdateAssetGroupBody_asset_groups_to_update_inner::getAssetGroupTypes()
{
	return asset_group_types;
}

void
UpdateAssetGroupBody_asset_groups_to_update_inner::setAssetGroupTypes(std::list <AssetGroupType> asset_group_types)
{
	this->asset_group_types = asset_group_types;
}

std::list<std::string>
UpdateAssetGroupBody_asset_groups_to_update_inner::getAssetsToAdd()
{
	return assets_to_add;
}

void
UpdateAssetGroupBody_asset_groups_to_update_inner::setAssetsToAdd(std::list <std::string> assets_to_add)
{
	this->assets_to_add = assets_to_add;
}

std::list<std::string>
UpdateAssetGroupBody_asset_groups_to_update_inner::getAssetsToRemove()
{
	return assets_to_remove;
}

void
UpdateAssetGroupBody_asset_groups_to_update_inner::setAssetsToRemove(std::list <std::string> assets_to_remove)
{
	this->assets_to_remove = assets_to_remove;
}


