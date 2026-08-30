#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LocalInventoryItemsBatchCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LocalInventoryItemsBatchCreate::LocalInventoryItemsBatchCreate()
{
	//__init();
}

LocalInventoryItemsBatchCreate::~LocalInventoryItemsBatchCreate()
{
	//__cleanup();
}

void
LocalInventoryItemsBatchCreate::__init()
{
	//new std::list()std::list> operations;
}

void
LocalInventoryItemsBatchCreate::__cleanup()
{
	//if(operations != NULL) {
	//operations.RemoveAll(true);
	//delete operations;
	//operations = NULL;
	//}
	//
}

void
LocalInventoryItemsBatchCreate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *operationsKey = "operations";
	node = json_object_get_member(pJsonObject, operationsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<LocalInventoryOperation> new_list;
			LocalInventoryOperation inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("LocalInventoryOperation")) {
					jsonToValue(&inst, temp_json, "LocalInventoryOperation", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			operations = new_list;
		}
		
	}
}

LocalInventoryItemsBatchCreate::LocalInventoryItemsBatchCreate(char* json)
{
	this->fromJson(json);
}

char*
LocalInventoryItemsBatchCreate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("LocalInventoryOperation")) {
		list<LocalInventoryOperation> new_list = static_cast<list <LocalInventoryOperation> > (getOperations());
		node = converttoJson(&new_list, "LocalInventoryOperation", "array");
	} else {
		node = json_node_alloc();
		list<LocalInventoryOperation> new_list = static_cast<list <LocalInventoryOperation> > (getOperations());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<LocalInventoryOperation>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			LocalInventoryOperation obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *operationsKey = "operations";
	json_object_set_member(pJsonObject, operationsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<LocalInventoryOperation>
LocalInventoryItemsBatchCreate::getOperations()
{
	return operations;
}

void
LocalInventoryItemsBatchCreate::setOperations(std::list <LocalInventoryOperation> operations)
{
	this->operations = operations;
}


