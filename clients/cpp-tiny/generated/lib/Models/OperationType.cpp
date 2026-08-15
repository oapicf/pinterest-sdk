

#include "OperationType.h"

using namespace Tiny;

OperationType::OperationType()
{
}

OperationType::OperationType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OperationType::~OperationType()
{

}

void
OperationType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OperationType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



