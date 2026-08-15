

#include "BusinessRoleForMembers.h"

using namespace Tiny;

BusinessRoleForMembers::BusinessRoleForMembers()
{
}

BusinessRoleForMembers::BusinessRoleForMembers(std::string jsonString)
{
	this->fromJson(jsonString);
}

BusinessRoleForMembers::~BusinessRoleForMembers()
{

}

void
BusinessRoleForMembers::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
BusinessRoleForMembers::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



