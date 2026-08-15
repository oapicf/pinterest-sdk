

#include "CatalogsHotelProductGroupType.h"

using namespace Tiny;

CatalogsHotelProductGroupType::CatalogsHotelProductGroupType()
{
}

CatalogsHotelProductGroupType::CatalogsHotelProductGroupType(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsHotelProductGroupType::~CatalogsHotelProductGroupType()
{

}

void
CatalogsHotelProductGroupType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CatalogsHotelProductGroupType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



