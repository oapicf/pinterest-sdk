

#include "BusinessSearchBy.h"

using namespace Tiny;

BusinessSearchBy::BusinessSearchBy()
{
}

BusinessSearchBy::BusinessSearchBy(std::string jsonString)
{
	this->fromJson(jsonString);
}

BusinessSearchBy::~BusinessSearchBy()
{

}

void
BusinessSearchBy::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
BusinessSearchBy::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



