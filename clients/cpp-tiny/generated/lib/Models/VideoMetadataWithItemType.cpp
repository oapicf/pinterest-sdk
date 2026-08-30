

#include "VideoMetadataWithItemType.h"

using namespace Tiny;

VideoMetadataWithItemType::VideoMetadataWithItemType()
{
	cover_image_url = std::string();
	duration = float(0);
	height = int(0);
	item_type = std::string();
	video_url = std::string();
	video_url_hls = std::string();
	width = int(0);
}

VideoMetadataWithItemType::VideoMetadataWithItemType(std::string jsonString)
{
	this->fromJson(jsonString);
}

VideoMetadataWithItemType::~VideoMetadataWithItemType()
{

}

void
VideoMetadataWithItemType::fromJson(std::string jsonObj)
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

    const char *item_typeKey = "item_type";

    if(object.has_key(item_typeKey))
    {
        bourne::json value = object[item_typeKey];



        jsonToValue(&item_type, value, "std::string");


    }

    const char *video_urlKey = "video_url";

    if(object.has_key(video_urlKey))
    {
        bourne::json value = object[video_urlKey];



        jsonToValue(&video_url, value, "std::string");


    }

    const char *video_url_hlsKey = "video_url_hls";

    if(object.has_key(video_url_hlsKey))
    {
        bourne::json value = object[video_url_hlsKey];



        jsonToValue(&video_url_hls, value, "std::string");


    }

    const char *widthKey = "width";

    if(object.has_key(widthKey))
    {
        bourne::json value = object[widthKey];



        jsonToValue(&width, value, "int");


    }


}

bourne::json
VideoMetadataWithItemType::toJson()
{
    bourne::json object = bourne::json::object();





    object["cover_image_url"] = getCoverImageUrl();






    object["duration"] = getDuration();






    object["height"] = getHeight();






    object["item_type"] = getItemType();






    object["video_url"] = getVideoUrl();






    object["video_url_hls"] = getVideoUrlHls();






    object["width"] = getWidth();



    return object;

}

std::string
VideoMetadataWithItemType::getCoverImageUrl()
{
	return cover_image_url;
}

void
VideoMetadataWithItemType::setCoverImageUrl(std::string cover_image_url)
{
	this->cover_image_url = cover_image_url;
}

long
VideoMetadataWithItemType::getDuration()
{
	return duration;
}

void
VideoMetadataWithItemType::setDuration(long duration)
{
	this->duration = duration;
}

int
VideoMetadataWithItemType::getHeight()
{
	return height;
}

void
VideoMetadataWithItemType::setHeight(int height)
{
	this->height = height;
}

std::string
VideoMetadataWithItemType::getItemType()
{
	return item_type;
}

void
VideoMetadataWithItemType::setItemType(std::string item_type)
{
	this->item_type = item_type;
}

std::string
VideoMetadataWithItemType::getVideoUrl()
{
	return video_url;
}

void
VideoMetadataWithItemType::setVideoUrl(std::string video_url)
{
	this->video_url = video_url;
}

std::string
VideoMetadataWithItemType::getVideoUrlHls()
{
	return video_url_hls;
}

void
VideoMetadataWithItemType::setVideoUrlHls(std::string video_url_hls)
{
	this->video_url_hls = video_url_hls;
}

int
VideoMetadataWithItemType::getWidth()
{
	return width;
}

void
VideoMetadataWithItemType::setWidth(int width)
{
	this->width = width;
}



