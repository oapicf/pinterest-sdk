

#include "MediaUploadStatus.h"

using namespace Tiny;

MediaUploadStatus::MediaUploadStatus()
{
}

MediaUploadStatus::MediaUploadStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

MediaUploadStatus::~MediaUploadStatus()
{

}

void
MediaUploadStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
MediaUploadStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



