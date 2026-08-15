

#include "InviteStatus.h"

using namespace Tiny;

InviteStatus::InviteStatus()
{
}

InviteStatus::InviteStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

InviteStatus::~InviteStatus()
{

}

void
InviteStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
InviteStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



