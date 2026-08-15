

#include "CampaignBidOptionsUpdate.h"

using namespace Tiny;

CampaignBidOptionsUpdate::CampaignBidOptionsUpdate()
{
	app_type_multipliers = AppTypeMultipliers();
	audience_multipliers = CampaignAudienceMultipliers();
	placement_multipliers = PlacementMultipliers();
	update_mask = std::list<std::string>();
}

CampaignBidOptionsUpdate::CampaignBidOptionsUpdate(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignBidOptionsUpdate::~CampaignBidOptionsUpdate()
{

}

void
CampaignBidOptionsUpdate::fromJson(std::string jsonObj)
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

    const char *update_maskKey = "update_mask";

    if(object.has_key(update_maskKey))
    {
        bourne::json value = object[update_maskKey];


        std::list<std::string> update_mask_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            update_mask_list.push_back(element);
        }
        update_mask = update_mask_list;


    }


}

bourne::json
CampaignBidOptionsUpdate::toJson()
{
    bourne::json object = bourne::json::object();






	object["app_type_multipliers"] = getAppTypeMultipliers().toJson();






	object["audience_multipliers"] = getAudienceMultipliers().toJson();






	object["placement_multipliers"] = getPlacementMultipliers().toJson();




    std::list<std::string> update_mask_list = getUpdateMask();
    bourne::json update_mask_arr = bourne::json::array();

    for(auto& var : update_mask_list)
    {
        update_mask_arr.append(var);
    }
    object["update_mask"] = update_mask_arr;






    return object;

}

AppTypeMultipliers
CampaignBidOptionsUpdate::getAppTypeMultipliers()
{
	return app_type_multipliers;
}

void
CampaignBidOptionsUpdate::setAppTypeMultipliers(AppTypeMultipliers  app_type_multipliers)
{
	this->app_type_multipliers = app_type_multipliers;
}

CampaignAudienceMultipliers
CampaignBidOptionsUpdate::getAudienceMultipliers()
{
	return audience_multipliers;
}

void
CampaignBidOptionsUpdate::setAudienceMultipliers(CampaignAudienceMultipliers  audience_multipliers)
{
	this->audience_multipliers = audience_multipliers;
}

PlacementMultipliers
CampaignBidOptionsUpdate::getPlacementMultipliers()
{
	return placement_multipliers;
}

void
CampaignBidOptionsUpdate::setPlacementMultipliers(PlacementMultipliers  placement_multipliers)
{
	this->placement_multipliers = placement_multipliers;
}

std::list<std::string>
CampaignBidOptionsUpdate::getUpdateMask()
{
	return update_mask;
}

void
CampaignBidOptionsUpdate::setUpdateMask(std::list <std::string> update_mask)
{
	this->update_mask = update_mask;
}



