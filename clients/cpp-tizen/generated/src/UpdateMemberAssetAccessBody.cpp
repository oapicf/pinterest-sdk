#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateMemberAssetAccessBody.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateMemberAssetAccessBody::UpdateMemberAssetAccessBody()
{
	//__init();
}

UpdateMemberAssetAccessBody::~UpdateMemberAssetAccessBody()
{
	//__cleanup();
}

void
UpdateMemberAssetAccessBody::__init()
{
	//new std::list()std::list> accesses;
}

void
UpdateMemberAssetAccessBody::__cleanup()
{
	//if(accesses != NULL) {
	//accesses.RemoveAll(true);
	//delete accesses;
	//accesses = NULL;
	//}
	//
}

void
UpdateMemberAssetAccessBody::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *accessesKey = "accesses";
	node = json_object_get_member(pJsonObject, accessesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<UpdateMemberAssetAccessBody_accesses_inner> new_list;
			UpdateMemberAssetAccessBody_accesses_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("UpdateMemberAssetAccessBody_accesses_inner")) {
					jsonToValue(&inst, temp_json, "UpdateMemberAssetAccessBody_accesses_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			accesses = new_list;
		}
		
	}
}

UpdateMemberAssetAccessBody::UpdateMemberAssetAccessBody(char* json)
{
	this->fromJson(json);
}

char*
UpdateMemberAssetAccessBody::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("UpdateMemberAssetAccessBody_accesses_inner")) {
		list<UpdateMemberAssetAccessBody_accesses_inner> new_list = static_cast<list <UpdateMemberAssetAccessBody_accesses_inner> > (getAccesses());
		node = converttoJson(&new_list, "UpdateMemberAssetAccessBody_accesses_inner", "array");
	} else {
		node = json_node_alloc();
		list<UpdateMemberAssetAccessBody_accesses_inner> new_list = static_cast<list <UpdateMemberAssetAccessBody_accesses_inner> > (getAccesses());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<UpdateMemberAssetAccessBody_accesses_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			UpdateMemberAssetAccessBody_accesses_inner obj = *it;
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

std::list<UpdateMemberAssetAccessBody_accesses_inner>
UpdateMemberAssetAccessBody::getAccesses()
{
	return accesses;
}

void
UpdateMemberAssetAccessBody::setAccesses(std::list <UpdateMemberAssetAccessBody_accesses_inner> accesses)
{
	this->accesses = accesses;
}


