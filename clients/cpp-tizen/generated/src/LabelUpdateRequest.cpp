#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LabelUpdateRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LabelUpdateRequest::LabelUpdateRequest()
{
	//__init();
}

LabelUpdateRequest::~LabelUpdateRequest()
{
	//__cleanup();
}

void
LabelUpdateRequest::__init()
{
	//new std::list()std::list> labels;
}

void
LabelUpdateRequest::__cleanup()
{
	//if(labels != NULL) {
	//labels.RemoveAll(true);
	//delete labels;
	//labels = NULL;
	//}
	//
}

void
LabelUpdateRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *labelsKey = "labels";
	node = json_object_get_member(pJsonObject, labelsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<LabelUpdateItem> new_list;
			LabelUpdateItem inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("LabelUpdateItem")) {
					jsonToValue(&inst, temp_json, "LabelUpdateItem", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			labels = new_list;
		}
		
	}
}

LabelUpdateRequest::LabelUpdateRequest(char* json)
{
	this->fromJson(json);
}

char*
LabelUpdateRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("LabelUpdateItem")) {
		list<LabelUpdateItem> new_list = static_cast<list <LabelUpdateItem> > (getLabels());
		node = converttoJson(&new_list, "LabelUpdateItem", "array");
	} else {
		node = json_node_alloc();
		list<LabelUpdateItem> new_list = static_cast<list <LabelUpdateItem> > (getLabels());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<LabelUpdateItem>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			LabelUpdateItem obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *labelsKey = "labels";
	json_object_set_member(pJsonObject, labelsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<LabelUpdateItem>
LabelUpdateRequest::getLabels()
{
	return labels;
}

void
LabelUpdateRequest::setLabels(std::list <LabelUpdateItem> labels)
{
	this->labels = labels;
}


