

#include "CampaignBidOptionsUpdate.h"

using namespace Tiny;

CampaignBidOptionsUpdate::CampaignBidOptionsUpdate()
{
	age_bucket_multipliers = null;
	app_type_multipliers = null;
	audience_multipliers = null;
	freq_bid_multiplier_time_window = null;
	frequency_multipliers = null;
	gender_multipliers = null;
	placement_multipliers = null;
	update_mask = std::list<CampaignBidOptionsUpdateMaskItems>();
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

    const char *age_bucket_multipliersKey = "age_bucket_multipliers";

    if(object.has_key(age_bucket_multipliersKey))
    {
        bourne::json value = object[age_bucket_multipliersKey];




        AgeBucketMultipliers* obj = &age_bucket_multipliers;
		obj->fromJson(value.dump());

    }

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

    const char *freq_bid_multiplier_time_windowKey = "freq_bid_multiplier_time_window";

    if(object.has_key(freq_bid_multiplier_time_windowKey))
    {
        bourne::json value = object[freq_bid_multiplier_time_windowKey];




        FreqBidMultiplierTimeWindow* obj = &freq_bid_multiplier_time_window;
		obj->fromJson(value.dump());

    }

    const char *frequency_multipliersKey = "frequency_multipliers";

    if(object.has_key(frequency_multipliersKey))
    {
        bourne::json value = object[frequency_multipliersKey];




        FrequencyMultipliers* obj = &frequency_multipliers;
		obj->fromJson(value.dump());

    }

    const char *gender_multipliersKey = "gender_multipliers";

    if(object.has_key(gender_multipliersKey))
    {
        bourne::json value = object[gender_multipliersKey];




        GenderMultipliers* obj = &gender_multipliers;
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


        std::list<CampaignBidOptionsUpdateMaskItems> update_mask_list;
        CampaignBidOptionsUpdateMaskItems element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            update_mask_list.push_back(element);
        }
        update_mask = update_mask_list;


    }


}

bourne::json
CampaignBidOptionsUpdate::toJson()
{
    bourne::json object = bourne::json::object();






	object["age_bucket_multipliers"] = getAgeBucketMultipliers().toJson();






	object["app_type_multipliers"] = getAppTypeMultipliers().toJson();






	object["audience_multipliers"] = getAudienceMultipliers().toJson();






	object["freq_bid_multiplier_time_window"] = getFreqBidMultiplierTimeWindow().toJson();






	object["frequency_multipliers"] = getFrequencyMultipliers().toJson();






	object["gender_multipliers"] = getGenderMultipliers().toJson();






	object["placement_multipliers"] = getPlacementMultipliers().toJson();




    std::list<CampaignBidOptionsUpdateMaskItems> update_mask_list = getUpdateMask();
    bourne::json update_mask_arr = bourne::json::array();

    for(auto& var : update_mask_list)
    {
        CampaignBidOptionsUpdateMaskItems obj = var;
        update_mask_arr.append(obj.toJson());
    }
    object["update_mask"] = update_mask_arr;




    return object;

}

AgeBucketMultipliers&lt;std::string, double&gt;
CampaignBidOptionsUpdate::getAgeBucketMultipliers()
{
	return age_bucket_multipliers;
}

void
CampaignBidOptionsUpdate::setAgeBucketMultipliers(AgeBucketMultipliers&lt;std::string, double&gt; age_bucket_multipliers)
{
	this->age_bucket_multipliers = age_bucket_multipliers;
}

AppTypeMultipliers&lt;std::string, double&gt;
CampaignBidOptionsUpdate::getAppTypeMultipliers()
{
	return app_type_multipliers;
}

void
CampaignBidOptionsUpdate::setAppTypeMultipliers(AppTypeMultipliers&lt;std::string, double&gt; app_type_multipliers)
{
	this->app_type_multipliers = app_type_multipliers;
}

CampaignAudienceMultipliers&lt;std::string, double&gt;
CampaignBidOptionsUpdate::getAudienceMultipliers()
{
	return audience_multipliers;
}

void
CampaignBidOptionsUpdate::setAudienceMultipliers(CampaignAudienceMultipliers&lt;std::string, double&gt; audience_multipliers)
{
	this->audience_multipliers = audience_multipliers;
}

FreqBidMultiplierTimeWindow
CampaignBidOptionsUpdate::getFreqBidMultiplierTimeWindow()
{
	return freq_bid_multiplier_time_window;
}

void
CampaignBidOptionsUpdate::setFreqBidMultiplierTimeWindow(FreqBidMultiplierTimeWindow freq_bid_multiplier_time_window)
{
	this->freq_bid_multiplier_time_window = freq_bid_multiplier_time_window;
}

FrequencyMultipliers&lt;std::string, double&gt;
CampaignBidOptionsUpdate::getFrequencyMultipliers()
{
	return frequency_multipliers;
}

void
CampaignBidOptionsUpdate::setFrequencyMultipliers(FrequencyMultipliers&lt;std::string, double&gt; frequency_multipliers)
{
	this->frequency_multipliers = frequency_multipliers;
}

GenderMultipliers&lt;std::string, double&gt;
CampaignBidOptionsUpdate::getGenderMultipliers()
{
	return gender_multipliers;
}

void
CampaignBidOptionsUpdate::setGenderMultipliers(GenderMultipliers&lt;std::string, double&gt; gender_multipliers)
{
	this->gender_multipliers = gender_multipliers;
}

PlacementMultipliers&lt;std::string, double&gt;
CampaignBidOptionsUpdate::getPlacementMultipliers()
{
	return placement_multipliers;
}

void
CampaignBidOptionsUpdate::setPlacementMultipliers(PlacementMultipliers&lt;std::string, double&gt; placement_multipliers)
{
	this->placement_multipliers = placement_multipliers;
}

std::list<CampaignBidOptionsUpdateMaskItems>
CampaignBidOptionsUpdate::getUpdateMask()
{
	return update_mask;
}

void
CampaignBidOptionsUpdate::setUpdateMask(std::list<CampaignBidOptionsUpdateMaskItems> update_mask)
{
	this->update_mask = update_mask;
}



