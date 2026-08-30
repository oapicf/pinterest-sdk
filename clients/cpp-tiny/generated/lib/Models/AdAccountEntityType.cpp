

#include "AdAccountEntityType.h"

using namespace Tiny;

AdAccountEntityType::AdAccountEntityType()
{
}

AdAccountEntityType::AdAccountEntityType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdAccountEntityType::~AdAccountEntityType()
{

}

void
AdAccountEntityType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AdAccountEntityType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



