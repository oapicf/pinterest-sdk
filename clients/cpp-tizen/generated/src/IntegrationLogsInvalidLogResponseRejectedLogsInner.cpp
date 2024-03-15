#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "IntegrationLogsInvalidLogResponse_rejected_logs_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

IntegrationLogsInvalidLogResponse_rejected_logs_inner::IntegrationLogsInvalidLogResponse_rejected_logs_inner()
{
	//__init();
}

IntegrationLogsInvalidLogResponse_rejected_logs_inner::~IntegrationLogsInvalidLogResponse_rejected_logs_inner()
{
	//__cleanup();
}

void
IntegrationLogsInvalidLogResponse_rejected_logs_inner::__init()
{
	//log_index = int(0);
	//field = std::string();
	//value = std::string();
	//reason = std::string();
}

void
IntegrationLogsInvalidLogResponse_rejected_logs_inner::__cleanup()
{
	//if(log_index != NULL) {
	//
	//delete log_index;
	//log_index = NULL;
	//}
	//if(field != NULL) {
	//
	//delete field;
	//field = NULL;
	//}
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//if(reason != NULL) {
	//
	//delete reason;
	//reason = NULL;
	//}
	//
}

void
IntegrationLogsInvalidLogResponse_rejected_logs_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *log_indexKey = "log_index";
	node = json_object_get_member(pJsonObject, log_indexKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&log_index, node, "int", "");
		} else {
			
		}
	}
	const gchar *fieldKey = "field";
	node = json_object_get_member(pJsonObject, fieldKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&field, node, "std::string", "");
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
	const gchar *reasonKey = "reason";
	node = json_object_get_member(pJsonObject, reasonKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&reason, node, "std::string", "");
		} else {
			
		}
	}
}

IntegrationLogsInvalidLogResponse_rejected_logs_inner::IntegrationLogsInvalidLogResponse_rejected_logs_inner(char* json)
{
	this->fromJson(json);
}

char*
IntegrationLogsInvalidLogResponse_rejected_logs_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getLogIndex();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *log_indexKey = "log_index";
	json_object_set_member(pJsonObject, log_indexKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getField();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *fieldKey = "field";
	json_object_set_member(pJsonObject, fieldKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getValue();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getReason();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *reasonKey = "reason";
	json_object_set_member(pJsonObject, reasonKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
IntegrationLogsInvalidLogResponse_rejected_logs_inner::getLogIndex()
{
	return log_index;
}

void
IntegrationLogsInvalidLogResponse_rejected_logs_inner::setLogIndex(int  log_index)
{
	this->log_index = log_index;
}

std::string
IntegrationLogsInvalidLogResponse_rejected_logs_inner::getField()
{
	return field;
}

void
IntegrationLogsInvalidLogResponse_rejected_logs_inner::setField(std::string  field)
{
	this->field = field;
}

std::string
IntegrationLogsInvalidLogResponse_rejected_logs_inner::getValue()
{
	return value;
}

void
IntegrationLogsInvalidLogResponse_rejected_logs_inner::setValue(std::string  value)
{
	this->value = value;
}

std::string
IntegrationLogsInvalidLogResponse_rejected_logs_inner::getReason()
{
	return reason;
}

void
IntegrationLogsInvalidLogResponse_rejected_logs_inner::setReason(std::string  reason)
{
	this->reason = reason;
}


