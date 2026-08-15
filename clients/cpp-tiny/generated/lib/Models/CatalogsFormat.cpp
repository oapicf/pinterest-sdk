

#include "CatalogsFormat.h"

using namespace Tiny;

CatalogsFormat::CatalogsFormat()
{
}

CatalogsFormat::CatalogsFormat(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsFormat::~CatalogsFormat()
{

}

void
CatalogsFormat::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CatalogsFormat::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



