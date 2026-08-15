

#include "TemplateResponse_date_range.h"

using namespace Tiny;

TemplateResponse_date_range::TemplateResponse_date_range()
{
	absolute_date_range = TemplateResponse_date_range_absolute_date_range();
	dynamic_date_range = TemplateResponse_date_range_dynamic_date_range();
	relative_date_range = TemplateResponse_date_range_relative_date_range();
}

TemplateResponse_date_range::TemplateResponse_date_range(std::string jsonString)
{
	this->fromJson(jsonString);
}

TemplateResponse_date_range::~TemplateResponse_date_range()
{

}

void
TemplateResponse_date_range::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *absolute_date_rangeKey = "absolute_date_range";

    if(object.has_key(absolute_date_rangeKey))
    {
        bourne::json value = object[absolute_date_rangeKey];




        TemplateResponse_date_range_absolute_date_range* obj = &absolute_date_range;
		obj->fromJson(value.dump());

    }

    const char *dynamic_date_rangeKey = "dynamic_date_range";

    if(object.has_key(dynamic_date_rangeKey))
    {
        bourne::json value = object[dynamic_date_rangeKey];




        TemplateResponse_date_range_dynamic_date_range* obj = &dynamic_date_range;
		obj->fromJson(value.dump());

    }

    const char *relative_date_rangeKey = "relative_date_range";

    if(object.has_key(relative_date_rangeKey))
    {
        bourne::json value = object[relative_date_rangeKey];




        TemplateResponse_date_range_relative_date_range* obj = &relative_date_range;
		obj->fromJson(value.dump());

    }


}

bourne::json
TemplateResponse_date_range::toJson()
{
    bourne::json object = bourne::json::object();






	object["absolute_date_range"] = getAbsoluteDateRange().toJson();






	object["dynamic_date_range"] = getDynamicDateRange().toJson();






	object["relative_date_range"] = getRelativeDateRange().toJson();


    return object;

}

TemplateResponse_date_range_absolute_date_range
TemplateResponse_date_range::getAbsoluteDateRange()
{
	return absolute_date_range;
}

void
TemplateResponse_date_range::setAbsoluteDateRange(TemplateResponse_date_range_absolute_date_range  absolute_date_range)
{
	this->absolute_date_range = absolute_date_range;
}

TemplateResponse_date_range_dynamic_date_range
TemplateResponse_date_range::getDynamicDateRange()
{
	return dynamic_date_range;
}

void
TemplateResponse_date_range::setDynamicDateRange(TemplateResponse_date_range_dynamic_date_range  dynamic_date_range)
{
	this->dynamic_date_range = dynamic_date_range;
}

TemplateResponse_date_range_relative_date_range
TemplateResponse_date_range::getRelativeDateRange()
{
	return relative_date_range;
}

void
TemplateResponse_date_range::setRelativeDateRange(TemplateResponse_date_range_relative_date_range  relative_date_range)
{
	this->relative_date_range = relative_date_range;
}



