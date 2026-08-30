#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TargetingSpecOperationGender.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TargetingSpecOperationGender::TargetingSpecOperationGender()
{
	//__init();
}

TargetingSpecOperationGender::~TargetingSpecOperationGender()
{
	//__cleanup();
}

void
TargetingSpecOperationGender::__init()
{
	//field = std::string();
	//operation = new TargetingSpecListOperation();
	//new std::list()std::list> values;
}

void
TargetingSpecOperationGender::__cleanup()
{
	//if(field != NULL) {
	//
	//delete field;
	//field = NULL;
	//}
	//if(operation != NULL) {
	//
	//delete operation;
	//operation = NULL;
	//}
	//if(values != NULL) {
	//values.RemoveAll(true);
	//delete values;
	//values = NULL;
	//}
	//
}

void
TargetingSpecOperationGender::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *fieldKey = "field";
	node = json_object_get_member(pJsonObject, fieldKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&field, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *operationKey = "operation";
	node = json_object_get_member(pJsonObject, operationKey);
	if (node !=NULL) {
	

		if (isprimitive("TargetingSpecListOperation")) {
			jsonToValue(&operation, node, "TargetingSpecListOperation", "TargetingSpecListOperation");
		} else {
			
			TargetingSpecListOperation* obj = static_cast<TargetingSpecListOperation*> (&operation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *valuesKey = "values";
	node = json_object_get_member(pJsonObject, valuesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TargetingSpecGender> new_list;
			TargetingSpecGender inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TargetingSpecGender")) {
					jsonToValue(&inst, temp_json, "TargetingSpecGender", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			values = new_list;
		}
		
	}
}

TargetingSpecOperationGender::TargetingSpecOperationGender(char* json)
{
	this->fromJson(json);
}

char*
TargetingSpecOperationGender::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getField();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *fieldKey = "field";
	json_object_set_member(pJsonObject, fieldKey, node);
	if (isprimitive("TargetingSpecListOperation")) {
		TargetingSpecListOperation obj = getOperation();
		node = converttoJson(&obj, "TargetingSpecListOperation", "");
	}
	else {
		
		TargetingSpecListOperation obj = static_cast<TargetingSpecListOperation> (getOperation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *operationKey = "operation";
	json_object_set_member(pJsonObject, operationKey, node);
	if (isprimitive("TargetingSpecGender")) {
		list<TargetingSpecGender> new_list = static_cast<list <TargetingSpecGender> > (getValues());
		node = converttoJson(&new_list, "TargetingSpecGender", "array");
	} else {
		node = json_node_alloc();
		list<TargetingSpecGender> new_list = static_cast<list <TargetingSpecGender> > (getValues());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TargetingSpecGender>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TargetingSpecGender obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *valuesKey = "values";
	json_object_set_member(pJsonObject, valuesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
TargetingSpecOperationGender::getField()
{
	return field;
}

void
TargetingSpecOperationGender::setField(std::string  field)
{
	this->field = field;
}

TargetingSpecListOperation
TargetingSpecOperationGender::getOperation()
{
	return operation;
}

void
TargetingSpecOperationGender::setOperation(TargetingSpecListOperation  operation)
{
	this->operation = operation;
}

std::list<TargetingSpecGender>
TargetingSpecOperationGender::getValues()
{
	return values;
}

void
TargetingSpecOperationGender::setValues(std::list <TargetingSpecGender> values)
{
	this->values = values;
}


