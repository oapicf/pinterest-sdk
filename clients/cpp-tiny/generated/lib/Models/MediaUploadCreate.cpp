

#include "MediaUploadCreate.h"

using namespace Tiny;

MediaUploadCreate::MediaUploadCreate()
{
	media_type = null;
}

MediaUploadCreate::MediaUploadCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

MediaUploadCreate::~MediaUploadCreate()
{

}

void
MediaUploadCreate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *media_typeKey = "media_type";

    if(object.has_key(media_typeKey))
    {
        bourne::json value = object[media_typeKey];




        MediaUploadType* obj = &media_type;
		obj->fromJson(value.dump());

    }


}

bourne::json
MediaUploadCreate::toJson()
{
    bourne::json object = bourne::json::object();






	object["media_type"] = getMediaType().toJson();


    return object;

}

MediaUploadType
MediaUploadCreate::getMediaType()
{
	return media_type;
}

void
MediaUploadCreate::setMediaType(MediaUploadType media_type)
{
	this->media_type = media_type;
}



