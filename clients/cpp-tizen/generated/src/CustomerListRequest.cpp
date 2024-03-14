#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CustomerListRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CustomerListRequest::CustomerListRequest()
{
	//__init();
}

CustomerListRequest::~CustomerListRequest()
{
	//__cleanup();
}

void
CustomerListRequest::__init()
{
	//name = std::string();
	//records = std::string();
	//list_type = std::string();
	//exceptions = null;
}

void
CustomerListRequest::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(records != NULL) {
	//
	//delete records;
	//records = NULL;
	//}
	//if(list_type != NULL) {
	//
	//delete list_type;
	//list_type = NULL;
	//}
	//if(exceptions != NULL) {
	//
	//delete exceptions;
	//exceptions = NULL;
	//}
	//
}

void
CustomerListRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *recordsKey = "records";
	node = json_object_get_member(pJsonObject, recordsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&records, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *list_typeKey = "list_type";
	node = json_object_get_member(pJsonObject, list_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("UserListType")) {
			jsonToValue(&list_type, node, "UserListType", "UserListType");
		} else {
			
			UserListType* obj = static_cast<UserListType*> (&list_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *exceptionsKey = "exceptions";
	node = json_object_get_member(pJsonObject, exceptionsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&exceptions, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&exceptions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CustomerListRequest::CustomerListRequest(char* json)
{
	this->fromJson(json);
}

char*
CustomerListRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRecords();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *recordsKey = "records";
	json_object_set_member(pJsonObject, recordsKey, node);
	if (isprimitive("UserListType")) {
		UserListType obj = getListType();
		node = converttoJson(&obj, "UserListType", "");
	}
	else {
		
		UserListType obj = static_cast<UserListType> (getListType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *list_typeKey = "list_type";
	json_object_set_member(pJsonObject, list_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getExceptions();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getExceptions());
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
CustomerListRequest::getName()
{
	return name;
}

void
CustomerListRequest::setName(std::string  name)
{
	this->name = name;
}

std::string
CustomerListRequest::getRecords()
{
	return records;
}

void
CustomerListRequest::setRecords(std::string  records)
{
	this->records = records;
}

UserListType
CustomerListRequest::getListType()
{
	return list_type;
}

void
CustomerListRequest::setListType(UserListType  list_type)
{
	this->list_type = list_type;
}

std::string
CustomerListRequest::getExceptions()
{
	return exceptions;
}

void
CustomerListRequest::setExceptions(std::string  exceptions)
{
	this->exceptions = exceptions;
}


