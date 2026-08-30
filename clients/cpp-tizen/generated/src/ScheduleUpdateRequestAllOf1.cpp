#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ScheduleUpdateRequestAllOf1.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ScheduleUpdateRequestAllOf1::ScheduleUpdateRequestAllOf1()
{
	//__init();
}

ScheduleUpdateRequestAllOf1::~ScheduleUpdateRequestAllOf1()
{
	//__cleanup();
}

void
ScheduleUpdateRequestAllOf1::__init()
{
	//entity_id = std::string();
	//entity_type = std::string();
	//id = std::string();
}

void
ScheduleUpdateRequestAllOf1::__cleanup()
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
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//
}

void
ScheduleUpdateRequestAllOf1::fromJson(char* jsonStr)
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
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
}

ScheduleUpdateRequestAllOf1::ScheduleUpdateRequestAllOf1(char* json)
{
	this->fromJson(json);
}

char*
ScheduleUpdateRequestAllOf1::toJson()
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
ScheduleUpdateRequestAllOf1::getEntityId()
{
	return entity_id;
}

void
ScheduleUpdateRequestAllOf1::setEntityId(std::string  entity_id)
{
	this->entity_id = entity_id;
}

std::string
ScheduleUpdateRequestAllOf1::getEntityType()
{
	return entity_type;
}

void
ScheduleUpdateRequestAllOf1::setEntityType(std::string  entity_type)
{
	this->entity_type = entity_type;
}

std::string
ScheduleUpdateRequestAllOf1::getId()
{
	return id;
}

void
ScheduleUpdateRequestAllOf1::setId(std::string  id)
{
	this->id = id;
}


