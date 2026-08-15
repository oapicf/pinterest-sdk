

#include "TargetingTemplateAudienceSizing_reach_estimate.h"

using namespace Tiny;

TargetingTemplateAudienceSizing_reach_estimate::TargetingTemplateAudienceSizing_reach_estimate()
{
	estimate = long(0);
	lower_bound = long(0);
	upper_bound = long(0);
}

TargetingTemplateAudienceSizing_reach_estimate::TargetingTemplateAudienceSizing_reach_estimate(std::string jsonString)
{
	this->fromJson(jsonString);
}

TargetingTemplateAudienceSizing_reach_estimate::~TargetingTemplateAudienceSizing_reach_estimate()
{

}

void
TargetingTemplateAudienceSizing_reach_estimate::fromJson(std::string jsonObj)
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
TargetingTemplateAudienceSizing_reach_estimate::toJson()
{
    bourne::json object = bourne::json::object();





    object["estimate"] = getEstimate();






    object["lower_bound"] = getLowerBound();






    object["upper_bound"] = getUpperBound();



    return object;

}

long
TargetingTemplateAudienceSizing_reach_estimate::getEstimate()
{
	return estimate;
}

void
TargetingTemplateAudienceSizing_reach_estimate::setEstimate(long  estimate)
{
	this->estimate = estimate;
}

long
TargetingTemplateAudienceSizing_reach_estimate::getLowerBound()
{
	return lower_bound;
}

void
TargetingTemplateAudienceSizing_reach_estimate::setLowerBound(long  lower_bound)
{
	this->lower_bound = lower_bound;
}

long
TargetingTemplateAudienceSizing_reach_estimate::getUpperBound()
{
	return upper_bound;
}

void
TargetingTemplateAudienceSizing_reach_estimate::setUpperBound(long  upper_bound)
{
	this->upper_bound = upper_bound;
}



