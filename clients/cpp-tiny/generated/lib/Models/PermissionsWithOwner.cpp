

#include "PermissionsWithOwner.h"

using namespace Tiny;

PermissionsWithOwner::PermissionsWithOwner()
{
}

PermissionsWithOwner::PermissionsWithOwner(std::string jsonString)
{
	this->fromJson(jsonString);
}

PermissionsWithOwner::~PermissionsWithOwner()
{

}

void
PermissionsWithOwner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
PermissionsWithOwner::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



