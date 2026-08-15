

#include "TemplateResponse_date_range_relative_date_range.h"

using namespace Tiny;

TemplateResponse_date_range_relative_date_range::TemplateResponse_date_range_relative_date_range()
{
	end_days_in_past = float(0);
	start_days_in_past = float(0);
	type = std::string();
}

TemplateResponse_date_range_relative_date_range::TemplateResponse_date_range_relative_date_range(std::string jsonString)
{
	this->fromJson(jsonString);
}

TemplateResponse_date_range_relative_date_range::~TemplateResponse_date_range_relative_date_range()
{

}

void
TemplateResponse_date_range_relative_date_range::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *end_days_in_pastKey = "end_days_in_past";

    if(object.has_key(end_days_in_pastKey))
    {
        bourne::json value = object[end_days_in_pastKey];



        jsonToValue(&end_days_in_past, value, "long");


    }

    const char *start_days_in_pastKey = "start_days_in_past";

    if(object.has_key(start_days_in_pastKey))
    {
        bourne::json value = object[start_days_in_pastKey];



        jsonToValue(&start_days_in_past, value, "long");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }


}

bourne::json
TemplateResponse_date_range_relative_date_range::toJson()
{
    bourne::json object = bourne::json::object();





    object["end_days_in_past"] = getEndDaysInPast();






    object["start_days_in_past"] = getStartDaysInPast();






    object["type"] = getType();



    return object;

}

long
TemplateResponse_date_range_relative_date_range::getEndDaysInPast()
{
	return end_days_in_past;
}

void
TemplateResponse_date_range_relative_date_range::setEndDaysInPast(long  end_days_in_past)
{
	this->end_days_in_past = end_days_in_past;
}

long
TemplateResponse_date_range_relative_date_range::getStartDaysInPast()
{
	return start_days_in_past;
}

void
TemplateResponse_date_range_relative_date_range::setStartDaysInPast(long  start_days_in_past)
{
	this->start_days_in_past = start_days_in_past;
}

std::string
TemplateResponse_date_range_relative_date_range::getType()
{
	return type;
}

void
TemplateResponse_date_range_relative_date_range::setType(std::string  type)
{
	this->type = type;
}



