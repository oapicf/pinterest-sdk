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
	//id = std::string();
	//operation_type = std::string();
	//targeting_attributes = new TargetingSpec();
}

void
TargetingTemplateUpdateRequest::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(operation_type != NULL) {
	//
	//delete operation_type;
	//operation_type = NULL;
	//}
	//if(targeting_attributes != NULL) {
	//
	//delete targeting_attributes;
	//targeting_attributes = NULL;
	//}
	//
}

void
TargetingTemplateUpdateRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *operation_typeKey = "operation_type";
	node = json_object_get_member(pJsonObject, operation_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&operation_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *targeting_attributesKey = "targeting_attributes";
	node = json_object_get_member(pJsonObject, targeting_attributesKey);
	if (node !=NULL) {
	

		if (isprimitive("TargetingSpec")) {
			jsonToValue(&targeting_attributes, node, "TargetingSpec", "TargetingSpec");
		} else {
			
			TargetingSpec* obj = static_cast<TargetingSpec*> (&targeting_attributes);
			obj->fromJson(json_to_string(node, false));
			
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
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOperationType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *operation_typeKey = "operation_type";
	json_object_set_member(pJsonObject, operation_typeKey, node);
	if (isprimitive("TargetingSpec")) {
		TargetingSpec obj = getTargetingAttributes();
		node = converttoJson(&obj, "TargetingSpec", "");
	}
	else {
		
		TargetingSpec obj = static_cast<TargetingSpec> (getTargetingAttributes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *targeting_attributesKey = "targeting_attributes";
	json_object_set_member(pJsonObject, targeting_attributesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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

TargetingSpec
TargetingTemplateUpdateRequest::getTargetingAttributes()
{
	return targeting_attributes;
}

void
TargetingTemplateUpdateRequest::setTargetingAttributes(TargetingSpec  targeting_attributes)
{
	this->targeting_attributes = targeting_attributes;
}


