

#include "Schedules_create_200_response_inner.h"

using namespace Tiny;

Schedules_create_200_response_inner::Schedules_create_200_response_inner()
{
	data = Schedules_create_200_response_inner_data();
}

Schedules_create_200_response_inner::Schedules_create_200_response_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

Schedules_create_200_response_inner::~Schedules_create_200_response_inner()
{

}

void
Schedules_create_200_response_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];




        Schedules_create_200_response_inner_data* obj = &data;
		obj->fromJson(value.dump());

    }


}

bourne::json
Schedules_create_200_response_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["data"] = getData().toJson();


    return object;

}

Schedules_create_200_response_inner_data
Schedules_create_200_response_inner::getData()
{
	return data;
}

void
Schedules_create_200_response_inner::setData(Schedules_create_200_response_inner_data data)
{
	this->data = data;
}



