

#include "CatalogsType.h"

using namespace Tiny;

CatalogsType::CatalogsType()
{
}

CatalogsType::CatalogsType(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsType::~CatalogsType()
{

}

void
CatalogsType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CatalogsType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



