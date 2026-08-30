

#include "PinMediaWithImage.h"

using namespace Tiny;

PinMediaWithImage::PinMediaWithImage()
{
	images = ImageSize();
	media_type = std::string();
}

PinMediaWithImage::PinMediaWithImage(std::string jsonString)
{
	this->fromJson(jsonString);
}

PinMediaWithImage::~PinMediaWithImage()
{

}

void
PinMediaWithImage::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *imagesKey = "images";

    if(object.has_key(imagesKey))
    {
        bourne::json value = object[imagesKey];




        ImageSize* obj = &images;
		obj->fromJson(value.dump());

    }

    const char *media_typeKey = "media_type";

    if(object.has_key(media_typeKey))
    {
        bourne::json value = object[media_typeKey];



        jsonToValue(&media_type, value, "std::string");


    }


}

bourne::json
PinMediaWithImage::toJson()
{
    bourne::json object = bourne::json::object();






	object["images"] = getImages().toJson();





    object["media_type"] = getMediaType();



    return object;

}

ImageSize
PinMediaWithImage::getImages()
{
	return images;
}

void
PinMediaWithImage::setImages(ImageSize images)
{
	this->images = images;
}

std::string
PinMediaWithImage::getMediaType()
{
	return media_type;
}

void
PinMediaWithImage::setMediaType(std::string media_type)
{
	this->media_type = media_type;
}



