

#include "BusinessRoleForInvite.h"

using namespace Tiny;

BusinessRoleForInvite::BusinessRoleForInvite()
{
}

BusinessRoleForInvite::BusinessRoleForInvite(std::string jsonString)
{
	this->fromJson(jsonString);
}

BusinessRoleForInvite::~BusinessRoleForInvite()
{

}

void
BusinessRoleForInvite::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
BusinessRoleForInvite::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



