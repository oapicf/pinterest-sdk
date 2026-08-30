

#include "ChangeHistoryOperationType.h"

using namespace Tiny;

ChangeHistoryOperationType::ChangeHistoryOperationType()
{
}

ChangeHistoryOperationType::ChangeHistoryOperationType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChangeHistoryOperationType::~ChangeHistoryOperationType()
{

}

void
ChangeHistoryOperationType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ChangeHistoryOperationType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



