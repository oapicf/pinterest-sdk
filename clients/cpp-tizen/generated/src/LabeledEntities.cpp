#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LabeledEntities.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LabeledEntities::LabeledEntities()
{
	//__init();
}

LabeledEntities::~LabeledEntities()
{
	//__cleanup();
}

void
LabeledEntities::__init()
{
	//new std::list()std::list> entities_labels;
	//new std::list()std::list> errors;
}

void
LabeledEntities::__cleanup()
{
	//if(entities_labels != NULL) {
	//entities_labels.RemoveAll(true);
	//delete entities_labels;
	//entities_labels = NULL;
	//}
	//if(errors != NULL) {
	//errors.RemoveAll(true);
	//delete errors;
	//errors = NULL;
	//}
	//
}

void
LabeledEntities::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *entities_labelsKey = "entities_labels";
	node = json_object_get_member(pJsonObject, entities_labelsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<EntityLabel> new_list;
			EntityLabel inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("EntityLabel")) {
					jsonToValue(&inst, temp_json, "EntityLabel", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			entities_labels = new_list;
		}
		
	}
	const gchar *errorsKey = "errors";
	node = json_object_get_member(pJsonObject, errorsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<EntityLabelError> new_list;
			EntityLabelError inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("EntityLabelError")) {
					jsonToValue(&inst, temp_json, "EntityLabelError", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			errors = new_list;
		}
		
	}
}

LabeledEntities::LabeledEntities(char* json)
{
	this->fromJson(json);
}

char*
LabeledEntities::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("EntityLabel")) {
		list<EntityLabel> new_list = static_cast<list <EntityLabel> > (getEntitiesLabels());
		node = converttoJson(&new_list, "EntityLabel", "array");
	} else {
		node = json_node_alloc();
		list<EntityLabel> new_list = static_cast<list <EntityLabel> > (getEntitiesLabels());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<EntityLabel>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			EntityLabel obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *entities_labelsKey = "entities_labels";
	json_object_set_member(pJsonObject, entities_labelsKey, node);
	if (isprimitive("EntityLabelError")) {
		list<EntityLabelError> new_list = static_cast<list <EntityLabelError> > (getErrors());
		node = converttoJson(&new_list, "EntityLabelError", "array");
	} else {
		node = json_node_alloc();
		list<EntityLabelError> new_list = static_cast<list <EntityLabelError> > (getErrors());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<EntityLabelError>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			EntityLabelError obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *errorsKey = "errors";
	json_object_set_member(pJsonObject, errorsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<EntityLabel>
LabeledEntities::getEntitiesLabels()
{
	return entities_labels;
}

void
LabeledEntities::setEntitiesLabels(std::list <EntityLabel> entities_labels)
{
	this->entities_labels = entities_labels;
}

std::list<EntityLabelError>
LabeledEntities::getErrors()
{
	return errors;
}

void
LabeledEntities::setErrors(std::list <EntityLabelError> errors)
{
	this->errors = errors;
}


