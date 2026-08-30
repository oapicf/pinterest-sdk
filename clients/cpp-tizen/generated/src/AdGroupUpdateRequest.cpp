#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdGroupUpdateRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdGroupUpdateRequest::AdGroupUpdateRequest()
{
	//__init();
}

AdGroupUpdateRequest::~AdGroupUpdateRequest()
{
	//__cleanup();
}

void
AdGroupUpdateRequest::__init()
{
	//bid_multiplier = double(0);
	//id = std::string();
	//new std::list()std::list> targeting_spec_operations;
	//auto_targeting_enabled = bool(false);
	//bid_in_micro_currency = int(0);
	//bid_strategy_type = new BidStrategyType();
	//billable_event = new ActionType();
	//budget_in_micro_currency = int(0);
	//budget_type = new BudgetType();
	//campaign_id = std::string();
	//end_time = int(0);
	//is_creative_optimization = bool(false);
	//lifetime_frequency_cap = int(0);
	//name = std::string();
	//optimization_goal_metadata = null;
	//pacing_delivery_type = new PacingDeliveryType();
	//placement_group = null;
	//promotion_application_level = std::string();
	//promotion_id = std::string();
	//new std::list()std::list> promotion_ids;
	//start_time = int(0);
	//status = null;
	//targeting_spec = new TargetingSpec();
	//new std::list()std::list> targeting_template_ids;
	//tracking_urls = null;
}

void
AdGroupUpdateRequest::__cleanup()
{
	//if(bid_multiplier != NULL) {
	//
	//delete bid_multiplier;
	//bid_multiplier = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(targeting_spec_operations != NULL) {
	//targeting_spec_operations.RemoveAll(true);
	//delete targeting_spec_operations;
	//targeting_spec_operations = NULL;
	//}
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
	//if(end_time != NULL) {
	//
	//delete end_time;
	//end_time = NULL;
	//}
	//if(is_creative_optimization != NULL) {
	//
	//delete is_creative_optimization;
	//is_creative_optimization = NULL;
	//}
	//if(lifetime_frequency_cap != NULL) {
	//
	//delete lifetime_frequency_cap;
	//lifetime_frequency_cap = NULL;
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
	//if(placement_group != NULL) {
	//
	//delete placement_group;
	//placement_group = NULL;
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
AdGroupUpdateRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *targeting_spec_operationsKey = "targeting_spec_operations";
	node = json_object_get_member(pJsonObject, targeting_spec_operationsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TargetingSpecOperations> new_list;
			TargetingSpecOperations inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TargetingSpecOperations")) {
					jsonToValue(&inst, temp_json, "TargetingSpecOperations", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			targeting_spec_operations = new_list;
		}
		
	}
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
	const gchar *end_timeKey = "end_time";
	node = json_object_get_member(pJsonObject, end_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&end_time, node, "int", "");
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
	const gchar *lifetime_frequency_capKey = "lifetime_frequency_cap";
	node = json_object_get_member(pJsonObject, lifetime_frequency_capKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&lifetime_frequency_cap, node, "int", "");
		} else {
			
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
	

		if (isprimitive("std::string")) {
			jsonToValue(&optimization_goal_metadata, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&optimization_goal_metadata);
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
	const gchar *promotion_application_levelKey = "promotion_application_level";
	node = json_object_get_member(pJsonObject, promotion_application_levelKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&promotion_application_level, node, "std::string", "");
		} else {
			
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
	

		if (isprimitive("TargetingSpec")) {
			jsonToValue(&targeting_spec, node, "TargetingSpec", "TargetingSpec");
		} else {
			
			TargetingSpec* obj = static_cast<TargetingSpec*> (&targeting_spec);
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
	

		if (isprimitive("std::string")) {
			jsonToValue(&tracking_urls, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&tracking_urls);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AdGroupUpdateRequest::AdGroupUpdateRequest(char* json)
{
	this->fromJson(json);
}

char*
AdGroupUpdateRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("TargetingSpecOperations")) {
		list<TargetingSpecOperations> new_list = static_cast<list <TargetingSpecOperations> > (getTargetingSpecOperations());
		node = converttoJson(&new_list, "TargetingSpecOperations", "array");
	} else {
		node = json_node_alloc();
		list<TargetingSpecOperations> new_list = static_cast<list <TargetingSpecOperations> > (getTargetingSpecOperations());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TargetingSpecOperations>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TargetingSpecOperations obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *targeting_spec_operationsKey = "targeting_spec_operations";
	json_object_set_member(pJsonObject, targeting_spec_operationsKey, node);
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
	if (isprimitive("int")) {
		int obj = getEndTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *end_timeKey = "end_time";
	json_object_set_member(pJsonObject, end_timeKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsCreativeOptimization();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_creative_optimizationKey = "is_creative_optimization";
	json_object_set_member(pJsonObject, is_creative_optimizationKey, node);
	if (isprimitive("int")) {
		int obj = getLifetimeFrequencyCap();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *lifetime_frequency_capKey = "lifetime_frequency_cap";
	json_object_set_member(pJsonObject, lifetime_frequency_capKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOptimizationGoalMetadata();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getOptimizationGoalMetadata());
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
	if (isprimitive("std::string")) {
		std::string obj = getPromotionApplicationLevel();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
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
	if (isprimitive("TargetingSpec")) {
		TargetingSpec obj = getTargetingSpec();
		node = converttoJson(&obj, "TargetingSpec", "");
	}
	else {
		
		TargetingSpec obj = static_cast<TargetingSpec> (getTargetingSpec());
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
	if (isprimitive("std::string")) {
		std::string obj = getTrackingUrls();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getTrackingUrls());
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

long long
AdGroupUpdateRequest::getBidMultiplier()
{
	return bid_multiplier;
}

void
AdGroupUpdateRequest::setBidMultiplier(long long  bid_multiplier)
{
	this->bid_multiplier = bid_multiplier;
}

std::string
AdGroupUpdateRequest::getId()
{
	return id;
}

void
AdGroupUpdateRequest::setId(std::string  id)
{
	this->id = id;
}

std::list<TargetingSpecOperations>
AdGroupUpdateRequest::getTargetingSpecOperations()
{
	return targeting_spec_operations;
}

void
AdGroupUpdateRequest::setTargetingSpecOperations(std::list <TargetingSpecOperations> targeting_spec_operations)
{
	this->targeting_spec_operations = targeting_spec_operations;
}

bool
AdGroupUpdateRequest::getAutoTargetingEnabled()
{
	return auto_targeting_enabled;
}

void
AdGroupUpdateRequest::setAutoTargetingEnabled(bool  auto_targeting_enabled)
{
	this->auto_targeting_enabled = auto_targeting_enabled;
}

int
AdGroupUpdateRequest::getBidInMicroCurrency()
{
	return bid_in_micro_currency;
}

void
AdGroupUpdateRequest::setBidInMicroCurrency(int  bid_in_micro_currency)
{
	this->bid_in_micro_currency = bid_in_micro_currency;
}

BidStrategyType
AdGroupUpdateRequest::getBidStrategyType()
{
	return bid_strategy_type;
}

void
AdGroupUpdateRequest::setBidStrategyType(BidStrategyType  bid_strategy_type)
{
	this->bid_strategy_type = bid_strategy_type;
}

ActionType
AdGroupUpdateRequest::getBillableEvent()
{
	return billable_event;
}

void
AdGroupUpdateRequest::setBillableEvent(ActionType  billable_event)
{
	this->billable_event = billable_event;
}

int
AdGroupUpdateRequest::getBudgetInMicroCurrency()
{
	return budget_in_micro_currency;
}

void
AdGroupUpdateRequest::setBudgetInMicroCurrency(int  budget_in_micro_currency)
{
	this->budget_in_micro_currency = budget_in_micro_currency;
}

BudgetType
AdGroupUpdateRequest::getBudgetType()
{
	return budget_type;
}

void
AdGroupUpdateRequest::setBudgetType(BudgetType  budget_type)
{
	this->budget_type = budget_type;
}

std::string
AdGroupUpdateRequest::getCampaignId()
{
	return campaign_id;
}

void
AdGroupUpdateRequest::setCampaignId(std::string  campaign_id)
{
	this->campaign_id = campaign_id;
}

int
AdGroupUpdateRequest::getEndTime()
{
	return end_time;
}

void
AdGroupUpdateRequest::setEndTime(int  end_time)
{
	this->end_time = end_time;
}

bool
AdGroupUpdateRequest::getIsCreativeOptimization()
{
	return is_creative_optimization;
}

void
AdGroupUpdateRequest::setIsCreativeOptimization(bool  is_creative_optimization)
{
	this->is_creative_optimization = is_creative_optimization;
}

int
AdGroupUpdateRequest::getLifetimeFrequencyCap()
{
	return lifetime_frequency_cap;
}

void
AdGroupUpdateRequest::setLifetimeFrequencyCap(int  lifetime_frequency_cap)
{
	this->lifetime_frequency_cap = lifetime_frequency_cap;
}

std::string
AdGroupUpdateRequest::getName()
{
	return name;
}

void
AdGroupUpdateRequest::setName(std::string  name)
{
	this->name = name;
}

std::string
AdGroupUpdateRequest::getOptimizationGoalMetadata()
{
	return optimization_goal_metadata;
}

void
AdGroupUpdateRequest::setOptimizationGoalMetadata(std::string  optimization_goal_metadata)
{
	this->optimization_goal_metadata = optimization_goal_metadata;
}

PacingDeliveryType
AdGroupUpdateRequest::getPacingDeliveryType()
{
	return pacing_delivery_type;
}

void
AdGroupUpdateRequest::setPacingDeliveryType(PacingDeliveryType  pacing_delivery_type)
{
	this->pacing_delivery_type = pacing_delivery_type;
}

PlacementGroupType
AdGroupUpdateRequest::getPlacementGroup()
{
	return placement_group;
}

void
AdGroupUpdateRequest::setPlacementGroup(PlacementGroupType  placement_group)
{
	this->placement_group = placement_group;
}

std::string
AdGroupUpdateRequest::getPromotionApplicationLevel()
{
	return promotion_application_level;
}

void
AdGroupUpdateRequest::setPromotionApplicationLevel(std::string  promotion_application_level)
{
	this->promotion_application_level = promotion_application_level;
}

std::string
AdGroupUpdateRequest::getPromotionId()
{
	return promotion_id;
}

void
AdGroupUpdateRequest::setPromotionId(std::string  promotion_id)
{
	this->promotion_id = promotion_id;
}

std::list<std::string>
AdGroupUpdateRequest::getPromotionIds()
{
	return promotion_ids;
}

void
AdGroupUpdateRequest::setPromotionIds(std::list <std::string> promotion_ids)
{
	this->promotion_ids = promotion_ids;
}

int
AdGroupUpdateRequest::getStartTime()
{
	return start_time;
}

void
AdGroupUpdateRequest::setStartTime(int  start_time)
{
	this->start_time = start_time;
}

EntityStatus
AdGroupUpdateRequest::getStatus()
{
	return status;
}

void
AdGroupUpdateRequest::setStatus(EntityStatus  status)
{
	this->status = status;
}

TargetingSpec
AdGroupUpdateRequest::getTargetingSpec()
{
	return targeting_spec;
}

void
AdGroupUpdateRequest::setTargetingSpec(TargetingSpec  targeting_spec)
{
	this->targeting_spec = targeting_spec;
}

std::list<std::string>
AdGroupUpdateRequest::getTargetingTemplateIds()
{
	return targeting_template_ids;
}

void
AdGroupUpdateRequest::setTargetingTemplateIds(std::list <std::string> targeting_template_ids)
{
	this->targeting_template_ids = targeting_template_ids;
}

std::string
AdGroupUpdateRequest::getTrackingUrls()
{
	return tracking_urls;
}

void
AdGroupUpdateRequest::setTrackingUrls(std::string  tracking_urls)
{
	this->tracking_urls = tracking_urls;
}


