#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DeletePartnerAssetAccessResultsResponseArray.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DeletePartnerAssetAccessResultsResponseArray::DeletePartnerAssetAccessResultsResponseArray()
{
	//__init();
}

DeletePartnerAssetAccessResultsResponseArray::~DeletePartnerAssetAccessResultsResponseArray()
{
	//__cleanup();
}

void
DeletePartnerAssetAccessResultsResponseArray::__init()
{
	//new std::list()std::list> items;
}

void
DeletePartnerAssetAccessResultsResponseArray::__cleanup()
{
	//if(items != NULL) {
	//items.RemoveAll(true);
	//delete items;
	//items = NULL;
	//}
	//
}

void
DeletePartnerAssetAccessResultsResponseArray::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<DeletePartnerAssetAccessResult> new_list;
			DeletePartnerAssetAccessResult inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("DeletePartnerAssetAccessResult")) {
					jsonToValue(&inst, temp_json, "DeletePartnerAssetAccessResult", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			items = new_list;
		}
		
	}
}

DeletePartnerAssetAccessResultsResponseArray::DeletePartnerAssetAccessResultsResponseArray(char* json)
{
	this->fromJson(json);
}

char*
DeletePartnerAssetAccessResultsResponseArray::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("DeletePartnerAssetAccessResult")) {
		list<DeletePartnerAssetAccessResult> new_list = static_cast<list <DeletePartnerAssetAccessResult> > (getItems());
		node = converttoJson(&new_list, "DeletePartnerAssetAccessResult", "array");
	} else {
		node = json_node_alloc();
		list<DeletePartnerAssetAccessResult> new_list = static_cast<list <DeletePartnerAssetAccessResult> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<DeletePartnerAssetAccessResult>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			DeletePartnerAssetAccessResult obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *itemsKey = "items";
	json_object_set_member(pJsonObject, itemsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<DeletePartnerAssetAccessResult>
DeletePartnerAssetAccessResultsResponseArray::getItems()
{
	return items;
}

void
DeletePartnerAssetAccessResultsResponseArray::setItems(std::list <DeletePartnerAssetAccessResult> items)
{
	this->items = items;
}


