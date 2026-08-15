

#include "AudienceShareType.h"

using namespace Tiny;

AudienceShareType::AudienceShareType()
{
}

AudienceShareType::AudienceShareType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AudienceShareType::~AudienceShareType()
{

}

void
AudienceShareType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AudienceShareType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



