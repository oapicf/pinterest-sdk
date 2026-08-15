

#include "ObjectiveType.h"

using namespace Tiny;

ObjectiveType::ObjectiveType()
{
}

ObjectiveType::ObjectiveType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ObjectiveType::~ObjectiveType()
{

}

void
ObjectiveType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ObjectiveType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



