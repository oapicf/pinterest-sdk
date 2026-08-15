

#include "BusinessRole.h"

using namespace Tiny;

BusinessRole::BusinessRole()
{
}

BusinessRole::BusinessRole(std::string jsonString)
{
	this->fromJson(jsonString);
}

BusinessRole::~BusinessRole()
{

}

void
BusinessRole::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
BusinessRole::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



