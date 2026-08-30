

#include "AudienceOwnershipType.h"

using namespace Tiny;

AudienceOwnershipType::AudienceOwnershipType()
{
}

AudienceOwnershipType::AudienceOwnershipType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AudienceOwnershipType::~AudienceOwnershipType()
{

}

void
AudienceOwnershipType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AudienceOwnershipType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



