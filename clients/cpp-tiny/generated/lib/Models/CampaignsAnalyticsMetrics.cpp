

#include "CampaignsAnalyticsMetrics.h"

using namespace Tiny;

CampaignsAnalyticsMetrics::CampaignsAnalyticsMetrics()
{
	cAMPAIGN_ID = std::string();
	dATE = std::string();
}

CampaignsAnalyticsMetrics::CampaignsAnalyticsMetrics(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignsAnalyticsMetrics::~CampaignsAnalyticsMetrics()
{

}

void
CampaignsAnalyticsMetrics::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cAMPAIGN_IDKey = "CAMPAIGN_ID";

    if(object.has_key(cAMPAIGN_IDKey))
    {
        bourne::json value = object[cAMPAIGN_IDKey];



        jsonToValue(&cAMPAIGN_ID, value, "std::string");


    }

    const char *dATEKey = "DATE";

    if(object.has_key(dATEKey))
    {
        bourne::json value = object[dATEKey];




        Date* obj = &dATE;
		obj->fromJson(value.dump());

    }


}

bourne::json
CampaignsAnalyticsMetrics::toJson()
{
    bourne::json object = bourne::json::object();





    object["cAMPAIGN_ID"] = getCAMPAIGNID();







	object["dATE"] = getDATE().toJson();


    return object;

}

std::string
CampaignsAnalyticsMetrics::getCAMPAIGNID()
{
	return cAMPAIGN_ID;
}

void
CampaignsAnalyticsMetrics::setCAMPAIGNID(std::string cAMPAIGN_ID)
{
	this->cAMPAIGN_ID = cAMPAIGN_ID;
}

Date
CampaignsAnalyticsMetrics::getDATE()
{
	return dATE;
}

void
CampaignsAnalyticsMetrics::setDATE(Date dATE)
{
	this->dATE = dATE;
}



