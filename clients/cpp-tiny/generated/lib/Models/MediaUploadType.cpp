

#include "MediaUploadType.h"

using namespace Tiny;

MediaUploadType::MediaUploadType()
{
}

MediaUploadType::MediaUploadType(std::string jsonString)
{
	this->fromJson(jsonString);
}

MediaUploadType::~MediaUploadType()
{

}

void
MediaUploadType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
MediaUploadType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



