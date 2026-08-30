#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ScheduleCreateRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ScheduleCreateRequest::ScheduleCreateRequest()
{
	//__init();
}

ScheduleCreateRequest::~ScheduleCreateRequest()
{
	//__cleanup();
}

void
ScheduleCreateRequest::__init()
{
	//entity_id = std::string();
	//entity_type = std::string();
	//delta_value = new ScheduleCommonDeltaValue();
	//end_timestamp = int(0);
	//name = std::string();
	//schedule_action = new ScheduleAction();
	//schedule_status = new ScheduleStatus();
	//schedule_type = new ScheduleType();
	//start_timestamp = int(0);
}

void
ScheduleCreateRequest::__cleanup()
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
	//if(delta_value != NULL) {
	//
	//delete delta_value;
	//delta_value = NULL;
	//}
	//if(end_timestamp != NULL) {
	//
	//delete end_timestamp;
	//end_timestamp = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(schedule_action != NULL) {
	//
	//delete schedule_action;
	//schedule_action = NULL;
	//}
	//if(schedule_status != NULL) {
	//
	//delete schedule_status;
	//schedule_status = NULL;
	//}
	//if(schedule_type != NULL) {
	//
	//delete schedule_type;
	//schedule_type = NULL;
	//}
	//if(start_timestamp != NULL) {
	//
	//delete start_timestamp;
	//start_timestamp = NULL;
	//}
	//
}

void
ScheduleCreateRequest::fromJson(char* jsonStr)
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
	const gchar *delta_valueKey = "delta_value";
	node = json_object_get_member(pJsonObject, delta_valueKey);
	if (node !=NULL) {
	

		if (isprimitive("ScheduleCommonDeltaValue")) {
			jsonToValue(&delta_value, node, "ScheduleCommonDeltaValue", "ScheduleCommonDeltaValue");
		} else {
			
			ScheduleCommonDeltaValue* obj = static_cast<ScheduleCommonDeltaValue*> (&delta_value);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *end_timestampKey = "end_timestamp";
	node = json_object_get_member(pJsonObject, end_timestampKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&end_timestamp, node, "int", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *schedule_actionKey = "schedule_action";
	node = json_object_get_member(pJsonObject, schedule_actionKey);
	if (node !=NULL) {
	

		if (isprimitive("ScheduleAction")) {
			jsonToValue(&schedule_action, node, "ScheduleAction", "ScheduleAction");
		} else {
			
			ScheduleAction* obj = static_cast<ScheduleAction*> (&schedule_action);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *schedule_statusKey = "schedule_status";
	node = json_object_get_member(pJsonObject, schedule_statusKey);
	if (node !=NULL) {
	

		if (isprimitive("ScheduleStatus")) {
			jsonToValue(&schedule_status, node, "ScheduleStatus", "ScheduleStatus");
		} else {
			
			ScheduleStatus* obj = static_cast<ScheduleStatus*> (&schedule_status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *schedule_typeKey = "schedule_type";
	node = json_object_get_member(pJsonObject, schedule_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("ScheduleType")) {
			jsonToValue(&schedule_type, node, "ScheduleType", "ScheduleType");
		} else {
			
			ScheduleType* obj = static_cast<ScheduleType*> (&schedule_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *start_timestampKey = "start_timestamp";
	node = json_object_get_member(pJsonObject, start_timestampKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&start_timestamp, node, "int", "");
		} else {
			
		}
	}
}

ScheduleCreateRequest::ScheduleCreateRequest(char* json)
{
	this->fromJson(json);
}

char*
ScheduleCreateRequest::toJson()
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
	if (isprimitive("ScheduleCommonDeltaValue")) {
		ScheduleCommonDeltaValue obj = getDeltaValue();
		node = converttoJson(&obj, "ScheduleCommonDeltaValue", "");
	}
	else {
		
		ScheduleCommonDeltaValue obj = static_cast<ScheduleCommonDeltaValue> (getDeltaValue());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *delta_valueKey = "delta_value";
	json_object_set_member(pJsonObject, delta_valueKey, node);
	if (isprimitive("int")) {
		int obj = getEndTimestamp();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *end_timestampKey = "end_timestamp";
	json_object_set_member(pJsonObject, end_timestampKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("ScheduleAction")) {
		ScheduleAction obj = getScheduleAction();
		node = converttoJson(&obj, "ScheduleAction", "");
	}
	else {
		
		ScheduleAction obj = static_cast<ScheduleAction> (getScheduleAction());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *schedule_actionKey = "schedule_action";
	json_object_set_member(pJsonObject, schedule_actionKey, node);
	if (isprimitive("ScheduleStatus")) {
		ScheduleStatus obj = getScheduleStatus();
		node = converttoJson(&obj, "ScheduleStatus", "");
	}
	else {
		
		ScheduleStatus obj = static_cast<ScheduleStatus> (getScheduleStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *schedule_statusKey = "schedule_status";
	json_object_set_member(pJsonObject, schedule_statusKey, node);
	if (isprimitive("ScheduleType")) {
		ScheduleType obj = getScheduleType();
		node = converttoJson(&obj, "ScheduleType", "");
	}
	else {
		
		ScheduleType obj = static_cast<ScheduleType> (getScheduleType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *schedule_typeKey = "schedule_type";
	json_object_set_member(pJsonObject, schedule_typeKey, node);
	if (isprimitive("int")) {
		int obj = getStartTimestamp();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *start_timestampKey = "start_timestamp";
	json_object_set_member(pJsonObject, start_timestampKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ScheduleCreateRequest::getEntityId()
{
	return entity_id;
}

void
ScheduleCreateRequest::setEntityId(std::string  entity_id)
{
	this->entity_id = entity_id;
}

std::string
ScheduleCreateRequest::getEntityType()
{
	return entity_type;
}

void
ScheduleCreateRequest::setEntityType(std::string  entity_type)
{
	this->entity_type = entity_type;
}

ScheduleCommonDeltaValue
ScheduleCreateRequest::getDeltaValue()
{
	return delta_value;
}

void
ScheduleCreateRequest::setDeltaValue(ScheduleCommonDeltaValue  delta_value)
{
	this->delta_value = delta_value;
}

int
ScheduleCreateRequest::getEndTimestamp()
{
	return end_timestamp;
}

void
ScheduleCreateRequest::setEndTimestamp(int  end_timestamp)
{
	this->end_timestamp = end_timestamp;
}

std::string
ScheduleCreateRequest::getName()
{
	return name;
}

void
ScheduleCreateRequest::setName(std::string  name)
{
	this->name = name;
}

ScheduleAction
ScheduleCreateRequest::getScheduleAction()
{
	return schedule_action;
}

void
ScheduleCreateRequest::setScheduleAction(ScheduleAction  schedule_action)
{
	this->schedule_action = schedule_action;
}

ScheduleStatus
ScheduleCreateRequest::getScheduleStatus()
{
	return schedule_status;
}

void
ScheduleCreateRequest::setScheduleStatus(ScheduleStatus  schedule_status)
{
	this->schedule_status = schedule_status;
}

ScheduleType
ScheduleCreateRequest::getScheduleType()
{
	return schedule_type;
}

void
ScheduleCreateRequest::setScheduleType(ScheduleType  schedule_type)
{
	this->schedule_type = schedule_type;
}

int
ScheduleCreateRequest::getStartTimestamp()
{
	return start_timestamp;
}

void
ScheduleCreateRequest::setStartTimestamp(int  start_timestamp)
{
	this->start_timestamp = start_timestamp;
}


