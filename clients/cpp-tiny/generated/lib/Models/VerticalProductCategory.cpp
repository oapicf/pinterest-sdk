

#include "VerticalProductCategory.h"

using namespace Tiny;

VerticalProductCategory::VerticalProductCategory()
{
}

VerticalProductCategory::VerticalProductCategory(std::string jsonString)
{
	this->fromJson(jsonString);
}

VerticalProductCategory::~VerticalProductCategory()
{

}

void
VerticalProductCategory::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
VerticalProductCategory::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



