

#include "TimeSeries.h"

using namespace Tiny;

TimeSeries::TimeSeries()
{
	date = std::string();
}

TimeSeries::TimeSeries(std::string jsonString)
{
	this->fromJson(jsonString);
}

TimeSeries::~TimeSeries()
{

}

void
TimeSeries::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dateKey = "date";

    if(object.has_key(dateKey))
    {
        bourne::json value = object[dateKey];




        Date* obj = &date;
		obj->fromJson(value.dump());

    }


}

bourne::json
TimeSeries::toJson()
{
    bourne::json object = bourne::json::object();






	object["date"] = getDate().toJson();


    return object;

}

Date
TimeSeries::getDate()
{
	return date;
}

void
TimeSeries::setDate(Date  date)
{
	this->date = date;
}



