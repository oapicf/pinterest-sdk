

#include "CatalogsStatus.h"

using namespace Tiny;

CatalogsStatus::CatalogsStatus()
{
}

CatalogsStatus::CatalogsStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsStatus::~CatalogsStatus()
{

}

void
CatalogsStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CatalogsStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



