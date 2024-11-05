#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Business_members_asset_access_delete_request.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Business_members_asset_access_delete_request::Business_members_asset_access_delete_request()
{
	//__init();
}

Business_members_asset_access_delete_request::~Business_members_asset_access_delete_request()
{
	//__cleanup();
}

void
Business_members_asset_access_delete_request::__init()
{
	//new std::list()std::list> accesses;
}

void
Business_members_asset_access_delete_request::__cleanup()
{
	//if(accesses != NULL) {
	//accesses.RemoveAll(true);
	//delete accesses;
	//accesses = NULL;
	//}
	//
}

void
Business_members_asset_access_delete_request::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *accessesKey = "accesses";
	node = json_object_get_member(pJsonObject, accessesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Business_members_asset_access_delete_request_accesses_inner> new_list;
			Business_members_asset_access_delete_request_accesses_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Business_members_asset_access_delete_request_accesses_inner")) {
					jsonToValue(&inst, temp_json, "Business_members_asset_access_delete_request_accesses_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			accesses = new_list;
		}
		
	}
}

Business_members_asset_access_delete_request::Business_members_asset_access_delete_request(char* json)
{
	this->fromJson(json);
}

char*
Business_members_asset_access_delete_request::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Business_members_asset_access_delete_request_accesses_inner")) {
		list<Business_members_asset_access_delete_request_accesses_inner> new_list = static_cast<list <Business_members_asset_access_delete_request_accesses_inner> > (getAccesses());
		node = converttoJson(&new_list, "Business_members_asset_access_delete_request_accesses_inner", "array");
	} else {
		node = json_node_alloc();
		list<Business_members_asset_access_delete_request_accesses_inner> new_list = static_cast<list <Business_members_asset_access_delete_request_accesses_inner> > (getAccesses());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Business_members_asset_access_delete_request_accesses_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Business_members_asset_access_delete_request_accesses_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *accessesKey = "accesses";
	json_object_set_member(pJsonObject, accessesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<Business_members_asset_access_delete_request_accesses_inner>
Business_members_asset_access_delete_request::getAccesses()
{
	return accesses;
}

void
Business_members_asset_access_delete_request::setAccesses(std::list <Business_members_asset_access_delete_request_accesses_inner> accesses)
{
	this->accesses = accesses;
}


