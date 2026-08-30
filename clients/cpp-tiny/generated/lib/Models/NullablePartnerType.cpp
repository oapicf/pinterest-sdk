

#include "NullablePartnerType.h"

using namespace Tiny;

NullablePartnerType::NullablePartnerType()
{
}

NullablePartnerType::NullablePartnerType(std::string jsonString)
{
	this->fromJson(jsonString);
}

NullablePartnerType::~NullablePartnerType()
{

}

void
NullablePartnerType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
NullablePartnerType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



