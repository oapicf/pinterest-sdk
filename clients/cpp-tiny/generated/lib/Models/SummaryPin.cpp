

#include "SummaryPin.h"

using namespace Tiny;

SummaryPin::SummaryPin()
{
	alt_text = std::string();
	description = std::string();
	id = std::string();
	link = std::string();
	media = null;
	title = std::string();
}

SummaryPin::SummaryPin(std::string jsonString)
{
	this->fromJson(jsonString);
}

SummaryPin::~SummaryPin()
{

}

void
SummaryPin::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *alt_textKey = "alt_text";

    if(object.has_key(alt_textKey))
    {
        bourne::json value = object[alt_textKey];



        jsonToValue(&alt_text, value, "std::string");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *linkKey = "link";

    if(object.has_key(linkKey))
    {
        bourne::json value = object[linkKey];



        jsonToValue(&link, value, "std::string");


    }

    const char *mediaKey = "media";

    if(object.has_key(mediaKey))
    {
        bourne::json value = object[mediaKey];




        PinMedia* obj = &media;
		obj->fromJson(value.dump());

    }

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];



        jsonToValue(&title, value, "std::string");


    }


}

bourne::json
SummaryPin::toJson()
{
    bourne::json object = bourne::json::object();





    object["alt_text"] = getAltText();






    object["description"] = getDescription();






    object["id"] = getId();






    object["link"] = getLink();







	object["media"] = getMedia().toJson();





    object["title"] = getTitle();



    return object;

}

std::string
SummaryPin::getAltText()
{
	return alt_text;
}

void
SummaryPin::setAltText(std::string  alt_text)
{
	this->alt_text = alt_text;
}

std::string
SummaryPin::getDescription()
{
	return description;
}

void
SummaryPin::setDescription(std::string  description)
{
	this->description = description;
}

std::string
SummaryPin::getId()
{
	return id;
}

void
SummaryPin::setId(std::string  id)
{
	this->id = id;
}

std::string
SummaryPin::getLink()
{
	return link;
}

void
SummaryPin::setLink(std::string  link)
{
	this->link = link;
}

PinMedia
SummaryPin::getMedia()
{
	return media;
}

void
SummaryPin::setMedia(PinMedia  media)
{
	this->media = media;
}

std::string
SummaryPin::getTitle()
{
	return title;
}

void
SummaryPin::setTitle(std::string  title)
{
	this->title = title;
}



