

#include "CampaignDeliveryEstimatesDerivedMetrics.h"

using namespace Tiny;

CampaignDeliveryEstimatesDerivedMetrics::CampaignDeliveryEstimatesDerivedMetrics()
{
	cpc = float(0);
	cpc_lower = float(0);
	cpc_upper = float(0);
	cpm = float(0);
	cpm_lower = float(0);
	cpm_upper = float(0);
	lifetime_frequency = float(0);
	lifetime_frequency_lower = float(0);
	lifetime_frequency_upper = float(0);
	lifetime_impression = float(0);
	lifetime_impression_lower = float(0);
	lifetime_impression_upper = float(0);
	lifetime_reach = float(0);
	lifetime_reach_lower = float(0);
	lifetime_reach_upper = float(0);
	weekly_click = float(0);
	weekly_click_lower = float(0);
	weekly_click_upper = float(0);
	weekly_frequency = float(0);
	weekly_frequency_lower = float(0);
	weekly_frequency_upper = float(0);
	weekly_impression = float(0);
	weekly_impression_lower = float(0);
	weekly_impression_upper = float(0);
	weekly_reach = float(0);
	weekly_reach_lower = float(0);
	weekly_reach_upper = float(0);
}

CampaignDeliveryEstimatesDerivedMetrics::CampaignDeliveryEstimatesDerivedMetrics(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignDeliveryEstimatesDerivedMetrics::~CampaignDeliveryEstimatesDerivedMetrics()
{

}

void
CampaignDeliveryEstimatesDerivedMetrics::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cpcKey = "cpc";

    if(object.has_key(cpcKey))
    {
        bourne::json value = object[cpcKey];



        jsonToValue(&cpc, value, "float");


    }

    const char *cpc_lowerKey = "cpc_lower";

    if(object.has_key(cpc_lowerKey))
    {
        bourne::json value = object[cpc_lowerKey];



        jsonToValue(&cpc_lower, value, "float");


    }

    const char *cpc_upperKey = "cpc_upper";

    if(object.has_key(cpc_upperKey))
    {
        bourne::json value = object[cpc_upperKey];



        jsonToValue(&cpc_upper, value, "float");


    }

    const char *cpmKey = "cpm";

    if(object.has_key(cpmKey))
    {
        bourne::json value = object[cpmKey];



        jsonToValue(&cpm, value, "float");


    }

    const char *cpm_lowerKey = "cpm_lower";

    if(object.has_key(cpm_lowerKey))
    {
        bourne::json value = object[cpm_lowerKey];



        jsonToValue(&cpm_lower, value, "float");


    }

    const char *cpm_upperKey = "cpm_upper";

    if(object.has_key(cpm_upperKey))
    {
        bourne::json value = object[cpm_upperKey];



        jsonToValue(&cpm_upper, value, "float");


    }

    const char *lifetime_frequencyKey = "lifetime_frequency";

    if(object.has_key(lifetime_frequencyKey))
    {
        bourne::json value = object[lifetime_frequencyKey];



        jsonToValue(&lifetime_frequency, value, "float");


    }

    const char *lifetime_frequency_lowerKey = "lifetime_frequency_lower";

    if(object.has_key(lifetime_frequency_lowerKey))
    {
        bourne::json value = object[lifetime_frequency_lowerKey];



        jsonToValue(&lifetime_frequency_lower, value, "float");


    }

    const char *lifetime_frequency_upperKey = "lifetime_frequency_upper";

    if(object.has_key(lifetime_frequency_upperKey))
    {
        bourne::json value = object[lifetime_frequency_upperKey];



        jsonToValue(&lifetime_frequency_upper, value, "float");


    }

    const char *lifetime_impressionKey = "lifetime_impression";

    if(object.has_key(lifetime_impressionKey))
    {
        bourne::json value = object[lifetime_impressionKey];



        jsonToValue(&lifetime_impression, value, "float");


    }

    const char *lifetime_impression_lowerKey = "lifetime_impression_lower";

    if(object.has_key(lifetime_impression_lowerKey))
    {
        bourne::json value = object[lifetime_impression_lowerKey];



        jsonToValue(&lifetime_impression_lower, value, "float");


    }

    const char *lifetime_impression_upperKey = "lifetime_impression_upper";

    if(object.has_key(lifetime_impression_upperKey))
    {
        bourne::json value = object[lifetime_impression_upperKey];



        jsonToValue(&lifetime_impression_upper, value, "float");


    }

    const char *lifetime_reachKey = "lifetime_reach";

    if(object.has_key(lifetime_reachKey))
    {
        bourne::json value = object[lifetime_reachKey];



        jsonToValue(&lifetime_reach, value, "float");


    }

    const char *lifetime_reach_lowerKey = "lifetime_reach_lower";

    if(object.has_key(lifetime_reach_lowerKey))
    {
        bourne::json value = object[lifetime_reach_lowerKey];



        jsonToValue(&lifetime_reach_lower, value, "float");


    }

    const char *lifetime_reach_upperKey = "lifetime_reach_upper";

    if(object.has_key(lifetime_reach_upperKey))
    {
        bourne::json value = object[lifetime_reach_upperKey];



        jsonToValue(&lifetime_reach_upper, value, "float");


    }

    const char *weekly_clickKey = "weekly_click";

    if(object.has_key(weekly_clickKey))
    {
        bourne::json value = object[weekly_clickKey];



        jsonToValue(&weekly_click, value, "float");


    }

    const char *weekly_click_lowerKey = "weekly_click_lower";

    if(object.has_key(weekly_click_lowerKey))
    {
        bourne::json value = object[weekly_click_lowerKey];



        jsonToValue(&weekly_click_lower, value, "float");


    }

    const char *weekly_click_upperKey = "weekly_click_upper";

    if(object.has_key(weekly_click_upperKey))
    {
        bourne::json value = object[weekly_click_upperKey];



        jsonToValue(&weekly_click_upper, value, "float");


    }

    const char *weekly_frequencyKey = "weekly_frequency";

    if(object.has_key(weekly_frequencyKey))
    {
        bourne::json value = object[weekly_frequencyKey];



        jsonToValue(&weekly_frequency, value, "float");


    }

    const char *weekly_frequency_lowerKey = "weekly_frequency_lower";

    if(object.has_key(weekly_frequency_lowerKey))
    {
        bourne::json value = object[weekly_frequency_lowerKey];



        jsonToValue(&weekly_frequency_lower, value, "float");


    }

    const char *weekly_frequency_upperKey = "weekly_frequency_upper";

    if(object.has_key(weekly_frequency_upperKey))
    {
        bourne::json value = object[weekly_frequency_upperKey];



        jsonToValue(&weekly_frequency_upper, value, "float");


    }

    const char *weekly_impressionKey = "weekly_impression";

    if(object.has_key(weekly_impressionKey))
    {
        bourne::json value = object[weekly_impressionKey];



        jsonToValue(&weekly_impression, value, "float");


    }

    const char *weekly_impression_lowerKey = "weekly_impression_lower";

    if(object.has_key(weekly_impression_lowerKey))
    {
        bourne::json value = object[weekly_impression_lowerKey];



        jsonToValue(&weekly_impression_lower, value, "float");


    }

    const char *weekly_impression_upperKey = "weekly_impression_upper";

    if(object.has_key(weekly_impression_upperKey))
    {
        bourne::json value = object[weekly_impression_upperKey];



        jsonToValue(&weekly_impression_upper, value, "float");


    }

    const char *weekly_reachKey = "weekly_reach";

    if(object.has_key(weekly_reachKey))
    {
        bourne::json value = object[weekly_reachKey];



        jsonToValue(&weekly_reach, value, "float");


    }

    const char *weekly_reach_lowerKey = "weekly_reach_lower";

    if(object.has_key(weekly_reach_lowerKey))
    {
        bourne::json value = object[weekly_reach_lowerKey];



        jsonToValue(&weekly_reach_lower, value, "float");


    }

    const char *weekly_reach_upperKey = "weekly_reach_upper";

    if(object.has_key(weekly_reach_upperKey))
    {
        bourne::json value = object[weekly_reach_upperKey];



        jsonToValue(&weekly_reach_upper, value, "float");


    }


}

bourne::json
CampaignDeliveryEstimatesDerivedMetrics::toJson()
{
    bourne::json object = bourne::json::object();





    object["cpc"] = getCpc();






    object["cpc_lower"] = getCpcLower();






    object["cpc_upper"] = getCpcUpper();






    object["cpm"] = getCpm();






    object["cpm_lower"] = getCpmLower();






    object["cpm_upper"] = getCpmUpper();






    object["lifetime_frequency"] = getLifetimeFrequency();






    object["lifetime_frequency_lower"] = getLifetimeFrequencyLower();






    object["lifetime_frequency_upper"] = getLifetimeFrequencyUpper();






    object["lifetime_impression"] = getLifetimeImpression();






    object["lifetime_impression_lower"] = getLifetimeImpressionLower();






    object["lifetime_impression_upper"] = getLifetimeImpressionUpper();






    object["lifetime_reach"] = getLifetimeReach();






    object["lifetime_reach_lower"] = getLifetimeReachLower();






    object["lifetime_reach_upper"] = getLifetimeReachUpper();






    object["weekly_click"] = getWeeklyClick();






    object["weekly_click_lower"] = getWeeklyClickLower();






    object["weekly_click_upper"] = getWeeklyClickUpper();






    object["weekly_frequency"] = getWeeklyFrequency();






    object["weekly_frequency_lower"] = getWeeklyFrequencyLower();






    object["weekly_frequency_upper"] = getWeeklyFrequencyUpper();






    object["weekly_impression"] = getWeeklyImpression();






    object["weekly_impression_lower"] = getWeeklyImpressionLower();






    object["weekly_impression_upper"] = getWeeklyImpressionUpper();






    object["weekly_reach"] = getWeeklyReach();






    object["weekly_reach_lower"] = getWeeklyReachLower();






    object["weekly_reach_upper"] = getWeeklyReachUpper();



    return object;

}

float
CampaignDeliveryEstimatesDerivedMetrics::getCpc()
{
	return cpc;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setCpc(float cpc)
{
	this->cpc = cpc;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getCpcLower()
{
	return cpc_lower;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setCpcLower(float cpc_lower)
{
	this->cpc_lower = cpc_lower;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getCpcUpper()
{
	return cpc_upper;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setCpcUpper(float cpc_upper)
{
	this->cpc_upper = cpc_upper;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getCpm()
{
	return cpm;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setCpm(float cpm)
{
	this->cpm = cpm;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getCpmLower()
{
	return cpm_lower;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setCpmLower(float cpm_lower)
{
	this->cpm_lower = cpm_lower;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getCpmUpper()
{
	return cpm_upper;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setCpmUpper(float cpm_upper)
{
	this->cpm_upper = cpm_upper;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getLifetimeFrequency()
{
	return lifetime_frequency;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setLifetimeFrequency(float lifetime_frequency)
{
	this->lifetime_frequency = lifetime_frequency;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getLifetimeFrequencyLower()
{
	return lifetime_frequency_lower;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setLifetimeFrequencyLower(float lifetime_frequency_lower)
{
	this->lifetime_frequency_lower = lifetime_frequency_lower;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getLifetimeFrequencyUpper()
{
	return lifetime_frequency_upper;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setLifetimeFrequencyUpper(float lifetime_frequency_upper)
{
	this->lifetime_frequency_upper = lifetime_frequency_upper;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getLifetimeImpression()
{
	return lifetime_impression;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setLifetimeImpression(float lifetime_impression)
{
	this->lifetime_impression = lifetime_impression;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getLifetimeImpressionLower()
{
	return lifetime_impression_lower;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setLifetimeImpressionLower(float lifetime_impression_lower)
{
	this->lifetime_impression_lower = lifetime_impression_lower;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getLifetimeImpressionUpper()
{
	return lifetime_impression_upper;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setLifetimeImpressionUpper(float lifetime_impression_upper)
{
	this->lifetime_impression_upper = lifetime_impression_upper;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getLifetimeReach()
{
	return lifetime_reach;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setLifetimeReach(float lifetime_reach)
{
	this->lifetime_reach = lifetime_reach;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getLifetimeReachLower()
{
	return lifetime_reach_lower;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setLifetimeReachLower(float lifetime_reach_lower)
{
	this->lifetime_reach_lower = lifetime_reach_lower;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getLifetimeReachUpper()
{
	return lifetime_reach_upper;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setLifetimeReachUpper(float lifetime_reach_upper)
{
	this->lifetime_reach_upper = lifetime_reach_upper;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getWeeklyClick()
{
	return weekly_click;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setWeeklyClick(float weekly_click)
{
	this->weekly_click = weekly_click;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getWeeklyClickLower()
{
	return weekly_click_lower;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setWeeklyClickLower(float weekly_click_lower)
{
	this->weekly_click_lower = weekly_click_lower;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getWeeklyClickUpper()
{
	return weekly_click_upper;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setWeeklyClickUpper(float weekly_click_upper)
{
	this->weekly_click_upper = weekly_click_upper;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getWeeklyFrequency()
{
	return weekly_frequency;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setWeeklyFrequency(float weekly_frequency)
{
	this->weekly_frequency = weekly_frequency;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getWeeklyFrequencyLower()
{
	return weekly_frequency_lower;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setWeeklyFrequencyLower(float weekly_frequency_lower)
{
	this->weekly_frequency_lower = weekly_frequency_lower;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getWeeklyFrequencyUpper()
{
	return weekly_frequency_upper;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setWeeklyFrequencyUpper(float weekly_frequency_upper)
{
	this->weekly_frequency_upper = weekly_frequency_upper;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getWeeklyImpression()
{
	return weekly_impression;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setWeeklyImpression(float weekly_impression)
{
	this->weekly_impression = weekly_impression;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getWeeklyImpressionLower()
{
	return weekly_impression_lower;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setWeeklyImpressionLower(float weekly_impression_lower)
{
	this->weekly_impression_lower = weekly_impression_lower;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getWeeklyImpressionUpper()
{
	return weekly_impression_upper;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setWeeklyImpressionUpper(float weekly_impression_upper)
{
	this->weekly_impression_upper = weekly_impression_upper;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getWeeklyReach()
{
	return weekly_reach;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setWeeklyReach(float weekly_reach)
{
	this->weekly_reach = weekly_reach;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getWeeklyReachLower()
{
	return weekly_reach_lower;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setWeeklyReachLower(float weekly_reach_lower)
{
	this->weekly_reach_lower = weekly_reach_lower;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getWeeklyReachUpper()
{
	return weekly_reach_upper;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setWeeklyReachUpper(float weekly_reach_upper)
{
	this->weekly_reach_upper = weekly_reach_upper;
}



