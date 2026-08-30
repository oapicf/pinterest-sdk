

#include "MobileAppPlatform.h"

using namespace Tiny;

MobileAppPlatform::MobileAppPlatform()
{
}

MobileAppPlatform::MobileAppPlatform(std::string jsonString)
{
	this->fromJson(jsonString);
}

MobileAppPlatform::~MobileAppPlatform()
{

}

void
MobileAppPlatform::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
MobileAppPlatform::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



