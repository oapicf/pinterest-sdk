#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetBusinessAssetsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetBusinessAssetsResponse::GetBusinessAssetsResponse()
{
	//__init();
}

GetBusinessAssetsResponse::~GetBusinessAssetsResponse()
{
	//__cleanup();
}

void
GetBusinessAssetsResponse::__init()
{
	//asset_id = std::string();
	//asset_type = std::string();
	//asset_group_info = new AssetGroupBinding();
}

void
GetBusinessAssetsResponse::__cleanup()
{
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
	//if(asset_group_info != NULL) {
	//
	//delete asset_group_info;
	//asset_group_info = NULL;
	//}
	//
}

void
GetBusinessAssetsResponse::fromJson(char* jsonStr)
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
	const gchar *asset_typeKey = "asset_type";
	node = json_object_get_member(pJsonObject, asset_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&asset_type, node, "std::string", "");
		} else {
			
		}
	}
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
}

GetBusinessAssetsResponse::GetBusinessAssetsResponse(char* json)
{
	this->fromJson(json);
}

char*
GetBusinessAssetsResponse::toJson()
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
		std::string obj = getAssetType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *asset_typeKey = "asset_type";
	json_object_set_member(pJsonObject, asset_typeKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
GetBusinessAssetsResponse::getAssetId()
{
	return asset_id;
}

void
GetBusinessAssetsResponse::setAssetId(std::string  asset_id)
{
	this->asset_id = asset_id;
}

std::string
GetBusinessAssetsResponse::getAssetType()
{
	return asset_type;
}

void
GetBusinessAssetsResponse::setAssetType(std::string  asset_type)
{
	this->asset_type = asset_type;
}

AssetGroupBinding
GetBusinessAssetsResponse::getAssetGroupInfo()
{
	return asset_group_info;
}

void
GetBusinessAssetsResponse::setAssetGroupInfo(AssetGroupBinding  asset_group_info)
{
	this->asset_group_info = asset_group_info;
}


