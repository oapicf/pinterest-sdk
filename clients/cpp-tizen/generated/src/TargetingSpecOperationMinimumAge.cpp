#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TargetingSpecOperationMinimumAge.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TargetingSpecOperationMinimumAge::TargetingSpecOperationMinimumAge()
{
	//__init();
}

TargetingSpecOperationMinimumAge::~TargetingSpecOperationMinimumAge()
{
	//__cleanup();
}

void
TargetingSpecOperationMinimumAge::__init()
{
	//field = std::string();
	//operation = std::string();
	//value = std::string();
}

void
TargetingSpecOperationMinimumAge::__cleanup()
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
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//
}

void
TargetingSpecOperationMinimumAge::fromJson(char* jsonStr)
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
	const gchar *valueKey = "value";
	node = json_object_get_member(pJsonObject, valueKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&value, node, "std::string", "");
		} else {
			
		}
	}
}

TargetingSpecOperationMinimumAge::TargetingSpecOperationMinimumAge(char* json)
{
	this->fromJson(json);
}

char*
TargetingSpecOperationMinimumAge::toJson()
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
TargetingSpecOperationMinimumAge::getField()
{
	return field;
}

void
TargetingSpecOperationMinimumAge::setField(std::string  field)
{
	this->field = field;
}

std::string
TargetingSpecOperationMinimumAge::getOperation()
{
	return operation;
}

void
TargetingSpecOperationMinimumAge::setOperation(std::string  operation)
{
	this->operation = operation;
}

std::string
TargetingSpecOperationMinimumAge::getValue()
{
	return value;
}

void
TargetingSpecOperationMinimumAge::setValue(std::string  value)
{
	this->value = value;
}


