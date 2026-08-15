

#include "PinMediaSourceVideoID.h"

using namespace Tiny;

PinMediaSourceVideoID::PinMediaSourceVideoID()
{
	cover_image_content_type = null;
	cover_image_data = std::string();
	cover_image_key_frame_time = int(0);
	cover_image_url = std::string();
	is_standard = bool(false);
	media_id = std::string();
	source_type = std::string();
}

PinMediaSourceVideoID::PinMediaSourceVideoID(std::string jsonString)
{
	this->fromJson(jsonString);
}

PinMediaSourceVideoID::~PinMediaSourceVideoID()
{

}

void
PinMediaSourceVideoID::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cover_image_content_typeKey = "cover_image_content_type";

    if(object.has_key(cover_image_content_typeKey))
    {
        bourne::json value = object[cover_image_content_typeKey];




        ContentType* obj = &cover_image_content_type;
		obj->fromJson(value.dump());

    }

    const char *cover_image_dataKey = "cover_image_data";

    if(object.has_key(cover_image_dataKey))
    {
        bourne::json value = object[cover_image_dataKey];



        jsonToValue(&cover_image_data, value, "std::string");


    }

    const char *cover_image_key_frame_timeKey = "cover_image_key_frame_time";

    if(object.has_key(cover_image_key_frame_timeKey))
    {
        bourne::json value = object[cover_image_key_frame_timeKey];



        jsonToValue(&cover_image_key_frame_time, value, "int");


    }

    const char *cover_image_urlKey = "cover_image_url";

    if(object.has_key(cover_image_urlKey))
    {
        bourne::json value = object[cover_image_urlKey];



        jsonToValue(&cover_image_url, value, "std::string");


    }

    const char *is_standardKey = "is_standard";

    if(object.has_key(is_standardKey))
    {
        bourne::json value = object[is_standardKey];



        jsonToValue(&is_standard, value, "bool");


    }

    const char *media_idKey = "media_id";

    if(object.has_key(media_idKey))
    {
        bourne::json value = object[media_idKey];



        jsonToValue(&media_id, value, "std::string");


    }

    const char *source_typeKey = "source_type";

    if(object.has_key(source_typeKey))
    {
        bourne::json value = object[source_typeKey];



        jsonToValue(&source_type, value, "std::string");


    }


}

bourne::json
PinMediaSourceVideoID::toJson()
{
    bourne::json object = bourne::json::object();






	object["cover_image_content_type"] = getCoverImageContentType().toJson();





    object["cover_image_data"] = getCoverImageData();






    object["cover_image_key_frame_time"] = getCoverImageKeyFrameTime();






    object["cover_image_url"] = getCoverImageUrl();






    object["is_standard"] = isIsStandard();






    object["media_id"] = getMediaId();






    object["source_type"] = getSourceType();



    return object;

}

ContentType
PinMediaSourceVideoID::getCoverImageContentType()
{
	return cover_image_content_type;
}

void
PinMediaSourceVideoID::setCoverImageContentType(ContentType  cover_image_content_type)
{
	this->cover_image_content_type = cover_image_content_type;
}

std::string
PinMediaSourceVideoID::getCoverImageData()
{
	return cover_image_data;
}

void
PinMediaSourceVideoID::setCoverImageData(std::string  cover_image_data)
{
	this->cover_image_data = cover_image_data;
}

int
PinMediaSourceVideoID::getCoverImageKeyFrameTime()
{
	return cover_image_key_frame_time;
}

void
PinMediaSourceVideoID::setCoverImageKeyFrameTime(int  cover_image_key_frame_time)
{
	this->cover_image_key_frame_time = cover_image_key_frame_time;
}

std::string
PinMediaSourceVideoID::getCoverImageUrl()
{
	return cover_image_url;
}

void
PinMediaSourceVideoID::setCoverImageUrl(std::string  cover_image_url)
{
	this->cover_image_url = cover_image_url;
}

bool
PinMediaSourceVideoID::isIsStandard()
{
	return is_standard;
}

void
PinMediaSourceVideoID::setIsStandard(bool  is_standard)
{
	this->is_standard = is_standard;
}

std::string
PinMediaSourceVideoID::getMediaId()
{
	return media_id;
}

void
PinMediaSourceVideoID::setMediaId(std::string  media_id)
{
	this->media_id = media_id;
}

std::string
PinMediaSourceVideoID::getSourceType()
{
	return source_type;
}

void
PinMediaSourceVideoID::setSourceType(std::string  source_type)
{
	this->source_type = source_type;
}



