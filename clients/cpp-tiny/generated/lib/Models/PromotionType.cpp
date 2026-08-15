

#include "PromotionType.h"

using namespace Tiny;

PromotionType::PromotionType()
{
}

PromotionType::PromotionType(std::string jsonString)
{
	this->fromJson(jsonString);
}

PromotionType::~PromotionType()
{

}

void
PromotionType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
PromotionType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



