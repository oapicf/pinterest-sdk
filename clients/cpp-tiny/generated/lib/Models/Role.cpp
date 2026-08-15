

#include "Role.h"

using namespace Tiny;

Role::Role()
{
}

Role::Role(std::string jsonString)
{
	this->fromJson(jsonString);
}

Role::~Role()
{

}

void
Role::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
Role::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



