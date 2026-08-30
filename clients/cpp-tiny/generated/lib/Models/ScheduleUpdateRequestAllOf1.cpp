

#include "ScheduleUpdateRequestAllOf1.h"

using namespace Tiny;

ScheduleUpdateRequestAllOf1::ScheduleUpdateRequestAllOf1()
{
	entity_id = std::string();
	entity_type = std::string();
	id = std::string();
}

ScheduleUpdateRequestAllOf1::ScheduleUpdateRequestAllOf1(std::string jsonString)
{
	this->fromJson(jsonString);
}

ScheduleUpdateRequestAllOf1::~ScheduleUpdateRequestAllOf1()
{

}

void
ScheduleUpdateRequestAllOf1::fromJson(std::string jsonObj)
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


}

bourne::json
ScheduleUpdateRequestAllOf1::toJson()
{
    bourne::json object = bourne::json::object();





    object["entity_id"] = getEntityId();






    object["entity_type"] = getEntityType();






    object["id"] = getId();



    return object;

}

std::string
ScheduleUpdateRequestAllOf1::getEntityId()
{
	return entity_id;
}

void
ScheduleUpdateRequestAllOf1::setEntityId(std::string entity_id)
{
	this->entity_id = entity_id;
}

std::string
ScheduleUpdateRequestAllOf1::getEntityType()
{
	return entity_type;
}

void
ScheduleUpdateRequestAllOf1::setEntityType(std::string entity_type)
{
	this->entity_type = entity_type;
}

std::string
ScheduleUpdateRequestAllOf1::getId()
{
	return id;
}

void
ScheduleUpdateRequestAllOf1::setId(std::string id)
{
	this->id = id;
}



