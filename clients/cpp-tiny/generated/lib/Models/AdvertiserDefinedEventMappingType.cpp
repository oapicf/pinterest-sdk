

#include "AdvertiserDefinedEventMappingType.h"

using namespace Tiny;

AdvertiserDefinedEventMappingType::AdvertiserDefinedEventMappingType()
{
}

AdvertiserDefinedEventMappingType::AdvertiserDefinedEventMappingType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdvertiserDefinedEventMappingType::~AdvertiserDefinedEventMappingType()
{

}

void
AdvertiserDefinedEventMappingType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AdvertiserDefinedEventMappingType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



