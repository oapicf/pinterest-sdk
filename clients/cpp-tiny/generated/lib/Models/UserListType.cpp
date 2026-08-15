

#include "UserListType.h"

using namespace Tiny;

UserListType::UserListType()
{
}

UserListType::UserListType(std::string jsonString)
{
	this->fromJson(jsonString);
}

UserListType::~UserListType()
{

}

void
UserListType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
UserListType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



