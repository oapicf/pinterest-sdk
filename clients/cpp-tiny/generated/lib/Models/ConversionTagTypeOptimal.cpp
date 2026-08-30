

#include "ConversionTagTypeOptimal.h"

using namespace Tiny;

ConversionTagTypeOptimal::ConversionTagTypeOptimal()
{
}

ConversionTagTypeOptimal::ConversionTagTypeOptimal(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionTagTypeOptimal::~ConversionTagTypeOptimal()
{

}

void
ConversionTagTypeOptimal::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ConversionTagTypeOptimal::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



