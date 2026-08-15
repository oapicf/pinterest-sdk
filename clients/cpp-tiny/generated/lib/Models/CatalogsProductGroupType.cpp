

#include "CatalogsProductGroupType.h"

using namespace Tiny;

CatalogsProductGroupType::CatalogsProductGroupType()
{
}

CatalogsProductGroupType::CatalogsProductGroupType(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsProductGroupType::~CatalogsProductGroupType()
{

}

void
CatalogsProductGroupType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CatalogsProductGroupType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



