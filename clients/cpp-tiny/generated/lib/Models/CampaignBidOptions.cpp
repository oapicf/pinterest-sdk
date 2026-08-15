

#include "CampaignBidOptions.h"

using namespace Tiny;

CampaignBidOptions::CampaignBidOptions()
{
	app_type_multipliers = AppTypeMultipliers();
	audience_multipliers = CampaignAudienceMultipliers();
	placement_multipliers = PlacementMultipliers();
}

CampaignBidOptions::CampaignBidOptions(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignBidOptions::~CampaignBidOptions()
{

}

void
CampaignBidOptions::fromJson(std::string jsonObj)
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
CampaignBidOptions::toJson()
{
    bourne::json object = bourne::json::object();






	object["app_type_multipliers"] = getAppTypeMultipliers().toJson();






	object["audience_multipliers"] = getAudienceMultipliers().toJson();






	object["placement_multipliers"] = getPlacementMultipliers().toJson();


    return object;

}

AppTypeMultipliers
CampaignBidOptions::getAppTypeMultipliers()
{
	return app_type_multipliers;
}

void
CampaignBidOptions::setAppTypeMultipliers(AppTypeMultipliers  app_type_multipliers)
{
	this->app_type_multipliers = app_type_multipliers;
}

CampaignAudienceMultipliers
CampaignBidOptions::getAudienceMultipliers()
{
	return audience_multipliers;
}

void
CampaignBidOptions::setAudienceMultipliers(CampaignAudienceMultipliers  audience_multipliers)
{
	this->audience_multipliers = audience_multipliers;
}

PlacementMultipliers
CampaignBidOptions::getPlacementMultipliers()
{
	return placement_multipliers;
}

void
CampaignBidOptions::setPlacementMultipliers(PlacementMultipliers  placement_multipliers)
{
	this->placement_multipliers = placement_multipliers;
}



