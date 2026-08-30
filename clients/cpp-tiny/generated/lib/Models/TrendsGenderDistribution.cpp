

#include "TrendsGenderDistribution.h"

using namespace Tiny;

TrendsGenderDistribution::TrendsGenderDistribution()
{
	gender_distribution = TrendsGender();
}

TrendsGenderDistribution::TrendsGenderDistribution(std::string jsonString)
{
	this->fromJson(jsonString);
}

TrendsGenderDistribution::~TrendsGenderDistribution()
{

}

void
TrendsGenderDistribution::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *gender_distributionKey = "gender_distribution";

    if(object.has_key(gender_distributionKey))
    {
        bourne::json value = object[gender_distributionKey];




        TrendsGender* obj = &gender_distribution;
		obj->fromJson(value.dump());

    }


}

bourne::json
TrendsGenderDistribution::toJson()
{
    bourne::json object = bourne::json::object();






	object["gender_distribution"] = getGenderDistribution().toJson();


    return object;

}

TrendsGender
TrendsGenderDistribution::getGenderDistribution()
{
	return gender_distribution;
}

void
TrendsGenderDistribution::setGenderDistribution(TrendsGender gender_distribution)
{
	this->gender_distribution = gender_distribution;
}



