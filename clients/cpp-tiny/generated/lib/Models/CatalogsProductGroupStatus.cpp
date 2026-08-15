

#include "CatalogsProductGroupStatus.h"

using namespace Tiny;

CatalogsProductGroupStatus::CatalogsProductGroupStatus()
{
}

CatalogsProductGroupStatus::CatalogsProductGroupStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsProductGroupStatus::~CatalogsProductGroupStatus()
{

}

void
CatalogsProductGroupStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CatalogsProductGroupStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



