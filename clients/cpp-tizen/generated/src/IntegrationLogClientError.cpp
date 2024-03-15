#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "IntegrationLogClientError.h"

using namespace std;
using namespace Tizen::ArtikCloud;

IntegrationLogClientError::IntegrationLogClientError()
{
	//__init();
}

IntegrationLogClientError::~IntegrationLogClientError()
{
	//__cleanup();
}

void
IntegrationLogClientError::__init()
{
	//cause = std::string();
	//column_number = int(0);
	//file_name = std::string();
	//line_number = int(0);
	//message = std::string();
	//message_detail = std::string();
	//name = std::string();
	//number = int(0);
	//stack_trace = std::string();
}

void
IntegrationLogClientError::__cleanup()
{
	//if(cause != NULL) {
	//
	//delete cause;
	//cause = NULL;
	//}
	//if(column_number != NULL) {
	//
	//delete column_number;
	//column_number = NULL;
	//}
	//if(file_name != NULL) {
	//
	//delete file_name;
	//file_name = NULL;
	//}
	//if(line_number != NULL) {
	//
	//delete line_number;
	//line_number = NULL;
	//}
	//if(message != NULL) {
	//
	//delete message;
	//message = NULL;
	//}
	//if(message_detail != NULL) {
	//
	//delete message_detail;
	//message_detail = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(number != NULL) {
	//
	//delete number;
	//number = NULL;
	//}
	//if(stack_trace != NULL) {
	//
	//delete stack_trace;
	//stack_trace = NULL;
	//}
	//
}

void
IntegrationLogClientError::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *causeKey = "cause";
	node = json_object_get_member(pJsonObject, causeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&cause, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *column_numberKey = "column_number";
	node = json_object_get_member(pJsonObject, column_numberKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&column_number, node, "int", "");
		} else {
			
		}
	}
	const gchar *file_nameKey = "file_name";
	node = json_object_get_member(pJsonObject, file_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&file_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *line_numberKey = "line_number";
	node = json_object_get_member(pJsonObject, line_numberKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&line_number, node, "int", "");
		} else {
			
		}
	}
	const gchar *messageKey = "message";
	node = json_object_get_member(pJsonObject, messageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&message, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *message_detailKey = "message_detail";
	node = json_object_get_member(pJsonObject, message_detailKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&message_detail, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *numberKey = "number";
	node = json_object_get_member(pJsonObject, numberKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&number, node, "int", "");
		} else {
			
		}
	}
	const gchar *stack_traceKey = "stack_trace";
	node = json_object_get_member(pJsonObject, stack_traceKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&stack_trace, node, "std::string", "");
		} else {
			
		}
	}
}

IntegrationLogClientError::IntegrationLogClientError(char* json)
{
	this->fromJson(json);
}

char*
IntegrationLogClientError::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getCause();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *causeKey = "cause";
	json_object_set_member(pJsonObject, causeKey, node);
	if (isprimitive("int")) {
		int obj = getColumnNumber();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *column_numberKey = "column_number";
	json_object_set_member(pJsonObject, column_numberKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFileName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *file_nameKey = "file_name";
	json_object_set_member(pJsonObject, file_nameKey, node);
	if (isprimitive("int")) {
		int obj = getLineNumber();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *line_numberKey = "line_number";
	json_object_set_member(pJsonObject, line_numberKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMessage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *messageKey = "message";
	json_object_set_member(pJsonObject, messageKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMessageDetail();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *message_detailKey = "message_detail";
	json_object_set_member(pJsonObject, message_detailKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("int")) {
		int obj = getNumber();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *numberKey = "number";
	json_object_set_member(pJsonObject, numberKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStackTrace();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *stack_traceKey = "stack_trace";
	json_object_set_member(pJsonObject, stack_traceKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
IntegrationLogClientError::getCause()
{
	return cause;
}

void
IntegrationLogClientError::setCause(std::string  cause)
{
	this->cause = cause;
}

int
IntegrationLogClientError::getColumnNumber()
{
	return column_number;
}

void
IntegrationLogClientError::setColumnNumber(int  column_number)
{
	this->column_number = column_number;
}

std::string
IntegrationLogClientError::getFileName()
{
	return file_name;
}

void
IntegrationLogClientError::setFileName(std::string  file_name)
{
	this->file_name = file_name;
}

int
IntegrationLogClientError::getLineNumber()
{
	return line_number;
}

void
IntegrationLogClientError::setLineNumber(int  line_number)
{
	this->line_number = line_number;
}

std::string
IntegrationLogClientError::getMessage()
{
	return message;
}

void
IntegrationLogClientError::setMessage(std::string  message)
{
	this->message = message;
}

std::string
IntegrationLogClientError::getMessageDetail()
{
	return message_detail;
}

void
IntegrationLogClientError::setMessageDetail(std::string  message_detail)
{
	this->message_detail = message_detail;
}

std::string
IntegrationLogClientError::getName()
{
	return name;
}

void
IntegrationLogClientError::setName(std::string  name)
{
	this->name = name;
}

int
IntegrationLogClientError::getNumber()
{
	return number;
}

void
IntegrationLogClientError::setNumber(int  number)
{
	this->number = number;
}

std::string
IntegrationLogClientError::getStackTrace()
{
	return stack_trace;
}

void
IntegrationLogClientError::setStackTrace(std::string  stack_trace)
{
	this->stack_trace = stack_trace;
}


