

#include "TrendsL1Interest.h"

using namespace Tiny;

TrendsL1Interest::TrendsL1Interest()
{
}

TrendsL1Interest::TrendsL1Interest(std::string jsonString)
{
	this->fromJson(jsonString);
}

TrendsL1Interest::~TrendsL1Interest()
{

}

void
TrendsL1Interest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
TrendsL1Interest::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



