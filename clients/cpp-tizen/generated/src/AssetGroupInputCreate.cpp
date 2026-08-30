#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AssetGroupInputCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AssetGroupInputCreate::AssetGroupInputCreate()
{
	//__init();
}

AssetGroupInputCreate::~AssetGroupInputCreate()
{
	//__cleanup();
}

void
AssetGroupInputCreate::__init()
{
	//asset_group = new AssetGroupBinding();
	//asset_group_description = std::string();
	//asset_group_name = std::string();
	//new std::list()std::list> asset_group_types;
}

void
AssetGroupInputCreate::__cleanup()
{
	//if(asset_group != NULL) {
	//
	//delete asset_group;
	//asset_group = NULL;
	//}
	//if(asset_group_description != NULL) {
	//
	//delete asset_group_description;
	//asset_group_description = NULL;
	//}
	//if(asset_group_name != NULL) {
	//
	//delete asset_group_name;
	//asset_group_name = NULL;
	//}
	//if(asset_group_types != NULL) {
	//asset_group_types.RemoveAll(true);
	//delete asset_group_types;
	//asset_group_types = NULL;
	//}
	//
}

void
AssetGroupInputCreate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *asset_groupKey = "asset_group";
	node = json_object_get_member(pJsonObject, asset_groupKey);
	if (node !=NULL) {
	

		if (isprimitive("AssetGroupBinding")) {
			jsonToValue(&asset_group, node, "AssetGroupBinding", "AssetGroupBinding");
		} else {
			
			AssetGroupBinding* obj = static_cast<AssetGroupBinding*> (&asset_group);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *asset_group_descriptionKey = "asset_group_description";
	node = json_object_get_member(pJsonObject, asset_group_descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&asset_group_description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *asset_group_nameKey = "asset_group_name";
	node = json_object_get_member(pJsonObject, asset_group_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&asset_group_name, node, "std::string", "");
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
}

AssetGroupInputCreate::AssetGroupInputCreate(char* json)
{
	this->fromJson(json);
}

char*
AssetGroupInputCreate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AssetGroupBinding")) {
		AssetGroupBinding obj = getAssetGroup();
		node = converttoJson(&obj, "AssetGroupBinding", "");
	}
	else {
		
		AssetGroupBinding obj = static_cast<AssetGroupBinding> (getAssetGroup());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *asset_groupKey = "asset_group";
	json_object_set_member(pJsonObject, asset_groupKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAssetGroupDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *asset_group_descriptionKey = "asset_group_description";
	json_object_set_member(pJsonObject, asset_group_descriptionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAssetGroupName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *asset_group_nameKey = "asset_group_name";
	json_object_set_member(pJsonObject, asset_group_nameKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

AssetGroupBinding
AssetGroupInputCreate::getAssetGroup()
{
	return asset_group;
}

void
AssetGroupInputCreate::setAssetGroup(AssetGroupBinding  asset_group)
{
	this->asset_group = asset_group;
}

std::string
AssetGroupInputCreate::getAssetGroupDescription()
{
	return asset_group_description;
}

void
AssetGroupInputCreate::setAssetGroupDescription(std::string  asset_group_description)
{
	this->asset_group_description = asset_group_description;
}

std::string
AssetGroupInputCreate::getAssetGroupName()
{
	return asset_group_name;
}

void
AssetGroupInputCreate::setAssetGroupName(std::string  asset_group_name)
{
	this->asset_group_name = asset_group_name;
}

std::list<AssetGroupType>
AssetGroupInputCreate::getAssetGroupTypes()
{
	return asset_group_types;
}

void
AssetGroupInputCreate::setAssetGroupTypes(std::list <AssetGroupType> asset_group_types)
{
	this->asset_group_types = asset_group_types;
}


