

#include "DeliveryMetricsResponse_items_inner.h"

using namespace Tiny;

DeliveryMetricsResponse_items_inner::DeliveryMetricsResponse_items_inner()
{
	category = std::string();
	definition = std::string();
	display_name = std::string();
	name = std::string();
}

DeliveryMetricsResponse_items_inner::DeliveryMetricsResponse_items_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeliveryMetricsResponse_items_inner::~DeliveryMetricsResponse_items_inner()
{

}

void
DeliveryMetricsResponse_items_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *categoryKey = "category";

    if(object.has_key(categoryKey))
    {
        bourne::json value = object[categoryKey];



        jsonToValue(&category, value, "std::string");


    }

    const char *definitionKey = "definition";

    if(object.has_key(definitionKey))
    {
        bourne::json value = object[definitionKey];



        jsonToValue(&definition, value, "std::string");


    }

    const char *display_nameKey = "display_name";

    if(object.has_key(display_nameKey))
    {
        bourne::json value = object[display_nameKey];



        jsonToValue(&display_name, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }


}

bourne::json
DeliveryMetricsResponse_items_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["category"] = getCategory();






    object["definition"] = getDefinition();






    object["display_name"] = getDisplayName();






    object["name"] = getName();



    return object;

}

std::string
DeliveryMetricsResponse_items_inner::getCategory()
{
	return category;
}

void
DeliveryMetricsResponse_items_inner::setCategory(std::string  category)
{
	this->category = category;
}

std::string
DeliveryMetricsResponse_items_inner::getDefinition()
{
	return definition;
}

void
DeliveryMetricsResponse_items_inner::setDefinition(std::string  definition)
{
	this->definition = definition;
}

std::string
DeliveryMetricsResponse_items_inner::getDisplayName()
{
	return display_name;
}

void
DeliveryMetricsResponse_items_inner::setDisplayName(std::string  display_name)
{
	this->display_name = display_name;
}

std::string
DeliveryMetricsResponse_items_inner::getName()
{
	return name;
}

void
DeliveryMetricsResponse_items_inner::setName(std::string  name)
{
	this->name = name;
}



