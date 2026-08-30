

#include "AudienceObjectiveType.h"

using namespace Tiny;

AudienceObjectiveType::AudienceObjectiveType()
{
}

AudienceObjectiveType::AudienceObjectiveType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AudienceObjectiveType::~AudienceObjectiveType()
{

}

void
AudienceObjectiveType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AudienceObjectiveType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



