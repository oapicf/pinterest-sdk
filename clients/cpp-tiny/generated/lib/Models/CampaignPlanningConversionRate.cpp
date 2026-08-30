

#include "CampaignPlanningConversionRate.h"

using namespace Tiny;

CampaignPlanningConversionRate::CampaignPlanningConversionRate()
{
	attribution_windows = CampaignPlanningConversionAttribution();
	conversion_event = CampaignPlanningConversionEvent();
	conversion_rate = float(0);
}

CampaignPlanningConversionRate::CampaignPlanningConversionRate(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignPlanningConversionRate::~CampaignPlanningConversionRate()
{

}

void
CampaignPlanningConversionRate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *attribution_windowsKey = "attribution_windows";

    if(object.has_key(attribution_windowsKey))
    {
        bourne::json value = object[attribution_windowsKey];




        CampaignPlanningConversionAttribution* obj = &attribution_windows;
		obj->fromJson(value.dump());

    }

    const char *conversion_eventKey = "conversion_event";

    if(object.has_key(conversion_eventKey))
    {
        bourne::json value = object[conversion_eventKey];




        CampaignPlanningConversionEvent* obj = &conversion_event;
		obj->fromJson(value.dump());

    }

    const char *conversion_rateKey = "conversion_rate";

    if(object.has_key(conversion_rateKey))
    {
        bourne::json value = object[conversion_rateKey];



        jsonToValue(&conversion_rate, value, "float");


    }


}

bourne::json
CampaignPlanningConversionRate::toJson()
{
    bourne::json object = bourne::json::object();






	object["attribution_windows"] = getAttributionWindows().toJson();






	object["conversion_event"] = getConversionEvent().toJson();





    object["conversion_rate"] = getConversionRate();



    return object;

}

CampaignPlanningConversionAttribution
CampaignPlanningConversionRate::getAttributionWindows()
{
	return attribution_windows;
}

void
CampaignPlanningConversionRate::setAttributionWindows(CampaignPlanningConversionAttribution attribution_windows)
{
	this->attribution_windows = attribution_windows;
}

CampaignPlanningConversionEvent
CampaignPlanningConversionRate::getConversionEvent()
{
	return conversion_event;
}

void
CampaignPlanningConversionRate::setConversionEvent(CampaignPlanningConversionEvent conversion_event)
{
	this->conversion_event = conversion_event;
}

float
CampaignPlanningConversionRate::getConversionRate()
{
	return conversion_rate;
}

void
CampaignPlanningConversionRate::setConversionRate(float conversion_rate)
{
	this->conversion_rate = conversion_rate;
}



