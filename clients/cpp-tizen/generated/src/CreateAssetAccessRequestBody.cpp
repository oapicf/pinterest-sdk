#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateAssetAccessRequestBody.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateAssetAccessRequestBody::CreateAssetAccessRequestBody()
{
	//__init();
}

CreateAssetAccessRequestBody::~CreateAssetAccessRequestBody()
{
	//__cleanup();
}

void
CreateAssetAccessRequestBody::__init()
{
	//new std::list()std::list> asset_requests;
}

void
CreateAssetAccessRequestBody::__cleanup()
{
	//if(asset_requests != NULL) {
	//asset_requests.RemoveAll(true);
	//delete asset_requests;
	//asset_requests = NULL;
	//}
	//
}

void
CreateAssetAccessRequestBody::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *asset_requestsKey = "asset_requests";
	node = json_object_get_member(pJsonObject, asset_requestsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CreateAssetAccessRequestBody_asset_requests_inner> new_list;
			CreateAssetAccessRequestBody_asset_requests_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CreateAssetAccessRequestBody_asset_requests_inner")) {
					jsonToValue(&inst, temp_json, "CreateAssetAccessRequestBody_asset_requests_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			asset_requests = new_list;
		}
		
	}
}

CreateAssetAccessRequestBody::CreateAssetAccessRequestBody(char* json)
{
	this->fromJson(json);
}

char*
CreateAssetAccessRequestBody::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CreateAssetAccessRequestBody_asset_requests_inner")) {
		list<CreateAssetAccessRequestBody_asset_requests_inner> new_list = static_cast<list <CreateAssetAccessRequestBody_asset_requests_inner> > (getAssetRequests());
		node = converttoJson(&new_list, "CreateAssetAccessRequestBody_asset_requests_inner", "array");
	} else {
		node = json_node_alloc();
		list<CreateAssetAccessRequestBody_asset_requests_inner> new_list = static_cast<list <CreateAssetAccessRequestBody_asset_requests_inner> > (getAssetRequests());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CreateAssetAccessRequestBody_asset_requests_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CreateAssetAccessRequestBody_asset_requests_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *asset_requestsKey = "asset_requests";
	json_object_set_member(pJsonObject, asset_requestsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<CreateAssetAccessRequestBody_asset_requests_inner>
CreateAssetAccessRequestBody::getAssetRequests()
{
	return asset_requests;
}

void
CreateAssetAccessRequestBody::setAssetRequests(std::list <CreateAssetAccessRequestBody_asset_requests_inner> asset_requests)
{
	this->asset_requests = asset_requests;
}


