

#include "UserListOperationType.h"

using namespace Tiny;

UserListOperationType::UserListOperationType()
{
}

UserListOperationType::UserListOperationType(std::string jsonString)
{
	this->fromJson(jsonString);
}

UserListOperationType::~UserListOperationType()
{

}

void
UserListOperationType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
UserListOperationType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



