

#include "CampaignAudienceMultipliers.h"

using namespace Tiny;

CampaignAudienceMultipliers::CampaignAudienceMultipliers()
{
	aUDIENCE_ID = std::string();
}

CampaignAudienceMultipliers::CampaignAudienceMultipliers(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignAudienceMultipliers::~CampaignAudienceMultipliers()
{

}

void
CampaignAudienceMultipliers::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *aUDIENCE_IDKey = "AUDIENCE_ID";

    if(object.has_key(aUDIENCE_IDKey))
    {
        bourne::json value = object[aUDIENCE_IDKey];



        jsonToValue(&aUDIENCE_ID, value, "std::string");


    }


}

bourne::json
CampaignAudienceMultipliers::toJson()
{
    bourne::json object = bourne::json::object();





    object["aUDIENCE_ID"] = getAUDIENCEID();



    return object;

}

std::string
CampaignAudienceMultipliers::getAUDIENCEID()
{
	return aUDIENCE_ID;
}

void
CampaignAudienceMultipliers::setAUDIENCEID(std::string  aUDIENCE_ID)
{
	this->aUDIENCE_ID = aUDIENCE_ID;
}



