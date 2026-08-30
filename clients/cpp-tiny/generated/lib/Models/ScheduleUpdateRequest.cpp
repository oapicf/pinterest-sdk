

#include "ScheduleUpdateRequest.h"

using namespace Tiny;

ScheduleUpdateRequest::ScheduleUpdateRequest()
{
	entity_id = std::string();
	entity_type = std::string();
	id = std::string();
	delta_value = ScheduleCommonDeltaValue();
	end_timestamp = int(0);
	name = std::string();
	schedule_action = ScheduleAction();
	schedule_status = ScheduleStatus();
	schedule_type = ScheduleType();
	start_timestamp = int(0);
}

ScheduleUpdateRequest::ScheduleUpdateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

ScheduleUpdateRequest::~ScheduleUpdateRequest()
{

}

void
ScheduleUpdateRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *entity_idKey = "entity_id";

    if(object.has_key(entity_idKey))
    {
        bourne::json value = object[entity_idKey];



        jsonToValue(&entity_id, value, "std::string");


    }

    const char *entity_typeKey = "entity_type";

    if(object.has_key(entity_typeKey))
    {
        bourne::json value = object[entity_typeKey];



        jsonToValue(&entity_type, value, "std::string");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *delta_valueKey = "delta_value";

    if(object.has_key(delta_valueKey))
    {
        bourne::json value = object[delta_valueKey];




        ScheduleCommonDeltaValue* obj = &delta_value;
		obj->fromJson(value.dump());

    }

    const char *end_timestampKey = "end_timestamp";

    if(object.has_key(end_timestampKey))
    {
        bourne::json value = object[end_timestampKey];



        jsonToValue(&end_timestamp, value, "int");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *schedule_actionKey = "schedule_action";

    if(object.has_key(schedule_actionKey))
    {
        bourne::json value = object[schedule_actionKey];




        ScheduleAction* obj = &schedule_action;
		obj->fromJson(value.dump());

    }

    const char *schedule_statusKey = "schedule_status";

    if(object.has_key(schedule_statusKey))
    {
        bourne::json value = object[schedule_statusKey];




        ScheduleStatus* obj = &schedule_status;
		obj->fromJson(value.dump());

    }

    const char *schedule_typeKey = "schedule_type";

    if(object.has_key(schedule_typeKey))
    {
        bourne::json value = object[schedule_typeKey];




        ScheduleType* obj = &schedule_type;
		obj->fromJson(value.dump());

    }

    const char *start_timestampKey = "start_timestamp";

    if(object.has_key(start_timestampKey))
    {
        bourne::json value = object[start_timestampKey];



        jsonToValue(&start_timestamp, value, "int");


    }


}

bourne::json
ScheduleUpdateRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["entity_id"] = getEntityId();






    object["entity_type"] = getEntityType();






    object["id"] = getId();







	object["delta_value"] = getDeltaValue().toJson();





    object["end_timestamp"] = getEndTimestamp();






    object["name"] = getName();







	object["schedule_action"] = getScheduleAction().toJson();






	object["schedule_status"] = getScheduleStatus().toJson();






	object["schedule_type"] = getScheduleType().toJson();





    object["start_timestamp"] = getStartTimestamp();



    return object;

}

std::string
ScheduleUpdateRequest::getEntityId()
{
	return entity_id;
}

void
ScheduleUpdateRequest::setEntityId(std::string entity_id)
{
	this->entity_id = entity_id;
}

std::string
ScheduleUpdateRequest::getEntityType()
{
	return entity_type;
}

void
ScheduleUpdateRequest::setEntityType(std::string entity_type)
{
	this->entity_type = entity_type;
}

std::string
ScheduleUpdateRequest::getId()
{
	return id;
}

void
ScheduleUpdateRequest::setId(std::string id)
{
	this->id = id;
}

ScheduleCommonDeltaValue
ScheduleUpdateRequest::getDeltaValue()
{
	return delta_value;
}

void
ScheduleUpdateRequest::setDeltaValue(ScheduleCommonDeltaValue delta_value)
{
	this->delta_value = delta_value;
}

int
ScheduleUpdateRequest::getEndTimestamp()
{
	return end_timestamp;
}

void
ScheduleUpdateRequest::setEndTimestamp(int end_timestamp)
{
	this->end_timestamp = end_timestamp;
}

std::string
ScheduleUpdateRequest::getName()
{
	return name;
}

void
ScheduleUpdateRequest::setName(std::string name)
{
	this->name = name;
}

ScheduleAction
ScheduleUpdateRequest::getScheduleAction()
{
	return schedule_action;
}

void
ScheduleUpdateRequest::setScheduleAction(ScheduleAction schedule_action)
{
	this->schedule_action = schedule_action;
}

ScheduleStatus
ScheduleUpdateRequest::getScheduleStatus()
{
	return schedule_status;
}

void
ScheduleUpdateRequest::setScheduleStatus(ScheduleStatus schedule_status)
{
	this->schedule_status = schedule_status;
}

ScheduleType
ScheduleUpdateRequest::getScheduleType()
{
	return schedule_type;
}

void
ScheduleUpdateRequest::setScheduleType(ScheduleType schedule_type)
{
	this->schedule_type = schedule_type;
}

int
ScheduleUpdateRequest::getStartTimestamp()
{
	return start_timestamp;
}

void
ScheduleUpdateRequest::setStartTimestamp(int start_timestamp)
{
	this->start_timestamp = start_timestamp;
}



