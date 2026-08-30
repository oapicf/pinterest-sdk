#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LabelCreateRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LabelCreateRequest::LabelCreateRequest()
{
	//__init();
}

LabelCreateRequest::~LabelCreateRequest()
{
	//__cleanup();
}

void
LabelCreateRequest::__init()
{
	//new std::list()std::list> labels;
}

void
LabelCreateRequest::__cleanup()
{
	//if(labels != NULL) {
	//labels.RemoveAll(true);
	//delete labels;
	//labels = NULL;
	//}
	//
}

void
LabelCreateRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *labelsKey = "labels";
	node = json_object_get_member(pJsonObject, labelsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<LabelCreateItem> new_list;
			LabelCreateItem inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("LabelCreateItem")) {
					jsonToValue(&inst, temp_json, "LabelCreateItem", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			labels = new_list;
		}
		
	}
}

LabelCreateRequest::LabelCreateRequest(char* json)
{
	this->fromJson(json);
}

char*
LabelCreateRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("LabelCreateItem")) {
		list<LabelCreateItem> new_list = static_cast<list <LabelCreateItem> > (getLabels());
		node = converttoJson(&new_list, "LabelCreateItem", "array");
	} else {
		node = json_node_alloc();
		list<LabelCreateItem> new_list = static_cast<list <LabelCreateItem> > (getLabels());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<LabelCreateItem>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			LabelCreateItem obj = *it;
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

std::list<LabelCreateItem>
LabelCreateRequest::getLabels()
{
	return labels;
}

void
LabelCreateRequest::setLabels(std::list <LabelCreateItem> labels)
{
	this->labels = labels;
}


