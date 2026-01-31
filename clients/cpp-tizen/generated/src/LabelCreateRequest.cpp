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
	//parent_id = std::string();
}

void
LabelCreateRequest::__cleanup()
{
	//if(labels != NULL) {
	//labels.RemoveAll(true);
	//delete labels;
	//labels = NULL;
	//}
	//if(parent_id != NULL) {
	//
	//delete parent_id;
	//parent_id = NULL;
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
			list<LabelCreateRequest_labels_inner> new_list;
			LabelCreateRequest_labels_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("LabelCreateRequest_labels_inner")) {
					jsonToValue(&inst, temp_json, "LabelCreateRequest_labels_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			labels = new_list;
		}
		
	}
	const gchar *parent_idKey = "parent_id";
	node = json_object_get_member(pJsonObject, parent_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&parent_id, node, "std::string", "");
		} else {
			
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
	if (isprimitive("LabelCreateRequest_labels_inner")) {
		list<LabelCreateRequest_labels_inner> new_list = static_cast<list <LabelCreateRequest_labels_inner> > (getLabels());
		node = converttoJson(&new_list, "LabelCreateRequest_labels_inner", "array");
	} else {
		node = json_node_alloc();
		list<LabelCreateRequest_labels_inner> new_list = static_cast<list <LabelCreateRequest_labels_inner> > (getLabels());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<LabelCreateRequest_labels_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			LabelCreateRequest_labels_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *labelsKey = "labels";
	json_object_set_member(pJsonObject, labelsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getParentId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *parent_idKey = "parent_id";
	json_object_set_member(pJsonObject, parent_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<LabelCreateRequest_labels_inner>
LabelCreateRequest::getLabels()
{
	return labels;
}

void
LabelCreateRequest::setLabels(std::list <LabelCreateRequest_labels_inner> labels)
{
	this->labels = labels;
}

std::string
LabelCreateRequest::getParentId()
{
	return parent_id;
}

void
LabelCreateRequest::setParentId(std::string  parent_id)
{
	this->parent_id = parent_id;
}


