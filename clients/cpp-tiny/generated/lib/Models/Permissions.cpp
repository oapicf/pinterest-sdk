

#include "Permissions.h"

using namespace Tiny;

Permissions::Permissions()
{
}

Permissions::Permissions(std::string jsonString)
{
	this->fromJson(jsonString);
}

Permissions::~Permissions()
{

}

void
Permissions::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
Permissions::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



