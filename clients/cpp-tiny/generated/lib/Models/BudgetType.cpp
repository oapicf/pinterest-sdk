

#include "BudgetType.h"

using namespace Tiny;

BudgetType::BudgetType()
{
}

BudgetType::BudgetType(std::string jsonString)
{
	this->fromJson(jsonString);
}

BudgetType::~BudgetType()
{

}

void
BudgetType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
BudgetType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



