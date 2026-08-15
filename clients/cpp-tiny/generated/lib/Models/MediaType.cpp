

#include "MediaType.h"

using namespace Tiny;

MediaType::MediaType()
{
}

MediaType::MediaType(std::string jsonString)
{
	this->fromJson(jsonString);
}

MediaType::~MediaType()
{

}

void
MediaType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
MediaType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



