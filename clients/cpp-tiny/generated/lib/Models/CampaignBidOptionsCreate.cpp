

#include "CampaignBidOptionsCreate.h"

using namespace Tiny;

CampaignBidOptionsCreate::CampaignBidOptionsCreate()
{
	app_type_multipliers = AppTypeMultipliers();
	audience_multipliers = CampaignAudienceMultipliers();
	placement_multipliers = PlacementMultipliers();
}

CampaignBidOptionsCreate::CampaignBidOptionsCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignBidOptionsCreate::~CampaignBidOptionsCreate()
{

}

void
CampaignBidOptionsCreate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *app_type_multipliersKey = "app_type_multipliers";

    if(object.has_key(app_type_multipliersKey))
    {
        bourne::json value = object[app_type_multipliersKey];




        AppTypeMultipliers* obj = &app_type_multipliers;
		obj->fromJson(value.dump());

    }

    const char *audience_multipliersKey = "audience_multipliers";

    if(object.has_key(audience_multipliersKey))
    {
        bourne::json value = object[audience_multipliersKey];




        CampaignAudienceMultipliers* obj = &audience_multipliers;
		obj->fromJson(value.dump());

    }

    const char *placement_multipliersKey = "placement_multipliers";

    if(object.has_key(placement_multipliersKey))
    {
        bourne::json value = object[placement_multipliersKey];




        PlacementMultipliers* obj = &placement_multipliers;
		obj->fromJson(value.dump());

    }


}

bourne::json
CampaignBidOptionsCreate::toJson()
{
    bourne::json object = bourne::json::object();






	object["app_type_multipliers"] = getAppTypeMultipliers().toJson();






	object["audience_multipliers"] = getAudienceMultipliers().toJson();






	object["placement_multipliers"] = getPlacementMultipliers().toJson();


    return object;

}

AppTypeMultipliers
CampaignBidOptionsCreate::getAppTypeMultipliers()
{
	return app_type_multipliers;
}

void
CampaignBidOptionsCreate::setAppTypeMultipliers(AppTypeMultipliers  app_type_multipliers)
{
	this->app_type_multipliers = app_type_multipliers;
}

CampaignAudienceMultipliers
CampaignBidOptionsCreate::getAudienceMultipliers()
{
	return audience_multipliers;
}

void
CampaignBidOptionsCreate::setAudienceMultipliers(CampaignAudienceMultipliers  audience_multipliers)
{
	this->audience_multipliers = audience_multipliers;
}

PlacementMultipliers
CampaignBidOptionsCreate::getPlacementMultipliers()
{
	return placement_multipliers;
}

void
CampaignBidOptionsCreate::setPlacementMultipliers(PlacementMultipliers  placement_multipliers)
{
	this->placement_multipliers = placement_multipliers;
}



