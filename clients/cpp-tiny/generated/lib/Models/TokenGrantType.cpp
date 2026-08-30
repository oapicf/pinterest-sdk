

#include "TokenGrantType.h"

using namespace Tiny;

TokenGrantType::TokenGrantType()
{
}

TokenGrantType::TokenGrantType(std::string jsonString)
{
	this->fromJson(jsonString);
}

TokenGrantType::~TokenGrantType()
{

}

void
TokenGrantType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
TokenGrantType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



