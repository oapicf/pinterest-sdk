

#include "NullalbleMatchType.h"

using namespace Tiny;

NullalbleMatchType::NullalbleMatchType()
{
}

NullalbleMatchType::NullalbleMatchType(std::string jsonString)
{
	this->fromJson(jsonString);
}

NullalbleMatchType::~NullalbleMatchType()
{

}

void
NullalbleMatchType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
NullalbleMatchType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



