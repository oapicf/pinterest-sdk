

#include "AudienceStatus.h"

using namespace Tiny;

AudienceStatus::AudienceStatus()
{
}

AudienceStatus::AudienceStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

AudienceStatus::~AudienceStatus()
{

}

void
AudienceStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AudienceStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



