#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DeletePartnerAssetAccessResult.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DeletePartnerAssetAccessResult::DeletePartnerAssetAccessResult()
{
	//__init();
}

DeletePartnerAssetAccessResult::~DeletePartnerAssetAccessResult()
{
	//__cleanup();
}

void
DeletePartnerAssetAccessResult::__init()
{
	//asset_id = std::string();
	//asset_type = std::string();
	//is_shared_partner = bool(false);
	//partner_id = std::string();
	//new std::list()std::list> permissions;
}

void
DeletePartnerAssetAccessResult::__cleanup()
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
	//if(is_shared_partner != NULL) {
	//
	//delete is_shared_partner;
	//is_shared_partner = NULL;
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
DeletePartnerAssetAccessResult::fromJson(char* jsonStr)
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
	const gchar *is_shared_partnerKey = "is_shared_partner";
	node = json_object_get_member(pJsonObject, is_shared_partnerKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_shared_partner, node, "bool", "");
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

DeletePartnerAssetAccessResult::DeletePartnerAssetAccessResult(char* json)
{
	this->fromJson(json);
}

char*
DeletePartnerAssetAccessResult::toJson()
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
	if (isprimitive("bool")) {
		bool obj = getIsSharedPartner();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_shared_partnerKey = "is_shared_partner";
	json_object_set_member(pJsonObject, is_shared_partnerKey, node);
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
DeletePartnerAssetAccessResult::getAssetId()
{
	return asset_id;
}

void
DeletePartnerAssetAccessResult::setAssetId(std::string  asset_id)
{
	this->asset_id = asset_id;
}

std::string
DeletePartnerAssetAccessResult::getAssetType()
{
	return asset_type;
}

void
DeletePartnerAssetAccessResult::setAssetType(std::string  asset_type)
{
	this->asset_type = asset_type;
}

bool
DeletePartnerAssetAccessResult::getIsSharedPartner()
{
	return is_shared_partner;
}

void
DeletePartnerAssetAccessResult::setIsSharedPartner(bool  is_shared_partner)
{
	this->is_shared_partner = is_shared_partner;
}

std::string
DeletePartnerAssetAccessResult::getPartnerId()
{
	return partner_id;
}

void
DeletePartnerAssetAccessResult::setPartnerId(std::string  partner_id)
{
	this->partner_id = partner_id;
}

std::list<std::string>
DeletePartnerAssetAccessResult::getPermissions()
{
	return permissions;
}

void
DeletePartnerAssetAccessResult::setPermissions(std::list <std::string> permissions)
{
	this->permissions = permissions;
}


