

#include "ConversionEvent.h"

using namespace Tiny;

ConversionEvent::ConversionEvent()
{
}

ConversionEvent::ConversionEvent(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionEvent::~ConversionEvent()
{

}

void
ConversionEvent::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ConversionEvent::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



