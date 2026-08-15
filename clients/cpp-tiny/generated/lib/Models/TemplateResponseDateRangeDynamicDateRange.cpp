

#include "TemplateResponse_date_range_dynamic_date_range.h"

using namespace Tiny;

TemplateResponse_date_range_dynamic_date_range::TemplateResponse_date_range_dynamic_date_range()
{
	range = std::string();
	type = std::string();
}

TemplateResponse_date_range_dynamic_date_range::TemplateResponse_date_range_dynamic_date_range(std::string jsonString)
{
	this->fromJson(jsonString);
}

TemplateResponse_date_range_dynamic_date_range::~TemplateResponse_date_range_dynamic_date_range()
{

}

void
TemplateResponse_date_range_dynamic_date_range::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *rangeKey = "range";

    if(object.has_key(rangeKey))
    {
        bourne::json value = object[rangeKey];



        jsonToValue(&range, value, "std::string");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }


}

bourne::json
TemplateResponse_date_range_dynamic_date_range::toJson()
{
    bourne::json object = bourne::json::object();





    object["range"] = getRange();






    object["type"] = getType();



    return object;

}

std::string
TemplateResponse_date_range_dynamic_date_range::getRange()
{
	return range;
}

void
TemplateResponse_date_range_dynamic_date_range::setRange(std::string  range)
{
	this->range = range;
}

std::string
TemplateResponse_date_range_dynamic_date_range::getType()
{
	return type;
}

void
TemplateResponse_date_range_dynamic_date_range::setType(std::string  type)
{
	this->type = type;
}



