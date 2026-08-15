

#include "ProductCategoryEnum.h"

using namespace Tiny;

ProductCategoryEnum::ProductCategoryEnum()
{
}

ProductCategoryEnum::ProductCategoryEnum(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProductCategoryEnum::~ProductCategoryEnum()
{

}

void
ProductCategoryEnum::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ProductCategoryEnum::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



