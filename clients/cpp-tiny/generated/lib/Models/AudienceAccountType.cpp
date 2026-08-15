

#include "AudienceAccountType.h"

using namespace Tiny;

AudienceAccountType::AudienceAccountType()
{
}

AudienceAccountType::AudienceAccountType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AudienceAccountType::~AudienceAccountType()
{

}

void
AudienceAccountType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AudienceAccountType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



