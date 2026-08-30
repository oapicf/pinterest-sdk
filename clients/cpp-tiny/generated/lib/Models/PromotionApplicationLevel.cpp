

#include "PromotionApplicationLevel.h"

using namespace Tiny;

PromotionApplicationLevel::PromotionApplicationLevel()
{
}

PromotionApplicationLevel::PromotionApplicationLevel(std::string jsonString)
{
	this->fromJson(jsonString);
}

PromotionApplicationLevel::~PromotionApplicationLevel()
{

}

void
PromotionApplicationLevel::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
PromotionApplicationLevel::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



