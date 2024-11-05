#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BusinessSharedAudienceResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BusinessSharedAudienceResponse::BusinessSharedAudienceResponse()
{
	//__init();
}

BusinessSharedAudienceResponse::~BusinessSharedAudienceResponse()
{
	//__cleanup();
}

void
BusinessSharedAudienceResponse::__init()
{
	//audience_id = std::string();
	//new std::list()std::list> permissions;
	//new std::list()std::list> recipient_business_ids;
}

void
BusinessSharedAudienceResponse::__cleanup()
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
	//if(recipient_business_ids != NULL) {
	//recipient_business_ids.RemoveAll(true);
	//delete recipient_business_ids;
	//recipient_business_ids = NULL;
	//}
	//
}

void
BusinessSharedAudienceResponse::fromJson(char* jsonStr)
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
	const gchar *recipient_business_idsKey = "recipient_business_ids";
	node = json_object_get_member(pJsonObject, recipient_business_idsKey);
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
			recipient_business_ids = new_list;
		}
		
	}
}

BusinessSharedAudienceResponse::BusinessSharedAudienceResponse(char* json)
{
	this->fromJson(json);
}

char*
BusinessSharedAudienceResponse::toJson()
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
		list<std::string> new_list = static_cast<list <std::string> > (getRecipientBusinessIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getRecipientBusinessIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *recipient_business_idsKey = "recipient_business_ids";
	json_object_set_member(pJsonObject, recipient_business_idsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
BusinessSharedAudienceResponse::getAudienceId()
{
	return audience_id;
}

void
BusinessSharedAudienceResponse::setAudienceId(std::string  audience_id)
{
	this->audience_id = audience_id;
}

std::list<Role>
BusinessSharedAudienceResponse::getPermissions()
{
	return permissions;
}

void
BusinessSharedAudienceResponse::setPermissions(std::list <Role> permissions)
{
	this->permissions = permissions;
}

std::list<std::string>
BusinessSharedAudienceResponse::getRecipientBusinessIds()
{
	return recipient_business_ids;
}

void
BusinessSharedAudienceResponse::setRecipientBusinessIds(std::list <std::string> recipient_business_ids)
{
	this->recipient_business_ids = recipient_business_ids;
}


