

#include "TargetingTemplateAudienceSizing.h"

using namespace Tiny;

TargetingTemplateAudienceSizing::TargetingTemplateAudienceSizing()
{
	reach_estimate = TargetingTemplateAudienceSizingReachEstimate();
}

TargetingTemplateAudienceSizing::TargetingTemplateAudienceSizing(std::string jsonString)
{
	this->fromJson(jsonString);
}

TargetingTemplateAudienceSizing::~TargetingTemplateAudienceSizing()
{

}

void
TargetingTemplateAudienceSizing::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *reach_estimateKey = "reach_estimate";

    if(object.has_key(reach_estimateKey))
    {
        bourne::json value = object[reach_estimateKey];




        TargetingTemplateAudienceSizingReachEstimate* obj = &reach_estimate;
		obj->fromJson(value.dump());

    }


}

bourne::json
TargetingTemplateAudienceSizing::toJson()
{
    bourne::json object = bourne::json::object();






	object["reach_estimate"] = getReachEstimate().toJson();


    return object;

}

TargetingTemplateAudienceSizingReachEstimate
TargetingTemplateAudienceSizing::getReachEstimate()
{
	return reach_estimate;
}

void
TargetingTemplateAudienceSizing::setReachEstimate(TargetingTemplateAudienceSizingReachEstimate reach_estimate)
{
	this->reach_estimate = reach_estimate;
}



