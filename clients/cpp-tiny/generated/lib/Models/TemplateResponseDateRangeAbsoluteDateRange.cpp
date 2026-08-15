

#include "TemplateResponse_date_range_absolute_date_range.h"

using namespace Tiny;

TemplateResponse_date_range_absolute_date_range::TemplateResponse_date_range_absolute_date_range()
{
	end_date = float(0);
	start_date = float(0);
	type = std::string();
}

TemplateResponse_date_range_absolute_date_range::TemplateResponse_date_range_absolute_date_range(std::string jsonString)
{
	this->fromJson(jsonString);
}

TemplateResponse_date_range_absolute_date_range::~TemplateResponse_date_range_absolute_date_range()
{

}

void
TemplateResponse_date_range_absolute_date_range::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *end_dateKey = "end_date";

    if(object.has_key(end_dateKey))
    {
        bourne::json value = object[end_dateKey];



        jsonToValue(&end_date, value, "long");


    }

    const char *start_dateKey = "start_date";

    if(object.has_key(start_dateKey))
    {
        bourne::json value = object[start_dateKey];



        jsonToValue(&start_date, value, "long");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }


}

bourne::json
TemplateResponse_date_range_absolute_date_range::toJson()
{
    bourne::json object = bourne::json::object();





    object["end_date"] = getEndDate();






    object["start_date"] = getStartDate();






    object["type"] = getType();



    return object;

}

long
TemplateResponse_date_range_absolute_date_range::getEndDate()
{
	return end_date;
}

void
TemplateResponse_date_range_absolute_date_range::setEndDate(long  end_date)
{
	this->end_date = end_date;
}

long
TemplateResponse_date_range_absolute_date_range::getStartDate()
{
	return start_date;
}

void
TemplateResponse_date_range_absolute_date_range::setStartDate(long  start_date)
{
	this->start_date = start_date;
}

std::string
TemplateResponse_date_range_absolute_date_range::getType()
{
	return type;
}

void
TemplateResponse_date_range_absolute_date_range::setType(std::string  type)
{
	this->type = type;
}



