

#include "Schedules_create_200_response_inner_data.h"

using namespace Tiny;

Schedules_create_200_response_inner_data::Schedules_create_200_response_inner_data()
{
	delta_value = Schedule_delta_value();
	end_timestamp = int(0);
	entity_id = null;
	entity_type = null;
	name = std::string();
	schedule_action = null;
	schedule_id = std::string();
	schedule_status = null;
	schedule_type = null;
	start_timestamp = int(0);
	id = std::string();
	exceptions = Pinterest.Lib.Error();
}

Schedules_create_200_response_inner_data::Schedules_create_200_response_inner_data(std::string jsonString)
{
	this->fromJson(jsonString);
}

Schedules_create_200_response_inner_data::~Schedules_create_200_response_inner_data()
{

}

void
Schedules_create_200_response_inner_data::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *delta_valueKey = "delta_value";

    if(object.has_key(delta_valueKey))
    {
        bourne::json value = object[delta_valueKey];




        Schedule_delta_value* obj = &delta_value;
		obj->fromJson(value.dump());

    }

    const char *end_timestampKey = "end_timestamp";

    if(object.has_key(end_timestampKey))
    {
        bourne::json value = object[end_timestampKey];



        jsonToValue(&end_timestamp, value, "int");


    }

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




        AdAccountEntityType* obj = &entity_type;
		obj->fromJson(value.dump());

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

    const char *schedule_idKey = "schedule_id";

    if(object.has_key(schedule_idKey))
    {
        bourne::json value = object[schedule_idKey];



        jsonToValue(&schedule_id, value, "std::string");


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

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *exceptionsKey = "exceptions";

    if(object.has_key(exceptionsKey))
    {
        bourne::json value = object[exceptionsKey];




        Pinterest.Lib.Error* obj = &exceptions;
		obj->fromJson(value.dump());

    }


}

bourne::json
Schedules_create_200_response_inner_data::toJson()
{
    bourne::json object = bourne::json::object();






	object["delta_value"] = getDeltaValue().toJson();





    object["end_timestamp"] = getEndTimestamp();






    object["entity_id"] = getEntityId();







	object["entity_type"] = getEntityType().toJson();





    object["name"] = getName();







	object["schedule_action"] = getScheduleAction().toJson();





    object["schedule_id"] = getScheduleId();







	object["schedule_status"] = getScheduleStatus().toJson();






	object["schedule_type"] = getScheduleType().toJson();





    object["start_timestamp"] = getStartTimestamp();






    object["id"] = getId();







	object["exceptions"] = getExceptions().toJson();


    return object;

}

Schedule_delta_value
Schedules_create_200_response_inner_data::getDeltaValue()
{
	return delta_value;
}

void
Schedules_create_200_response_inner_data::setDeltaValue(Schedule_delta_value delta_value)
{
	this->delta_value = delta_value;
}

int
Schedules_create_200_response_inner_data::getEndTimestamp()
{
	return end_timestamp;
}

void
Schedules_create_200_response_inner_data::setEndTimestamp(int end_timestamp)
{
	this->end_timestamp = end_timestamp;
}

std::string
Schedules_create_200_response_inner_data::getEntityId()
{
	return entity_id;
}

void
Schedules_create_200_response_inner_data::setEntityId(std::string entity_id)
{
	this->entity_id = entity_id;
}

AdAccountEntityType
Schedules_create_200_response_inner_data::getEntityType()
{
	return entity_type;
}

void
Schedules_create_200_response_inner_data::setEntityType(AdAccountEntityType entity_type)
{
	this->entity_type = entity_type;
}

std::string
Schedules_create_200_response_inner_data::getName()
{
	return name;
}

void
Schedules_create_200_response_inner_data::setName(std::string name)
{
	this->name = name;
}

ScheduleAction
Schedules_create_200_response_inner_data::getScheduleAction()
{
	return schedule_action;
}

void
Schedules_create_200_response_inner_data::setScheduleAction(ScheduleAction schedule_action)
{
	this->schedule_action = schedule_action;
}

std::string
Schedules_create_200_response_inner_data::getScheduleId()
{
	return schedule_id;
}

void
Schedules_create_200_response_inner_data::setScheduleId(std::string schedule_id)
{
	this->schedule_id = schedule_id;
}

ScheduleStatus
Schedules_create_200_response_inner_data::getScheduleStatus()
{
	return schedule_status;
}

void
Schedules_create_200_response_inner_data::setScheduleStatus(ScheduleStatus schedule_status)
{
	this->schedule_status = schedule_status;
}

ScheduleType
Schedules_create_200_response_inner_data::getScheduleType()
{
	return schedule_type;
}

void
Schedules_create_200_response_inner_data::setScheduleType(ScheduleType schedule_type)
{
	this->schedule_type = schedule_type;
}

int
Schedules_create_200_response_inner_data::getStartTimestamp()
{
	return start_timestamp;
}

void
Schedules_create_200_response_inner_data::setStartTimestamp(int start_timestamp)
{
	this->start_timestamp = start_timestamp;
}

std::string
Schedules_create_200_response_inner_data::getId()
{
	return id;
}

void
Schedules_create_200_response_inner_data::setId(std::string id)
{
	this->id = id;
}

Pinterest.Lib.Error
Schedules_create_200_response_inner_data::getExceptions()
{
	return exceptions;
}

void
Schedules_create_200_response_inner_data::setExceptions(Pinterest.Lib.Error exceptions)
{
	this->exceptions = exceptions;
}



