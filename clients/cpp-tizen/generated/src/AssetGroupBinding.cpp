#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AssetGroupBinding.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AssetGroupBinding::AssetGroupBinding()
{
	//__init();
}

AssetGroupBinding::~AssetGroupBinding()
{
	//__cleanup();
}

void
AssetGroupBinding::__init()
{
	//id = std::string();
	//asset_group_name = std::string();
	//asset_group_description = std::string();
	//new std::list()std::list> asset_group_types;
	//new std::list()std::list> ad_accounts_ids;
	//new std::list()std::list> profiles_ids;
	//created_time = int(0);
	//updated_time = int(0);
	//owner = null;
	//created_by = null;
}

void
AssetGroupBinding::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(asset_group_name != NULL) {
	//
	//delete asset_group_name;
	//asset_group_name = NULL;
	//}
	//if(asset_group_description != NULL) {
	//
	//delete asset_group_description;
	//asset_group_description = NULL;
	//}
	//if(asset_group_types != NULL) {
	//asset_group_types.RemoveAll(true);
	//delete asset_group_types;
	//asset_group_types = NULL;
	//}
	//if(ad_accounts_ids != NULL) {
	//ad_accounts_ids.RemoveAll(true);
	//delete ad_accounts_ids;
	//ad_accounts_ids = NULL;
	//}
	//if(profiles_ids != NULL) {
	//profiles_ids.RemoveAll(true);
	//delete profiles_ids;
	//profiles_ids = NULL;
	//}
	//if(created_time != NULL) {
	//
	//delete created_time;
	//created_time = NULL;
	//}
	//if(updated_time != NULL) {
	//
	//delete updated_time;
	//updated_time = NULL;
	//}
	//if(owner != NULL) {
	//
	//delete owner;
	//owner = NULL;
	//}
	//if(created_by != NULL) {
	//
	//delete created_by;
	//created_by = NULL;
	//}
	//
}

void
AssetGroupBinding::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
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
	const gchar *asset_group_descriptionKey = "asset_group_description";
	node = json_object_get_member(pJsonObject, asset_group_descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&asset_group_description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *asset_group_typesKey = "asset_group_types";
	node = json_object_get_member(pJsonObject, asset_group_typesKey);
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
			asset_group_types = new_list;
		}
		
	}
	const gchar *ad_accounts_idsKey = "ad_accounts_ids";
	node = json_object_get_member(pJsonObject, ad_accounts_idsKey);
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
			ad_accounts_ids = new_list;
		}
		
	}
	const gchar *profiles_idsKey = "profiles_ids";
	node = json_object_get_member(pJsonObject, profiles_idsKey);
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
			profiles_ids = new_list;
		}
		
	}
	const gchar *created_timeKey = "created_time";
	node = json_object_get_member(pJsonObject, created_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&created_time, node, "int", "");
		} else {
			
		}
	}
	const gchar *updated_timeKey = "updated_time";
	node = json_object_get_member(pJsonObject, updated_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&updated_time, node, "int", "");
		} else {
			
		}
	}
	const gchar *ownerKey = "owner";
	node = json_object_get_member(pJsonObject, ownerKey);
	if (node !=NULL) {
	

		if (isprimitive("BusinessAccessUserSummary")) {
			jsonToValue(&owner, node, "BusinessAccessUserSummary", "BusinessAccessUserSummary");
		} else {
			
			BusinessAccessUserSummary* obj = static_cast<BusinessAccessUserSummary*> (&owner);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *created_byKey = "created_by";
	node = json_object_get_member(pJsonObject, created_byKey);
	if (node !=NULL) {
	

		if (isprimitive("BusinessAccessUserSummary")) {
			jsonToValue(&created_by, node, "BusinessAccessUserSummary", "BusinessAccessUserSummary");
		} else {
			
			BusinessAccessUserSummary* obj = static_cast<BusinessAccessUserSummary*> (&created_by);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AssetGroupBinding::AssetGroupBinding(char* json)
{
	this->fromJson(json);
}

char*
AssetGroupBinding::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAssetGroupName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *asset_group_nameKey = "asset_group_name";
	json_object_set_member(pJsonObject, asset_group_nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAssetGroupDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *asset_group_descriptionKey = "asset_group_description";
	json_object_set_member(pJsonObject, asset_group_descriptionKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getAssetGroupTypes());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getAssetGroupTypes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *asset_group_typesKey = "asset_group_types";
	json_object_set_member(pJsonObject, asset_group_typesKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getAdAccountsIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getAdAccountsIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *ad_accounts_idsKey = "ad_accounts_ids";
	json_object_set_member(pJsonObject, ad_accounts_idsKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getProfilesIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getProfilesIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *profiles_idsKey = "profiles_ids";
	json_object_set_member(pJsonObject, profiles_idsKey, node);
	if (isprimitive("int")) {
		int obj = getCreatedTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_timeKey = "created_time";
	json_object_set_member(pJsonObject, created_timeKey, node);
	if (isprimitive("int")) {
		int obj = getUpdatedTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *updated_timeKey = "updated_time";
	json_object_set_member(pJsonObject, updated_timeKey, node);
	if (isprimitive("BusinessAccessUserSummary")) {
		BusinessAccessUserSummary obj = getOwner();
		node = converttoJson(&obj, "BusinessAccessUserSummary", "");
	}
	else {
		
		BusinessAccessUserSummary obj = static_cast<BusinessAccessUserSummary> (getOwner());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ownerKey = "owner";
	json_object_set_member(pJsonObject, ownerKey, node);
	if (isprimitive("BusinessAccessUserSummary")) {
		BusinessAccessUserSummary obj = getCreatedBy();
		node = converttoJson(&obj, "BusinessAccessUserSummary", "");
	}
	else {
		
		BusinessAccessUserSummary obj = static_cast<BusinessAccessUserSummary> (getCreatedBy());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *created_byKey = "created_by";
	json_object_set_member(pJsonObject, created_byKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AssetGroupBinding::getId()
{
	return id;
}

void
AssetGroupBinding::setId(std::string  id)
{
	this->id = id;
}

std::string
AssetGroupBinding::getAssetGroupName()
{
	return asset_group_name;
}

void
AssetGroupBinding::setAssetGroupName(std::string  asset_group_name)
{
	this->asset_group_name = asset_group_name;
}

std::string
AssetGroupBinding::getAssetGroupDescription()
{
	return asset_group_description;
}

void
AssetGroupBinding::setAssetGroupDescription(std::string  asset_group_description)
{
	this->asset_group_description = asset_group_description;
}

std::list<std::string>
AssetGroupBinding::getAssetGroupTypes()
{
	return asset_group_types;
}

void
AssetGroupBinding::setAssetGroupTypes(std::list <std::string> asset_group_types)
{
	this->asset_group_types = asset_group_types;
}

std::list<std::string>
AssetGroupBinding::getAdAccountsIds()
{
	return ad_accounts_ids;
}

void
AssetGroupBinding::setAdAccountsIds(std::list <std::string> ad_accounts_ids)
{
	this->ad_accounts_ids = ad_accounts_ids;
}

std::list<std::string>
AssetGroupBinding::getProfilesIds()
{
	return profiles_ids;
}

void
AssetGroupBinding::setProfilesIds(std::list <std::string> profiles_ids)
{
	this->profiles_ids = profiles_ids;
}

int
AssetGroupBinding::getCreatedTime()
{
	return created_time;
}

void
AssetGroupBinding::setCreatedTime(int  created_time)
{
	this->created_time = created_time;
}

int
AssetGroupBinding::getUpdatedTime()
{
	return updated_time;
}

void
AssetGroupBinding::setUpdatedTime(int  updated_time)
{
	this->updated_time = updated_time;
}

BusinessAccessUserSummary
AssetGroupBinding::getOwner()
{
	return owner;
}

void
AssetGroupBinding::setOwner(BusinessAccessUserSummary  owner)
{
	this->owner = owner;
}

BusinessAccessUserSummary
AssetGroupBinding::getCreatedBy()
{
	return created_by;
}

void
AssetGroupBinding::setCreatedBy(BusinessAccessUserSummary  created_by)
{
	this->created_by = created_by;
}


