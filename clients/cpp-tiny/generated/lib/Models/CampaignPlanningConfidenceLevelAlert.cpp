

#include "CampaignPlanningConfidenceLevelAlert.h"

using namespace Tiny;

CampaignPlanningConfidenceLevelAlert::CampaignPlanningConfidenceLevelAlert()
{
	description = std::string();
	reason = null;
	severity = null;
}

CampaignPlanningConfidenceLevelAlert::CampaignPlanningConfidenceLevelAlert(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignPlanningConfidenceLevelAlert::~CampaignPlanningConfidenceLevelAlert()
{

}

void
CampaignPlanningConfidenceLevelAlert::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *reasonKey = "reason";

    if(object.has_key(reasonKey))
    {
        bourne::json value = object[reasonKey];




        CampaignPlanningConfidenceLevelAlertReason* obj = &reason;
		obj->fromJson(value.dump());

    }

    const char *severityKey = "severity";

    if(object.has_key(severityKey))
    {
        bourne::json value = object[severityKey];




        CampaignPlanningConfidenceLevelAlertSeverity* obj = &severity;
		obj->fromJson(value.dump());

    }


}

bourne::json
CampaignPlanningConfidenceLevelAlert::toJson()
{
    bourne::json object = bourne::json::object();





    object["description"] = getDescription();







	object["reason"] = getReason().toJson();






	object["severity"] = getSeverity().toJson();


    return object;

}

std::string
CampaignPlanningConfidenceLevelAlert::getDescription()
{
	return description;
}

void
CampaignPlanningConfidenceLevelAlert::setDescription(std::string description)
{
	this->description = description;
}

CampaignPlanningConfidenceLevelAlertReason
CampaignPlanningConfidenceLevelAlert::getReason()
{
	return reason;
}

void
CampaignPlanningConfidenceLevelAlert::setReason(CampaignPlanningConfidenceLevelAlertReason reason)
{
	this->reason = reason;
}

CampaignPlanningConfidenceLevelAlertSeverity
CampaignPlanningConfidenceLevelAlert::getSeverity()
{
	return severity;
}

void
CampaignPlanningConfidenceLevelAlert::setSeverity(CampaignPlanningConfidenceLevelAlertSeverity severity)
{
	this->severity = severity;
}



