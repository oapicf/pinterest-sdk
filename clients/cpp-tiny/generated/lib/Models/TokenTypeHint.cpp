

#include "TokenTypeHint.h"

using namespace Tiny;

TokenTypeHint::TokenTypeHint()
{
}

TokenTypeHint::TokenTypeHint(std::string jsonString)
{
	this->fromJson(jsonString);
}

TokenTypeHint::~TokenTypeHint()
{

}

void
TokenTypeHint::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
TokenTypeHint::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



