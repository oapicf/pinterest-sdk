#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BusinessMemberAssetsSummary_ad_accounts_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BusinessMemberAssetsSummary_ad_accounts_inner::BusinessMemberAssetsSummary_ad_accounts_inner()
{
	//__init();
}

BusinessMemberAssetsSummary_ad_accounts_inner::~BusinessMemberAssetsSummary_ad_accounts_inner()
{
	//__cleanup();
}

void
BusinessMemberAssetsSummary_ad_accounts_inner::__init()
{
	//id = std::string();
	//new std::list()std::list> permissions;
}

void
BusinessMemberAssetsSummary_ad_accounts_inner::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(permissions != NULL) {
	//permissions.RemoveAll(true);
	//delete permissions;
	//permissions = NULL;
	//}
	//
}

void
BusinessMemberAssetsSummary_ad_accounts_inner::fromJson(char* jsonStr)
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

BusinessMemberAssetsSummary_ad_accounts_inner::BusinessMemberAssetsSummary_ad_accounts_inner(char* json)
{
	this->fromJson(json);
}

char*
BusinessMemberAssetsSummary_ad_accounts_inner::toJson()
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
BusinessMemberAssetsSummary_ad_accounts_inner::getId()
{
	return id;
}

void
BusinessMemberAssetsSummary_ad_accounts_inner::setId(std::string  id)
{
	this->id = id;
}

std::list<std::string>
BusinessMemberAssetsSummary_ad_accounts_inner::getPermissions()
{
	return permissions;
}

void
BusinessMemberAssetsSummary_ad_accounts_inner::setPermissions(std::list <std::string> permissions)
{
	this->permissions = permissions;
}


