

#include "CreativeType.h"

using namespace Tiny;

CreativeType::CreativeType()
{
}

CreativeType::CreativeType(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreativeType::~CreativeType()
{

}

void
CreativeType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CreativeType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



