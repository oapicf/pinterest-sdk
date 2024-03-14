#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CustomerListUpdateRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CustomerListUpdateRequest::CustomerListUpdateRequest()
{
	//__init();
}

CustomerListUpdateRequest::~CustomerListUpdateRequest()
{
	//__cleanup();
}

void
CustomerListUpdateRequest::__init()
{
	//records = std::string();
	//operation_type = std::string();
	//exceptions = new Exception();
}

void
CustomerListUpdateRequest::__cleanup()
{
	//if(records != NULL) {
	//
	//delete records;
	//records = NULL;
	//}
	//if(operation_type != NULL) {
	//
	//delete operation_type;
	//operation_type = NULL;
	//}
	//if(exceptions != NULL) {
	//
	//delete exceptions;
	//exceptions = NULL;
	//}
	//
}

void
CustomerListUpdateRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *recordsKey = "records";
	node = json_object_get_member(pJsonObject, recordsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&records, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *operation_typeKey = "operation_type";
	node = json_object_get_member(pJsonObject, operation_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("UserListOperationType")) {
			jsonToValue(&operation_type, node, "UserListOperationType", "UserListOperationType");
		} else {
			
			UserListOperationType* obj = static_cast<UserListOperationType*> (&operation_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *exceptionsKey = "exceptions";
	node = json_object_get_member(pJsonObject, exceptionsKey);
	if (node !=NULL) {
	

		if (isprimitive("Exception")) {
			jsonToValue(&exceptions, node, "Exception", "");
		} else {
			
			Exception* obj = static_cast<Exception*> (&exceptions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CustomerListUpdateRequest::CustomerListUpdateRequest(char* json)
{
	this->fromJson(json);
}

char*
CustomerListUpdateRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getRecords();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *recordsKey = "records";
	json_object_set_member(pJsonObject, recordsKey, node);
	if (isprimitive("UserListOperationType")) {
		UserListOperationType obj = getOperationType();
		node = converttoJson(&obj, "UserListOperationType", "");
	}
	else {
		
		UserListOperationType obj = static_cast<UserListOperationType> (getOperationType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *operation_typeKey = "operation_type";
	json_object_set_member(pJsonObject, operation_typeKey, node);
	if (isprimitive("Exception")) {
		Exception obj = getExceptions();
		node = converttoJson(&obj, "Exception", "");
	}
	else {
		
		Exception obj = static_cast<Exception> (getExceptions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *exceptionsKey = "exceptions";
	json_object_set_member(pJsonObject, exceptionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CustomerListUpdateRequest::getRecords()
{
	return records;
}

void
CustomerListUpdateRequest::setRecords(std::string  records)
{
	this->records = records;
}

UserListOperationType
CustomerListUpdateRequest::getOperationType()
{
	return operation_type;
}

void
CustomerListUpdateRequest::setOperationType(UserListOperationType  operation_type)
{
	this->operation_type = operation_type;
}

Exception
CustomerListUpdateRequest::getExceptions()
{
	return exceptions;
}

void
CustomerListUpdateRequest::setExceptions(Exception  exceptions)
{
	this->exceptions = exceptions;
}


