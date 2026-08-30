

#include "ScheduleCreateRequestAllOf1.h"

using namespace Tiny;

ScheduleCreateRequestAllOf1::ScheduleCreateRequestAllOf1()
{
	entity_id = std::string();
	entity_type = std::string();
}

ScheduleCreateRequestAllOf1::ScheduleCreateRequestAllOf1(std::string jsonString)
{
	this->fromJson(jsonString);
}

ScheduleCreateRequestAllOf1::~ScheduleCreateRequestAllOf1()
{

}

void
ScheduleCreateRequestAllOf1::fromJson(std::string jsonObj)
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


}

bourne::json
ScheduleCreateRequestAllOf1::toJson()
{
    bourne::json object = bourne::json::object();





    object["entity_id"] = getEntityId();






    object["entity_type"] = getEntityType();



    return object;

}

std::string
ScheduleCreateRequestAllOf1::getEntityId()
{
	return entity_id;
}

void
ScheduleCreateRequestAllOf1::setEntityId(std::string entity_id)
{
	this->entity_id = entity_id;
}

std::string
ScheduleCreateRequestAllOf1::getEntityType()
{
	return entity_type;
}

void
ScheduleCreateRequestAllOf1::setEntityType(std::string entity_type)
{
	this->entity_type = entity_type;
}



