

#include "PinMediaMetadata.h"

using namespace Tiny;

PinMediaMetadata::PinMediaMetadata()
{
	description = std::string();
	images = ImageSize();
	item_type = std::string();
	link = std::string();
	title = std::string();
	cover_image_url = std::string();
	duration = float(0);
	height = int(0);
	video_url = std::string();
	width = int(0);
}

PinMediaMetadata::PinMediaMetadata(std::string jsonString)
{
	this->fromJson(jsonString);
}

PinMediaMetadata::~PinMediaMetadata()
{

}

void
PinMediaMetadata::fromJson(std::string jsonObj)
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

    const char *cover_image_urlKey = "cover_image_url";

    if(object.has_key(cover_image_urlKey))
    {
        bourne::json value = object[cover_image_urlKey];



        jsonToValue(&cover_image_url, value, "std::string");


    }

    const char *durationKey = "duration";

    if(object.has_key(durationKey))
    {
        bourne::json value = object[durationKey];



        jsonToValue(&duration, value, "long");


    }

    const char *heightKey = "height";

    if(object.has_key(heightKey))
    {
        bourne::json value = object[heightKey];



        jsonToValue(&height, value, "int");


    }

    const char *video_urlKey = "video_url";

    if(object.has_key(video_urlKey))
    {
        bourne::json value = object[video_urlKey];



        jsonToValue(&video_url, value, "std::string");


    }

    const char *widthKey = "width";

    if(object.has_key(widthKey))
    {
        bourne::json value = object[widthKey];



        jsonToValue(&width, value, "int");


    }


}

bourne::json
PinMediaMetadata::toJson()
{
    bourne::json object = bourne::json::object();





    object["description"] = getDescription();







	object["images"] = getImages().toJson();





    object["item_type"] = getItemType();






    object["link"] = getLink();






    object["title"] = getTitle();






    object["cover_image_url"] = getCoverImageUrl();






    object["duration"] = getDuration();






    object["height"] = getHeight();






    object["video_url"] = getVideoUrl();






    object["width"] = getWidth();



    return object;

}

std::string
PinMediaMetadata::getDescription()
{
	return description;
}

void
PinMediaMetadata::setDescription(std::string  description)
{
	this->description = description;
}

ImageSize
PinMediaMetadata::getImages()
{
	return images;
}

void
PinMediaMetadata::setImages(ImageSize  images)
{
	this->images = images;
}

std::string
PinMediaMetadata::getItemType()
{
	return item_type;
}

void
PinMediaMetadata::setItemType(std::string  item_type)
{
	this->item_type = item_type;
}

std::string
PinMediaMetadata::getLink()
{
	return link;
}

void
PinMediaMetadata::setLink(std::string  link)
{
	this->link = link;
}

std::string
PinMediaMetadata::getTitle()
{
	return title;
}

void
PinMediaMetadata::setTitle(std::string  title)
{
	this->title = title;
}

std::string
PinMediaMetadata::getCoverImageUrl()
{
	return cover_image_url;
}

void
PinMediaMetadata::setCoverImageUrl(std::string  cover_image_url)
{
	this->cover_image_url = cover_image_url;
}

long
PinMediaMetadata::getDuration()
{
	return duration;
}

void
PinMediaMetadata::setDuration(long  duration)
{
	this->duration = duration;
}

int
PinMediaMetadata::getHeight()
{
	return height;
}

void
PinMediaMetadata::setHeight(int  height)
{
	this->height = height;
}

std::string
PinMediaMetadata::getVideoUrl()
{
	return video_url;
}

void
PinMediaMetadata::setVideoUrl(std::string  video_url)
{
	this->video_url = video_url;
}

int
PinMediaMetadata::getWidth()
{
	return width;
}

void
PinMediaMetadata::setWidth(int  width)
{
	this->width = width;
}



