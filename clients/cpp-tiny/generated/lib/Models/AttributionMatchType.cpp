

#include "AttributionMatchType.h"

using namespace Tiny;

AttributionMatchType::AttributionMatchType()
{
}

AttributionMatchType::AttributionMatchType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AttributionMatchType::~AttributionMatchType()
{

}

void
AttributionMatchType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AttributionMatchType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



