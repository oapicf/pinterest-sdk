

#include "ScheduleAudienceMultipliers.h"

using namespace Tiny;

ScheduleAudienceMultipliers::ScheduleAudienceMultipliers()
{
	aUDIENCE_ID = std::string();
}

ScheduleAudienceMultipliers::ScheduleAudienceMultipliers(std::string jsonString)
{
	this->fromJson(jsonString);
}

ScheduleAudienceMultipliers::~ScheduleAudienceMultipliers()
{

}

void
ScheduleAudienceMultipliers::fromJson(std::string jsonObj)
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
ScheduleAudienceMultipliers::toJson()
{
    bourne::json object = bourne::json::object();





    object["aUDIENCE_ID"] = getAUDIENCEID();



    return object;

}

std::string
ScheduleAudienceMultipliers::getAUDIENCEID()
{
	return aUDIENCE_ID;
}

void
ScheduleAudienceMultipliers::setAUDIENCEID(std::string aUDIENCE_ID)
{
	this->aUDIENCE_ID = aUDIENCE_ID;
}



