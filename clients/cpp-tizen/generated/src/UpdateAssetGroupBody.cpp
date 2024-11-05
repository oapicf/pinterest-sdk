#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateAssetGroupBody.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateAssetGroupBody::UpdateAssetGroupBody()
{
	//__init();
}

UpdateAssetGroupBody::~UpdateAssetGroupBody()
{
	//__cleanup();
}

void
UpdateAssetGroupBody::__init()
{
	//new std::list()std::list> asset_groups_to_update;
}

void
UpdateAssetGroupBody::__cleanup()
{
	//if(asset_groups_to_update != NULL) {
	//asset_groups_to_update.RemoveAll(true);
	//delete asset_groups_to_update;
	//asset_groups_to_update = NULL;
	//}
	//
}

void
UpdateAssetGroupBody::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *asset_groups_to_updateKey = "asset_groups_to_update";
	node = json_object_get_member(pJsonObject, asset_groups_to_updateKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<UpdateAssetGroupBody_asset_groups_to_update_inner> new_list;
			UpdateAssetGroupBody_asset_groups_to_update_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("UpdateAssetGroupBody_asset_groups_to_update_inner")) {
					jsonToValue(&inst, temp_json, "UpdateAssetGroupBody_asset_groups_to_update_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			asset_groups_to_update = new_list;
		}
		
	}
}

UpdateAssetGroupBody::UpdateAssetGroupBody(char* json)
{
	this->fromJson(json);
}

char*
UpdateAssetGroupBody::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("UpdateAssetGroupBody_asset_groups_to_update_inner")) {
		list<UpdateAssetGroupBody_asset_groups_to_update_inner> new_list = static_cast<list <UpdateAssetGroupBody_asset_groups_to_update_inner> > (getAssetGroupsToUpdate());
		node = converttoJson(&new_list, "UpdateAssetGroupBody_asset_groups_to_update_inner", "array");
	} else {
		node = json_node_alloc();
		list<UpdateAssetGroupBody_asset_groups_to_update_inner> new_list = static_cast<list <UpdateAssetGroupBody_asset_groups_to_update_inner> > (getAssetGroupsToUpdate());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<UpdateAssetGroupBody_asset_groups_to_update_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			UpdateAssetGroupBody_asset_groups_to_update_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *asset_groups_to_updateKey = "asset_groups_to_update";
	json_object_set_member(pJsonObject, asset_groups_to_updateKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<UpdateAssetGroupBody_asset_groups_to_update_inner>
UpdateAssetGroupBody::getAssetGroupsToUpdate()
{
	return asset_groups_to_update;
}

void
UpdateAssetGroupBody::setAssetGroupsToUpdate(std::list <UpdateAssetGroupBody_asset_groups_to_update_inner> asset_groups_to_update)
{
	this->asset_groups_to_update = asset_groups_to_update;
}


