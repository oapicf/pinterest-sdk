

#include "ActionType.h"

using namespace Tiny;

ActionType::ActionType()
{
}

ActionType::ActionType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ActionType::~ActionType()
{

}

void
ActionType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ActionType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



