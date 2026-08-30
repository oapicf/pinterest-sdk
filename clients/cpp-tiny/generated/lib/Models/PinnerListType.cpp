

#include "PinnerListType.h"

using namespace Tiny;

PinnerListType::PinnerListType()
{
}

PinnerListType::PinnerListType(std::string jsonString)
{
	this->fromJson(jsonString);
}

PinnerListType::~PinnerListType()
{

}

void
PinnerListType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
PinnerListType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



