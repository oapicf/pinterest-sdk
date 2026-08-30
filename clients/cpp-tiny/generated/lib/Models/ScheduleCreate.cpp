

#include "ScheduleCreate.h"

using namespace Tiny;

ScheduleCreate::ScheduleCreate()
{
	delta_value = Schedule_delta_value();
	end_timestamp = int(0);
	entity_id = null;
	entity_type = null;
	name = std::string();
	schedule_action = null;
	schedule_status = null;
	schedule_type = null;
	start_timestamp = int(0);
}

ScheduleCreate::ScheduleCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

ScheduleCreate::~ScheduleCreate()
{

}

void
ScheduleCreate::fromJson(std::string jsonObj)
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
ScheduleCreate::toJson()
{
    bourne::json object = bourne::json::object();






	object["delta_value"] = getDeltaValue().toJson();





    object["end_timestamp"] = getEndTimestamp();






    object["entity_id"] = getEntityId();







	object["entity_type"] = getEntityType().toJson();





    object["name"] = getName();







	object["schedule_action"] = getScheduleAction().toJson();






	object["schedule_status"] = getScheduleStatus().toJson();






	object["schedule_type"] = getScheduleType().toJson();





    object["start_timestamp"] = getStartTimestamp();



    return object;

}

Schedule_delta_value
ScheduleCreate::getDeltaValue()
{
	return delta_value;
}

void
ScheduleCreate::setDeltaValue(Schedule_delta_value delta_value)
{
	this->delta_value = delta_value;
}

int
ScheduleCreate::getEndTimestamp()
{
	return end_timestamp;
}

void
ScheduleCreate::setEndTimestamp(int end_timestamp)
{
	this->end_timestamp = end_timestamp;
}

std::string
ScheduleCreate::getEntityId()
{
	return entity_id;
}

void
ScheduleCreate::setEntityId(std::string entity_id)
{
	this->entity_id = entity_id;
}

AdAccountEntityType
ScheduleCreate::getEntityType()
{
	return entity_type;
}

void
ScheduleCreate::setEntityType(AdAccountEntityType entity_type)
{
	this->entity_type = entity_type;
}

std::string
ScheduleCreate::getName()
{
	return name;
}

void
ScheduleCreate::setName(std::string name)
{
	this->name = name;
}

ScheduleAction
ScheduleCreate::getScheduleAction()
{
	return schedule_action;
}

void
ScheduleCreate::setScheduleAction(ScheduleAction schedule_action)
{
	this->schedule_action = schedule_action;
}

ScheduleStatus
ScheduleCreate::getScheduleStatus()
{
	return schedule_status;
}

void
ScheduleCreate::setScheduleStatus(ScheduleStatus schedule_status)
{
	this->schedule_status = schedule_status;
}

ScheduleType
ScheduleCreate::getScheduleType()
{
	return schedule_type;
}

void
ScheduleCreate::setScheduleType(ScheduleType schedule_type)
{
	this->schedule_type = schedule_type;
}

int
ScheduleCreate::getStartTimestamp()
{
	return start_timestamp;
}

void
ScheduleCreate::setStartTimestamp(int start_timestamp)
{
	this->start_timestamp = start_timestamp;
}



