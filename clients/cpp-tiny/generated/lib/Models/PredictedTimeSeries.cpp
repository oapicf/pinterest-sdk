

#include "PredictedTimeSeries.h"

using namespace Tiny;

PredictedTimeSeries::PredictedTimeSeries()
{
	date = std::string();
}

PredictedTimeSeries::PredictedTimeSeries(std::string jsonString)
{
	this->fromJson(jsonString);
}

PredictedTimeSeries::~PredictedTimeSeries()
{

}

void
PredictedTimeSeries::fromJson(std::string jsonObj)
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
PredictedTimeSeries::toJson()
{
    bourne::json object = bourne::json::object();






	object["date"] = getDate().toJson();


    return object;

}

Date
PredictedTimeSeries::getDate()
{
	return date;
}

void
PredictedTimeSeries::setDate(Date  date)
{
	this->date = date;
}



