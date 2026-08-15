

#include "TrendingKeyword_demographics.h"

using namespace Tiny;

TrendingKeyword_demographics::TrendingKeyword_demographics()
{
	age_distribution = TrendingKeyword_demographics_age_distribution();
	gender_distribution = TrendingKeyword_demographics_gender_distribution();
}

TrendingKeyword_demographics::TrendingKeyword_demographics(std::string jsonString)
{
	this->fromJson(jsonString);
}

TrendingKeyword_demographics::~TrendingKeyword_demographics()
{

}

void
TrendingKeyword_demographics::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *age_distributionKey = "age_distribution";

    if(object.has_key(age_distributionKey))
    {
        bourne::json value = object[age_distributionKey];




        TrendingKeyword_demographics_age_distribution* obj = &age_distribution;
		obj->fromJson(value.dump());

    }

    const char *gender_distributionKey = "gender_distribution";

    if(object.has_key(gender_distributionKey))
    {
        bourne::json value = object[gender_distributionKey];




        TrendingKeyword_demographics_gender_distribution* obj = &gender_distribution;
		obj->fromJson(value.dump());

    }


}

bourne::json
TrendingKeyword_demographics::toJson()
{
    bourne::json object = bourne::json::object();






	object["age_distribution"] = getAgeDistribution().toJson();






	object["gender_distribution"] = getGenderDistribution().toJson();


    return object;

}

TrendingKeyword_demographics_age_distribution
TrendingKeyword_demographics::getAgeDistribution()
{
	return age_distribution;
}

void
TrendingKeyword_demographics::setAgeDistribution(TrendingKeyword_demographics_age_distribution  age_distribution)
{
	this->age_distribution = age_distribution;
}

TrendingKeyword_demographics_gender_distribution
TrendingKeyword_demographics::getGenderDistribution()
{
	return gender_distribution;
}

void
TrendingKeyword_demographics::setGenderDistribution(TrendingKeyword_demographics_gender_distribution  gender_distribution)
{
	this->gender_distribution = gender_distribution;
}



