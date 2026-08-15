

#include "TargetingTemplateAudienceSizing.h"

using namespace Tiny;

TargetingTemplateAudienceSizing::TargetingTemplateAudienceSizing()
{
	reach_estimate = TargetingTemplateAudienceSizing_reach_estimate();
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




        TargetingTemplateAudienceSizing_reach_estimate* obj = &reach_estimate;
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

TargetingTemplateAudienceSizing_reach_estimate
TargetingTemplateAudienceSizing::getReachEstimate()
{
	return reach_estimate;
}

void
TargetingTemplateAudienceSizing::setReachEstimate(TargetingTemplateAudienceSizing_reach_estimate  reach_estimate)
{
	this->reach_estimate = reach_estimate;
}



