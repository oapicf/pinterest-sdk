

#include "CarouselSlot.h"

using namespace Tiny;

CarouselSlot::CarouselSlot()
{
	description = std::string();
	link = std::string();
	title = std::string();
}

CarouselSlot::CarouselSlot(std::string jsonString)
{
	this->fromJson(jsonString);
}

CarouselSlot::~CarouselSlot()
{

}

void
CarouselSlot::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *linkKey = "link";

    if(object.has_key(linkKey))
    {
        bourne::json value = object[linkKey];



        jsonToValue(&link, value, "std::string");


    }

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];



        jsonToValue(&title, value, "std::string");


    }


}

bourne::json
CarouselSlot::toJson()
{
    bourne::json object = bourne::json::object();





    object["description"] = getDescription();






    object["link"] = getLink();






    object["title"] = getTitle();



    return object;

}

std::string
CarouselSlot::getDescription()
{
	return description;
}

void
CarouselSlot::setDescription(std::string description)
{
	this->description = description;
}

std::string
CarouselSlot::getLink()
{
	return link;
}

void
CarouselSlot::setLink(std::string link)
{
	this->link = link;
}

std::string
CarouselSlot::getTitle()
{
	return title;
}

void
CarouselSlot::setTitle(std::string title)
{
	this->title = title;
}



