#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TargetingTemplateUpdateRequestReadOrUpdate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TargetingTemplateUpdateRequestReadOrUpdate::TargetingTemplateUpdateRequestReadOrUpdate()
{
	//__init();
}

TargetingTemplateUpdateRequestReadOrUpdate::~TargetingTemplateUpdateRequestReadOrUpdate()
{
	//__cleanup();
}

void
TargetingTemplateUpdateRequestReadOrUpdate::__init()
{
	//id = std::string();
	//operation_type = new AudienceUpdateOperationType();
	//targeting_attributes = null;
}

void
TargetingTemplateUpdateRequestReadOrUpdate::__cleanup()
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
TargetingTemplateUpdateRequestReadOrUpdate::fromJson(char* jsonStr)
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
	

		if (isprimitive("AudienceUpdateOperationType")) {
			jsonToValue(&operation_type, node, "AudienceUpdateOperationType", "AudienceUpdateOperationType");
		} else {
			
			AudienceUpdateOperationType* obj = static_cast<AudienceUpdateOperationType*> (&operation_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *targeting_attributesKey = "targeting_attributes";
	node = json_object_get_member(pJsonObject, targeting_attributesKey);
	if (node !=NULL) {
	

		if (isprimitive("TargetingSpecOptimal")) {
			jsonToValue(&targeting_attributes, node, "TargetingSpecOptimal", "TargetingSpecOptimal");
		} else {
			
			TargetingSpecOptimal* obj = static_cast<TargetingSpecOptimal*> (&targeting_attributes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

TargetingTemplateUpdateRequestReadOrUpdate::TargetingTemplateUpdateRequestReadOrUpdate(char* json)
{
	this->fromJson(json);
}

char*
TargetingTemplateUpdateRequestReadOrUpdate::toJson()
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
	if (isprimitive("AudienceUpdateOperationType")) {
		AudienceUpdateOperationType obj = getOperationType();
		node = converttoJson(&obj, "AudienceUpdateOperationType", "");
	}
	else {
		
		AudienceUpdateOperationType obj = static_cast<AudienceUpdateOperationType> (getOperationType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *operation_typeKey = "operation_type";
	json_object_set_member(pJsonObject, operation_typeKey, node);
	if (isprimitive("TargetingSpecOptimal")) {
		TargetingSpecOptimal obj = getTargetingAttributes();
		node = converttoJson(&obj, "TargetingSpecOptimal", "");
	}
	else {
		
		TargetingSpecOptimal obj = static_cast<TargetingSpecOptimal> (getTargetingAttributes());
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
TargetingTemplateUpdateRequestReadOrUpdate::getId()
{
	return id;
}

void
TargetingTemplateUpdateRequestReadOrUpdate::setId(std::string  id)
{
	this->id = id;
}

AudienceUpdateOperationType
TargetingTemplateUpdateRequestReadOrUpdate::getOperationType()
{
	return operation_type;
}

void
TargetingTemplateUpdateRequestReadOrUpdate::setOperationType(AudienceUpdateOperationType  operation_type)
{
	this->operation_type = operation_type;
}

TargetingSpecOptimal
TargetingTemplateUpdateRequestReadOrUpdate::getTargetingAttributes()
{
	return targeting_attributes;
}

void
TargetingTemplateUpdateRequestReadOrUpdate::setTargetingAttributes(TargetingSpecOptimal  targeting_attributes)
{
	this->targeting_attributes = targeting_attributes;
}


