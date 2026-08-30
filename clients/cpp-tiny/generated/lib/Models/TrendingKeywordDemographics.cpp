

#include "TrendingKeywordDemographics.h"

using namespace Tiny;

TrendingKeywordDemographics::TrendingKeywordDemographics()
{
	age_distribution = TrendsAgeDistribution();
	gender_distribution = TrendsGenderDistribution();
}

TrendingKeywordDemographics::TrendingKeywordDemographics(std::string jsonString)
{
	this->fromJson(jsonString);
}

TrendingKeywordDemographics::~TrendingKeywordDemographics()
{

}

void
TrendingKeywordDemographics::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *age_distributionKey = "age_distribution";

    if(object.has_key(age_distributionKey))
    {
        bourne::json value = object[age_distributionKey];




        TrendsAgeDistribution* obj = &age_distribution;
		obj->fromJson(value.dump());

    }

    const char *gender_distributionKey = "gender_distribution";

    if(object.has_key(gender_distributionKey))
    {
        bourne::json value = object[gender_distributionKey];




        TrendsGenderDistribution* obj = &gender_distribution;
		obj->fromJson(value.dump());

    }


}

bourne::json
TrendingKeywordDemographics::toJson()
{
    bourne::json object = bourne::json::object();






	object["age_distribution"] = getAgeDistribution().toJson();






	object["gender_distribution"] = getGenderDistribution().toJson();


    return object;

}

TrendsAgeDistribution&lt;std::string, double&gt;
TrendingKeywordDemographics::getAgeDistribution()
{
	return age_distribution;
}

void
TrendingKeywordDemographics::setAgeDistribution(TrendsAgeDistribution&lt;std::string, double&gt; age_distribution)
{
	this->age_distribution = age_distribution;
}

TrendsGenderDistribution&lt;std::string, double&gt;
TrendingKeywordDemographics::getGenderDistribution()
{
	return gender_distribution;
}

void
TrendingKeywordDemographics::setGenderDistribution(TrendsGenderDistribution&lt;std::string, double&gt; gender_distribution)
{
	this->gender_distribution = gender_distribution;
}



