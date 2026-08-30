

#include "AdsCreditDiscountType.h"

using namespace Tiny;

AdsCreditDiscountType::AdsCreditDiscountType()
{
}

AdsCreditDiscountType::AdsCreditDiscountType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdsCreditDiscountType::~AdsCreditDiscountType()
{

}

void
AdsCreditDiscountType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AdsCreditDiscountType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



