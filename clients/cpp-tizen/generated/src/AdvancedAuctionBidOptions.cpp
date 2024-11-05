#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdvancedAuctionBidOptions.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdvancedAuctionBidOptions::AdvancedAuctionBidOptions()
{
	//__init();
}

AdvancedAuctionBidOptions::~AdvancedAuctionBidOptions()
{
	//__cleanup();
}

void
AdvancedAuctionBidOptions::__init()
{
	//bid_in_micro_currency = long(0);
	//app_type_multipliers = new AppTypeMultipliers();
	//placement_multipliers = new PlacementMultipliers();
}

void
AdvancedAuctionBidOptions::__cleanup()
{
	//if(bid_in_micro_currency != NULL) {
	//
	//delete bid_in_micro_currency;
	//bid_in_micro_currency = NULL;
	//}
	//if(app_type_multipliers != NULL) {
	//
	//delete app_type_multipliers;
	//app_type_multipliers = NULL;
	//}
	//if(placement_multipliers != NULL) {
	//
	//delete placement_multipliers;
	//placement_multipliers = NULL;
	//}
	//
}

void
AdvancedAuctionBidOptions::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *bid_in_micro_currencyKey = "bid_in_micro_currency";
	node = json_object_get_member(pJsonObject, bid_in_micro_currencyKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&bid_in_micro_currency, node, "long long", "");
		} else {
			
		}
	}
	const gchar *app_type_multipliersKey = "app_type_multipliers";
	node = json_object_get_member(pJsonObject, app_type_multipliersKey);
	if (node !=NULL) {
	

		if (isprimitive("AppTypeMultipliers")) {
			jsonToValue(&app_type_multipliers, node, "AppTypeMultipliers", "AppTypeMultipliers");
		} else {
			
			AppTypeMultipliers* obj = static_cast<AppTypeMultipliers*> (&app_type_multipliers);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *placement_multipliersKey = "placement_multipliers";
	node = json_object_get_member(pJsonObject, placement_multipliersKey);
	if (node !=NULL) {
	

		if (isprimitive("PlacementMultipliers")) {
			jsonToValue(&placement_multipliers, node, "PlacementMultipliers", "PlacementMultipliers");
		} else {
			
			PlacementMultipliers* obj = static_cast<PlacementMultipliers*> (&placement_multipliers);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AdvancedAuctionBidOptions::AdvancedAuctionBidOptions(char* json)
{
	this->fromJson(json);
}

char*
AdvancedAuctionBidOptions::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getBidInMicroCurrency();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *bid_in_micro_currencyKey = "bid_in_micro_currency";
	json_object_set_member(pJsonObject, bid_in_micro_currencyKey, node);
	if (isprimitive("AppTypeMultipliers")) {
		AppTypeMultipliers obj = getAppTypeMultipliers();
		node = converttoJson(&obj, "AppTypeMultipliers", "");
	}
	else {
		
		AppTypeMultipliers obj = static_cast<AppTypeMultipliers> (getAppTypeMultipliers());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *app_type_multipliersKey = "app_type_multipliers";
	json_object_set_member(pJsonObject, app_type_multipliersKey, node);
	if (isprimitive("PlacementMultipliers")) {
		PlacementMultipliers obj = getPlacementMultipliers();
		node = converttoJson(&obj, "PlacementMultipliers", "");
	}
	else {
		
		PlacementMultipliers obj = static_cast<PlacementMultipliers> (getPlacementMultipliers());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *placement_multipliersKey = "placement_multipliers";
	json_object_set_member(pJsonObject, placement_multipliersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
AdvancedAuctionBidOptions::getBidInMicroCurrency()
{
	return bid_in_micro_currency;
}

void
AdvancedAuctionBidOptions::setBidInMicroCurrency(long long  bid_in_micro_currency)
{
	this->bid_in_micro_currency = bid_in_micro_currency;
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


