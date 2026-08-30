#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdatePartnerAssetAccessBody.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdatePartnerAssetAccessBody::UpdatePartnerAssetAccessBody()
{
	//__init();
}

UpdatePartnerAssetAccessBody::~UpdatePartnerAssetAccessBody()
{
	//__cleanup();
}

void
UpdatePartnerAssetAccessBody::__init()
{
	//new std::list()std::list> accesses;
}

void
UpdatePartnerAssetAccessBody::__cleanup()
{
	//if(accesses != NULL) {
	//accesses.RemoveAll(true);
	//delete accesses;
	//accesses = NULL;
	//}
	//
}

void
UpdatePartnerAssetAccessBody::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *accessesKey = "accesses";
	node = json_object_get_member(pJsonObject, accessesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<UpdatePartnerAssetAccessItem> new_list;
			UpdatePartnerAssetAccessItem inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("UpdatePartnerAssetAccessItem")) {
					jsonToValue(&inst, temp_json, "UpdatePartnerAssetAccessItem", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			accesses = new_list;
		}
		
	}
}

UpdatePartnerAssetAccessBody::UpdatePartnerAssetAccessBody(char* json)
{
	this->fromJson(json);
}

char*
UpdatePartnerAssetAccessBody::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("UpdatePartnerAssetAccessItem")) {
		list<UpdatePartnerAssetAccessItem> new_list = static_cast<list <UpdatePartnerAssetAccessItem> > (getAccesses());
		node = converttoJson(&new_list, "UpdatePartnerAssetAccessItem", "array");
	} else {
		node = json_node_alloc();
		list<UpdatePartnerAssetAccessItem> new_list = static_cast<list <UpdatePartnerAssetAccessItem> > (getAccesses());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<UpdatePartnerAssetAccessItem>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			UpdatePartnerAssetAccessItem obj = *it;
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

std::list<UpdatePartnerAssetAccessItem>
UpdatePartnerAssetAccessBody::getAccesses()
{
	return accesses;
}

void
UpdatePartnerAssetAccessBody::setAccesses(std::list <UpdatePartnerAssetAccessItem> accesses)
{
	this->accesses = accesses;
}


