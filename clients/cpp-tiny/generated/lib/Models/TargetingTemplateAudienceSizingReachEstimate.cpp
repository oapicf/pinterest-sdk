

#include "TargetingTemplateAudienceSizingReachEstimate.h"

using namespace Tiny;

TargetingTemplateAudienceSizingReachEstimate::TargetingTemplateAudienceSizingReachEstimate()
{
	estimate = long(0);
	lower_bound = long(0);
	upper_bound = long(0);
}

TargetingTemplateAudienceSizingReachEstimate::TargetingTemplateAudienceSizingReachEstimate(std::string jsonString)
{
	this->fromJson(jsonString);
}

TargetingTemplateAudienceSizingReachEstimate::~TargetingTemplateAudienceSizingReachEstimate()
{

}

void
TargetingTemplateAudienceSizingReachEstimate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *estimateKey = "estimate";

    if(object.has_key(estimateKey))
    {
        bourne::json value = object[estimateKey];



        jsonToValue(&estimate, value, "long");


    }

    const char *lower_boundKey = "lower_bound";

    if(object.has_key(lower_boundKey))
    {
        bourne::json value = object[lower_boundKey];



        jsonToValue(&lower_bound, value, "long");


    }

    const char *upper_boundKey = "upper_bound";

    if(object.has_key(upper_boundKey))
    {
        bourne::json value = object[upper_boundKey];



        jsonToValue(&upper_bound, value, "long");


    }


}

bourne::json
TargetingTemplateAudienceSizingReachEstimate::toJson()
{
    bourne::json object = bourne::json::object();





    object["estimate"] = getEstimate();






    object["lower_bound"] = getLowerBound();






    object["upper_bound"] = getUpperBound();



    return object;

}

long
TargetingTemplateAudienceSizingReachEstimate::getEstimate()
{
	return estimate;
}

void
TargetingTemplateAudienceSizingReachEstimate::setEstimate(long estimate)
{
	this->estimate = estimate;
}

long
TargetingTemplateAudienceSizingReachEstimate::getLowerBound()
{
	return lower_bound;
}

void
TargetingTemplateAudienceSizingReachEstimate::setLowerBound(long lower_bound)
{
	this->lower_bound = lower_bound;
}

long
TargetingTemplateAudienceSizingReachEstimate::getUpperBound()
{
	return upper_bound;
}

void
TargetingTemplateAudienceSizingReachEstimate::setUpperBound(long upper_bound)
{
	this->upper_bound = upper_bound;
}



