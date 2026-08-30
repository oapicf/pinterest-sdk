

#include "PinType.h"

using namespace Tiny;

PinType::PinType()
{
}

PinType::PinType(std::string jsonString)
{
	this->fromJson(jsonString);
}

PinType::~PinType()
{

}

void
PinType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
PinType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



