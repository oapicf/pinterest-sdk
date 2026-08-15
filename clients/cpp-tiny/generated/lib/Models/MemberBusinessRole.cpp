

#include "MemberBusinessRole.h"

using namespace Tiny;

MemberBusinessRole::MemberBusinessRole()
{
}

MemberBusinessRole::MemberBusinessRole(std::string jsonString)
{
	this->fromJson(jsonString);
}

MemberBusinessRole::~MemberBusinessRole()
{

}

void
MemberBusinessRole::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
MemberBusinessRole::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



