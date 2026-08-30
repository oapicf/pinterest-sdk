

#include "ProductGroupPromotionCustomizableCTAType.h"

using namespace Tiny;

ProductGroupPromotionCustomizableCTAType::ProductGroupPromotionCustomizableCTAType()
{
}

ProductGroupPromotionCustomizableCTAType::ProductGroupPromotionCustomizableCTAType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProductGroupPromotionCustomizableCTAType::~ProductGroupPromotionCustomizableCTAType()
{

}

void
ProductGroupPromotionCustomizableCTAType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ProductGroupPromotionCustomizableCTAType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



