

#include "Media.h"

using namespace Tiny;

Media::Media()
{
	media_id = std::string();
	media_type = null;
	status = null;
}

Media::Media(std::string jsonString)
{
	this->fromJson(jsonString);
}

Media::~Media()
{

}

void
Media::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *media_idKey = "media_id";

    if(object.has_key(media_idKey))
    {
        bourne::json value = object[media_idKey];



        jsonToValue(&media_id, value, "std::string");


    }

    const char *media_typeKey = "media_type";

    if(object.has_key(media_typeKey))
    {
        bourne::json value = object[media_typeKey];




        MediaUploadType* obj = &media_type;
		obj->fromJson(value.dump());

    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        MediaUploadStatus* obj = &status;
		obj->fromJson(value.dump());

    }


}

bourne::json
Media::toJson()
{
    bourne::json object = bourne::json::object();





    object["media_id"] = getMediaId();







	object["media_type"] = getMediaType().toJson();






	object["status"] = getStatus().toJson();


    return object;

}

std::string
Media::getMediaId()
{
	return media_id;
}

void
Media::setMediaId(std::string  media_id)
{
	this->media_id = media_id;
}

MediaUploadType
Media::getMediaType()
{
	return media_type;
}

void
Media::setMediaType(MediaUploadType  media_type)
{
	this->media_type = media_type;
}

MediaUploadStatus
Media::getStatus()
{
	return status;
}

void
Media::setStatus(MediaUploadStatus  status)
{
	this->status = status;
}



