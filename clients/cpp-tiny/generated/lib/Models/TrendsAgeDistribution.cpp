

#include "TrendsAgeDistribution.h"

using namespace Tiny;

TrendsAgeDistribution::TrendsAgeDistribution()
{
	age_distribution = TrendsAgeBucket();
}

TrendsAgeDistribution::TrendsAgeDistribution(std::string jsonString)
{
	this->fromJson(jsonString);
}

TrendsAgeDistribution::~TrendsAgeDistribution()
{

}

void
TrendsAgeDistribution::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *age_distributionKey = "age_distribution";

    if(object.has_key(age_distributionKey))
    {
        bourne::json value = object[age_distributionKey];




        TrendsAgeBucket* obj = &age_distribution;
		obj->fromJson(value.dump());

    }


}

bourne::json
TrendsAgeDistribution::toJson()
{
    bourne::json object = bourne::json::object();






	object["age_distribution"] = getAgeDistribution().toJson();


    return object;

}

TrendsAgeBucket
TrendsAgeDistribution::getAgeDistribution()
{
	return age_distribution;
}

void
TrendsAgeDistribution::setAgeDistribution(TrendsAgeBucket age_distribution)
{
	this->age_distribution = age_distribution;
}



