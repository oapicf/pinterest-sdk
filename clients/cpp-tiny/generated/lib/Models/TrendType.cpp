

#include "TrendType.h"

using namespace Tiny;

TrendType::TrendType()
{
}

TrendType::TrendType(std::string jsonString)
{
	this->fromJson(jsonString);
}

TrendType::~TrendType()
{

}

void
TrendType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
TrendType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



