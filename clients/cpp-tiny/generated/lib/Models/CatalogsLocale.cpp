

#include "CatalogsLocale.h"

using namespace Tiny;

CatalogsLocale::CatalogsLocale()
{
}

CatalogsLocale::CatalogsLocale(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsLocale::~CatalogsLocale()
{

}

void
CatalogsLocale::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CatalogsLocale::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



