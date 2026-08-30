

#include "AttributionScope.h"

using namespace Tiny;

AttributionScope::AttributionScope()
{
}

AttributionScope::AttributionScope(std::string jsonString)
{
	this->fromJson(jsonString);
}

AttributionScope::~AttributionScope()
{

}

void
AttributionScope::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AttributionScope::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



