

#include "AudienceUpdateOperationType.h"

using namespace Tiny;

AudienceUpdateOperationType::AudienceUpdateOperationType()
{
}

AudienceUpdateOperationType::AudienceUpdateOperationType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AudienceUpdateOperationType::~AudienceUpdateOperationType()
{

}

void
AudienceUpdateOperationType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AudienceUpdateOperationType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



