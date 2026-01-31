#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CustomerListUploadCreateRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CustomerListUploadCreateRequest::CustomerListUploadCreateRequest()
{
	//__init();
}

CustomerListUploadCreateRequest::~CustomerListUploadCreateRequest()
{
	//__cleanup();
}

void
CustomerListUploadCreateRequest::__init()
{
	//operation = std::string();
	//total_parts = int(0);
}

void
CustomerListUploadCreateRequest::__cleanup()
{
	//if(operation != NULL) {
	//
	//delete operation;
	//operation = NULL;
	//}
	//if(total_parts != NULL) {
	//
	//delete total_parts;
	//total_parts = NULL;
	//}
	//
}

void
CustomerListUploadCreateRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *operationKey = "operation";
	node = json_object_get_member(pJsonObject, operationKey);
	if (node !=NULL) {
	

		if (isprimitive("UserListOperationType")) {
			jsonToValue(&operation, node, "UserListOperationType", "UserListOperationType");
		} else {
			
			UserListOperationType* obj = static_cast<UserListOperationType*> (&operation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *total_partsKey = "total_parts";
	node = json_object_get_member(pJsonObject, total_partsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&total_parts, node, "int", "");
		} else {
			
		}
	}
}

CustomerListUploadCreateRequest::CustomerListUploadCreateRequest(char* json)
{
	this->fromJson(json);
}

char*
CustomerListUploadCreateRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("UserListOperationType")) {
		UserListOperationType obj = getOperation();
		node = converttoJson(&obj, "UserListOperationType", "");
	}
	else {
		
		UserListOperationType obj = static_cast<UserListOperationType> (getOperation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *operationKey = "operation";
	json_object_set_member(pJsonObject, operationKey, node);
	if (isprimitive("int")) {
		int obj = getTotalParts();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *total_partsKey = "total_parts";
	json_object_set_member(pJsonObject, total_partsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

UserListOperationType
CustomerListUploadCreateRequest::getOperation()
{
	return operation;
}

void
CustomerListUploadCreateRequest::setOperation(UserListOperationType  operation)
{
	this->operation = operation;
}

int
CustomerListUploadCreateRequest::getTotalParts()
{
	return total_parts;
}

void
CustomerListUploadCreateRequest::setTotalParts(int  total_parts)
{
	this->total_parts = total_parts;
}


