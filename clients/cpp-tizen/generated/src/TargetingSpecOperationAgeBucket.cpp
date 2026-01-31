#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TargetingSpecOperationAgeBucket.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TargetingSpecOperationAgeBucket::TargetingSpecOperationAgeBucket()
{
	//__init();
}

TargetingSpecOperationAgeBucket::~TargetingSpecOperationAgeBucket()
{
	//__cleanup();
}

void
TargetingSpecOperationAgeBucket::__init()
{
	//field = std::string();
	//operation = std::string();
	//new std::list()std::list> values;
}

void
TargetingSpecOperationAgeBucket::__cleanup()
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
TargetingSpecOperationAgeBucket::fromJson(char* jsonStr)
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
	

		if (isprimitive("std::string")) {
			jsonToValue(&operation, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *valuesKey = "values";
	node = json_object_get_member(pJsonObject, valuesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TargetingSpecAgeBucket> new_list;
			TargetingSpecAgeBucket inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TargetingSpecAgeBucket")) {
					jsonToValue(&inst, temp_json, "TargetingSpecAgeBucket", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			values = new_list;
		}
		
	}
}

TargetingSpecOperationAgeBucket::TargetingSpecOperationAgeBucket(char* json)
{
	this->fromJson(json);
}

char*
TargetingSpecOperationAgeBucket::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getOperation();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *operationKey = "operation";
	json_object_set_member(pJsonObject, operationKey, node);
	if (isprimitive("TargetingSpecAgeBucket")) {
		list<TargetingSpecAgeBucket> new_list = static_cast<list <TargetingSpecAgeBucket> > (getValues());
		node = converttoJson(&new_list, "TargetingSpecAgeBucket", "array");
	} else {
		node = json_node_alloc();
		list<TargetingSpecAgeBucket> new_list = static_cast<list <TargetingSpecAgeBucket> > (getValues());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TargetingSpecAgeBucket>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TargetingSpecAgeBucket obj = *it;
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
TargetingSpecOperationAgeBucket::getField()
{
	return field;
}

void
TargetingSpecOperationAgeBucket::setField(std::string  field)
{
	this->field = field;
}

std::string
TargetingSpecOperationAgeBucket::getOperation()
{
	return operation;
}

void
TargetingSpecOperationAgeBucket::setOperation(std::string  operation)
{
	this->operation = operation;
}

std::list<TargetingSpecAgeBucket>
TargetingSpecOperationAgeBucket::getValues()
{
	return values;
}

void
TargetingSpecOperationAgeBucket::setValues(std::list <TargetingSpecAgeBucket> values)
{
	this->values = values;
}


