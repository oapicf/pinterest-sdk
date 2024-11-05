#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SharedAudienceResponseCommon.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SharedAudienceResponseCommon::SharedAudienceResponseCommon()
{
	//__init();
}

SharedAudienceResponseCommon::~SharedAudienceResponseCommon()
{
	//__cleanup();
}

void
SharedAudienceResponseCommon::__init()
{
	//audience_id = std::string();
	//new std::list()std::list> permissions;
}

void
SharedAudienceResponseCommon::__cleanup()
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
	//
}

void
SharedAudienceResponseCommon::fromJson(char* jsonStr)
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
}

SharedAudienceResponseCommon::SharedAudienceResponseCommon(char* json)
{
	this->fromJson(json);
}

char*
SharedAudienceResponseCommon::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
SharedAudienceResponseCommon::getAudienceId()
{
	return audience_id;
}

void
SharedAudienceResponseCommon::setAudienceId(std::string  audience_id)
{
	this->audience_id = audience_id;
}

std::list<Role>
SharedAudienceResponseCommon::getPermissions()
{
	return permissions;
}

void
SharedAudienceResponseCommon::setPermissions(std::list <Role> permissions)
{
	this->permissions = permissions;
}


