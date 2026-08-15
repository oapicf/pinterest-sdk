

#include "AudienceType.h"

using namespace Tiny;

AudienceType::AudienceType()
{
}

AudienceType::AudienceType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AudienceType::~AudienceType()
{

}

void
AudienceType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AudienceType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



