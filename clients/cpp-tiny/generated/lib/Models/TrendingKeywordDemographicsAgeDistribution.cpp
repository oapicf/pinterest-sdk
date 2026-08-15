

#include "TrendingKeyword_demographics_age_distribution.h"

using namespace Tiny;

TrendingKeyword_demographics_age_distribution::TrendingKeyword_demographics_age_distribution()
{
	age_distribution = std::string();
}

TrendingKeyword_demographics_age_distribution::TrendingKeyword_demographics_age_distribution(std::string jsonString)
{
	this->fromJson(jsonString);
}

TrendingKeyword_demographics_age_distribution::~TrendingKeyword_demographics_age_distribution()
{

}

void
TrendingKeyword_demographics_age_distribution::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *age_distributionKey = "age_distribution";

    if(object.has_key(age_distributionKey))
    {
        bourne::json value = object[age_distributionKey];



        jsonToValue(&age_distribution, value, "std::string");


    }


}

bourne::json
TrendingKeyword_demographics_age_distribution::toJson()
{
    bourne::json object = bourne::json::object();





    object["age_distribution"] = getAgeDistribution();



    return object;

}

std::string
TrendingKeyword_demographics_age_distribution::getAgeDistribution()
{
	return age_distribution;
}

void
TrendingKeyword_demographics_age_distribution::setAgeDistribution(std::string  age_distribution)
{
	this->age_distribution = age_distribution;
}



