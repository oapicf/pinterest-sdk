

#include "ProductCategoriesEngagementType.h"

using namespace Tiny;

ProductCategoriesEngagementType::ProductCategoriesEngagementType()
{
}

ProductCategoriesEngagementType::ProductCategoriesEngagementType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProductCategoriesEngagementType::~ProductCategoriesEngagementType()
{

}

void
ProductCategoriesEngagementType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ProductCategoriesEngagementType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



