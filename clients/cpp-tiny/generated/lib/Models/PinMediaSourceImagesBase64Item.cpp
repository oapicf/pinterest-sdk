

#include "PinMediaSourceImagesBase64Item.h"

using namespace Tiny;

PinMediaSourceImagesBase64Item::PinMediaSourceImagesBase64Item()
{
	content_type = ContentType();
	data = std::string();
	description = std::string();
	link = std::string();
	title = std::string();
}

PinMediaSourceImagesBase64Item::PinMediaSourceImagesBase64Item(std::string jsonString)
{
	this->fromJson(jsonString);
}

PinMediaSourceImagesBase64Item::~PinMediaSourceImagesBase64Item()
{

}

void
PinMediaSourceImagesBase64Item::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *content_typeKey = "content_type";

    if(object.has_key(content_typeKey))
    {
        bourne::json value = object[content_typeKey];




        ContentType* obj = &content_type;
		obj->fromJson(value.dump());

    }

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];



        jsonToValue(&data, value, "std::string");


    }

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
PinMediaSourceImagesBase64Item::toJson()
{
    bourne::json object = bourne::json::object();






	object["content_type"] = getContentType().toJson();





    object["data"] = getData();






    object["description"] = getDescription();






    object["link"] = getLink();






    object["title"] = getTitle();



    return object;

}

ContentType
PinMediaSourceImagesBase64Item::getContentType()
{
	return content_type;
}

void
PinMediaSourceImagesBase64Item::setContentType(ContentType content_type)
{
	this->content_type = content_type;
}

std::string
PinMediaSourceImagesBase64Item::getData()
{
	return data;
}

void
PinMediaSourceImagesBase64Item::setData(std::string data)
{
	this->data = data;
}

std::string
PinMediaSourceImagesBase64Item::getDescription()
{
	return description;
}

void
PinMediaSourceImagesBase64Item::setDescription(std::string description)
{
	this->description = description;
}

std::string
PinMediaSourceImagesBase64Item::getLink()
{
	return link;
}

void
PinMediaSourceImagesBase64Item::setLink(std::string link)
{
	this->link = link;
}

std::string
PinMediaSourceImagesBase64Item::getTitle()
{
	return title;
}

void
PinMediaSourceImagesBase64Item::setTitle(std::string title)
{
	this->title = title;
}



