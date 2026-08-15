

#include "EntityStatus.h"

using namespace Tiny;

EntityStatus::EntityStatus()
{
}

EntityStatus::EntityStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

EntityStatus::~EntityStatus()
{

}

void
EntityStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
EntityStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



