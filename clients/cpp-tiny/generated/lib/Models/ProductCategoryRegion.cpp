

#include "ProductCategoryRegion.h"

using namespace Tiny;

ProductCategoryRegion::ProductCategoryRegion()
{
}

ProductCategoryRegion::ProductCategoryRegion(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProductCategoryRegion::~ProductCategoryRegion()
{

}

void
ProductCategoryRegion::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ProductCategoryRegion::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



