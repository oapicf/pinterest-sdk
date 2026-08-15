

#include "TrendingKeyword_demographics_gender_distribution.h"

using namespace Tiny;

TrendingKeyword_demographics_gender_distribution::TrendingKeyword_demographics_gender_distribution()
{
	gender_distribution = std::string();
}

TrendingKeyword_demographics_gender_distribution::TrendingKeyword_demographics_gender_distribution(std::string jsonString)
{
	this->fromJson(jsonString);
}

TrendingKeyword_demographics_gender_distribution::~TrendingKeyword_demographics_gender_distribution()
{

}

void
TrendingKeyword_demographics_gender_distribution::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *gender_distributionKey = "gender_distribution";

    if(object.has_key(gender_distributionKey))
    {
        bourne::json value = object[gender_distributionKey];



        jsonToValue(&gender_distribution, value, "std::string");


    }


}

bourne::json
TrendingKeyword_demographics_gender_distribution::toJson()
{
    bourne::json object = bourne::json::object();





    object["gender_distribution"] = getGenderDistribution();



    return object;

}

std::string
TrendingKeyword_demographics_gender_distribution::getGenderDistribution()
{
	return gender_distribution;
}

void
TrendingKeyword_demographics_gender_distribution::setGenderDistribution(std::string  gender_distribution)
{
	this->gender_distribution = gender_distribution;
}



