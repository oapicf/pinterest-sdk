

#include "PinMediaWithVideo.h"

using namespace Tiny;

PinMediaWithVideo::PinMediaWithVideo()
{
	cover_image_url = std::string();
	duration = float(0);
	height = int(0);
	images = ImageSize();
	media_type = std::string();
	video_url = std::string();
	width = int(0);
}

PinMediaWithVideo::PinMediaWithVideo(std::string jsonString)
{
	this->fromJson(jsonString);
}

PinMediaWithVideo::~PinMediaWithVideo()
{

}

void
PinMediaWithVideo::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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
PinMediaWithVideo::toJson()
{
    bourne::json object = bourne::json::object();





    object["cover_image_url"] = getCoverImageUrl();






    object["duration"] = getDuration();






    object["height"] = getHeight();







	object["images"] = getImages().toJson();





    object["media_type"] = getMediaType();






    object["video_url"] = getVideoUrl();






    object["width"] = getWidth();



    return object;

}

std::string
PinMediaWithVideo::getCoverImageUrl()
{
	return cover_image_url;
}

void
PinMediaWithVideo::setCoverImageUrl(std::string  cover_image_url)
{
	this->cover_image_url = cover_image_url;
}

long
PinMediaWithVideo::getDuration()
{
	return duration;
}

void
PinMediaWithVideo::setDuration(long  duration)
{
	this->duration = duration;
}

int
PinMediaWithVideo::getHeight()
{
	return height;
}

void
PinMediaWithVideo::setHeight(int  height)
{
	this->height = height;
}

ImageSize
PinMediaWithVideo::getImages()
{
	return images;
}

void
PinMediaWithVideo::setImages(ImageSize  images)
{
	this->images = images;
}

std::string
PinMediaWithVideo::getMediaType()
{
	return media_type;
}

void
PinMediaWithVideo::setMediaType(std::string  media_type)
{
	this->media_type = media_type;
}

std::string
PinMediaWithVideo::getVideoUrl()
{
	return video_url;
}

void
PinMediaWithVideo::setVideoUrl(std::string  video_url)
{
	this->video_url = video_url;
}

int
PinMediaWithVideo::getWidth()
{
	return width;
}

void
PinMediaWithVideo::setWidth(int  width)
{
	this->width = width;
}



