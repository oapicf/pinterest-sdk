

#include "Currency.h"

using namespace Tiny;

Currency::Currency()
{
}

Currency::Currency(std::string jsonString)
{
	this->fromJson(jsonString);
}

Currency::~Currency()
{

}

void
Currency::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
Currency::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



