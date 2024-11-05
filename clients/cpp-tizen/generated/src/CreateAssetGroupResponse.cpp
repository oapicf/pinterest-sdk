#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateAssetGroupResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateAssetGroupResponse::CreateAssetGroupResponse()
{
	//__init();
}

CreateAssetGroupResponse::~CreateAssetGroupResponse()
{
	//__cleanup();
}

void
CreateAssetGroupResponse::__init()
{
	//asset_group = new AssetGroupBinding();
}

void
CreateAssetGroupResponse::__cleanup()
{
	//if(asset_group != NULL) {
	//
	//delete asset_group;
	//asset_group = NULL;
	//}
	//
}

void
CreateAssetGroupResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *asset_groupKey = "asset_group";
	node = json_object_get_member(pJsonObject, asset_groupKey);
	if (node !=NULL) {
	

		if (isprimitive("AssetGroupBinding")) {
			jsonToValue(&asset_group, node, "AssetGroupBinding", "AssetGroupBinding");
		} else {
			
			AssetGroupBinding* obj = static_cast<AssetGroupBinding*> (&asset_group);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CreateAssetGroupResponse::CreateAssetGroupResponse(char* json)
{
	this->fromJson(json);
}

char*
CreateAssetGroupResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AssetGroupBinding")) {
		AssetGroupBinding obj = getAssetGroup();
		node = converttoJson(&obj, "AssetGroupBinding", "");
	}
	else {
		
		AssetGroupBinding obj = static_cast<AssetGroupBinding> (getAssetGroup());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *asset_groupKey = "asset_group";
	json_object_set_member(pJsonObject, asset_groupKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

AssetGroupBinding
CreateAssetGroupResponse::getAssetGroup()
{
	return asset_group;
}

void
CreateAssetGroupResponse::setAssetGroup(AssetGroupBinding  asset_group)
{
	this->asset_group = asset_group;
}


