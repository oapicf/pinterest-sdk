

#include "NullableLabelType.h"

using namespace Tiny;

NullableLabelType::NullableLabelType()
{
}

NullableLabelType::NullableLabelType(std::string jsonString)
{
	this->fromJson(jsonString);
}

NullableLabelType::~NullableLabelType()
{

}

void
NullableLabelType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
NullableLabelType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



