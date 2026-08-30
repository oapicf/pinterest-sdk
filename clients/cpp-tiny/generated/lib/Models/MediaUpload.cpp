

#include "MediaUpload.h"

using namespace Tiny;

MediaUpload::MediaUpload()
{
	media_id = std::string();
	media_type = null;
	upload_parameters = null;
	upload_url = std::string();
}

MediaUpload::MediaUpload(std::string jsonString)
{
	this->fromJson(jsonString);
}

MediaUpload::~MediaUpload()
{

}

void
MediaUpload::fromJson(std::string jsonObj)
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

    const char *upload_parametersKey = "upload_parameters";

    if(object.has_key(upload_parametersKey))
    {
        bourne::json value = object[upload_parametersKey];




        MediaUploadParameters* obj = &upload_parameters;
		obj->fromJson(value.dump());

    }

    const char *upload_urlKey = "upload_url";

    if(object.has_key(upload_urlKey))
    {
        bourne::json value = object[upload_urlKey];



        jsonToValue(&upload_url, value, "std::string");


    }


}

bourne::json
MediaUpload::toJson()
{
    bourne::json object = bourne::json::object();





    object["media_id"] = getMediaId();







	object["media_type"] = getMediaType().toJson();






	object["upload_parameters"] = getUploadParameters().toJson();





    object["upload_url"] = getUploadUrl();



    return object;

}

std::string
MediaUpload::getMediaId()
{
	return media_id;
}

void
MediaUpload::setMediaId(std::string media_id)
{
	this->media_id = media_id;
}

MediaUploadType
MediaUpload::getMediaType()
{
	return media_type;
}

void
MediaUpload::setMediaType(MediaUploadType media_type)
{
	this->media_type = media_type;
}

MediaUploadParameters
MediaUpload::getUploadParameters()
{
	return upload_parameters;
}

void
MediaUpload::setUploadParameters(MediaUploadParameters upload_parameters)
{
	this->upload_parameters = upload_parameters;
}

std::string
MediaUpload::getUploadUrl()
{
	return upload_url;
}

void
MediaUpload::setUploadUrl(std::string upload_url)
{
	this->upload_url = upload_url;
}



