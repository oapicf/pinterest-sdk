

#include "ProductCondition.h"

using namespace Tiny;

ProductCondition::ProductCondition()
{
}

ProductCondition::ProductCondition(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProductCondition::~ProductCondition()
{

}

void
ProductCondition::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ProductCondition::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



