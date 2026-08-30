#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdGroupCreateCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdGroupCreateCreate::AdGroupCreateCreate()
{
	//__init();
}

AdGroupCreateCreate::~AdGroupCreateCreate()
{
	//__cleanup();
}

void
AdGroupCreateCreate::__init()
{
	//auto_targeting_enabled = bool(false);
	//bid_in_micro_currency = int(0);
	//bid_multiplier = double(0);
	//bid_strategy_type = new BidStrategyType();
	//billable_event = new ActionType();
	//budget_in_micro_currency = int(0);
	//budget_type = null;
	//campaign_id = std::string();
	//customer_segment_id = null;
	//end_time = int(0);
	//ext_features = new AdgroupTrackingFeatures();
	//feed_profile_id = std::string();
	//is_creative_optimization = bool(false);
	//is_local_inventory = bool(false);
	//lifetime_frequency_cap = int(0);
	//local_inventory_radius_in_miles = double(0);
	//name = std::string();
	//optimization_goal_metadata = null;
	//pacing_delivery_type = null;
	//performance_plus_campaign_settings = null;
	//placement_group = null;
	//placement_traffic_type = null;
	//promotion_application_level = null;
	//promotion_id = std::string();
	//new std::list()std::list> promotion_ids;
	//start_time = int(0);
	//status = null;
	//targeting_spec = new TargetingSpecOptimal();
	//new std::list()std::list> targeting_template_ids;
	//tracking_urls = new AdGroupTrackingURLs();
}

void
AdGroupCreateCreate::__cleanup()
{
	//if(auto_targeting_enabled != NULL) {
	//
	//delete auto_targeting_enabled;
	//auto_targeting_enabled = NULL;
	//}
	//if(bid_in_micro_currency != NULL) {
	//
	//delete bid_in_micro_currency;
	//bid_in_micro_currency = NULL;
	//}
	//if(bid_multiplier != NULL) {
	//
	//delete bid_multiplier;
	//bid_multiplier = NULL;
	//}
	//if(bid_strategy_type != NULL) {
	//
	//delete bid_strategy_type;
	//bid_strategy_type = NULL;
	//}
	//if(billable_event != NULL) {
	//
	//delete billable_event;
	//billable_event = NULL;
	//}
	//if(budget_in_micro_currency != NULL) {
	//
	//delete budget_in_micro_currency;
	//budget_in_micro_currency = NULL;
	//}
	//if(budget_type != NULL) {
	//
	//delete budget_type;
	//budget_type = NULL;
	//}
	//if(campaign_id != NULL) {
	//
	//delete campaign_id;
	//campaign_id = NULL;
	//}
	//if(customer_segment_id != NULL) {
	//
	//delete customer_segment_id;
	//customer_segment_id = NULL;
	//}
	//if(end_time != NULL) {
	//
	//delete end_time;
	//end_time = NULL;
	//}
	//if(ext_features != NULL) {
	//
	//delete ext_features;
	//ext_features = NULL;
	//}
	//if(feed_profile_id != NULL) {
	//
	//delete feed_profile_id;
	//feed_profile_id = NULL;
	//}
	//if(is_creative_optimization != NULL) {
	//
	//delete is_creative_optimization;
	//is_creative_optimization = NULL;
	//}
	//if(is_local_inventory != NULL) {
	//
	//delete is_local_inventory;
	//is_local_inventory = NULL;
	//}
	//if(lifetime_frequency_cap != NULL) {
	//
	//delete lifetime_frequency_cap;
	//lifetime_frequency_cap = NULL;
	//}
	//if(local_inventory_radius_in_miles != NULL) {
	//
	//delete local_inventory_radius_in_miles;
	//local_inventory_radius_in_miles = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(optimization_goal_metadata != NULL) {
	//
	//delete optimization_goal_metadata;
	//optimization_goal_metadata = NULL;
	//}
	//if(pacing_delivery_type != NULL) {
	//
	//delete pacing_delivery_type;
	//pacing_delivery_type = NULL;
	//}
	//if(performance_plus_campaign_settings != NULL) {
	//
	//delete performance_plus_campaign_settings;
	//performance_plus_campaign_settings = NULL;
	//}
	//if(placement_group != NULL) {
	//
	//delete placement_group;
	//placement_group = NULL;
	//}
	//if(placement_traffic_type != NULL) {
	//
	//delete placement_traffic_type;
	//placement_traffic_type = NULL;
	//}
	//if(promotion_application_level != NULL) {
	//
	//delete promotion_application_level;
	//promotion_application_level = NULL;
	//}
	//if(promotion_id != NULL) {
	//
	//delete promotion_id;
	//promotion_id = NULL;
	//}
	//if(promotion_ids != NULL) {
	//promotion_ids.RemoveAll(true);
	//delete promotion_ids;
	//promotion_ids = NULL;
	//}
	//if(start_time != NULL) {
	//
	//delete start_time;
	//start_time = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(targeting_spec != NULL) {
	//
	//delete targeting_spec;
	//targeting_spec = NULL;
	//}
	//if(targeting_template_ids != NULL) {
	//targeting_template_ids.RemoveAll(true);
	//delete targeting_template_ids;
	//targeting_template_ids = NULL;
	//}
	//if(tracking_urls != NULL) {
	//
	//delete tracking_urls;
	//tracking_urls = NULL;
	//}
	//
}

void
AdGroupCreateCreate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *auto_targeting_enabledKey = "auto_targeting_enabled";
	node = json_object_get_member(pJsonObject, auto_targeting_enabledKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&auto_targeting_enabled, node, "bool", "");
		} else {
			
		}
	}
	const gchar *bid_in_micro_currencyKey = "bid_in_micro_currency";
	node = json_object_get_member(pJsonObject, bid_in_micro_currencyKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&bid_in_micro_currency, node, "int", "");
		} else {
			
		}
	}
	const gchar *bid_multiplierKey = "bid_multiplier";
	node = json_object_get_member(pJsonObject, bid_multiplierKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&bid_multiplier, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&bid_multiplier);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *bid_strategy_typeKey = "bid_strategy_type";
	node = json_object_get_member(pJsonObject, bid_strategy_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("BidStrategyType")) {
			jsonToValue(&bid_strategy_type, node, "BidStrategyType", "BidStrategyType");
		} else {
			
			BidStrategyType* obj = static_cast<BidStrategyType*> (&bid_strategy_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *billable_eventKey = "billable_event";
	node = json_object_get_member(pJsonObject, billable_eventKey);
	if (node !=NULL) {
	

		if (isprimitive("ActionType")) {
			jsonToValue(&billable_event, node, "ActionType", "ActionType");
		} else {
			
			ActionType* obj = static_cast<ActionType*> (&billable_event);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *budget_in_micro_currencyKey = "budget_in_micro_currency";
	node = json_object_get_member(pJsonObject, budget_in_micro_currencyKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&budget_in_micro_currency, node, "int", "");
		} else {
			
		}
	}
	const gchar *budget_typeKey = "budget_type";
	node = json_object_get_member(pJsonObject, budget_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("BudgetType")) {
			jsonToValue(&budget_type, node, "BudgetType", "BudgetType");
		} else {
			
			BudgetType* obj = static_cast<BudgetType*> (&budget_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *campaign_idKey = "campaign_id";
	node = json_object_get_member(pJsonObject, campaign_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&campaign_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *customer_segment_idKey = "customer_segment_id";
	node = json_object_get_member(pJsonObject, customer_segment_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&customer_segment_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *end_timeKey = "end_time";
	node = json_object_get_member(pJsonObject, end_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&end_time, node, "int", "");
		} else {
			
		}
	}
	const gchar *ext_featuresKey = "ext_features";
	node = json_object_get_member(pJsonObject, ext_featuresKey);
	if (node !=NULL) {
	

		if (isprimitive("AdgroupTrackingFeatures")) {
			jsonToValue(&ext_features, node, "AdgroupTrackingFeatures", "AdgroupTrackingFeatures");
		} else {
			
			AdgroupTrackingFeatures* obj = static_cast<AdgroupTrackingFeatures*> (&ext_features);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *feed_profile_idKey = "feed_profile_id";
	node = json_object_get_member(pJsonObject, feed_profile_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&feed_profile_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *is_creative_optimizationKey = "is_creative_optimization";
	node = json_object_get_member(pJsonObject, is_creative_optimizationKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_creative_optimization, node, "bool", "");
		} else {
			
		}
	}
	const gchar *is_local_inventoryKey = "is_local_inventory";
	node = json_object_get_member(pJsonObject, is_local_inventoryKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_local_inventory, node, "bool", "");
		} else {
			
		}
	}
	const gchar *lifetime_frequency_capKey = "lifetime_frequency_cap";
	node = json_object_get_member(pJsonObject, lifetime_frequency_capKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&lifetime_frequency_cap, node, "int", "");
		} else {
			
		}
	}
	const gchar *local_inventory_radius_in_milesKey = "local_inventory_radius_in_miles";
	node = json_object_get_member(pJsonObject, local_inventory_radius_in_milesKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&local_inventory_radius_in_miles, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&local_inventory_radius_in_miles);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *optimization_goal_metadataKey = "optimization_goal_metadata";
	node = json_object_get_member(pJsonObject, optimization_goal_metadataKey);
	if (node !=NULL) {
	

		if (isprimitive("NullableOptimizationGoalMetadata")) {
			jsonToValue(&optimization_goal_metadata, node, "NullableOptimizationGoalMetadata", "NullableOptimizationGoalMetadata");
		} else {
			
			NullableOptimizationGoalMetadata* obj = static_cast<NullableOptimizationGoalMetadata*> (&optimization_goal_metadata);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pacing_delivery_typeKey = "pacing_delivery_type";
	node = json_object_get_member(pJsonObject, pacing_delivery_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("PacingDeliveryType")) {
			jsonToValue(&pacing_delivery_type, node, "PacingDeliveryType", "PacingDeliveryType");
		} else {
			
			PacingDeliveryType* obj = static_cast<PacingDeliveryType*> (&pacing_delivery_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *performance_plus_campaign_settingsKey = "performance_plus_campaign_settings";
	node = json_object_get_member(pJsonObject, performance_plus_campaign_settingsKey);
	if (node !=NULL) {
	

		if (isprimitive("PerformancePlusCampaignSettings")) {
			jsonToValue(&performance_plus_campaign_settings, node, "PerformancePlusCampaignSettings", "PerformancePlusCampaignSettings");
		} else {
			
			PerformancePlusCampaignSettings* obj = static_cast<PerformancePlusCampaignSettings*> (&performance_plus_campaign_settings);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *placement_groupKey = "placement_group";
	node = json_object_get_member(pJsonObject, placement_groupKey);
	if (node !=NULL) {
	

		if (isprimitive("PlacementGroupType")) {
			jsonToValue(&placement_group, node, "PlacementGroupType", "PlacementGroupType");
		} else {
			
			PlacementGroupType* obj = static_cast<PlacementGroupType*> (&placement_group);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *placement_traffic_typeKey = "placement_traffic_type";
	node = json_object_get_member(pJsonObject, placement_traffic_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("PlacementTrafficType")) {
			jsonToValue(&placement_traffic_type, node, "PlacementTrafficType", "PlacementTrafficType");
		} else {
			
			PlacementTrafficType* obj = static_cast<PlacementTrafficType*> (&placement_traffic_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *promotion_application_levelKey = "promotion_application_level";
	node = json_object_get_member(pJsonObject, promotion_application_levelKey);
	if (node !=NULL) {
	

		if (isprimitive("PromotionApplicationLevel")) {
			jsonToValue(&promotion_application_level, node, "PromotionApplicationLevel", "PromotionApplicationLevel");
		} else {
			
			PromotionApplicationLevel* obj = static_cast<PromotionApplicationLevel*> (&promotion_application_level);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *promotion_idKey = "promotion_id";
	node = json_object_get_member(pJsonObject, promotion_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&promotion_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *promotion_idsKey = "promotion_ids";
	node = json_object_get_member(pJsonObject, promotion_idsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			promotion_ids = new_list;
		}
		
	}
	const gchar *start_timeKey = "start_time";
	node = json_object_get_member(pJsonObject, start_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&start_time, node, "int", "");
		} else {
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("EntityStatus")) {
			jsonToValue(&status, node, "EntityStatus", "EntityStatus");
		} else {
			
			EntityStatus* obj = static_cast<EntityStatus*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *targeting_specKey = "targeting_spec";
	node = json_object_get_member(pJsonObject, targeting_specKey);
	if (node !=NULL) {
	

		if (isprimitive("TargetingSpecOptimal")) {
			jsonToValue(&targeting_spec, node, "TargetingSpecOptimal", "TargetingSpecOptimal");
		} else {
			
			TargetingSpecOptimal* obj = static_cast<TargetingSpecOptimal*> (&targeting_spec);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *targeting_template_idsKey = "targeting_template_ids";
	node = json_object_get_member(pJsonObject, targeting_template_idsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			targeting_template_ids = new_list;
		}
		
	}
	const gchar *tracking_urlsKey = "tracking_urls";
	node = json_object_get_member(pJsonObject, tracking_urlsKey);
	if (node !=NULL) {
	

		if (isprimitive("AdGroupTrackingURLs")) {
			jsonToValue(&tracking_urls, node, "AdGroupTrackingURLs", "AdGroupTrackingURLs");
		} else {
			
			AdGroupTrackingURLs* obj = static_cast<AdGroupTrackingURLs*> (&tracking_urls);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AdGroupCreateCreate::AdGroupCreateCreate(char* json)
{
	this->fromJson(json);
}

char*
AdGroupCreateCreate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getAutoTargetingEnabled();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *auto_targeting_enabledKey = "auto_targeting_enabled";
	json_object_set_member(pJsonObject, auto_targeting_enabledKey, node);
	if (isprimitive("int")) {
		int obj = getBidInMicroCurrency();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *bid_in_micro_currencyKey = "bid_in_micro_currency";
	json_object_set_member(pJsonObject, bid_in_micro_currencyKey, node);
	if (isprimitive("long long")) {
		long long obj = getBidMultiplier();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getBidMultiplier());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *bid_multiplierKey = "bid_multiplier";
	json_object_set_member(pJsonObject, bid_multiplierKey, node);
	if (isprimitive("BidStrategyType")) {
		BidStrategyType obj = getBidStrategyType();
		node = converttoJson(&obj, "BidStrategyType", "");
	}
	else {
		
		BidStrategyType obj = static_cast<BidStrategyType> (getBidStrategyType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *bid_strategy_typeKey = "bid_strategy_type";
	json_object_set_member(pJsonObject, bid_strategy_typeKey, node);
	if (isprimitive("ActionType")) {
		ActionType obj = getBillableEvent();
		node = converttoJson(&obj, "ActionType", "");
	}
	else {
		
		ActionType obj = static_cast<ActionType> (getBillableEvent());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *billable_eventKey = "billable_event";
	json_object_set_member(pJsonObject, billable_eventKey, node);
	if (isprimitive("int")) {
		int obj = getBudgetInMicroCurrency();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *budget_in_micro_currencyKey = "budget_in_micro_currency";
	json_object_set_member(pJsonObject, budget_in_micro_currencyKey, node);
	if (isprimitive("BudgetType")) {
		BudgetType obj = getBudgetType();
		node = converttoJson(&obj, "BudgetType", "");
	}
	else {
		
		BudgetType obj = static_cast<BudgetType> (getBudgetType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *budget_typeKey = "budget_type";
	json_object_set_member(pJsonObject, budget_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCampaignId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *campaign_idKey = "campaign_id";
	json_object_set_member(pJsonObject, campaign_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCustomerSegmentId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *customer_segment_idKey = "customer_segment_id";
	json_object_set_member(pJsonObject, customer_segment_idKey, node);
	if (isprimitive("int")) {
		int obj = getEndTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *end_timeKey = "end_time";
	json_object_set_member(pJsonObject, end_timeKey, node);
	if (isprimitive("AdgroupTrackingFeatures")) {
		AdgroupTrackingFeatures obj = getExtFeatures();
		node = converttoJson(&obj, "AdgroupTrackingFeatures", "");
	}
	else {
		
		AdgroupTrackingFeatures obj = static_cast<AdgroupTrackingFeatures> (getExtFeatures());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ext_featuresKey = "ext_features";
	json_object_set_member(pJsonObject, ext_featuresKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFeedProfileId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *feed_profile_idKey = "feed_profile_id";
	json_object_set_member(pJsonObject, feed_profile_idKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsCreativeOptimization();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_creative_optimizationKey = "is_creative_optimization";
	json_object_set_member(pJsonObject, is_creative_optimizationKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsLocalInventory();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_local_inventoryKey = "is_local_inventory";
	json_object_set_member(pJsonObject, is_local_inventoryKey, node);
	if (isprimitive("int")) {
		int obj = getLifetimeFrequencyCap();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *lifetime_frequency_capKey = "lifetime_frequency_cap";
	json_object_set_member(pJsonObject, lifetime_frequency_capKey, node);
	if (isprimitive("long long")) {
		long long obj = getLocalInventoryRadiusInMiles();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getLocalInventoryRadiusInMiles());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *local_inventory_radius_in_milesKey = "local_inventory_radius_in_miles";
	json_object_set_member(pJsonObject, local_inventory_radius_in_milesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("NullableOptimizationGoalMetadata")) {
		NullableOptimizationGoalMetadata obj = getOptimizationGoalMetadata();
		node = converttoJson(&obj, "NullableOptimizationGoalMetadata", "");
	}
	else {
		
		NullableOptimizationGoalMetadata obj = static_cast<NullableOptimizationGoalMetadata> (getOptimizationGoalMetadata());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *optimization_goal_metadataKey = "optimization_goal_metadata";
	json_object_set_member(pJsonObject, optimization_goal_metadataKey, node);
	if (isprimitive("PacingDeliveryType")) {
		PacingDeliveryType obj = getPacingDeliveryType();
		node = converttoJson(&obj, "PacingDeliveryType", "");
	}
	else {
		
		PacingDeliveryType obj = static_cast<PacingDeliveryType> (getPacingDeliveryType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pacing_delivery_typeKey = "pacing_delivery_type";
	json_object_set_member(pJsonObject, pacing_delivery_typeKey, node);
	if (isprimitive("PerformancePlusCampaignSettings")) {
		PerformancePlusCampaignSettings obj = getPerformancePlusCampaignSettings();
		node = converttoJson(&obj, "PerformancePlusCampaignSettings", "");
	}
	else {
		
		PerformancePlusCampaignSettings obj = static_cast<PerformancePlusCampaignSettings> (getPerformancePlusCampaignSettings());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *performance_plus_campaign_settingsKey = "performance_plus_campaign_settings";
	json_object_set_member(pJsonObject, performance_plus_campaign_settingsKey, node);
	if (isprimitive("PlacementGroupType")) {
		PlacementGroupType obj = getPlacementGroup();
		node = converttoJson(&obj, "PlacementGroupType", "");
	}
	else {
		
		PlacementGroupType obj = static_cast<PlacementGroupType> (getPlacementGroup());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *placement_groupKey = "placement_group";
	json_object_set_member(pJsonObject, placement_groupKey, node);
	if (isprimitive("PlacementTrafficType")) {
		PlacementTrafficType obj = getPlacementTrafficType();
		node = converttoJson(&obj, "PlacementTrafficType", "");
	}
	else {
		
		PlacementTrafficType obj = static_cast<PlacementTrafficType> (getPlacementTrafficType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *placement_traffic_typeKey = "placement_traffic_type";
	json_object_set_member(pJsonObject, placement_traffic_typeKey, node);
	if (isprimitive("PromotionApplicationLevel")) {
		PromotionApplicationLevel obj = getPromotionApplicationLevel();
		node = converttoJson(&obj, "PromotionApplicationLevel", "");
	}
	else {
		
		PromotionApplicationLevel obj = static_cast<PromotionApplicationLevel> (getPromotionApplicationLevel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *promotion_application_levelKey = "promotion_application_level";
	json_object_set_member(pJsonObject, promotion_application_levelKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPromotionId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *promotion_idKey = "promotion_id";
	json_object_set_member(pJsonObject, promotion_idKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getPromotionIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getPromotionIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *promotion_idsKey = "promotion_ids";
	json_object_set_member(pJsonObject, promotion_idsKey, node);
	if (isprimitive("int")) {
		int obj = getStartTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *start_timeKey = "start_time";
	json_object_set_member(pJsonObject, start_timeKey, node);
	if (isprimitive("EntityStatus")) {
		EntityStatus obj = getStatus();
		node = converttoJson(&obj, "EntityStatus", "");
	}
	else {
		
		EntityStatus obj = static_cast<EntityStatus> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("TargetingSpecOptimal")) {
		TargetingSpecOptimal obj = getTargetingSpec();
		node = converttoJson(&obj, "TargetingSpecOptimal", "");
	}
	else {
		
		TargetingSpecOptimal obj = static_cast<TargetingSpecOptimal> (getTargetingSpec());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *targeting_specKey = "targeting_spec";
	json_object_set_member(pJsonObject, targeting_specKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getTargetingTemplateIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getTargetingTemplateIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *targeting_template_idsKey = "targeting_template_ids";
	json_object_set_member(pJsonObject, targeting_template_idsKey, node);
	if (isprimitive("AdGroupTrackingURLs")) {
		AdGroupTrackingURLs obj = getTrackingUrls();
		node = converttoJson(&obj, "AdGroupTrackingURLs", "");
	}
	else {
		
		AdGroupTrackingURLs obj = static_cast<AdGroupTrackingURLs> (getTrackingUrls());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tracking_urlsKey = "tracking_urls";
	json_object_set_member(pJsonObject, tracking_urlsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
AdGroupCreateCreate::getAutoTargetingEnabled()
{
	return auto_targeting_enabled;
}

void
AdGroupCreateCreate::setAutoTargetingEnabled(bool  auto_targeting_enabled)
{
	this->auto_targeting_enabled = auto_targeting_enabled;
}

int
AdGroupCreateCreate::getBidInMicroCurrency()
{
	return bid_in_micro_currency;
}

void
AdGroupCreateCreate::setBidInMicroCurrency(int  bid_in_micro_currency)
{
	this->bid_in_micro_currency = bid_in_micro_currency;
}

long long
AdGroupCreateCreate::getBidMultiplier()
{
	return bid_multiplier;
}

void
AdGroupCreateCreate::setBidMultiplier(long long  bid_multiplier)
{
	this->bid_multiplier = bid_multiplier;
}

BidStrategyType
AdGroupCreateCreate::getBidStrategyType()
{
	return bid_strategy_type;
}

void
AdGroupCreateCreate::setBidStrategyType(BidStrategyType  bid_strategy_type)
{
	this->bid_strategy_type = bid_strategy_type;
}

ActionType
AdGroupCreateCreate::getBillableEvent()
{
	return billable_event;
}

void
AdGroupCreateCreate::setBillableEvent(ActionType  billable_event)
{
	this->billable_event = billable_event;
}

int
AdGroupCreateCreate::getBudgetInMicroCurrency()
{
	return budget_in_micro_currency;
}

void
AdGroupCreateCreate::setBudgetInMicroCurrency(int  budget_in_micro_currency)
{
	this->budget_in_micro_currency = budget_in_micro_currency;
}

BudgetType
AdGroupCreateCreate::getBudgetType()
{
	return budget_type;
}

void
AdGroupCreateCreate::setBudgetType(BudgetType  budget_type)
{
	this->budget_type = budget_type;
}

std::string
AdGroupCreateCreate::getCampaignId()
{
	return campaign_id;
}

void
AdGroupCreateCreate::setCampaignId(std::string  campaign_id)
{
	this->campaign_id = campaign_id;
}

std::string
AdGroupCreateCreate::getCustomerSegmentId()
{
	return customer_segment_id;
}

void
AdGroupCreateCreate::setCustomerSegmentId(std::string  customer_segment_id)
{
	this->customer_segment_id = customer_segment_id;
}

int
AdGroupCreateCreate::getEndTime()
{
	return end_time;
}

void
AdGroupCreateCreate::setEndTime(int  end_time)
{
	this->end_time = end_time;
}

AdgroupTrackingFeatures
AdGroupCreateCreate::getExtFeatures()
{
	return ext_features;
}

void
AdGroupCreateCreate::setExtFeatures(AdgroupTrackingFeatures  ext_features)
{
	this->ext_features = ext_features;
}

std::string
AdGroupCreateCreate::getFeedProfileId()
{
	return feed_profile_id;
}

void
AdGroupCreateCreate::setFeedProfileId(std::string  feed_profile_id)
{
	this->feed_profile_id = feed_profile_id;
}

bool
AdGroupCreateCreate::getIsCreativeOptimization()
{
	return is_creative_optimization;
}

void
AdGroupCreateCreate::setIsCreativeOptimization(bool  is_creative_optimization)
{
	this->is_creative_optimization = is_creative_optimization;
}

bool
AdGroupCreateCreate::getIsLocalInventory()
{
	return is_local_inventory;
}

void
AdGroupCreateCreate::setIsLocalInventory(bool  is_local_inventory)
{
	this->is_local_inventory = is_local_inventory;
}

int
AdGroupCreateCreate::getLifetimeFrequencyCap()
{
	return lifetime_frequency_cap;
}

void
AdGroupCreateCreate::setLifetimeFrequencyCap(int  lifetime_frequency_cap)
{
	this->lifetime_frequency_cap = lifetime_frequency_cap;
}

long long
AdGroupCreateCreate::getLocalInventoryRadiusInMiles()
{
	return local_inventory_radius_in_miles;
}

void
AdGroupCreateCreate::setLocalInventoryRadiusInMiles(long long  local_inventory_radius_in_miles)
{
	this->local_inventory_radius_in_miles = local_inventory_radius_in_miles;
}

std::string
AdGroupCreateCreate::getName()
{
	return name;
}

void
AdGroupCreateCreate::setName(std::string  name)
{
	this->name = name;
}

NullableOptimizationGoalMetadata
AdGroupCreateCreate::getOptimizationGoalMetadata()
{
	return optimization_goal_metadata;
}

void
AdGroupCreateCreate::setOptimizationGoalMetadata(NullableOptimizationGoalMetadata  optimization_goal_metadata)
{
	this->optimization_goal_metadata = optimization_goal_metadata;
}

PacingDeliveryType
AdGroupCreateCreate::getPacingDeliveryType()
{
	return pacing_delivery_type;
}

void
AdGroupCreateCreate::setPacingDeliveryType(PacingDeliveryType  pacing_delivery_type)
{
	this->pacing_delivery_type = pacing_delivery_type;
}

PerformancePlusCampaignSettings
AdGroupCreateCreate::getPerformancePlusCampaignSettings()
{
	return performance_plus_campaign_settings;
}

void
AdGroupCreateCreate::setPerformancePlusCampaignSettings(PerformancePlusCampaignSettings  performance_plus_campaign_settings)
{
	this->performance_plus_campaign_settings = performance_plus_campaign_settings;
}

PlacementGroupType
AdGroupCreateCreate::getPlacementGroup()
{
	return placement_group;
}

void
AdGroupCreateCreate::setPlacementGroup(PlacementGroupType  placement_group)
{
	this->placement_group = placement_group;
}

PlacementTrafficType
AdGroupCreateCreate::getPlacementTrafficType()
{
	return placement_traffic_type;
}

void
AdGroupCreateCreate::setPlacementTrafficType(PlacementTrafficType  placement_traffic_type)
{
	this->placement_traffic_type = placement_traffic_type;
}

PromotionApplicationLevel
AdGroupCreateCreate::getPromotionApplicationLevel()
{
	return promotion_application_level;
}

void
AdGroupCreateCreate::setPromotionApplicationLevel(PromotionApplicationLevel  promotion_application_level)
{
	this->promotion_application_level = promotion_application_level;
}

std::string
AdGroupCreateCreate::getPromotionId()
{
	return promotion_id;
}

void
AdGroupCreateCreate::setPromotionId(std::string  promotion_id)
{
	this->promotion_id = promotion_id;
}

std::list<std::string>
AdGroupCreateCreate::getPromotionIds()
{
	return promotion_ids;
}

void
AdGroupCreateCreate::setPromotionIds(std::list <std::string> promotion_ids)
{
	this->promotion_ids = promotion_ids;
}

int
AdGroupCreateCreate::getStartTime()
{
	return start_time;
}

void
AdGroupCreateCreate::setStartTime(int  start_time)
{
	this->start_time = start_time;
}

EntityStatus
AdGroupCreateCreate::getStatus()
{
	return status;
}

void
AdGroupCreateCreate::setStatus(EntityStatus  status)
{
	this->status = status;
}

TargetingSpecOptimal
AdGroupCreateCreate::getTargetingSpec()
{
	return targeting_spec;
}

void
AdGroupCreateCreate::setTargetingSpec(TargetingSpecOptimal  targeting_spec)
{
	this->targeting_spec = targeting_spec;
}

std::list<std::string>
AdGroupCreateCreate::getTargetingTemplateIds()
{
	return targeting_template_ids;
}

void
AdGroupCreateCreate::setTargetingTemplateIds(std::list <std::string> targeting_template_ids)
{
	this->targeting_template_ids = targeting_template_ids;
}

AdGroupTrackingURLs
AdGroupCreateCreate::getTrackingUrls()
{
	return tracking_urls;
}

void
AdGroupCreateCreate::setTrackingUrls(AdGroupTrackingURLs  tracking_urls)
{
	this->tracking_urls = tracking_urls;
}


