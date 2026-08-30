

#include "InviteFilterStatus.h"

using namespace Tiny;

InviteFilterStatus::InviteFilterStatus()
{
}

InviteFilterStatus::InviteFilterStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

InviteFilterStatus::~InviteFilterStatus()
{

}

void
InviteFilterStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
InviteFilterStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



