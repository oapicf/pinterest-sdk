

#include "DisclosureType.h"

using namespace Tiny;

DisclosureType::DisclosureType()
{
}

DisclosureType::DisclosureType(std::string jsonString)
{
	this->fromJson(jsonString);
}

DisclosureType::~DisclosureType()
{

}

void
DisclosureType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
DisclosureType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



