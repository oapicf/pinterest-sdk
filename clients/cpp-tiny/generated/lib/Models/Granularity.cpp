

#include "Granularity.h"

using namespace Tiny;

Granularity::Granularity()
{
}

Granularity::Granularity(std::string jsonString)
{
	this->fromJson(jsonString);
}

Granularity::~Granularity()
{

}

void
Granularity::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
Granularity::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



