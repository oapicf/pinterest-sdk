

#include "DeliveryMetricsResponseItemsItems.h"

using namespace Tiny;

DeliveryMetricsResponseItemsItems::DeliveryMetricsResponseItemsItems()
{
	category = std::string();
	definition = std::string();
	display_name = std::string();
	name = std::string();
}

DeliveryMetricsResponseItemsItems::DeliveryMetricsResponseItemsItems(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeliveryMetricsResponseItemsItems::~DeliveryMetricsResponseItemsItems()
{

}

void
DeliveryMetricsResponseItemsItems::fromJson(std::string jsonObj)
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
DeliveryMetricsResponseItemsItems::toJson()
{
    bourne::json object = bourne::json::object();





    object["category"] = getCategory();






    object["definition"] = getDefinition();






    object["display_name"] = getDisplayName();






    object["name"] = getName();



    return object;

}

std::string
DeliveryMetricsResponseItemsItems::getCategory()
{
	return category;
}

void
DeliveryMetricsResponseItemsItems::setCategory(std::string category)
{
	this->category = category;
}

std::string
DeliveryMetricsResponseItemsItems::getDefinition()
{
	return definition;
}

void
DeliveryMetricsResponseItemsItems::setDefinition(std::string definition)
{
	this->definition = definition;
}

std::string
DeliveryMetricsResponseItemsItems::getDisplayName()
{
	return display_name;
}

void
DeliveryMetricsResponseItemsItems::setDisplayName(std::string display_name)
{
	this->display_name = display_name;
}

std::string
DeliveryMetricsResponseItemsItems::getName()
{
	return name;
}

void
DeliveryMetricsResponseItemsItems::setName(std::string name)
{
	this->name = name;
}



