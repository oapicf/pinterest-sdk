#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BusinessAssets.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BusinessAssets::BusinessAssets()
{
	//__init();
}

BusinessAssets::~BusinessAssets()
{
	//__cleanup();
}

void
BusinessAssets::__init()
{
	//asset_group_info = null;
	//asset_id = std::string();
	//asset_type = new AssetTypeResponse();
	//new std::list()std::list> permissions;
	//catalog_info = null;
}

void
BusinessAssets::__cleanup()
{
	//if(asset_group_info != NULL) {
	//
	//delete asset_group_info;
	//asset_group_info = NULL;
	//}
	//if(asset_id != NULL) {
	//
	//delete asset_id;
	//asset_id = NULL;
	//}
	//if(asset_type != NULL) {
	//
	//delete asset_type;
	//asset_type = NULL;
	//}
	//if(permissions != NULL) {
	//permissions.RemoveAll(true);
	//delete permissions;
	//permissions = NULL;
	//}
	//if(catalog_info != NULL) {
	//
	//delete catalog_info;
	//catalog_info = NULL;
	//}
	//
}

void
BusinessAssets::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *asset_group_infoKey = "asset_group_info";
	node = json_object_get_member(pJsonObject, asset_group_infoKey);
	if (node !=NULL) {
	

		if (isprimitive("AssetGroupBinding")) {
			jsonToValue(&asset_group_info, node, "AssetGroupBinding", "AssetGroupBinding");
		} else {
			
			AssetGroupBinding* obj = static_cast<AssetGroupBinding*> (&asset_group_info);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *asset_idKey = "asset_id";
	node = json_object_get_member(pJsonObject, asset_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&asset_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *asset_typeKey = "asset_type";
	node = json_object_get_member(pJsonObject, asset_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("AssetTypeResponse")) {
			jsonToValue(&asset_type, node, "AssetTypeResponse", "AssetTypeResponse");
		} else {
			
			AssetTypeResponse* obj = static_cast<AssetTypeResponse*> (&asset_type);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *catalog_infoKey = "catalog_info";
	node = json_object_get_member(pJsonObject, catalog_infoKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogBinding")) {
			jsonToValue(&catalog_info, node, "CatalogBinding", "CatalogBinding");
		} else {
			
			CatalogBinding* obj = static_cast<CatalogBinding*> (&catalog_info);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

BusinessAssets::BusinessAssets(char* json)
{
	this->fromJson(json);
}

char*
BusinessAssets::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AssetGroupBinding")) {
		AssetGroupBinding obj = getAssetGroupInfo();
		node = converttoJson(&obj, "AssetGroupBinding", "");
	}
	else {
		
		AssetGroupBinding obj = static_cast<AssetGroupBinding> (getAssetGroupInfo());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *asset_group_infoKey = "asset_group_info";
	json_object_set_member(pJsonObject, asset_group_infoKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAssetId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *asset_idKey = "asset_id";
	json_object_set_member(pJsonObject, asset_idKey, node);
	if (isprimitive("AssetTypeResponse")) {
		AssetTypeResponse obj = getAssetType();
		node = converttoJson(&obj, "AssetTypeResponse", "");
	}
	else {
		
		AssetTypeResponse obj = static_cast<AssetTypeResponse> (getAssetType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *asset_typeKey = "asset_type";
	json_object_set_member(pJsonObject, asset_typeKey, node);
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
	if (isprimitive("CatalogBinding")) {
		CatalogBinding obj = getCatalogInfo();
		node = converttoJson(&obj, "CatalogBinding", "");
	}
	else {
		
		CatalogBinding obj = static_cast<CatalogBinding> (getCatalogInfo());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *catalog_infoKey = "catalog_info";
	json_object_set_member(pJsonObject, catalog_infoKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

AssetGroupBinding
BusinessAssets::getAssetGroupInfo()
{
	return asset_group_info;
}

void
BusinessAssets::setAssetGroupInfo(AssetGroupBinding  asset_group_info)
{
	this->asset_group_info = asset_group_info;
}

std::string
BusinessAssets::getAssetId()
{
	return asset_id;
}

void
BusinessAssets::setAssetId(std::string  asset_id)
{
	this->asset_id = asset_id;
}

AssetTypeResponse
BusinessAssets::getAssetType()
{
	return asset_type;
}

void
BusinessAssets::setAssetType(AssetTypeResponse  asset_type)
{
	this->asset_type = asset_type;
}

std::list<std::string>
BusinessAssets::getPermissions()
{
	return permissions;
}

void
BusinessAssets::setPermissions(std::list <std::string> permissions)
{
	this->permissions = permissions;
}

CatalogBinding
BusinessAssets::getCatalogInfo()
{
	return catalog_info;
}

void
BusinessAssets::setCatalogInfo(CatalogBinding  catalog_info)
{
	this->catalog_info = catalog_info;
}


