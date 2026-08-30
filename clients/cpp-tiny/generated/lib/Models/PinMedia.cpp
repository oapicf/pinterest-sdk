

#include "PinMedia.h"

using namespace Tiny;

PinMedia::PinMedia()
{
	images = ImageSize();
	media_type = std::string();
	cover_image_url = std::string();
	duration = float(0);
	height = int(0);
	video_url = std::string();
	video_url_hls = std::string();
	width = int(0);
	items = std::list<PinMediaMetadata>();
}

PinMedia::PinMedia(std::string jsonString)
{
	this->fromJson(jsonString);
}

PinMedia::~PinMedia()
{

}

void
PinMedia::fromJson(std::string jsonObj)
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

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<PinMediaMetadata> items_list;
        PinMediaMetadata element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
PinMedia::toJson()
{
    bourne::json object = bourne::json::object();






	object["images"] = getImages().toJson();





    object["media_type"] = getMediaType();






    object["cover_image_url"] = getCoverImageUrl();






    object["duration"] = getDuration();






    object["height"] = getHeight();






    object["video_url"] = getVideoUrl();






    object["video_url_hls"] = getVideoUrlHls();






    object["width"] = getWidth();





    std::list<PinMediaMetadata> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        PinMediaMetadata obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

ImageSize
PinMedia::getImages()
{
	return images;
}

void
PinMedia::setImages(ImageSize images)
{
	this->images = images;
}

std::string
PinMedia::getMediaType()
{
	return media_type;
}

void
PinMedia::setMediaType(std::string media_type)
{
	this->media_type = media_type;
}

std::string
PinMedia::getCoverImageUrl()
{
	return cover_image_url;
}

void
PinMedia::setCoverImageUrl(std::string cover_image_url)
{
	this->cover_image_url = cover_image_url;
}

long
PinMedia::getDuration()
{
	return duration;
}

void
PinMedia::setDuration(long duration)
{
	this->duration = duration;
}

int
PinMedia::getHeight()
{
	return height;
}

void
PinMedia::setHeight(int height)
{
	this->height = height;
}

std::string
PinMedia::getVideoUrl()
{
	return video_url;
}

void
PinMedia::setVideoUrl(std::string video_url)
{
	this->video_url = video_url;
}

std::string
PinMedia::getVideoUrlHls()
{
	return video_url_hls;
}

void
PinMedia::setVideoUrlHls(std::string video_url_hls)
{
	this->video_url_hls = video_url_hls;
}

int
PinMedia::getWidth()
{
	return width;
}

void
PinMedia::setWidth(int width)
{
	this->width = width;
}

std::list<PinMediaMetadata>
PinMedia::getItems()
{
	return items;
}

void
PinMedia::setItems(std::list<PinMediaMetadata> items)
{
	this->items = items;
}



