

#include "TrendsSupportedRegion.h"

using namespace Tiny;

TrendsSupportedRegion::TrendsSupportedRegion()
{
}

TrendsSupportedRegion::TrendsSupportedRegion(std::string jsonString)
{
	this->fromJson(jsonString);
}

TrendsSupportedRegion::~TrendsSupportedRegion()
{

}

void
TrendsSupportedRegion::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
TrendsSupportedRegion::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



