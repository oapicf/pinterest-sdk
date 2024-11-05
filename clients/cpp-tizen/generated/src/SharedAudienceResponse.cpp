#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SharedAudienceResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SharedAudienceResponse::SharedAudienceResponse()
{
	//__init();
}

SharedAudienceResponse::~SharedAudienceResponse()
{
	//__cleanup();
}

void
SharedAudienceResponse::__init()
{
	//audience_id = std::string();
	//new std::list()std::list> permissions;
	//new std::list()std::list> recipient_account_ids;
}

void
SharedAudienceResponse::__cleanup()
{
	//if(audience_id != NULL) {
	//
	//delete audience_id;
	//audience_id = NULL;
	//}
	//if(permissions != NULL) {
	//permissions.RemoveAll(true);
	//delete permissions;
	//permissions = NULL;
	//}
	//if(recipient_account_ids != NULL) {
	//recipient_account_ids.RemoveAll(true);
	//delete recipient_account_ids;
	//recipient_account_ids = NULL;
	//}
	//
}

void
SharedAudienceResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *audience_idKey = "audience_id";
	node = json_object_get_member(pJsonObject, audience_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&audience_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *permissionsKey = "permissions";
	node = json_object_get_member(pJsonObject, permissionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Role> new_list;
			Role inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Role")) {
					jsonToValue(&inst, temp_json, "Role", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			permissions = new_list;
		}
		
	}
	const gchar *recipient_account_idsKey = "recipient_account_ids";
	node = json_object_get_member(pJsonObject, recipient_account_idsKey);
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
			recipient_account_ids = new_list;
		}
		
	}
}

SharedAudienceResponse::SharedAudienceResponse(char* json)
{
	this->fromJson(json);
}

char*
SharedAudienceResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAudienceId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *audience_idKey = "audience_id";
	json_object_set_member(pJsonObject, audience_idKey, node);
	if (isprimitive("Role")) {
		list<Role> new_list = static_cast<list <Role> > (getPermissions());
		node = converttoJson(&new_list, "Role", "array");
	} else {
		node = json_node_alloc();
		list<Role> new_list = static_cast<list <Role> > (getPermissions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Role>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Role obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *permissionsKey = "permissions";
	json_object_set_member(pJsonObject, permissionsKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getRecipientAccountIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getRecipientAccountIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *recipient_account_idsKey = "recipient_account_ids";
	json_object_set_member(pJsonObject, recipient_account_idsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
SharedAudienceResponse::getAudienceId()
{
	return audience_id;
}

void
SharedAudienceResponse::setAudienceId(std::string  audience_id)
{
	this->audience_id = audience_id;
}

std::list<Role>
SharedAudienceResponse::getPermissions()
{
	return permissions;
}

void
SharedAudienceResponse::setPermissions(std::list <Role> permissions)
{
	this->permissions = permissions;
}

std::list<std::string>
SharedAudienceResponse::getRecipientAccountIds()
{
	return recipient_account_ids;
}

void
SharedAudienceResponse::setRecipientAccountIds(std::list <std::string> recipient_account_ids)
{
	this->recipient_account_ids = recipient_account_ids;
}


