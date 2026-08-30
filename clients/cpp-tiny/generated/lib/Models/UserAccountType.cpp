

#include "UserAccountType.h"

using namespace Tiny;

UserAccountType::UserAccountType()
{
}

UserAccountType::UserAccountType(std::string jsonString)
{
	this->fromJson(jsonString);
}

UserAccountType::~UserAccountType()
{

}

void
UserAccountType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
UserAccountType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



