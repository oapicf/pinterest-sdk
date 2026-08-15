

#include "PinMediaSourceImagesURLItem.h"

using namespace Tiny;

PinMediaSourceImagesURLItem::PinMediaSourceImagesURLItem()
{
	description = std::string();
	link = std::string();
	title = std::string();
	url = std::string();
}

PinMediaSourceImagesURLItem::PinMediaSourceImagesURLItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

PinMediaSourceImagesURLItem::~PinMediaSourceImagesURLItem()
{

}

void
PinMediaSourceImagesURLItem::fromJson(std::string jsonObj)
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

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];



        jsonToValue(&url, value, "std::string");


    }


}

bourne::json
PinMediaSourceImagesURLItem::toJson()
{
    bourne::json object = bourne::json::object();





    object["description"] = getDescription();






    object["link"] = getLink();






    object["title"] = getTitle();






    object["url"] = getUrl();



    return object;

}

std::string
PinMediaSourceImagesURLItem::getDescription()
{
	return description;
}

void
PinMediaSourceImagesURLItem::setDescription(std::string  description)
{
	this->description = description;
}

std::string
PinMediaSourceImagesURLItem::getLink()
{
	return link;
}

void
PinMediaSourceImagesURLItem::setLink(std::string  link)
{
	this->link = link;
}

std::string
PinMediaSourceImagesURLItem::getTitle()
{
	return title;
}

void
PinMediaSourceImagesURLItem::setTitle(std::string  title)
{
	this->title = title;
}

std::string
PinMediaSourceImagesURLItem::getUrl()
{
	return url;
}

void
PinMediaSourceImagesURLItem::setUrl(std::string  url)
{
	this->url = url;
}



