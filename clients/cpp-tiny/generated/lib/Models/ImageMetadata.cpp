

#include "ImageMetadata.h"

using namespace Tiny;

ImageMetadata::ImageMetadata()
{
	description = std::string();
	images = ImageSize();
	item_type = std::string();
	link = std::string();
	title = std::string();
}

ImageMetadata::ImageMetadata(std::string jsonString)
{
	this->fromJson(jsonString);
}

ImageMetadata::~ImageMetadata()
{

}

void
ImageMetadata::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *imagesKey = "images";

    if(object.has_key(imagesKey))
    {
        bourne::json value = object[imagesKey];




        ImageSize* obj = &images;
		obj->fromJson(value.dump());

    }

    const char *item_typeKey = "item_type";

    if(object.has_key(item_typeKey))
    {
        bourne::json value = object[item_typeKey];



        jsonToValue(&item_type, value, "std::string");


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
ImageMetadata::toJson()
{
    bourne::json object = bourne::json::object();





    object["description"] = getDescription();







	object["images"] = getImages().toJson();





    object["item_type"] = getItemType();






    object["link"] = getLink();






    object["title"] = getTitle();



    return object;

}

std::string
ImageMetadata::getDescription()
{
	return description;
}

void
ImageMetadata::setDescription(std::string  description)
{
	this->description = description;
}

ImageSize
ImageMetadata::getImages()
{
	return images;
}

void
ImageMetadata::setImages(ImageSize  images)
{
	this->images = images;
}

std::string
ImageMetadata::getItemType()
{
	return item_type;
}

void
ImageMetadata::setItemType(std::string  item_type)
{
	this->item_type = item_type;
}

std::string
ImageMetadata::getLink()
{
	return link;
}

void
ImageMetadata::setLink(std::string  link)
{
	this->link = link;
}

std::string
ImageMetadata::getTitle()
{
	return title;
}

void
ImageMetadata::setTitle(std::string  title)
{
	this->title = title;
}



