#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AudienceCreateRequest_1.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AudienceCreateRequest_1::AudienceCreateRequest_1()
{
	//__init();
}

AudienceCreateRequest_1::~AudienceCreateRequest_1()
{
	//__cleanup();
}

void
AudienceCreateRequest_1::__init()
{
	//description = std::string();
	//audience_type = std::string();
}

void
AudienceCreateRequest_1::__cleanup()
{
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(audience_type != NULL) {
	//
	//delete audience_type;
	//audience_type = NULL;
	//}
	//
}

void
AudienceCreateRequest_1::fromJson(char* jsonStr)
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
	const gchar *audience_typeKey = "audience_type";
	node = json_object_get_member(pJsonObject, audience_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("AudienceType")) {
			jsonToValue(&audience_type, node, "AudienceType", "AudienceType");
		} else {
			
		}
	}
}

AudienceCreateRequest_1::AudienceCreateRequest_1(char* json)
{
	this->fromJson(json);
}

char*
AudienceCreateRequest_1::toJson()
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
	if (isprimitive("AudienceType")) {
		AudienceType obj = getAudienceType();
		node = converttoJson(&obj, "AudienceType", "");
	}
	else {
		
	}
	const gchar *audience_typeKey = "audience_type";
	json_object_set_member(pJsonObject, audience_typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AudienceCreateRequest_1::getDescription()
{
	return description;
}

void
AudienceCreateRequest_1::setDescription(std::string  description)
{
	this->description = description;
}

AudienceType
AudienceCreateRequest_1::getAudienceType()
{
	return audience_type;
}

void
AudienceCreateRequest_1::setAudienceType(AudienceType  audience_type)
{
	this->audience_type = audience_type;
}


