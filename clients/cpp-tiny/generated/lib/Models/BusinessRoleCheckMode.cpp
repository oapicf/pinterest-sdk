

#include "BusinessRoleCheckMode.h"

using namespace Tiny;

BusinessRoleCheckMode::BusinessRoleCheckMode()
{
}

BusinessRoleCheckMode::BusinessRoleCheckMode(std::string jsonString)
{
	this->fromJson(jsonString);
}

BusinessRoleCheckMode::~BusinessRoleCheckMode()
{

}

void
BusinessRoleCheckMode::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
BusinessRoleCheckMode::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



