

#include "LabelType.h"

using namespace Tiny;

LabelType::LabelType()
{
}

LabelType::LabelType(std::string jsonString)
{
	this->fromJson(jsonString);
}

LabelType::~LabelType()
{

}

void
LabelType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
LabelType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



