#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdatePartnerAssetsResult.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdatePartnerAssetsResult::UpdatePartnerAssetsResult()
{
	//__init();
}

UpdatePartnerAssetsResult::~UpdatePartnerAssetsResult()
{
	//__cleanup();
}

void
UpdatePartnerAssetsResult::__init()
{
	//asset_id = std::string();
	//asset_type = std::string();
	//partner_id = std::string();
	//new std::list()std::list> permissions;
}

void
UpdatePartnerAssetsResult::__cleanup()
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
	//if(partner_id != NULL) {
	//
	//delete partner_id;
	//partner_id = NULL;
	//}
	//if(permissions != NULL) {
	//permissions.RemoveAll(true);
	//delete permissions;
	//permissions = NULL;
	//}
	//
}

void
UpdatePartnerAssetsResult::fromJson(char* jsonStr)
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
	const gchar *partner_idKey = "partner_id";
	node = json_object_get_member(pJsonObject, partner_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&partner_id, node, "std::string", "");
		} else {
			
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
}

UpdatePartnerAssetsResult::UpdatePartnerAssetsResult(char* json)
{
	this->fromJson(json);
}

char*
UpdatePartnerAssetsResult::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getPartnerId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *partner_idKey = "partner_id";
	json_object_set_member(pJsonObject, partner_idKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
UpdatePartnerAssetsResult::getAssetId()
{
	return asset_id;
}

void
UpdatePartnerAssetsResult::setAssetId(std::string  asset_id)
{
	this->asset_id = asset_id;
}

std::string
UpdatePartnerAssetsResult::getAssetType()
{
	return asset_type;
}

void
UpdatePartnerAssetsResult::setAssetType(std::string  asset_type)
{
	this->asset_type = asset_type;
}

std::string
UpdatePartnerAssetsResult::getPartnerId()
{
	return partner_id;
}

void
UpdatePartnerAssetsResult::setPartnerId(std::string  partner_id)
{
	this->partner_id = partner_id;
}

std::list<std::string>
UpdatePartnerAssetsResult::getPermissions()
{
	return permissions;
}

void
UpdatePartnerAssetsResult::setPermissions(std::list <std::string> permissions)
{
	this->permissions = permissions;
}


