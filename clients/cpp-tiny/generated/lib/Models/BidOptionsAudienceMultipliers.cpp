

#include "BidOptionsAudienceMultipliers.h"

using namespace Tiny;

BidOptionsAudienceMultipliers::BidOptionsAudienceMultipliers()
{
	audience_id = std::string();
	multiplier = float(0);
}

BidOptionsAudienceMultipliers::BidOptionsAudienceMultipliers(std::string jsonString)
{
	this->fromJson(jsonString);
}

BidOptionsAudienceMultipliers::~BidOptionsAudienceMultipliers()
{

}

void
BidOptionsAudienceMultipliers::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *audience_idKey = "audience_id";

    if(object.has_key(audience_idKey))
    {
        bourne::json value = object[audience_idKey];



        jsonToValue(&audience_id, value, "std::string");


    }

    const char *multiplierKey = "multiplier";

    if(object.has_key(multiplierKey))
    {
        bourne::json value = object[multiplierKey];



        jsonToValue(&multiplier, value, "long");


    }


}

bourne::json
BidOptionsAudienceMultipliers::toJson()
{
    bourne::json object = bourne::json::object();





    object["audience_id"] = getAudienceId();






    object["multiplier"] = getMultiplier();



    return object;

}

std::string
BidOptionsAudienceMultipliers::getAudienceId()
{
	return audience_id;
}

void
BidOptionsAudienceMultipliers::setAudienceId(std::string audience_id)
{
	this->audience_id = audience_id;
}

long
BidOptionsAudienceMultipliers::getMultiplier()
{
	return multiplier;
}

void
BidOptionsAudienceMultipliers::setMultiplier(long multiplier)
{
	this->multiplier = multiplier;
}



