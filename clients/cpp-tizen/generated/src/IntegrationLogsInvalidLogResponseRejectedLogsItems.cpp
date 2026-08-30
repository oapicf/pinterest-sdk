#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "IntegrationLogsInvalidLogResponseRejectedLogsItems.h"

using namespace std;
using namespace Tizen::ArtikCloud;

IntegrationLogsInvalidLogResponseRejectedLogsItems::IntegrationLogsInvalidLogResponseRejectedLogsItems()
{
	//__init();
}

IntegrationLogsInvalidLogResponseRejectedLogsItems::~IntegrationLogsInvalidLogResponseRejectedLogsItems()
{
	//__cleanup();
}

void
IntegrationLogsInvalidLogResponseRejectedLogsItems::__init()
{
	//field = std::string();
	//log_index = int(0);
	//reason = std::string();
	//value = std::string();
}

void
IntegrationLogsInvalidLogResponseRejectedLogsItems::__cleanup()
{
	//if(field != NULL) {
	//
	//delete field;
	//field = NULL;
	//}
	//if(log_index != NULL) {
	//
	//delete log_index;
	//log_index = NULL;
	//}
	//if(reason != NULL) {
	//
	//delete reason;
	//reason = NULL;
	//}
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//
}

void
IntegrationLogsInvalidLogResponseRejectedLogsItems::fromJson(char* jsonStr)
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
	const gchar *log_indexKey = "log_index";
	node = json_object_get_member(pJsonObject, log_indexKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&log_index, node, "int", "");
		} else {
			
		}
	}
	const gchar *reasonKey = "reason";
	node = json_object_get_member(pJsonObject, reasonKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&reason, node, "std::string", "");
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

IntegrationLogsInvalidLogResponseRejectedLogsItems::IntegrationLogsInvalidLogResponseRejectedLogsItems(char* json)
{
	this->fromJson(json);
}

char*
IntegrationLogsInvalidLogResponseRejectedLogsItems::toJson()
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
	if (isprimitive("int")) {
		int obj = getLogIndex();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *log_indexKey = "log_index";
	json_object_set_member(pJsonObject, log_indexKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getReason();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *reasonKey = "reason";
	json_object_set_member(pJsonObject, reasonKey, node);
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
IntegrationLogsInvalidLogResponseRejectedLogsItems::getField()
{
	return field;
}

void
IntegrationLogsInvalidLogResponseRejectedLogsItems::setField(std::string  field)
{
	this->field = field;
}

int
IntegrationLogsInvalidLogResponseRejectedLogsItems::getLogIndex()
{
	return log_index;
}

void
IntegrationLogsInvalidLogResponseRejectedLogsItems::setLogIndex(int  log_index)
{
	this->log_index = log_index;
}

std::string
IntegrationLogsInvalidLogResponseRejectedLogsItems::getReason()
{
	return reason;
}

void
IntegrationLogsInvalidLogResponseRejectedLogsItems::setReason(std::string  reason)
{
	this->reason = reason;
}

std::string
IntegrationLogsInvalidLogResponseRejectedLogsItems::getValue()
{
	return value;
}

void
IntegrationLogsInvalidLogResponseRejectedLogsItems::setValue(std::string  value)
{
	this->value = value;
}


