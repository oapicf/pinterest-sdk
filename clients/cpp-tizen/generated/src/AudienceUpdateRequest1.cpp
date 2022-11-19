#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AudienceUpdateRequest_1.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AudienceUpdateRequest_1::AudienceUpdateRequest_1()
{
	//__init();
}

AudienceUpdateRequest_1::~AudienceUpdateRequest_1()
{
	//__cleanup();
}

void
AudienceUpdateRequest_1::__init()
{
	//description = std::string();
	//operation_type = new AudienceUpdateOperationType();
}

void
AudienceUpdateRequest_1::__cleanup()
{
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(operation_type != NULL) {
	//
	//delete operation_type;
	//operation_type = NULL;
	//}
	//
}

void
AudienceUpdateRequest_1::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
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
}

AudienceUpdateRequest_1::AudienceUpdateRequest_1(char* json)
{
	this->fromJson(json);
}

char*
AudienceUpdateRequest_1::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AudienceUpdateRequest_1::getDescription()
{
	return description;
}

void
AudienceUpdateRequest_1::setDescription(std::string  description)
{
	this->description = description;
}

AudienceUpdateOperationType
AudienceUpdateRequest_1::getOperationType()
{
	return operation_type;
}

void
AudienceUpdateRequest_1::setOperationType(AudienceUpdateOperationType  operation_type)
{
	this->operation_type = operation_type;
}


