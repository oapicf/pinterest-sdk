#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LabelsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LabelsResponse::LabelsResponse()
{
	//__init();
}

LabelsResponse::~LabelsResponse()
{
	//__cleanup();
}

void
LabelsResponse::__init()
{
	//new std::list()std::list> errors;
	//new std::list()std::list> labels;
}

void
LabelsResponse::__cleanup()
{
	//if(errors != NULL) {
	//errors.RemoveAll(true);
	//delete errors;
	//errors = NULL;
	//}
	//if(labels != NULL) {
	//labels.RemoveAll(true);
	//delete labels;
	//labels = NULL;
	//}
	//
}

void
LabelsResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *errorsKey = "errors";
	node = json_object_get_member(pJsonObject, errorsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<LabelError> new_list;
			LabelError inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("LabelError")) {
					jsonToValue(&inst, temp_json, "LabelError", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			errors = new_list;
		}
		
	}
	const gchar *labelsKey = "labels";
	node = json_object_get_member(pJsonObject, labelsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Label> new_list;
			Label inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Label")) {
					jsonToValue(&inst, temp_json, "Label", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			labels = new_list;
		}
		
	}
}

LabelsResponse::LabelsResponse(char* json)
{
	this->fromJson(json);
}

char*
LabelsResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("LabelError")) {
		list<LabelError> new_list = static_cast<list <LabelError> > (getErrors());
		node = converttoJson(&new_list, "LabelError", "array");
	} else {
		node = json_node_alloc();
		list<LabelError> new_list = static_cast<list <LabelError> > (getErrors());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<LabelError>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			LabelError obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *errorsKey = "errors";
	json_object_set_member(pJsonObject, errorsKey, node);
	if (isprimitive("Label")) {
		list<Label> new_list = static_cast<list <Label> > (getLabels());
		node = converttoJson(&new_list, "Label", "array");
	} else {
		node = json_node_alloc();
		list<Label> new_list = static_cast<list <Label> > (getLabels());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Label>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Label obj = *it;
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

std::list<LabelError>
LabelsResponse::getErrors()
{
	return errors;
}

void
LabelsResponse::setErrors(std::list <LabelError> errors)
{
	this->errors = errors;
}

std::list<Label>
LabelsResponse::getLabels()
{
	return labels;
}

void
LabelsResponse::setLabels(std::list <Label> labels)
{
	this->labels = labels;
}


