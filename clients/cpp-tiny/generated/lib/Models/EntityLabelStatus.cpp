

#include "EntityLabelStatus.h"

using namespace Tiny;

EntityLabelStatus::EntityLabelStatus()
{
}

EntityLabelStatus::EntityLabelStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

EntityLabelStatus::~EntityLabelStatus()
{

}

void
EntityLabelStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
EntityLabelStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



