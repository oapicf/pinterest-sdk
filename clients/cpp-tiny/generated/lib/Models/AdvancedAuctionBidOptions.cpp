

#include "AdvancedAuctionBidOptions.h"

using namespace Tiny;

AdvancedAuctionBidOptions::AdvancedAuctionBidOptions()
{
	app_type_multipliers = AppTypeMultipliers();
	bid_in_micro_currency = long(0);
	placement_multipliers = PlacementMultipliers();
}

AdvancedAuctionBidOptions::AdvancedAuctionBidOptions(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdvancedAuctionBidOptions::~AdvancedAuctionBidOptions()
{

}

void
AdvancedAuctionBidOptions::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *app_type_multipliersKey = "app_type_multipliers";

    if(object.has_key(app_type_multipliersKey))
    {
        bourne::json value = object[app_type_multipliersKey];




        AppTypeMultipliers* obj = &app_type_multipliers;
		obj->fromJson(value.dump());

    }

    const char *bid_in_micro_currencyKey = "bid_in_micro_currency";

    if(object.has_key(bid_in_micro_currencyKey))
    {
        bourne::json value = object[bid_in_micro_currencyKey];



        jsonToValue(&bid_in_micro_currency, value, "long");


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
AdvancedAuctionBidOptions::toJson()
{
    bourne::json object = bourne::json::object();






	object["app_type_multipliers"] = getAppTypeMultipliers().toJson();





    object["bid_in_micro_currency"] = getBidInMicroCurrency();







	object["placement_multipliers"] = getPlacementMultipliers().toJson();


    return object;

}

AppTypeMultipliers
AdvancedAuctionBidOptions::getAppTypeMultipliers()
{
	return app_type_multipliers;
}

void
AdvancedAuctionBidOptions::setAppTypeMultipliers(AppTypeMultipliers  app_type_multipliers)
{
	this->app_type_multipliers = app_type_multipliers;
}

long
AdvancedAuctionBidOptions::getBidInMicroCurrency()
{
	return bid_in_micro_currency;
}

void
AdvancedAuctionBidOptions::setBidInMicroCurrency(long  bid_in_micro_currency)
{
	this->bid_in_micro_currency = bid_in_micro_currency;
}

PlacementMultipliers
AdvancedAuctionBidOptions::getPlacementMultipliers()
{
	return placement_multipliers;
}

void
AdvancedAuctionBidOptions::setPlacementMultipliers(PlacementMultipliers  placement_multipliers)
{
	this->placement_multipliers = placement_multipliers;
}



