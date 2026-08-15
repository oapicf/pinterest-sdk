

#include "AdCountry.h"

using namespace Tiny;

AdCountry::AdCountry()
{
}

AdCountry::AdCountry(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdCountry::~AdCountry()
{

}

void
AdCountry::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AdCountry::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



