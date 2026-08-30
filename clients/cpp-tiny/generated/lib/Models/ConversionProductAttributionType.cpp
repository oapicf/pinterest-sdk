

#include "ConversionProductAttributionType.h"

using namespace Tiny;

ConversionProductAttributionType::ConversionProductAttributionType()
{
}

ConversionProductAttributionType::ConversionProductAttributionType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionProductAttributionType::~ConversionProductAttributionType()
{

}

void
ConversionProductAttributionType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ConversionProductAttributionType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



