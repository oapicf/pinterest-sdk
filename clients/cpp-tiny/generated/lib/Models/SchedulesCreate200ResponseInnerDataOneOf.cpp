

#include "Schedules_create_200_response_inner_data_oneOf.h"

using namespace Tiny;

Schedules_create_200_response_inner_data_oneOf::Schedules_create_200_response_inner_data_oneOf()
{
	id = std::string();
	schedule_id = std::string();
	exceptions = Pinterest.Lib.Error();
}

Schedules_create_200_response_inner_data_oneOf::Schedules_create_200_response_inner_data_oneOf(std::string jsonString)
{
	this->fromJson(jsonString);
}

Schedules_create_200_response_inner_data_oneOf::~Schedules_create_200_response_inner_data_oneOf()
{

}

void
Schedules_create_200_response_inner_data_oneOf::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *schedule_idKey = "schedule_id";

    if(object.has_key(schedule_idKey))
    {
        bourne::json value = object[schedule_idKey];



        jsonToValue(&schedule_id, value, "std::string");


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
Schedules_create_200_response_inner_data_oneOf::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["schedule_id"] = getScheduleId();







	object["exceptions"] = getExceptions().toJson();


    return object;

}

std::string
Schedules_create_200_response_inner_data_oneOf::getId()
{
	return id;
}

void
Schedules_create_200_response_inner_data_oneOf::setId(std::string id)
{
	this->id = id;
}

std::string
Schedules_create_200_response_inner_data_oneOf::getScheduleId()
{
	return schedule_id;
}

void
Schedules_create_200_response_inner_data_oneOf::setScheduleId(std::string schedule_id)
{
	this->schedule_id = schedule_id;
}

Pinterest.Lib.Error
Schedules_create_200_response_inner_data_oneOf::getExceptions()
{
	return exceptions;
}

void
Schedules_create_200_response_inner_data_oneOf::setExceptions(Pinterest.Lib.Error exceptions)
{
	this->exceptions = exceptions;
}



