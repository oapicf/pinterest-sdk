#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ScheduleCreateRequestAllOf1.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ScheduleCreateRequestAllOf1::ScheduleCreateRequestAllOf1()
{
	//__init();
}

ScheduleCreateRequestAllOf1::~ScheduleCreateRequestAllOf1()
{
	//__cleanup();
}

void
ScheduleCreateRequestAllOf1::__init()
{
	//entity_id = std::string();
	//entity_type = std::string();
}

void
ScheduleCreateRequestAllOf1::__cleanup()
{
	//if(entity_id != NULL) {
	//
	//delete entity_id;
	//entity_id = NULL;
	//}
	//if(entity_type != NULL) {
	//
	//delete entity_type;
	//entity_type = NULL;
	//}
	//
}

void
ScheduleCreateRequestAllOf1::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *entity_idKey = "entity_id";
	node = json_object_get_member(pJsonObject, entity_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&entity_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *entity_typeKey = "entity_type";
	node = json_object_get_member(pJsonObject, entity_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&entity_type, node, "std::string", "");
		} else {
			
		}
	}
}

ScheduleCreateRequestAllOf1::ScheduleCreateRequestAllOf1(char* json)
{
	this->fromJson(json);
}

char*
ScheduleCreateRequestAllOf1::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getEntityId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *entity_idKey = "entity_id";
	json_object_set_member(pJsonObject, entity_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEntityType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *entity_typeKey = "entity_type";
	json_object_set_member(pJsonObject, entity_typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ScheduleCreateRequestAllOf1::getEntityId()
{
	return entity_id;
}

void
ScheduleCreateRequestAllOf1::setEntityId(std::string  entity_id)
{
	this->entity_id = entity_id;
}

std::string
ScheduleCreateRequestAllOf1::getEntityType()
{
	return entity_type;
}

void
ScheduleCreateRequestAllOf1::setEntityType(std::string  entity_type)
{
	this->entity_type = entity_type;
}


