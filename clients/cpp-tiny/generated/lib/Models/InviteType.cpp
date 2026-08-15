

#include "InviteType.h"

using namespace Tiny;

InviteType::InviteType()
{
}

InviteType::InviteType(std::string jsonString)
{
	this->fromJson(jsonString);
}

InviteType::~InviteType()
{

}

void
InviteType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
InviteType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



