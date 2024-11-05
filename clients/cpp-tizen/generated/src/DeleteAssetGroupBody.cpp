#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DeleteAssetGroupBody.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DeleteAssetGroupBody::DeleteAssetGroupBody()
{
	//__init();
}

DeleteAssetGroupBody::~DeleteAssetGroupBody()
{
	//__cleanup();
}

void
DeleteAssetGroupBody::__init()
{
	//new std::list()std::list> asset_groups_to_delete;
}

void
DeleteAssetGroupBody::__cleanup()
{
	//if(asset_groups_to_delete != NULL) {
	//asset_groups_to_delete.RemoveAll(true);
	//delete asset_groups_to_delete;
	//asset_groups_to_delete = NULL;
	//}
	//
}

void
DeleteAssetGroupBody::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *asset_groups_to_deleteKey = "asset_groups_to_delete";
	node = json_object_get_member(pJsonObject, asset_groups_to_deleteKey);
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
			asset_groups_to_delete = new_list;
		}
		
	}
}

DeleteAssetGroupBody::DeleteAssetGroupBody(char* json)
{
	this->fromJson(json);
}

char*
DeleteAssetGroupBody::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getAssetGroupsToDelete());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getAssetGroupsToDelete());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *asset_groups_to_deleteKey = "asset_groups_to_delete";
	json_object_set_member(pJsonObject, asset_groups_to_deleteKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
DeleteAssetGroupBody::getAssetGroupsToDelete()
{
	return asset_groups_to_delete;
}

void
DeleteAssetGroupBody::setAssetGroupsToDelete(std::list <std::string> asset_groups_to_delete)
{
	this->asset_groups_to_delete = asset_groups_to_delete;
}


