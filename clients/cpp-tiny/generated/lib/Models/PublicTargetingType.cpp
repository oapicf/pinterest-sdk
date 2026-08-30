

#include "PublicTargetingType.h"

using namespace Tiny;

PublicTargetingType::PublicTargetingType()
{
}

PublicTargetingType::PublicTargetingType(std::string jsonString)
{
	this->fromJson(jsonString);
}

PublicTargetingType::~PublicTargetingType()
{

}

void
PublicTargetingType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
PublicTargetingType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



