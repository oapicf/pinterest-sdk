

#include "ConversionTagType.h"

using namespace Tiny;

ConversionTagType::ConversionTagType()
{
}

ConversionTagType::ConversionTagType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionTagType::~ConversionTagType()
{

}

void
ConversionTagType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ConversionTagType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



