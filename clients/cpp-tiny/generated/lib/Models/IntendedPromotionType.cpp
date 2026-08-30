

#include "IntendedPromotionType.h"

using namespace Tiny;

IntendedPromotionType::IntendedPromotionType()
{
}

IntendedPromotionType::IntendedPromotionType(std::string jsonString)
{
	this->fromJson(jsonString);
}

IntendedPromotionType::~IntendedPromotionType()
{

}

void
IntendedPromotionType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
IntendedPromotionType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



