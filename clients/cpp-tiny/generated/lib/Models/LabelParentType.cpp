

#include "LabelParentType.h"

using namespace Tiny;

LabelParentType::LabelParentType()
{
}

LabelParentType::LabelParentType(std::string jsonString)
{
	this->fromJson(jsonString);
}

LabelParentType::~LabelParentType()
{

}

void
LabelParentType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
LabelParentType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



