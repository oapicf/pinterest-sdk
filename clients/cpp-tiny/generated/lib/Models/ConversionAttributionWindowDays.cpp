

#include "ConversionAttributionWindowDays.h"

using namespace Tiny;

ConversionAttributionWindowDays::ConversionAttributionWindowDays()
{
}

ConversionAttributionWindowDays::ConversionAttributionWindowDays(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionAttributionWindowDays::~ConversionAttributionWindowDays()
{

}

void
ConversionAttributionWindowDays::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ConversionAttributionWindowDays::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



