

#include "BusinessAccessRole.h"

using namespace Tiny;

BusinessAccessRole::BusinessAccessRole()
{
}

BusinessAccessRole::BusinessAccessRole(std::string jsonString)
{
	this->fromJson(jsonString);
}

BusinessAccessRole::~BusinessAccessRole()
{

}

void
BusinessAccessRole::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
BusinessAccessRole::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



