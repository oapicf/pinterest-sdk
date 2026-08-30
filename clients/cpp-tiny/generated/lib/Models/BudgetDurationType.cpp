

#include "BudgetDurationType.h"

using namespace Tiny;

BudgetDurationType::BudgetDurationType()
{
}

BudgetDurationType::BudgetDurationType(std::string jsonString)
{
	this->fromJson(jsonString);
}

BudgetDurationType::~BudgetDurationType()
{

}

void
BudgetDurationType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
BudgetDurationType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



