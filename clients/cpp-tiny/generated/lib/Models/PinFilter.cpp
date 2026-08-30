

#include "PinFilter.h"

using namespace Tiny;

PinFilter::PinFilter()
{
}

PinFilter::PinFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

PinFilter::~PinFilter()
{

}

void
PinFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
PinFilter::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



