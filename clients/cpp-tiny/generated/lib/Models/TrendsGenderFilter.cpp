

#include "TrendsGenderFilter.h"

using namespace Tiny;

TrendsGenderFilter::TrendsGenderFilter()
{
}

TrendsGenderFilter::TrendsGenderFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

TrendsGenderFilter::~TrendsGenderFilter()
{

}

void
TrendsGenderFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
TrendsGenderFilter::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



