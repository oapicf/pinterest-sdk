

#include "PartnerType.h"

using namespace Tiny;

PartnerType::PartnerType()
{
}

PartnerType::PartnerType(std::string jsonString)
{
	this->fromJson(jsonString);
}

PartnerType::~PartnerType()
{

}

void
PartnerType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
PartnerType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



