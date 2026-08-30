

#include "ImageDetails.h"

using namespace Tiny;

ImageDetails::ImageDetails()
{
	height = int(0);
	url = std::string();
	width = int(0);
}

ImageDetails::ImageDetails(std::string jsonString)
{
	this->fromJson(jsonString);
}

ImageDetails::~ImageDetails()
{

}

void
ImageDetails::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *heightKey = "height";

    if(object.has_key(heightKey))
    {
        bourne::json value = object[heightKey];



        jsonToValue(&height, value, "int");


    }

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];



        jsonToValue(&url, value, "std::string");


    }

    const char *widthKey = "width";

    if(object.has_key(widthKey))
    {
        bourne::json value = object[widthKey];



        jsonToValue(&width, value, "int");


    }


}

bourne::json
ImageDetails::toJson()
{
    bourne::json object = bourne::json::object();





    object["height"] = getHeight();






    object["url"] = getUrl();






    object["width"] = getWidth();



    return object;

}

int
ImageDetails::getHeight()
{
	return height;
}

void
ImageDetails::setHeight(int height)
{
	this->height = height;
}

std::string
ImageDetails::getUrl()
{
	return url;
}

void
ImageDetails::setUrl(std::string url)
{
	this->url = url;
}

int
ImageDetails::getWidth()
{
	return width;
}

void
ImageDetails::setWidth(int width)
{
	this->width = width;
}



