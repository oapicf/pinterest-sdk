

#include "AdPreviewCreateFromImage.h"

using namespace Tiny;

AdPreviewCreateFromImage::AdPreviewCreateFromImage()
{
	image_url = std::string();
	title = std::string();
}

AdPreviewCreateFromImage::AdPreviewCreateFromImage(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdPreviewCreateFromImage::~AdPreviewCreateFromImage()
{

}

void
AdPreviewCreateFromImage::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *image_urlKey = "image_url";

    if(object.has_key(image_urlKey))
    {
        bourne::json value = object[image_urlKey];



        jsonToValue(&image_url, value, "std::string");


    }

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];



        jsonToValue(&title, value, "std::string");


    }


}

bourne::json
AdPreviewCreateFromImage::toJson()
{
    bourne::json object = bourne::json::object();





    object["image_url"] = getImageUrl();






    object["title"] = getTitle();



    return object;

}

std::string
AdPreviewCreateFromImage::getImageUrl()
{
	return image_url;
}

void
AdPreviewCreateFromImage::setImageUrl(std::string  image_url)
{
	this->image_url = image_url;
}

std::string
AdPreviewCreateFromImage::getTitle()
{
	return title;
}

void
AdPreviewCreateFromImage::setTitle(std::string  title)
{
	this->title = title;
}



