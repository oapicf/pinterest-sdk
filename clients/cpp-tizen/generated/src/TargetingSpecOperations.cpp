#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TargetingSpecOperations.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TargetingSpecOperations::TargetingSpecOperations()
{
	//__init();
}

TargetingSpecOperations::~TargetingSpecOperations()
{
	//__cleanup();
}

void
TargetingSpecOperations::__init()
{
	//field = std::string();
	//operation = std::string();
	//new std::list()std::list> values;
	//value = std::string();
}

void
TargetingSpecOperations::__cleanup()
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
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//
}

void
TargetingSpecOperations::fromJson(char* jsonStr)
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
			list<TargetingSpecShoppingRetargeting> new_list;
			TargetingSpecShoppingRetargeting inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TargetingSpecShoppingRetargeting")) {
					jsonToValue(&inst, temp_json, "TargetingSpecShoppingRetargeting", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			values = new_list;
		}
		
	}
	const gchar *valueKey = "value";
	node = json_object_get_member(pJsonObject, valueKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&value, node, "std::string", "");
		} else {
			
		}
	}
}

TargetingSpecOperations::TargetingSpecOperations(char* json)
{
	this->fromJson(json);
}

char*
TargetingSpecOperations::toJson()
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
	if (isprimitive("TargetingSpecShoppingRetargeting")) {
		list<TargetingSpecShoppingRetargeting> new_list = static_cast<list <TargetingSpecShoppingRetargeting> > (getValues());
		node = converttoJson(&new_list, "TargetingSpecShoppingRetargeting", "array");
	} else {
		node = json_node_alloc();
		list<TargetingSpecShoppingRetargeting> new_list = static_cast<list <TargetingSpecShoppingRetargeting> > (getValues());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TargetingSpecShoppingRetargeting>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TargetingSpecShoppingRetargeting obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *valuesKey = "values";
	json_object_set_member(pJsonObject, valuesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getValue();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
TargetingSpecOperations::getField()
{
	return field;
}

void
TargetingSpecOperations::setField(std::string  field)
{
	this->field = field;
}

std::string
TargetingSpecOperations::getOperation()
{
	return operation;
}

void
TargetingSpecOperations::setOperation(std::string  operation)
{
	this->operation = operation;
}

std::list<TargetingSpecShoppingRetargeting>
TargetingSpecOperations::getValues()
{
	return values;
}

void
TargetingSpecOperations::setValues(std::list <TargetingSpecShoppingRetargeting> values)
{
	this->values = values;
}

std::string
TargetingSpecOperations::getValue()
{
	return value;
}

void
TargetingSpecOperations::setValue(std::string  value)
{
	this->value = value;
}


