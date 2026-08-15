

#include "CampaignsAnalyticsResponse_inner.h"

using namespace Tiny;

CampaignsAnalyticsResponse_inner::CampaignsAnalyticsResponse_inner()
{
	cAMPAIGN_ID = std::string();
	dATE = std::string();
}

CampaignsAnalyticsResponse_inner::CampaignsAnalyticsResponse_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignsAnalyticsResponse_inner::~CampaignsAnalyticsResponse_inner()
{

}

void
CampaignsAnalyticsResponse_inner::fromJson(std::string jsonObj)
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
CampaignsAnalyticsResponse_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["cAMPAIGN_ID"] = getCAMPAIGNID();







	object["dATE"] = getDATE().toJson();


    return object;

}

std::string
CampaignsAnalyticsResponse_inner::getCAMPAIGNID()
{
	return cAMPAIGN_ID;
}

void
CampaignsAnalyticsResponse_inner::setCAMPAIGNID(std::string  cAMPAIGN_ID)
{
	this->cAMPAIGN_ID = cAMPAIGN_ID;
}

Date
CampaignsAnalyticsResponse_inner::getDATE()
{
	return dATE;
}

void
CampaignsAnalyticsResponse_inner::setDATE(Date  dATE)
{
	this->dATE = dATE;
}



