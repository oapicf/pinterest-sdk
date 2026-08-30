

#include "AdPinPreviewCreativeType.h"

using namespace Tiny;

AdPinPreviewCreativeType::AdPinPreviewCreativeType()
{
}

AdPinPreviewCreativeType::AdPinPreviewCreativeType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdPinPreviewCreativeType::~AdPinPreviewCreativeType()
{

}

void
AdPinPreviewCreativeType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AdPinPreviewCreativeType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



