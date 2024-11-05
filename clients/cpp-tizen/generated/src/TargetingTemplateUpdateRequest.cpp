#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TargetingTemplateUpdateRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TargetingTemplateUpdateRequest::TargetingTemplateUpdateRequest()
{
	//__init();
}

TargetingTemplateUpdateRequest::~TargetingTemplateUpdateRequest()
{
	//__cleanup();
}

void
TargetingTemplateUpdateRequest::__init()
{
	//operation_type = std::string();
	//id = std::string();
}

void
TargetingTemplateUpdateRequest::__cleanup()
{
	//if(operation_type != NULL) {
	//
	//delete operation_type;
	//operation_type = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//
}

void
TargetingTemplateUpdateRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *operation_typeKey = "operation_type";
	node = json_object_get_member(pJsonObject, operation_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&operation_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
}

TargetingTemplateUpdateRequest::TargetingTemplateUpdateRequest(char* json)
{
	this->fromJson(json);
}

char*
TargetingTemplateUpdateRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getOperationType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *operation_typeKey = "operation_type";
	json_object_set_member(pJsonObject, operation_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
TargetingTemplateUpdateRequest::getOperationType()
{
	return operation_type;
}

void
TargetingTemplateUpdateRequest::setOperationType(std::string  operation_type)
{
	this->operation_type = operation_type;
}

std::string
TargetingTemplateUpdateRequest::getId()
{
	return id;
}

void
TargetingTemplateUpdateRequest::setId(std::string  id)
{
	this->id = id;
}


