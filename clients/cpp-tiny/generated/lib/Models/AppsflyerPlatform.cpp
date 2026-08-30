

#include "AppsflyerPlatform.h"

using namespace Tiny;

AppsflyerPlatform::AppsflyerPlatform()
{
}

AppsflyerPlatform::AppsflyerPlatform(std::string jsonString)
{
	this->fromJson(jsonString);
}

AppsflyerPlatform::~AppsflyerPlatform()
{

}

void
AppsflyerPlatform::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AppsflyerPlatform::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



