#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TargetingSpecOperationMinMaxAge.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TargetingSpecOperationMinMaxAge::TargetingSpecOperationMinMaxAge()
{
	//__init();
}

TargetingSpecOperationMinMaxAge::~TargetingSpecOperationMinMaxAge()
{
	//__cleanup();
}

void
TargetingSpecOperationMinMaxAge::__init()
{
	//field = std::string();
	//operation = std::string();
	//value = std::string();
}

void
TargetingSpecOperationMinMaxAge::__cleanup()
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
TargetingSpecOperationMinMaxAge::fromJson(char* jsonStr)
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

TargetingSpecOperationMinMaxAge::TargetingSpecOperationMinMaxAge(char* json)
{
	this->fromJson(json);
}

char*
TargetingSpecOperationMinMaxAge::toJson()
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
TargetingSpecOperationMinMaxAge::getField()
{
	return field;
}

void
TargetingSpecOperationMinMaxAge::setField(std::string  field)
{
	this->field = field;
}

std::string
TargetingSpecOperationMinMaxAge::getOperation()
{
	return operation;
}

void
TargetingSpecOperationMinMaxAge::setOperation(std::string  operation)
{
	this->operation = operation;
}

std::string
TargetingSpecOperationMinMaxAge::getValue()
{
	return value;
}

void
TargetingSpecOperationMinMaxAge::setValue(std::string  value)
{
	this->value = value;
}


